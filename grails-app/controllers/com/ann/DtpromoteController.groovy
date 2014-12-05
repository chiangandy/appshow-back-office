package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DtpromoteController {

    //static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Dtpromote.list(params), model:[dtpromoteInstanceCount: Dtpromote.count()]
    }

    def show(Dtpromote dtpromoteInstance) {
        respond dtpromoteInstance
    }

    def create() {
        respond new Dtpromote(params)
    }

    @Transactional
    def save(Dtpromote dtpromoteInstance) {
        if (dtpromoteInstance == null) {
            notFound()
            return
        }

        if (dtpromoteInstance.hasErrors()) {
            respond dtpromoteInstance.errors, view:'create'
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
				
				dtpromoteInstance.picfile = filename
				log.println(" dtpromoteInstance data:"+dtpromoteInstance.picfile)
			}else{
				log.error("wrong attachment type [${cfile.getClass()}]");
			}
		}

        dtpromoteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dtpromote.label', default: 'Dtpromote'), dtpromoteInstance.id])
                redirect dtpromoteInstance
            }
            '*' { respond dtpromoteInstance, [status: CREATED] }
        }
    }

    def edit(Dtpromote dtpromoteInstance) {
        respond dtpromoteInstance
    }

    @Transactional
    def update(Dtpromote dtpromoteInstance) {
        if (dtpromoteInstance == null) {
            notFound()
            return
        }

        if (dtpromoteInstance.hasErrors()) {
            respond dtpromoteInstance.errors, view:'edit'
            return
        }

		if(params.ufile.originalFilename!=''){
			if(params.ufile instanceof org.springframework.web.multipart.commons.CommonsMultipartFile){
				def baseFolder = request.getSession().getServletContext().getRealPath("/")
				log.println(" location:"+baseFolder)

				def filename = UUID.randomUUID().toString()+params.ufile.originalFilename
				log.println(" file name:"+params.ufile.originalFilename)
				
				params.ufile.transferTo(new File(baseFolder+'/files/'+filename))	// the file name will be unique
				
				dtpromoteInstance.picfile = filename
				log.println(" dtpromoteInstance.picfile data:"+dtpromoteInstance.picfile)
			}else{
				log.error("wrong attachment type [${ufile.getClass()}]");
			}
		}

        dtpromoteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Dtpromote.label', default: 'Dtpromote'), dtpromoteInstance.id])
                redirect dtpromoteInstance
            }
            '*'{ respond dtpromoteInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Dtpromote dtpromoteInstance) {

        if (dtpromoteInstance == null) {
            notFound()
            return
        }

        dtpromoteInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Dtpromote.label', default: 'Dtpromote'), dtpromoteInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dtpromote.label', default: 'Dtpromote'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
