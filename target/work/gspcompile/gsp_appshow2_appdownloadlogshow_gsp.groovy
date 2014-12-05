import com.ann.Appdownloadlog
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_appdownloadlogshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/appdownloadlog/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'appdownloadlog.label', default: 'Appdownloadlog'))],-1)
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
if(true && (appdownloadlogInstance?.eventname)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("appdownloadlog.eventname.label"),'default':("Eventname")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(appdownloadlogInstance),'field':("eventname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.eventdesc)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("appdownloadlog.eventdesc.label"),'default':("Eventdesc")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(appdownloadlogInstance),'field':("eventdesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.storekey)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("appdownloadlog.storekey.label"),'default':("Storekey")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(appdownloadlogInstance),'field':("storekey")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.deviceid)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("appdownloadlog.deviceid.label"),'default':("Deviceid")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(appdownloadlogInstance),'field':("deviceid")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.openudid)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("appdownloadlog.openudid.label"),'default':("Openudid")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(appdownloadlogInstance),'field':("openudid")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.ipaddress)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("appdownloadlog.ipaddress.label"),'default':("Ipaddress")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(appdownloadlogInstance),'field':("ipaddress")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.eventstatus)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("appdownloadlog.eventstatus.label"),'default':("Eventstatus")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(appdownloadlogInstance),'field':("eventstatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.checkstatusdetail)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("appdownloadlog.checkstatusdetail.label"),'default':("Checkstatusdetail")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(appdownloadlogInstance),'field':("checkstatusdetail")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.aux1)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("appdownloadlog.aux1.label"),'default':("Aux1")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(appdownloadlogInstance),'field':("aux1")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.aux2)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("appdownloadlog.aux2.label"),'default':("Aux2")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(appdownloadlogInstance),'field':("aux2")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.aux3)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("appdownloadlog.aux3.label"),'default':("Aux3")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(appdownloadlogInstance),'field':("aux3")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.aux4)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("appdownloadlog.aux4.label"),'default':("Aux4")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(appdownloadlogInstance),'field':("aux4")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.aux5)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("appdownloadlog.aux5.label"),'default':("Aux5")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(appdownloadlogInstance),'field':("aux5")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.amount)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("appdownloadlog.amount.label"),'default':("Amount")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(appdownloadlogInstance),'field':("amount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.dateCreated)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("appdownloadlog.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(45)
invokeTag('formatDate','g',156,['date':(appdownloadlogInstance?.dateCreated)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (appdownloadlogInstance?.lastUpdated)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("appdownloadlog.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(47)
invokeTag('formatDate','g',165,['date':(appdownloadlogInstance?.lastUpdated)],-1)
printHtmlPart(16)
}
printHtmlPart(48)
createTagBody(2, {->
printHtmlPart(49)
createTagBody(3, {->
invokeTag('message','g',173,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',173,['class':("edit"),'action':("edit"),'resource':(appdownloadlogInstance)],3)
printHtmlPart(50)
invokeTag('actionSubmit','g',174,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(51)
})
invokeTag('form','g',176,['url':([resource:appdownloadlogInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(52)
})
invokeTag('captureBody','sitemesh',178,[:],1)
printHtmlPart(53)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416209202000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
