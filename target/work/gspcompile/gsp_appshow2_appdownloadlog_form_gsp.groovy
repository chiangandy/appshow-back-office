import com.ann.Appdownloadlog
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_appdownloadlog_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/appdownloadlog/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'eventname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("appdownloadlog.eventname.label"),'default':("Eventname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("eventname"),'maxlength':("80"),'value':(appdownloadlogInstance?.eventname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'eventdesc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("appdownloadlog.eventdesc.label"),'default':("Eventdesc")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("eventdesc"),'maxlength':("180"),'value':(appdownloadlogInstance?.eventdesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'storekey', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("appdownloadlog.storekey.label"),'default':("Storekey")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("storekey"),'maxlength':("70"),'value':(appdownloadlogInstance?.storekey)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'deviceid', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("appdownloadlog.deviceid.label"),'default':("Deviceid")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("deviceid"),'maxlength':("40"),'value':(appdownloadlogInstance?.deviceid)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'openudid', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("appdownloadlog.openudid.label"),'default':("Openudid")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("openudid"),'maxlength':("40"),'value':(appdownloadlogInstance?.openudid)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'ipaddress', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("appdownloadlog.ipaddress.label"),'default':("Ipaddress")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("ipaddress"),'maxlength':("20"),'value':(appdownloadlogInstance?.ipaddress)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'eventstatus', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("appdownloadlog.eventstatus.label"),'default':("Eventstatus")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("eventstatus"),'maxlength':("16"),'value':(appdownloadlogInstance?.eventstatus)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'checkstatusdetail', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("appdownloadlog.checkstatusdetail.label"),'default':("Checkstatusdetail")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("checkstatusdetail"),'maxlength':("100"),'value':(appdownloadlogInstance?.checkstatusdetail)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'aux1', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("appdownloadlog.aux1.label"),'default':("Aux1")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("aux1"),'maxlength':("80"),'value':(appdownloadlogInstance?.aux1)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'aux2', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("appdownloadlog.aux2.label"),'default':("Aux2")],-1)
printHtmlPart(2)
invokeTag('textArea','g',91,['name':("aux2"),'cols':("40"),'rows':("5"),'maxlength':("255"),'value':(appdownloadlogInstance?.aux2)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'aux3', 'error'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("appdownloadlog.aux3.label"),'default':("Aux3")],-1)
printHtmlPart(2)
invokeTag('textArea','g',100,['name':("aux3"),'cols':("40"),'rows':("5"),'maxlength':("255"),'value':(appdownloadlogInstance?.aux3)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'aux4', 'error'))
printHtmlPart(14)
invokeTag('message','g',106,['code':("appdownloadlog.aux4.label"),'default':("Aux4")],-1)
printHtmlPart(2)
invokeTag('textArea','g',109,['name':("aux4"),'cols':("40"),'rows':("5"),'maxlength':("255"),'value':(appdownloadlogInstance?.aux4)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'aux5', 'error'))
printHtmlPart(15)
invokeTag('message','g',115,['code':("appdownloadlog.aux5.label"),'default':("Aux5")],-1)
printHtmlPart(2)
invokeTag('textArea','g',118,['name':("aux5"),'cols':("40"),'rows':("5"),'maxlength':("255"),'value':(appdownloadlogInstance?.aux5)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadlogInstance, field: 'amount', 'error'))
printHtmlPart(16)
invokeTag('message','g',124,['code':("appdownloadlog.amount.label"),'default':("Amount")],-1)
printHtmlPart(17)
invokeTag('field','g',127,['name':("amount"),'type':("number"),'value':(appdownloadlogInstance.amount),'required':("")],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416209201000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
