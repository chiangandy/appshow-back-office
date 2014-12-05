import com.ann.Mtgoapp
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_mtgoapp_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/mtgoapp/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: vditemsInstance, field: 'dtsubcategory', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("appsubcategory.subcatname.label"),'default':("Appsubcategory")],-1)
printHtmlPart(2)
invokeTag('select','g',9,['name':("appsubcategory"),'from':(com.ann.Appsubcategory.list()),'multiple':("multiple"),'optionKey':("id"),'size':("10"),'value':(mtgoappInstance?.appsubcategory*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: mtgoappInstance, field: 'appname', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("mtgoapp.appname.label"),'default':("Appname")],-1)
printHtmlPart(5)
invokeTag('textField','g',18,['name':("appname"),'maxlength':("30"),'required':(""),'value':(mtgoappInstance?.appname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: mtgoappInstance, field: 'appdesc', 'error'))
printHtmlPart(6)
invokeTag('message','g',24,['code':("mtgoapp.appdesc.label"),'default':("Appdesc")],-1)
printHtmlPart(2)
invokeTag('textArea','g',27,['name':("appdesc"),'cols':("40"),'rows':("5"),'maxlength':("512"),'value':(mtgoappInstance?.appdesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: mtgoappInstance, field: 'picfile', 'error'))
printHtmlPart(7)
invokeTag('message','g',33,['code':("mtgoapp.ufile.label"),'default':("picfile")],-1)
printHtmlPart(5)
if(true && (mtgoappInstance?.picfile != null)) {
printHtmlPart(8)
invokeTag('hiddenField','g',37,['name':("picfile"),'value':(mtgoappInstance?.picfile)],-1)
printHtmlPart(9)
}
else {
printHtmlPart(8)
invokeTag('hiddenField','g',40,['name':("picfile"),'value':("--")],-1)
printHtmlPart(9)
}
printHtmlPart(9)
invokeTag('field','g',42,['type':("file"),'name':("ufile")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: mtgoappInstance, field: 'dtversion', 'error'))
printHtmlPart(11)
invokeTag('message','g',47,['code':("mtgoapp.dtversion.label"),'default':("Dtversion")],-1)
printHtmlPart(5)
invokeTag('textField','g',50,['name':("dtversion"),'required':(""),'value':(mtgoappInstance?.dtversion)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: mtgoappInstance, field: 'vditems', 'error'))
printHtmlPart(12)
invokeTag('message','g',56,['code':("mtgoapp.vditems.label"),'default':("Vditems")],-1)
printHtmlPart(2)
invokeTag('select','g',59,['name':("vditems"),'from':(com.ann.Vditems.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(mtgoappInstance?.vditems*.id),'class':("many-to-many")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416140200000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
