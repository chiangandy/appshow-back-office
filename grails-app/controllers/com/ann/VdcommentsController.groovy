package com.ann


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class VdcommentsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Vdcomments.list(params), model:[vdcommentsInstanceCount: Vdcomments.count()]
    }

    def show(Vdcomments vdcommentsInstance) {
        respond vdcommentsInstance
    }

    def create() {
        respond new Vdcomments(params)
    }

    @Transactional
    def save(Vdcomments vdcommentsInstance) {
        if (vdcommentsInstance == null) {
            notFound()
            return
        }

        if (vdcommentsInstance.hasErrors()) {
            respond vdcommentsInstance.errors, view:'create'
            return
        }

        vdcommentsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'vdcomments.label', default: 'Vdcomments'), vdcommentsInstance.id])
                redirect vdcommentsInstance
            }
            '*' { respond vdcommentsInstance, [status: CREATED] }
        }
    }

    def edit(Vdcomments vdcommentsInstance) {
        respond vdcommentsInstance
    }

    @Transactional
    def update(Vdcomments vdcommentsInstance) {
        if (vdcommentsInstance == null) {
            notFound()
            return
        }

        if (vdcommentsInstance.hasErrors()) {
            respond vdcommentsInstance.errors, view:'edit'
            return
        }

        vdcommentsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Vdcomments.label', default: 'Vdcomments'), vdcommentsInstance.id])
                redirect vdcommentsInstance
            }
            '*'{ respond vdcommentsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Vdcomments vdcommentsInstance) {

        if (vdcommentsInstance == null) {
            notFound()
            return
        }

        vdcommentsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Vdcomments.label', default: 'Vdcomments'), vdcommentsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'vdcomments.label', default: 'Vdcomments'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
