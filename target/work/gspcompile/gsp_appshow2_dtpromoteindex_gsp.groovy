import com.ann.Dtpromote
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_dtpromoteindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dtpromote/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'dtpromote.label', default: 'Dtpromote'))],-1)
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
invokeTag('message','g',19,['code':("dtpromote.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(message(code: 'dtpromote.picfile.label', default: '廣告圖示'))
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("promote_topic"),'title':(message(code: 'dtpromote.promote_topic.label', default: 'Promotetopic'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("picfile"),'title':(message(code: 'dtpromote.promotedesc.label', default: 'Picfile'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',33,['property':("left_XY"),'title':(message(code: 'dtpromote.left_XY.label', default: 'Left XY'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',35,['property':("top_XY"),'title':(message(code: 'dtpromote.top_XY.label', default: 'Top XY'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',37,['property':("width_XY"),'title':(message(code: 'dtpromote.width_XY.label', default: 'Width XY'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',39,['property':("high_XY"),'title':(message(code: 'dtpromote.high_XY.label', default: 'High XY'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( dtpromoteInstance in (dtpromoteInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:dtpromoteInstance, field:'picfile')))
printHtmlPart(19)
expressionOut.print(dtpromoteInstance.picfile)
printHtmlPart(20)
})
invokeTag('link','g',46,['action':("show"),'id':(dtpromoteInstance.id)],3)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: dtpromoteInstance, field: "promote_topic"))
})
invokeTag('link','g',48,['action':("show"),'id':(dtpromoteInstance.id)],3)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: dtpromoteInstance, field: "promotedesc"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: dtpromoteInstance, field: "left_XY"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: dtpromoteInstance, field: "top_XY"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: dtpromoteInstance, field: "width_XY"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: dtpromoteInstance, field: "high_XY"))
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',65,['total':(dtpromoteInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',68,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415865990000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
