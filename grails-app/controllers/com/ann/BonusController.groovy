package com.ann



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BonusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Bonus.list(params), model:[bonusInstanceCount: Bonus.count()]
    }

    def show(Bonus bonusInstance) {
        respond bonusInstance
    }

    def create() {
        respond new Bonus(params)
    }

    @Transactional
    def save(Bonus bonusInstance) {
        if (bonusInstance == null) {
            notFound()
            return
        }

        if (bonusInstance.hasErrors()) {
            respond bonusInstance.errors, view:'create'
            return
        }

        bonusInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'bonus.label', default: 'Bonus'), bonusInstance.id])
                redirect bonusInstance
            }
            '*' { respond bonusInstance, [status: CREATED] }
        }
    }

    def edit(Bonus bonusInstance) {
        respond bonusInstance
    }

    @Transactional
    def update(Bonus bonusInstance) {
        if (bonusInstance == null) {
            notFound()
            return
        }

        if (bonusInstance.hasErrors()) {
            respond bonusInstance.errors, view:'edit'
            return
        }

        bonusInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Bonus.label', default: 'Bonus'), bonusInstance.id])
                redirect bonusInstance
            }
            '*'{ respond bonusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Bonus bonusInstance) {

        if (bonusInstance == null) {
            notFound()
            return
        }

        bonusInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Bonus.label', default: 'Bonus'), bonusInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'bonus.label', default: 'Bonus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
