import com.ann.Dtpromote
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_dtpromoteshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dtpromote/show.gsp" }
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
if(true && (dtpromoteInstance?.promote_topic)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("dtpromote.promote_topic.label"),'default':("Promotetopic")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(dtpromoteInstance),'field':("promote_topic")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (dtpromoteInstance?.promotedesc)) {
printHtmlPart(14)
invokeTag('message','g',37,['code':("dtpromote.promotedesc.label"),'default':("Promote description")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',39,['bean':(dtpromoteInstance),'field':("promotedesc")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.picfile)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("dtpromote.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(dtpromoteInstance),'field':("picfile")],-1)
printHtmlPart(21)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:dtpromoteInstance, field:'picfile')))
printHtmlPart(22)
expressionOut.print(dtpromoteInstance.picfile)
printHtmlPart(23)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.left_XY)) {
printHtmlPart(24)
invokeTag('message','g',56,['code':("dtpromote.left_XY.label"),'default':("Left XY")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',58,['bean':(dtpromoteInstance),'field':("left_XY")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.top_XY)) {
printHtmlPart(26)
invokeTag('message','g',65,['code':("dtpromote.top_XY.label"),'default':("Top XY")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',67,['bean':(dtpromoteInstance),'field':("top_XY")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.width_XY)) {
printHtmlPart(28)
invokeTag('message','g',74,['code':("dtpromote.width_XY.label"),'default':("Width XY")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',76,['bean':(dtpromoteInstance),'field':("width_XY")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.high_XY)) {
printHtmlPart(30)
invokeTag('message','g',83,['code':("dtpromote.high_XY.label"),'default':("High XY")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',85,['bean':(dtpromoteInstance),'field':("high_XY")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.startdate)) {
printHtmlPart(32)
invokeTag('message','g',92,['code':("dtpromote.startdate.label"),'default':("Startdate")],-1)
printHtmlPart(33)
invokeTag('formatDate','g',94,['date':(dtpromoteInstance?.startdate),'format':("yyyy-MM-dd")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.enddate)) {
printHtmlPart(34)
invokeTag('message','g',101,['code':("dtpromote.enddate.label"),'default':("Enddate")],-1)
printHtmlPart(35)
invokeTag('formatDate','g',103,['date':(dtpromoteInstance?.enddate),'format':("yyyy-MM-dd")],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.appowner)) {
printHtmlPart(36)
invokeTag('message','g',110,['code':("dtpromote.appowner.label"),'default':("Appowner")],-1)
printHtmlPart(37)
createTagBody(3, {->
expressionOut.print(dtpromoteInstance?.appowner?.encodeAsHTML())
})
invokeTag('link','g',112,['controller':("mtgoapp"),'action':("show"),'id':(dtpromoteInstance?.appowner?.id)],3)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.keep_active)) {
printHtmlPart(38)
invokeTag('message','g',119,['code':("dtpromote.keep_active.label"),'default':("Keepactive")],-1)
printHtmlPart(39)
invokeTag('formatBoolean','g',121,['boolean':(dtpromoteInstance?.keep_active)],-1)
printHtmlPart(16)
}
printHtmlPart(18)
if(true && (dtpromoteInstance?.vditems_id)) {
printHtmlPart(40)
invokeTag('message','g',128,['code':("dtpromote.vditems_id.label"),'default':("Vditemsid")],-1)
printHtmlPart(41)
createTagBody(3, {->
expressionOut.print(dtpromoteInstance?.vditems_id?.encodeAsHTML())
})
invokeTag('link','g',130,['controller':("vditems"),'action':("show"),'id':(dtpromoteInstance?.vditems_id?.id)],3)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',138,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',138,['class':("edit"),'action':("edit"),'resource':(dtpromoteInstance)],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',139,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',141,['url':([resource:dtpromoteInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',143,[:],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415866035000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
