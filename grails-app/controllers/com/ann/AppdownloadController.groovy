package com.ann

import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.subject.Subject
import org.apache.shiro.SecurityUtils

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AppdownloadController {

//    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Appdownload.list(params), model:[appdownloadInstanceCount: Appdownload.count()]
    }

    def show(Appdownload appdownloadInstance) {
        respond appdownloadInstance
    }

    def create() {
        respond new Appdownload(params)
    }

    @Transactional
    def save(Appdownload appdownloadInstance) {
        if (appdownloadInstance == null) {
            notFound()
            return
        }

        if (appdownloadInstance.hasErrors()) {
            respond appdownloadInstance.errors, view:'create'
            return
        }

		Subject currentUser = SecurityUtils.getSubject()
		log.println("user info:"+(String) session.getAttribute("UserId"))
		appdownloadInstance.opuser = currentUser.getPrincipal()
		
		if(params.ufile.originalFilename!=''){
			if(params.ufile instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile.originalFilename
				params.ufile.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfile = filename
				log.println(" appdownloadInstance.picfile data:"+appdownloadInstance.picfile)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

		if(params.ufile1.originalFilename!=''){
			if(params.ufile1 instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile1.originalFilename
				params.ufile1.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfiled1 = filename
				log.println(" appdownloadInstance.picfiled1 data:"+appdownloadInstance.picfiled1)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

		if(params.ufile2.originalFilename!=''){
			if(params.ufile2 instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile2.originalFilename
				params.ufile2.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfiled2 = filename
				log.println(" appdownloadInstance.picfiled2 data:"+appdownloadInstance.picfiled2)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

		if(params.ufile3.originalFilename!=''){
			if(params.ufile3 instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile3.originalFilename
				params.ufile3.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfiled3 = filename
				log.println(" appdownloadInstance.picfiled3 data:"+appdownloadInstance.picfiled3)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

        appdownloadInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'appdownload.label', default: 'Appdownload'), appdownloadInstance.id])
                redirect appdownloadInstance
            }
            '*' { respond appdownloadInstance, [status: CREATED] }
        }
    }

    def edit(Appdownload appdownloadInstance) {
        respond appdownloadInstance
    }

    @Transactional
    def update(Appdownload appdownloadInstance) {
        if (appdownloadInstance == null) {
            notFound()
            return
        }

        if (appdownloadInstance.hasErrors()) {
            respond appdownloadInstance.errors, view:'edit'
            return
        }

		Subject currentUser = SecurityUtils.getSubject()
		log.println("user info:"+(String) session.getAttribute("UserId"))
		appdownloadInstance.opuser = currentUser.getPrincipal()
		
		if(params.ufile.originalFilename!=''){
			if(params.ufile instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile.originalFilename
				params.ufile.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfile = filename
				log.println(" appdownloadInstance.picfile data:"+appdownloadInstance.picfile)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

		if(params.ufile1.originalFilename!=''){
			if(params.ufile1 instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile1.originalFilename
				params.ufile1.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfiled1 = filename
				log.println(" appdownloadInstance.picfiled1 data:"+appdownloadInstance.picfiled1)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

		if(params.ufile2.originalFilename!=''){
			if(params.ufile2 instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile1.originalFilename
				params.ufile2.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfiled2 = filename
				log.println(" appdownloadInstance.picfiled1 data:"+appdownloadInstance.picfiled2)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

		if(params.ufile3.originalFilename!=''){
			if(params.ufile3 instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				def filename = UUID.randomUUID().toString()+params.ufile3.originalFilename
				params.ufile3.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				appdownloadInstance.picfiled3 = filename
				log.println(" appdownloadInstance.picfiled3 data:"+appdownloadInstance.picfiled3)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

        appdownloadInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Appdownload.label', default: 'Appdownload'), appdownloadInstance.id])
                redirect appdownloadInstance
            }
            '*'{ respond appdownloadInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Appdownload appdownloadInstance) {

        if (appdownloadInstance == null) {
            notFound()
            return
        }

        appdownloadInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Appdownload.label', default: 'Appdownload'), appdownloadInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'appdownload.label', default: 'Appdownload'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
