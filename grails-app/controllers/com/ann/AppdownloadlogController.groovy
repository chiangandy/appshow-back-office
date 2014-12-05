package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AppdownloadlogController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Appdownloadlog.list(params), model:[appdownloadlogInstanceCount: Appdownloadlog.count()]
    }

    def show(Appdownloadlog appdownloadlogInstance) {
        respond appdownloadlogInstance
    }

    def create() {
        respond new Appdownloadlog(params)
    }

    @Transactional
    def save(Appdownloadlog appdownloadlogInstance) {
        if (appdownloadlogInstance == null) {
            notFound()
            return
        }

        if (appdownloadlogInstance.hasErrors()) {
            respond appdownloadlogInstance.errors, view:'create'
            return
        }

        appdownloadlogInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'appdownloadlog.label', default: 'Appdownloadlog'), appdownloadlogInstance.id])
                redirect appdownloadlogInstance
            }
            '*' { respond appdownloadlogInstance, [status: CREATED] }
        }
    }

    def edit(Appdownloadlog appdownloadlogInstance) {
        respond appdownloadlogInstance
    }

    @Transactional
    def update(Appdownloadlog appdownloadlogInstance) {
        if (appdownloadlogInstance == null) {
            notFound()
            return
        }

        if (appdownloadlogInstance.hasErrors()) {
            respond appdownloadlogInstance.errors, view:'edit'
            return
        }

        appdownloadlogInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Appdownloadlog.label', default: 'Appdownloadlog'), appdownloadlogInstance.id])
                redirect appdownloadlogInstance
            }
            '*'{ respond appdownloadlogInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Appdownloadlog appdownloadlogInstance) {

        if (appdownloadlogInstance == null) {
            notFound()
            return
        }

        appdownloadlogInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Appdownloadlog.label', default: 'Appdownloadlog'), appdownloadlogInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'appdownloadlog.label', default: 'Appdownloadlog'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
