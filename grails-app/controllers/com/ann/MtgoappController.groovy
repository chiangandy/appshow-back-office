package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class MtgoappController {

    //static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Mtgoapp.list(params), model:[mtgoappInstanceCount: Mtgoapp.count()]
    }

    def show(Mtgoapp mtgoappInstance) {
        respond mtgoappInstance
    }

    def create() {
        respond new Mtgoapp(params)
    }

    @Transactional
    def save(Mtgoapp mtgoappInstance) {
        if (mtgoappInstance == null) {
            notFound()
            return
        }

        if (mtgoappInstance.hasErrors()) {
            respond mtgoappInstance.errors, view:'create'
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
				
				mtgoappInstance.picfile = filename
				log.println(" mtgoappInstance.picfile data:"+mtgoappInstance.picfile)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

        mtgoappInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'mtgoapp.label', default: 'Mtgoapp'), mtgoappInstance.id])
                redirect mtgoappInstance
            }
            '*' { respond mtgoappInstance, [status: CREATED] }
        }
    }

    def edit(Mtgoapp mtgoappInstance) {
        respond mtgoappInstance
    }

    @Transactional
    def update(Mtgoapp mtgoappInstance) {
        if (mtgoappInstance == null) {
            notFound()
            return
        }

        if (mtgoappInstance.hasErrors()) {
            respond mtgoappInstance.errors, view:'edit'
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
				
				mtgoappInstance.picfile = filename
				log.println(" mtgoappInstance.picfile data:"+mtgoappInstance.picfile)
			}else{
				log.error("wrong attachment type [${ufile.getClass()}]");
			}
		}

        mtgoappInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Mtgoapp.label', default: 'Mtgoapp'), mtgoappInstance.id])
                redirect mtgoappInstance
            }
            '*'{ respond mtgoappInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Mtgoapp mtgoappInstance) {

        if (mtgoappInstance == null) {
            notFound()
            return
        }

        mtgoappInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Mtgoapp.label', default: 'Mtgoapp'), mtgoappInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'mtgoapp.label', default: 'Mtgoapp'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
