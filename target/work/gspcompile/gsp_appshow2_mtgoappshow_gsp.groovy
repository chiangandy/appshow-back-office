import com.ann.Mtgoapp
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_mtgoappshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/mtgoapp/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'mtgoapp.label', default: 'Mtgoapp'))],-1)
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
if(true && (mtgoappInstance?.appsubcategory)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("mtgoapp.appsubcategory.label"),'default':("App sub category")],-1)
printHtmlPart(15)
for( d in (mtgoappInstance.appsubcategory) ) {
printHtmlPart(16)
createTagBody(4, {->
expressionOut.print(d?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("appsubcategory"),'action':("show"),'id':(d.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (mtgoappInstance?.appname)) {
printHtmlPart(20)
invokeTag('message','g',39,['code':("mtgoapp.appname.label"),'default':("Appname")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',41,['bean':(mtgoappInstance),'field':("appname")],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (mtgoappInstance?.appdesc)) {
printHtmlPart(23)
invokeTag('message','g',48,['code':("mtgoapp.appdesc.label"),'default':("Appdesc")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',50,['bean':(mtgoappInstance),'field':("appdesc")],-1)
printHtmlPart(22)
}
printHtmlPart(25)
if(true && (mtgoappInstance?.picfile)) {
printHtmlPart(26)
invokeTag('message','g',57,['code':("mtgoapp.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',59,['bean':(mtgoappInstance),'field':("picfile")],-1)
printHtmlPart(28)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:mtgoappInstance, field:'picfile')))
printHtmlPart(29)
expressionOut.print(mtgoappInstance.picfile)
printHtmlPart(30)
}
printHtmlPart(19)
if(true && (mtgoappInstance?.dtversion)) {
printHtmlPart(31)
invokeTag('message','g',67,['code':("mtgoapp.dtversion.label"),'default':("Dtversion")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',69,['bean':(mtgoappInstance),'field':("dtversion")],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (mtgoappInstance?.dateCreated)) {
printHtmlPart(33)
invokeTag('message','g',76,['code':("mtgoapp.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(34)
invokeTag('formatDate','g',78,['date':(mtgoappInstance?.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (mtgoappInstance?.lastUpdated)) {
printHtmlPart(35)
invokeTag('message','g',85,['code':("mtgoapp.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(36)
invokeTag('formatDate','g',87,['date':(mtgoappInstance?.lastUpdated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(22)
}
printHtmlPart(19)
if(true && (mtgoappInstance?.vditems)) {
printHtmlPart(37)
invokeTag('message','g',94,['code':("mtgoapp.vditems.label"),'default':("Vditems")],-1)
printHtmlPart(15)
for( v in (mtgoappInstance.vditems) ) {
printHtmlPart(38)
createTagBody(4, {->
expressionOut.print(v?.encodeAsHTML())
})
invokeTag('link','g',97,['controller':("vditems"),'action':("show"),'id':(v.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',106,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',106,['class':("edit"),'action':("edit"),'resource':(mtgoappInstance)],3)
printHtmlPart(41)
invokeTag('actionSubmit','g',107,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(42)
})
invokeTag('form','g',109,['url':([resource:mtgoappInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416140617000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
