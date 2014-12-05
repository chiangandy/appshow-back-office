import com.ann.Vditems
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_vditems_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vditems/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'vditemname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("vditems.vditemname.label"),'default':("Vditemname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("vditemname"),'maxlength':("50"),'required':(""),'value':(vditemsInstance?.vditemname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'vditemdesc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("vditems.vditemdesc.label"),'default':("Vditemdesc")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("vditemdesc"),'maxlength':("200"),'value':(vditemsInstance?.vditemdesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'vditemtype', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("vditems.vditemtype.label"),'default':("Vditemtype")],-1)
printHtmlPart(5)
invokeTag('textField','g',28,['name':("vditemtype"),'maxlength':("20"),'value':(vditemsInstance?.vditemtype)],-1)
printHtmlPart(7)
invokeTag('hiddenField','g',32,['name':("createuser"),'value':(vditemsInstance?.createuser)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'mediaurl', 'error'))
printHtmlPart(9)
invokeTag('message','g',36,['code':("vditems.mediaurl.label"),'default':("Mediaurl")],-1)
printHtmlPart(2)
invokeTag('textField','g',39,['name':("mediaurl"),'maxlength':("128"),'required':(""),'value':(vditemsInstance?.mediaurl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'picfile', 'error'))
printHtmlPart(10)
invokeTag('message','g',45,['code':("vditems.ufile.label"),'default':("picfile")],-1)
printHtmlPart(2)
if(true && (vditemsInstance?.mediaurl != null)) {
printHtmlPart(11)
invokeTag('hiddenField','g',49,['name':("picfile"),'value':(vditemsInstance?.mediaurl)],-1)
printHtmlPart(12)
}
else {
printHtmlPart(11)
invokeTag('hiddenField','g',52,['name':("picfile"),'value':("--")],-1)
printHtmlPart(12)
}
printHtmlPart(12)
invokeTag('field','g',54,['type':("file"),'name':("ufile")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'appowner', 'error'))
printHtmlPart(14)
invokeTag('message','g',59,['code':("vditems.appowner.label"),'default':("Appowner")],-1)
printHtmlPart(2)
invokeTag('select','g',62,['id':("appowner"),'name':("appowner.id"),'from':(com.ann.Mtgoapp.list()),'optionKey':("id"),'required':(""),'value':(vditemsInstance?.appowner?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'dtsubcategory', 'error'))
printHtmlPart(15)
invokeTag('message','g',68,['code':("dtsubcategory.subcatname.label"),'default':("Dtsubcategory")],-1)
printHtmlPart(5)
invokeTag('select','g',71,['name':("dtsubcategory"),'from':(com.ann.Dtsubcategory.list()),'multiple':("multiple"),'optionKey':("id"),'size':("10"),'value':(vditemsInstance?.dtsubcategory*.id),'class':("many-to-many")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415273004000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
