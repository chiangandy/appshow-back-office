import com.ann.Vdcomments
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_vdcommentsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vdcomments/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'vdcomments.label', default: 'Vdcomments'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("comtopic"),'title':(message(code: 'vdcomments.comtopic.label', default: 'Comtopic')),'style':("width: 400px")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("comrate"),'title':(message(code: 'vdcomments.comrate.label', default: 'Comrate')),'style':("width: 140px")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("dateCreated"),'title':(message(code: 'vdcomments.dateCreated.label', default: 'Date Created')),'style':("width: 190px")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("lastUpdated"),'title':(message(code: 'vdcomments.lastUpdated.label', default: 'Last Updated')),'style':("width: 190px")],-1)
printHtmlPart(14)
invokeTag('message','g',35,['code':("dtsubcategory.subcatname.label"),'default':("Vditems")],-1)
printHtmlPart(15)
loop:{
int i = 0
for( vdcommentsInstance in (vdcommentsInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: vdcommentsInstance, field: "comtopic"))
})
invokeTag('link','g',43,['action':("show"),'id':(vdcommentsInstance.id)],3)
printHtmlPart(18)

v = vdcommentsInstance.comrate
								if (v<=2) 		clr = "red" 
								else if (v>=4) 	clr = "blue" 
								else 			clr = "black"

printHtmlPart(19)
expressionOut.print(clr)
printHtmlPart(20)

(1..v).each { pi ->
									println "★"
								}

printHtmlPart(21)
invokeTag('formatDate','g',59,['date':(vdcommentsInstance.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(18)
invokeTag('formatDate','g',61,['date':(vdcommentsInstance.lastUpdated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: vdcommentsInstance, field: "vditems"))
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',70,['total':(vdcommentsInstanceCount ?: 0)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',73,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415273054000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
