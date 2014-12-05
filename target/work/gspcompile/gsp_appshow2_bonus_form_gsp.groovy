import com.ann.Bonus
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_bonus_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bonus/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: bonusInstance, field: 'eventtopic', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("bonus.eventtopic.label"),'default':("Eventtopic")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("eventtopic"),'maxlength':("50"),'required':(""),'value':(bonusInstance?.eventtopic)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bonusInstance, field: 'eventdesc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("bonus.eventdesc.label"),'default':("Eventdesc")],-1)
printHtmlPart(5)
invokeTag('textArea','g',19,['name':("eventdesc"),'cols':("80"),'rows':("5"),'maxlength':("512"),'value':(bonusInstance?.eventdesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bonusInstance, field: 'eventfrom', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("bonus.eventfrom.label"),'default':("Eventfrom")],-1)
printHtmlPart(5)
if(true && (bonusInstance?.eventfrom != null)) {
printHtmlPart(7)
invokeTag('textField','g',29,['name':("eventfrom"),'value':(bonusInstance?.eventfrom)],-1)
printHtmlPart(8)
}
else {
printHtmlPart(7)
invokeTag('textField','g',32,['name':("eventfrom"),'value':("後台操作")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(hasErrors(bean: bonusInstance, field: 'bonus', 'error'))
printHtmlPart(11)
invokeTag('message','g',38,['code':("bonus.bonus.label"),'default':("Bonus")],-1)
printHtmlPart(2)
invokeTag('field','g',41,['name':("bonus"),'type':("number"),'value':(bonusInstance.bonus),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bonusInstance, field: 'activeevent', 'error'))
printHtmlPart(12)
invokeTag('message','g',47,['code':("bonus.activeevent.label"),'default':("Activeevent")],-1)
printHtmlPart(5)
invokeTag('checkBox','g',50,['name':("activeevent"),'value':(bonusInstance?.activeevent)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bonusInstance, field: 'user', 'error'))
printHtmlPart(13)
invokeTag('message','g',56,['code':("bonus.user.label"),'default':("User")],-1)
printHtmlPart(2)
invokeTag('select','g',59,['id':("user"),'name':("user.id"),'from':(com.ann.User.list()),'optionKey':("id"),'required':(""),'value':(bonusInstance?.user?.id),'class':("many-to-one")],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415871460000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
