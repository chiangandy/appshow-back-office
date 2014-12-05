package com.ann



import grails.test.mixin.*
import spock.lang.*

@TestFor(BullletinController)
@Mock(Bullletin)
class BullletinControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.bullletinInstanceList
            model.bullletinInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.bullletinInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            def bullletin = new Bullletin()
            bullletin.validate()
            controller.save(bullletin)

        then:"The create view is rendered again with the correct model"
            model.bullletinInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            bullletin = new Bullletin(params)

            controller.save(bullletin)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/bullletin/show/1'
            controller.flash.message != null
            Bullletin.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def bullletin = new Bullletin(params)
            controller.show(bullletin)

        then:"A model is populated containing the domain instance"
            model.bullletinInstance == bullletin
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def bullletin = new Bullletin(params)
            controller.edit(bullletin)

        then:"A model is populated containing the domain instance"
            model.bullletinInstance == bullletin
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/bullletin/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def bullletin = new Bullletin()
            bullletin.validate()
            controller.update(bullletin)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.bullletinInstance == bullletin

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            bullletin = new Bullletin(params).save(flush: true)
            controller.update(bullletin)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/bullletin/show/$bullletin.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/bullletin/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def bullletin = new Bullletin(params).save(flush: true)

        then:"It exists"
            Bullletin.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(bullletin)

        then:"The instance is deleted"
            Bullletin.count() == 0
            response.redirectedUrl == '/bullletin/index'
            flash.message != null
    }
}
