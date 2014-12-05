import com.ann.Bullletin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_bullletinshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bullletin/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (bullletinInstance?.bulletin_topic)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("bullletin.bulletin_topic.label"),'default':("Bulletintopic")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(bullletinInstance),'field':("bulletin_topic")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.bulletin_content)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("bullletin.bulletin_content.label"),'default':("Bulletincontent")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(bullletinInstance),'field':("bulletin_content")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.picfile)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("bullletin.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(bullletinInstance),'field':("picfile")],-1)
printHtmlPart(22)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:bullletinInstance, field:'picfile')))
printHtmlPart(23)
expressionOut.print(bullletinInstance.picfile)
printHtmlPart(24)
}
printHtmlPart(17)
if(true && (bullletinInstance?.startdate)) {
printHtmlPart(25)
invokeTag('message','g',55,['code':("bullletin.startdate.label"),'default':("Startdate")],-1)
printHtmlPart(26)
invokeTag('formatDate','g',57,['date':(bullletinInstance?.startdate),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.enddate)) {
printHtmlPart(27)
invokeTag('message','g',64,['code':("bullletin.enddate.label"),'default':("Enddate")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',66,['date':(bullletinInstance?.enddate),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.gotop)) {
printHtmlPart(29)
invokeTag('message','g',73,['code':("bullletin.gotop.label"),'default':("Gotop")],-1)
printHtmlPart(30)
invokeTag('formatBoolean','g',75,['boolean':(bullletinInstance?.gotop)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.keep)) {
printHtmlPart(31)
invokeTag('message','g',82,['code':("bullletin.keep.label"),'default':("Keep")],-1)
printHtmlPart(32)
invokeTag('formatBoolean','g',84,['boolean':(bullletinInstance?.keep)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.dateCreated)) {
printHtmlPart(33)
invokeTag('message','g',91,['code':("bullletin.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(34)
invokeTag('formatDate','g',93,['date':(bullletinInstance?.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (bullletinInstance?.lastUpdated)) {
printHtmlPart(35)
invokeTag('message','g',100,['code':("bullletin.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(36)
invokeTag('formatDate','g',102,['date':(bullletinInstance?.lastUpdated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
invokeTag('message','g',110,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',110,['class':("edit"),'action':("edit"),'resource':(bullletinInstance)],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',111,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',113,['url':([resource:bullletinInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415860231000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
