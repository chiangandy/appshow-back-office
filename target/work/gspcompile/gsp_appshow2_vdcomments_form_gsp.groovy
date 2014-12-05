import com.ann.Vdcomments
import com.ann.Vditems
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_vdcomments_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vdcomments/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: vdcommentsInstance, field: 'comtopic', 'error'))
printHtmlPart(2)
invokeTag('message','g',6,['code':("vdcomments.comtopic.label"),'default':("Comtopic")],-1)
printHtmlPart(3)
invokeTag('textField','g',9,['name':("comtopic"),'maxlength':("140"),'required':(""),'value':(vdcommentsInstance?.comtopic)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: vdcommentsInstance, field: 'comtext', 'error'))
printHtmlPart(5)
invokeTag('message','g',15,['code':("vdcomments.comtext.label"),'default':("Comtext")],-1)
printHtmlPart(3)
invokeTag('textArea','g',18,['name':("comtext"),'maxlength':("512"),'required':(""),'rows':("5"),'value':(vdcommentsInstance?.comtext)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: vdcommentsInstance, field: 'comrate', 'error'))
printHtmlPart(6)
invokeTag('message','g',24,['code':("vdcomments.comrate.label"),'default':("Comrate")],-1)
printHtmlPart(3)
invokeTag('select','g',27,['name':("comrate"),'from':(0..5),'class':("range"),'required':(""),'value':(fieldValue(bean: vdcommentsInstance, field: 'comrate'))],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: vdcommentsInstance, field: 'vditems', 'error'))
printHtmlPart(7)
invokeTag('message','g',33,['code':("vdcomments.vditems.label"),'default':("Video Show")],-1)
printHtmlPart(3)
invokeTag('select','g',36,['id':("vditems"),'name':("vditems.id"),'from':(com.ann.Vditems.list()),'optionKey':("id"),'required':(""),'value':(vdcommentsInstance?.vditems?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415875832000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
