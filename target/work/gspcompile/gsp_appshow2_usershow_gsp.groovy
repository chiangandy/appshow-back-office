import com.ann.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_usershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
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
if(true && (userInstance?.realname)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("user.realname.label"),'default':("Realname")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(userInstance),'field':("realname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.username)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(userInstance),'field':("username")],-1)
printHtmlPart(16)
}
printHtmlPart(20)
if(true && (userInstance?.passwordHash)) {
printHtmlPart(21)
invokeTag('message','g',47,['code':("user.passwordHash.label"),'default':("Password Hash")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',49,['bean':(userInstance),'field':("passwordHash")],-1)
printHtmlPart(16)
}
printHtmlPart(23)
if(true && (UserInstance?.dateCreated)) {
printHtmlPart(24)
invokeTag('message','g',57,['code':("User.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',59,['date':(UserInstance?.dateCreated)],-1)
printHtmlPart(16)
}
printHtmlPart(26)
if(true && (userInstance?.additionalInfo)) {
printHtmlPart(27)
invokeTag('message','g',68,['code':("user.additionalInfo.label"),'default':("Additional Info")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',70,['bean':(userInstance),'field':("additionalInfo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.dateCreated)) {
printHtmlPart(24)
invokeTag('message','g',77,['code':("user.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',79,['date':(userInstance?.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.lastUpdated)) {
printHtmlPart(29)
invokeTag('message','g',86,['code':("user.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',88,['date':(userInstance?.lastUpdated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.passwordChangeRequiredOnNextLogon)) {
printHtmlPart(31)
invokeTag('message','g',95,['code':("user.passwordChangeRequiredOnNextLogon.label"),'default':("Password Change Required On Next Logon")],-1)
printHtmlPart(32)
invokeTag('formatBoolean','g',97,['boolean':(userInstance?.passwordChangeRequiredOnNextLogon)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.permissions)) {
printHtmlPart(33)
invokeTag('message','g',104,['code':("user.permissions.label"),'default':("Permissions")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',106,['bean':(userInstance),'field':("permissions")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userInstance?.roles)) {
printHtmlPart(35)
invokeTag('message','g',113,['code':("user.roles.label"),'default':("Roles")],-1)
printHtmlPart(36)
for( r in (userInstance.roles) ) {
printHtmlPart(37)
expressionOut.print(r?.encodeAsHTML())
printHtmlPart(38)
}
printHtmlPart(39)
}
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
createTagBody(3, {->
invokeTag('message','g',125,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',125,['class':("edit"),'action':("edit"),'resource':(userInstance)],3)
printHtmlPart(42)
invokeTag('actionSubmit','g',126,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(43)
})
invokeTag('form','g',128,['url':([resource:userInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(44)
})
invokeTag('captureBody','sitemesh',130,[:],1)
printHtmlPart(45)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415871823000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
