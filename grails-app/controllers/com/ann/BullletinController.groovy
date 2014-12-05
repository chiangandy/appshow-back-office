package com.ann

import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.subject.Subject
import org.apache.shiro.SecurityUtils

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BullletinController {

    // static allowedMethods = [save: "POST", update: "POST", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Bullletin.list(params), model:[bullletinInstanceCount: Bullletin.count()]
    }

    def show(Bullletin bullletinInstance) {
        respond bullletinInstance
    }

    def create() {
        respond new Bullletin(params)
    }

    @Transactional
    def save(Bullletin bullletinInstance) {
        if (bullletinInstance == null) {
            notFound()
            return
        }

        if (bullletinInstance.hasErrors()) {
            respond bullletinInstance.errors, view:'create'
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
				
				bullletinInstance.picfile = filename
				log.println(" bullletinInstance.picfile data:"+bullletinInstance.picfile)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}
		
        bullletinInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'bullletin.label', default: 'Bullletin'), bullletinInstance.id])
                redirect bullletinInstance
            }
            '*' { respond bullletinInstance, [status: CREATED] }
        }
    }

    def edit(Bullletin bullletinInstance) {
        respond bullletinInstance
    }

    @Transactional
    def update(Bullletin bullletinInstance) {
        if (bullletinInstance == null) {
            notFound()
            return
        }

        if (bullletinInstance.hasErrors()) {
            respond bullletinInstance.errors, view:'edit'
            return
        }

		if(params.ufile.originalFilename!=''){
			if(params.ufile instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				log.println(" location:"+baseFolder)

				def filename = UUID.randomUUID().toString()+params.ufile.originalFilename
				log.println(" file name:"+params.ufile.originalFilename)
				
				params.ufile.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				
				bullletinInstance.picfile = filename
				log.println(" bullletinInstance.picfile data:"+bullletinInstance.picfile)
			}else{
				log.error("wrong attachment type [${ufile.getClass()}]");
			}
		}

		
        bullletinInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Bullletin.label', default: 'Bullletin'), bullletinInstance.id])
                redirect bullletinInstance
            }
            '*'{ respond bullletinInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Bullletin bullletinInstance) {

        if (bullletinInstance == null) {
            notFound()
            return
        }

        bullletinInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Bullletin.label', default: 'Bullletin'), bullletinInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'bullletin.label', default: 'Bullletin'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
