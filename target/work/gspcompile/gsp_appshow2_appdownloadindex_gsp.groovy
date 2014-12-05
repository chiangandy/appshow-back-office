import com.ann.Appdownload
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_appdownloadindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/appdownload/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'appdownload.label', default: 'Appdownload'))],-1)
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
invokeTag('message','g',19,['code':("default.downloadlist.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(message(code: 'appdownload.picfile.label', default: '下載App圖示'))
printHtmlPart(13)
invokeTag('sortableColumn','g',28,['property':("apptopic"),'title':(message(code: 'appdownload.apptopic.label', default: 'Apptopic'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',30,['property':("apppublisher"),'title':(message(code: 'appdownload.apppublisher.label', default: 'Apppublisher'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',32,['property':("appdesc"),'title':(message(code: 'appdownload.appdesc.label', default: 'Appdesc'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',34,['property':("storekey"),'title':(message(code: 'appdownload.datestart.label', default: 'Data Start'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',36,['property':("mediaurl"),'title':(message(code: 'appdownload.datestop.label', default: 'Date Stop'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( appdownloadInstance in (appdownloadInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfile')))
printHtmlPart(19)
expressionOut.print(appdownloadInstance.picfile)
printHtmlPart(20)
})
invokeTag('link','g',43,['action':("show"),'id':(appdownloadInstance.id)],3)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: appdownloadInstance, field: "apptopic"))
})
invokeTag('link','g',45,['action':("show"),'id':(appdownloadInstance.id)],3)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: appdownloadInstance, field: "apppublisher"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: appdownloadInstance, field: "appdesc"))
printHtmlPart(21)
invokeTag('formatDate','g',51,['date':(appdownloadInstance?.datestart),'format':("yyyy-MM-dd")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',53,['date':(appdownloadInstance?.datestop),'format':("yyyy-MM-dd")],-1)
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',60,['total':(appdownloadInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415870339000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
