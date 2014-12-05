package com.ann

import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.subject.Subject
import org.apache.shiro.SecurityUtils

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class VditemsController {

    static allowedMethods = [save: "POST", update: "POST", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Vditems.list(params), model:[vditemsInstanceCount: Vditems.count()]
    }

    def show(Vditems vditemsInstance) {
        respond vditemsInstance
    }

    def create() {
        respond new Vditems(params)
    }

    @Transactional
    def save(Vditems vditemsInstance) {
		log.println(" user xxxxxxx:"+(String) session.getAttribute("UserId"))
        if (vditemsInstance == null) {
            notFound()
            return
        }

        if (vditemsInstance.hasErrors()) {
            respond vditemsInstance.errors, view:'create'
            return
        }

		if (vditemsInstance.picfile=='--' && params.ufile.originalFilename=='') {
			flash.message = '沒有上傳檔案物件'
			respond vditemsInstance.errors, view:'create'
			return
		}
		
		Subject currentUser = SecurityUtils.getSubject()
		log.println(" user info:"+(String) session.getAttribute("UserId"))
		vditemsInstance.createuser = currentUser.getPrincipal() 
		
		if(params.ufile.originalFilename!=''){
			if(params.ufile instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				log.println(" location:"+baseFolder)
				//new FileOutputStream(baseFolder+'/images').leftShift( params.ufile.getInputStream() )

				def filename = UUID.randomUUID().toString()+params.ufile.originalFilename
				log.println(" file name:"+params.ufile.originalFilename)
				
				params.ufile.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				
				vditemsInstance.picfile = filename
				log.println(" vditemsInstance.picfile data:"+vditemsInstance.picfile)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}
		

        vditemsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'vditems.label', default: 'Vditems'), vditemsInstance.id])
                redirect vditemsInstance
            }
            '*' { respond vditemsInstance, [status: CREATED] }
        }
    }

    def edit(Vditems vditemsInstance) {
        respond vditemsInstance
    }

    @Transactional
    def update(Vditems vditemsInstance) {
		log.println("*******")
        if (vditemsInstance == null) {
            notFound()
            return
        }

        if (vditemsInstance.hasErrors()) {
            respond vditemsInstance.errors, view:'edit'
            return
        }
		
		if(params.ufile.originalFilename!=''){
			if(params.ufile instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				log.println(" location:"+baseFolder)
				//new FileOutputStream(baseFolder+'/images').leftShift( params.ufile.getInputStream() )

				def filename = UUID.randomUUID().toString()+params.ufile.originalFilename
				log.println(" file name:"+params.ufile.originalFilename)
				
				params.ufile.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				
				vditemsInstance.picfile = filename
				log.println(" vditemsInstance.picfile data:"+vditemsInstance.picfile)
			}else{
				log.error("wrong attachment type [${ufile.getClass()}]");
			}
		}

        vditemsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Vditems.label', default: 'Vditems'), vditemsInstance.id])
                redirect vditemsInstance
            }
            '*'{ respond vditemsInstance, [status: OK] }
        }
		
    }

    @Transactional
    def delete(Vditems vditemsInstance) {

        if (vditemsInstance == null) {
            notFound()
            return
        }

        vditemsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Vditems.label', default: 'Vditems'), vditemsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'vditems.label', default: 'Vditems'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
