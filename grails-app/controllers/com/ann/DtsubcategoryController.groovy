package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DtsubcategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Dtsubcategory.list(params), model:[dtsubcategoryInstanceCount: Dtsubcategory.count()]
    }

    def show(Dtsubcategory dtsubcategoryInstance) {
        respond dtsubcategoryInstance
    }

    def create() {
        respond new Dtsubcategory(params)
    }

    @Transactional
    def save(Dtsubcategory dtsubcategoryInstance) {
        if (dtsubcategoryInstance == null) {
            notFound()
            return
        }

        if (dtsubcategoryInstance.hasErrors()) {
            respond dtsubcategoryInstance.errors, view:'create'
            return
        }

        dtsubcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dtsubcategory.label', default: 'Dtsubcategory'), dtsubcategoryInstance.id])
                redirect dtsubcategoryInstance
            }
            '*' { respond dtsubcategoryInstance, [status: CREATED] }
        }
    }

    def edit(Dtsubcategory dtsubcategoryInstance) {
        respond dtsubcategoryInstance
    }

    @Transactional
    def update(Dtsubcategory dtsubcategoryInstance) {
        if (dtsubcategoryInstance == null) {
            notFound()
            return
        }

        if (dtsubcategoryInstance.hasErrors()) {
            respond dtsubcategoryInstance.errors, view:'edit'
            return
        }

        dtsubcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Dtsubcategory.label', default: 'Dtsubcategory'), dtsubcategoryInstance.id])
                redirect dtsubcategoryInstance
            }
            '*'{ respond dtsubcategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Dtsubcategory dtsubcategoryInstance) {

        if (dtsubcategoryInstance == null) {
            notFound()
            return
        }

        dtsubcategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Dtsubcategory.label', default: 'Dtsubcategory'), dtsubcategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dtsubcategory.label', default: 'Dtsubcategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
