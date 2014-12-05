import com.ann.Dtsubcategory
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_dtsubcategory_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dtsubcategory/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: dtsubcategoryInstance, field: 'dtcategory', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("dtsubcategory.dtcategory.label"),'default':("Dtcategory")],-1)
printHtmlPart(2)
invokeTag('select','g',9,['id':("dtcategory"),'name':("dtcategory.id"),'from':(com.ann.Dtcategory.list()),'optionKey':("id"),'required':(""),'value':(dtsubcategoryInstance?.dtcategory?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dtsubcategoryInstance, field: 'subcatname', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("dtsubcategory.subcatname.label"),'default':("Subcatname")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("subcatname"),'maxlength':("30"),'required':(""),'value':(dtsubcategoryInstance?.subcatname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dtsubcategoryInstance, field: 'subcatdesc', 'error'))
printHtmlPart(5)
invokeTag('message','g',24,['code':("dtsubcategory.subcatdesc.label"),'default':("Subcatdesc")],-1)
printHtmlPart(6)
invokeTag('textArea','g',27,['name':("subcatdesc"),'maxlength':("120"),'value':(dtsubcategoryInstance?.subcatdesc),'rows':("10"),'cols':("200")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415701795000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
