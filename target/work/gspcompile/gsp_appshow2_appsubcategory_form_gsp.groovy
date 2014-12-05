import com.ann.Appsubcategory
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_appsubcategory_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/appsubcategory/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: appsubcategoryInstance, field: 'subcatname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("appsubcategory.subcatname.label"),'default':("Subcatname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("subcatname"),'maxlength':("30"),'required':(""),'value':(appsubcategoryInstance?.subcatname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appsubcategoryInstance, field: 'subcatdesc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("appsubcategory.subcatdesc.label"),'default':("Subcatdesc")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("subcatdesc"),'maxlength':("120"),'value':(appsubcategoryInstance?.subcatdesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appsubcategoryInstance, field: 'appcategory', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("appsubcategory.appcategory.label"),'default':("Appcategory")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("appcategory"),'name':("appcategory.id"),'from':(com.ann.Appcategory.list()),'optionKey':("id"),'required':(""),'value':(appsubcategoryInstance?.appcategory?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appsubcategoryInstance, field: 'mtgoapp', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("appsubcategory.mtgoapp.label"),'default':("Mtgoapp")],-1)
printHtmlPart(5)
invokeTag('select','g',37,['name':("mtgoapp"),'from':(com.ann.Mtgoapp.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(appsubcategoryInstance?.mtgoapp*.id),'class':("many-to-many")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416138856000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
