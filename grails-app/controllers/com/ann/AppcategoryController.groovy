package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AppcategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Appcategory.list(params), model:[appcategoryInstanceCount: Appcategory.count()]
    }

    def show(Appcategory appcategoryInstance) {
        respond appcategoryInstance
    }

    def create() {
        respond new Appcategory(params)
    }

    @Transactional
    def save(Appcategory appcategoryInstance) {
        if (appcategoryInstance == null) {
            notFound()
            return
        }

        if (appcategoryInstance.hasErrors()) {
            respond appcategoryInstance.errors, view:'create'
            return
        }

        appcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'appcategory.label', default: 'Appcategory'), appcategoryInstance.id])
                redirect appcategoryInstance
            }
            '*' { respond appcategoryInstance, [status: CREATED] }
        }
    }

    def edit(Appcategory appcategoryInstance) {
        respond appcategoryInstance
    }

    @Transactional
    def update(Appcategory appcategoryInstance) {
        if (appcategoryInstance == null) {
            notFound()
            return
        }

        if (appcategoryInstance.hasErrors()) {
            respond appcategoryInstance.errors, view:'edit'
            return
        }

        appcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Appcategory.label', default: 'Appcategory'), appcategoryInstance.id])
                redirect appcategoryInstance
            }
            '*'{ respond appcategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Appcategory appcategoryInstance) {

        if (appcategoryInstance == null) {
            notFound()
            return
        }

        appcategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Appcategory.label', default: 'Appcategory'), appcategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'appcategory.label', default: 'Appcategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
