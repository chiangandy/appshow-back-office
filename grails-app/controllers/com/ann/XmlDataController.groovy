package com.ann


import org.apache.shiro.crypto.hash.Sha256Hash
import groovy.xml.MarkupBuilder
import java.text.SimpleDateFormat
import org.custommonkey.xmlunit.*
import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.AuthenticationException
import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.web.util.SavedRequest
import org.apache.shiro.web.util.WebUtils


class XmlDataController {

    def index() {  // xml builder 的 sample，參考用～
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
		  car(name:'HSV Maloo', make:'Holden', year:2006) {
			country('Australia')
			record(type:'speed', 'Production Pickup Truck with speed of 271kph')
		  }
		  car(name:'P50', make:'Peel', year:1962) {
			country('Isle of Man')
			record(type:'size', 'Smallest Street-Legal Car at 99cm wide and 59 kg in weight')
		  }
		  car(name:'Royale', make:'Bugatti', year:1931) {
			country('France')
			record(type:'price', 'Most Valuable Car at $15 million')
		  }
		}
		println("ok here:"+writer.toString())
		//respond writer
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}
	
	def vdcategory() {
		
		def cat = Dtcategory.list()
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			cat.each() { scat ->
			  category(name:scat.catname) {
				catdesc(scat.catdesc)
				dateinfo(createdate:scat.dateCreated.toString(), updatedate:scat.lastUpdated.toString())
			  }
			}
		}
		//println("ok here:"+writer.toString())
		//respond writer
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}

	def vdsubcategory() {
		def param = params.id
		def cat
		if (param==null) {
			println("ddd")
			cat = Dtsubcategory.list()
		} else {
			cat = Dtsubcategory.findAllByDtcategory(Dtcategory.get(param.toInteger()))	
		}
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			cat.each() { scat ->
				category(name:scat.subcatname) {
					catdesc(scat.subcatdesc)
					rootcat(id:scat.dtcategory.id.toString(),scat.dtcategory)
					dateinfo(createdate:scat.dateCreated.toString(), updatedate:scat.lastUpdated.toString())
				  }
			  println("#")
			}
		}
		//println("ok here:"+writer.toString())
		//respond writer
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}

	def appcategory() {
		
		def appcat = Appcategory.list()
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			appcat.each() { acat ->
			  appcategory(id:acat.id, name:acat.catname) {
				catdesc(acat.catdesc)
				dateinfo(createdate:acat.dateCreated.toString(), updatedate:acat.lastUpdated.toString())
			  }
			}
		}
		//println("ok here:"+writer.toString())
		//respond writer
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}

	def appsubcategory() {
		def param = params.id
		def cat
		if (param==null) {
			cat = Appsubcategory.list()
		} else {
			cat = Appsubcategory.findAllByAppcategory(Appcategory.get(param.toInteger()))
		}
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			cat.each() { acat ->
				appsubcategory(id: acat.id, name:acat.subcatname) {
					catdesc(acat.subcatdesc)
					rootcat(id:acat.appcategory.id.toString(), acat.appcategory)
					dateinfo(createdate:acat.dateCreated.toString(), updatedate:acat.lastUpdated.toString())
				  }
			}
		}
		//respond writer
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}

	def vditems() {
		def param = params.id
		def vditems
		if (param==null) {
			vditems = Vditems.list()
		} else {
			vditems = Vditems.withCriteria {
				dtsubcategory {
					eq('id', param.toLong())
				}
				maxResults 100
			}
		}
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			vditems.each() { itm ->
				vditem(name:itm.vditemname) {
					desc(itm.vditemdesc)
					youtube(keyid:itm.youtubekey)
					createdate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(itm.dateCreated))
					videopic("http://"+request.getServerName()+":"
								+request.getServerPort()
								+request.getContextPath()
								+"/files/"+itm.picfile)
				  }
			}
		}
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}
	
	def appdownloadlist() {
		Calendar calendar = Calendar.getInstance()
		Date nowDate = calendar.getTime()
		
		def param = params.id
		def mtgoapp

		if (param==null) {
			mtgoapp = Mtgoapp.withCriteria {
				appdownload{
					le('datestart', nowDate)    // or use gt
					ge('datestop', nowDate)		// or use lt
				}
				maxResults 200

			}
		} else {
			mtgoapp = Mtgoapp.withCriteria {
				appsubcategory {
					eq('id', param.toLong())
				}
				appdownload {
					le('datestart', nowDate)    // or use gt
					ge('datestop', nowDate)		// or use lt
				}
				maxResults 200
			}
		}

		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		
		def systempath = "http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/files/"
									
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			mtgoapp.each() { app ->
				app.appdownload.each {  appdown ->
					appitem(id:app.id, name:app.appname) {
						desc(app.appdesc)
						createdate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(app.dateCreated))
						videopic(systempath+app.picfile)
						rate(appdown.comrate)
						intropics {
							f0(systempath+appdown.picfile)
							f1(systempath+appdown.picfiled1)
							f2(systempath+appdown.picfiled2)
							f3(systempath+appdown.picfiled3)
						}
						apppublisher(appdown.apppublisher)
						storekey(appdown.storekey)
						datestart(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(appdown.datestart))
						datestop(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(appdown.datestop))
					}
				}
			}
		}
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}
	
	def createappuser() {
		def userid = params.id
		def password = params.pp			// password parameter
		def email = params.pe			// email parameter
		def username = params.pn			// user name parameter

		// 如何insert 資料至User
		def appuser = User.findByUsername(userid)
		def result_string = ""
		def reason_string = ""
		
		if(!appuser){
			appuser = new User(realname:username, username: userid, passwordHash: new Sha256Hash(password).toHex(), email: email)
			appuser.addToRoles(Role.findByName("手機使用者"))
			appuser.save()
			result_string = "success"
			reason_string = "新增帳號成功"
		} else {
			result_string = "fail"
			reason_string = "帳號名稱重複"
		}
		
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			  systemprocess(name:"result") {
				result(result_string)
				reason(reason_string)
			  }
		}
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}
	
	def appsignIn = {
		def authToken = new UsernamePasswordToken(params.username, params.password as String)
		
		try{
			// Perform the actual login. An AuthenticationException
			// will be thrown if the username is unrecognised or the
			// password is incorrect.
			SecurityUtils.subject.login(authToken)

			log.info "Redirecting to '${targetUri}'."
			result_string = "success"
			reason_string = "login is corrected"
			//redirect(uri: targetUri)
		}
		catch (AuthenticationException ex){
			// Authentication failed, so display the appropriate message
			// on the login page.
			log.info "Authentication failure for user '${params.username}'."
			flash.message = message(code: "login.failed")
			result_string = "failed"
			reason_string = "Authentication failure for user '${params.username}'."

			def m = [ username: params.username ]

		}
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		xml.mkp.xmlDeclaration(version: "1.0", encoding: "utf-8")
		xml.records() {
			  systemprocess(name:"result") {
				result(result_string)
				reason(reason_string)
			  }
		}
		render(view: "index", , model: [ writeroutput:writer.toString()])
	}

}
