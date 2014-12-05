import com.ann.Dtcategory
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_dtcategory_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dtcategory/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: dtcategoryInstance, field: 'catname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("dtcategory.catname.label"),'default':("Catname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("catname"),'maxlength':("30"),'required':(""),'value':(dtcategoryInstance?.catname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dtcategoryInstance, field: 'catdesc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("dtcategory.catdesc.label"),'default':("Catdesc")],-1)
printHtmlPart(5)
invokeTag('textArea','g',19,['name':("catdesc"),'maxlength':("120"),'value':(dtcategoryInstance?.catdesc),'rows':("10"),'cols':("200")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dtcategoryInstance, field: 'subcategory', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("dtcategory.subcategory.label"),'default':("Subcategory")],-1)
printHtmlPart(7)
for( s in (dtcategoryInstance?.subcategory) ) {
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("dtsubcategory"),'action':("show"),'id':(s.id)],2)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'dtsubcategory.label', default: 'Dtsubcategory')]))
})
invokeTag('link','g',34,['controller':("dtsubcategory"),'action':("create"),'params':(['dtcategory.id': dtcategoryInstance?.id])],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415270378000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
