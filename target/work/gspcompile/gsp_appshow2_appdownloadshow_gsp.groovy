import com.ann.Appdownload
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_appdownloadshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/appdownload/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'appdownload.label', default: 'Appdownload'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (appdownloadInstance?.apptopic)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("appdownload.apptopic.label"),'default':("Apptopic")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(appdownloadInstance),'field':("apptopic")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.apppublisher)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("appdownload.apppublisher.label"),'default':("Apppublisher")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(appdownloadInstance),'field':("apppublisher")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.appdesc)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("appdownload.appdesc.label"),'default':("Appdesc")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(appdownloadInstance),'field':("appdesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.storekey)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("appdownload.storekey.label"),'default':("Storekey")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(appdownloadInstance),'field':("storekey")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.mediaurl)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("appdownload.mediaurl.label"),'default':("Mediaurl")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(appdownloadInstance),'field':("mediaurl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.picfile)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("appdownload.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(appdownloadInstance),'field':("picfile")],-1)
printHtmlPart(28)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfile')))
printHtmlPart(29)
expressionOut.print(appdownloadInstance.picfile)
printHtmlPart(30)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.opuser)) {
printHtmlPart(31)
invokeTag('message','g',84,['code':("appdownload.opuser.label"),'default':("Opuser")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',86,['bean':(appdownloadInstance),'field':("opuser")],-1)
printHtmlPart(33)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.comrate)) {
printHtmlPart(34)
invokeTag('message','g',94,['code':("appdownload.comrate.label"),'default':("Comrate")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',96,['bean':(appdownloadInstance),'field':("comrate")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.datestart)) {
printHtmlPart(36)
invokeTag('message','g',103,['code':("appdownload.datestart.label"),'default':("Datestart")],-1)
printHtmlPart(37)
invokeTag('formatDate','g',105,['date':(appdownloadInstance?.datestart),'format':("yyyy-MM-dd")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.datestop)) {
printHtmlPart(38)
invokeTag('message','g',112,['code':("appdownload.datestop.label"),'default':("Datestop")],-1)
printHtmlPart(39)
invokeTag('formatDate','g',114,['date':(appdownloadInstance?.datestop),'format':("yyyy-MM-dd")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.dateCreated)) {
printHtmlPart(40)
invokeTag('message','g',121,['code':("appdownload.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(41)
invokeTag('formatDate','g',123,['date':(appdownloadInstance?.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.lastUpdated)) {
printHtmlPart(42)
invokeTag('message','g',130,['code':("appdownload.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(43)
invokeTag('formatDate','g',132,['date':(appdownloadInstance?.lastUpdated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.mtgoapp)) {
printHtmlPart(44)
invokeTag('message','g',139,['code':("appdownload.mtgoapp.label"),'default':("Mtgoapp")],-1)
printHtmlPart(45)
createTagBody(3, {->
expressionOut.print(appdownloadInstance?.mtgoapp?.encodeAsHTML())
})
invokeTag('link','g',141,['controller':("mtgoapp"),'action':("show"),'id':(appdownloadInstance?.mtgoapp?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.picfiled1)) {
printHtmlPart(46)
invokeTag('message','g',148,['code':("appdownload.picfiled1.label"),'default':("Picfiled1")],-1)
printHtmlPart(47)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfiled1')))
printHtmlPart(29)
expressionOut.print(appdownloadInstance.picfiled1)
printHtmlPart(48)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.picfiled2)) {
printHtmlPart(49)
invokeTag('message','g',159,['code':("appdownload.picfiled2.label"),'default':("Picfiled2")],-1)
printHtmlPart(50)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfiled2')))
printHtmlPart(29)
expressionOut.print(appdownloadInstance.picfiled2)
printHtmlPart(48)
}
printHtmlPart(17)
if(true && (appdownloadInstance?.picfiled3)) {
printHtmlPart(51)
invokeTag('message','g',170,['code':("appdownload.picfiled3.label"),'default':("Picfiled3")],-1)
printHtmlPart(52)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfiled3')))
printHtmlPart(29)
expressionOut.print(appdownloadInstance.picfiled3)
printHtmlPart(53)
}
printHtmlPart(54)
createTagBody(2, {->
printHtmlPart(55)
createTagBody(3, {->
invokeTag('message','g',182,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',182,['class':("edit"),'action':("edit"),'resource':(appdownloadInstance)],3)
printHtmlPart(56)
invokeTag('actionSubmit','g',183,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(57)
})
invokeTag('form','g',185,['url':([resource:appdownloadInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(58)
})
invokeTag('captureBody','sitemesh',187,[:],1)
printHtmlPart(59)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415869763000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
