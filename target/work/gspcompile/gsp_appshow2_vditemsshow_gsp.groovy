import com.ann.Vditems
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_vditemsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vditems/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'vditems.label', default: 'Vditems'))],-1)
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
invokeTag('message','g',20,['code':("vditems.show.label")],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (vditemsInstance?.vditemname)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("vditems.vditemname.label"),'default':("Vditemname")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(vditemsInstance),'field':("vditemname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.vditemdesc)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("vditems.vditemdesc.label"),'default':("Vditemdesc")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(vditemsInstance),'field':("vditemdesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.vditemtype)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("vditems.vditemtype.label"),'default':("Vditemtype")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(vditemsInstance),'field':("vditemtype")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.createuser)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("vditems.createuser.label"),'default':("Createuser")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(vditemsInstance),'field':("createuser")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.mediaurl)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("vditems.mediaurl.label"),'default':("Mediaurl")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(vditemsInstance),'field':("mediaurl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.picfile)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("vditems.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(vditemsInstance),'field':("picfile")],-1)
printHtmlPart(28)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:vditemsInstance, field:'picfile')))
printHtmlPart(29)
expressionOut.print(vditemsInstance.picfile)
printHtmlPart(30)
}
printHtmlPart(17)
if(true && (vditemsInstance?.appowner)) {
printHtmlPart(31)
invokeTag('message','g',83,['code':("vditems.appowner.label"),'default':("Appowner")],-1)
printHtmlPart(32)
createTagBody(3, {->
expressionOut.print(vditemsInstance?.appowner?.encodeAsHTML())
})
invokeTag('link','g',85,['controller':("mtgoapp"),'action':("show"),'id':(vditemsInstance?.appowner?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.dtsubcategory)) {
printHtmlPart(33)
invokeTag('message','g',92,['code':("vditems.dtsubcategory.label"),'default':("Dtsubcategory")],-1)
printHtmlPart(34)
for( d in (vditemsInstance.dtsubcategory) ) {
printHtmlPart(35)
createTagBody(4, {->
expressionOut.print(d?.encodeAsHTML())
})
invokeTag('link','g',95,['controller':("dtsubcategory"),'action':("show"),'id':(d.id)],4)
printHtmlPart(36)
}
printHtmlPart(37)
}
printHtmlPart(17)
if(true && (vditemsInstance?.dateCreated)) {
printHtmlPart(38)
invokeTag('message','g',103,['code':("vditems.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(39)
invokeTag('formatDate','g',105,['date':(vditemsInstance?.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (vditemsInstance?.lastUpdated)) {
printHtmlPart(40)
invokeTag('message','g',112,['code':("vditems.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(41)
invokeTag('formatDate','g',114,['date':(vditemsInstance?.lastUpdated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',122,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',122,['class':("edit"),'action':("edit"),'resource':(vditemsInstance)],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',123,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',125,['url':([resource:vditemsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',127,[:],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416141821000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
