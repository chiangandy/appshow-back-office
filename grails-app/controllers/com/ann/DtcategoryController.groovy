package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DtcategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Dtcategory.list(params), model:[dtcategoryInstanceCount: Dtcategory.count()]
    }

    def show(Dtcategory dtcategoryInstance) {
        respond dtcategoryInstance
    }

    def create() {
        respond new Dtcategory(params)
    }

    @Transactional
    def save(Dtcategory dtcategoryInstance) {
        if (dtcategoryInstance == null) {
            notFound()
            return
        }

        if (dtcategoryInstance.hasErrors()) {
            respond dtcategoryInstance.errors, view:'create'
            return
        }

        dtcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dtcategory.label', default: 'Dtcategory'), dtcategoryInstance.id])
                redirect dtcategoryInstance
            }
            '*' { respond dtcategoryInstance, [status: CREATED] }
        }
    }

    def edit(Dtcategory dtcategoryInstance) {
        respond dtcategoryInstance
    }

    @Transactional
    def update(Dtcategory dtcategoryInstance) {
        if (dtcategoryInstance == null) {
            notFound()
            return
        }

        if (dtcategoryInstance.hasErrors()) {
            respond dtcategoryInstance.errors, view:'edit'
            return
        }

        dtcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Dtcategory.label', default: 'Dtcategory'), dtcategoryInstance.id])
                redirect dtcategoryInstance
            }
            '*'{ respond dtcategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Dtcategory dtcategoryInstance) {

        if (dtcategoryInstance == null) {
            notFound()
            return
        }

        dtcategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Dtcategory.label', default: 'Dtcategory'), dtcategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dtcategory.label', default: 'Dtcategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
