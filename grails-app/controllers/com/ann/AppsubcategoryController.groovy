package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AppsubcategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Appsubcategory.list(params), model:[appsubcategoryInstanceCount: Appsubcategory.count()]
    }

    def show(Appsubcategory appsubcategoryInstance) {
        respond appsubcategoryInstance
    }

    def create() {
        respond new Appsubcategory(params)
    }

    @Transactional
    def save(Appsubcategory appsubcategoryInstance) {
        if (appsubcategoryInstance == null) {
            notFound()
            return
        }

        if (appsubcategoryInstance.hasErrors()) {
            respond appsubcategoryInstance.errors, view:'create'
            return
        }

        appsubcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'appsubcategory.label', default: 'Appsubcategory'), appsubcategoryInstance.id])
                redirect appsubcategoryInstance
            }
            '*' { respond appsubcategoryInstance, [status: CREATED] }
        }
    }

    def edit(Appsubcategory appsubcategoryInstance) {
        respond appsubcategoryInstance
    }

    @Transactional
    def update(Appsubcategory appsubcategoryInstance) {
        if (appsubcategoryInstance == null) {
            notFound()
            return
        }

        if (appsubcategoryInstance.hasErrors()) {
            respond appsubcategoryInstance.errors, view:'edit'
            return
        }

        appsubcategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Appsubcategory.label', default: 'Appsubcategory'), appsubcategoryInstance.id])
                redirect appsubcategoryInstance
            }
            '*'{ respond appsubcategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Appsubcategory appsubcategoryInstance) {

        if (appsubcategoryInstance == null) {
            notFound()
            return
        }

        appsubcategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Appsubcategory.label', default: 'Appsubcategory'), appsubcategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'appsubcategory.label', default: 'Appsubcategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
