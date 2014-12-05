import com.ann.Bullletin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_bullletinindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bullletin/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'bullletin.label', default: 'Bullletin'))],-1)
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
invokeTag('message','g',19,['code':("bulletin.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("bulletin_topic"),'title':(message(code: 'bullletin.bulletin_topic.label', default: 'Bulletintopic'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("bulletin_content"),'title':(message(code: 'bullletin.bulletin_content.label', default: 'Bulletincontent'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("startdate"),'title':(message(code: 'bullletin.startdate.label', default: 'Startdate'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("enddate"),'title':(message(code: 'bullletin.enddate.label', default: 'Enddate'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("dateCreated"),'title':(message(code: 'bullletin.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( bullletinInstance in (bullletinInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: bullletinInstance, field: "bulletin_topic"))
})
invokeTag('link','g',43,['action':("show"),'id':(bullletinInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: bullletinInstance, field: "bulletin_content"))
printHtmlPart(17)
invokeTag('formatDate','g',47,['date':(bullletinInstance.startdate),'format':("yyyy-MM-dd")],-1)
printHtmlPart(17)
invokeTag('formatDate','g',49,['date':(bullletinInstance.enddate),'format':("yyyy-MM-dd")],-1)
printHtmlPart(17)
invokeTag('formatDate','g',51,['date':(bullletinInstance.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',58,['total':(bullletinInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415866157000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
