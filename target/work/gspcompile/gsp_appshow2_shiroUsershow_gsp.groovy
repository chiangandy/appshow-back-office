import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_shiroUsershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiroUser/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'shiroUser.label', default: 'ShiroUser'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (shiroUserInstance?.realname)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("shiroUser.realname.label"),'default':("Realname")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(shiroUserInstance),'field':("realname")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.username)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("shiroUser.username.label"),'default':("Username")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(shiroUserInstance),'field':("username")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.email)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("shiroUser.email.label"),'default':("Email")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(shiroUserInstance),'field':("email")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.additionalInfo)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("shiroUser.additionalInfo.label"),'default':("Additional Info")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(shiroUserInstance),'field':("additionalInfo")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.dateCreated)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("shiroUser.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(24)
invokeTag('formatDate','g',66,['date':(shiroUserInstance?.dateCreated)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.lastUpdated)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("shiroUser.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(26)
invokeTag('formatDate','g',75,['date':(shiroUserInstance?.lastUpdated)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.passwordChangeRequiredOnNextLogon)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("shiroUser.passwordChangeRequiredOnNextLogon.label"),'default':("Password Change Required On Next Logon")],-1)
printHtmlPart(28)
invokeTag('formatBoolean','g',84,['boolean':(shiroUserInstance?.passwordChangeRequiredOnNextLogon)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.permissions)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("shiroUser.permissions.label"),'default':("Permissions")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',93,['bean':(shiroUserInstance),'field':("permissions")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (shiroUserInstance?.roles)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("shiroUser.roles.label"),'default':("Roles")],-1)
printHtmlPart(32)
for( r in (shiroUserInstance.roles) ) {
printHtmlPart(33)
expressionOut.print(r?.encodeAsHTML())
printHtmlPart(34)
}
printHtmlPart(35)
}
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
createTagBody(3, {->
invokeTag('message','g',114,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',114,['class':("edit"),'action':("edit"),'resource':(shiroUserInstance)],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',115,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',117,['url':([resource:shiroUserInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',120,[:],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407227294000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
