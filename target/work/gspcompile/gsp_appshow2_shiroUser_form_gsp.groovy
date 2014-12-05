import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_shiroUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiroUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'realname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("shiroUser.realname.label"),'default':("Realname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("realname"),'required':(""),'value':(shiroUserInstance?.realname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'username', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("shiroUser.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("username"),'required':(""),'value':(shiroUserInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'passwordHash', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("shiroUser.passwordHash.label"),'default':("Password Hash")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("passwordHash"),'required':(""),'value':("")],-1)
printHtmlPart(6)
expressionOut.print(shiroUserInstance?.passwordHash)
printHtmlPart(7)
if(true && (shiroUserInstance?.passwordHash!=null)) {
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'email', 'error'))
printHtmlPart(10)
invokeTag('message','g',34,['code':("shiroUser.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['type':("email"),'name':("email"),'required':(""),'value':(shiroUserInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'additionalInfo', 'error'))
printHtmlPart(11)
invokeTag('message','g',43,['code':("shiroUser.additionalInfo.label"),'default':("Additional Info")],-1)
printHtmlPart(12)
invokeTag('textArea','g',46,['name':("additionalInfo"),'value':(shiroUserInstance?.additionalInfo),'rows':("10"),'cols':("200")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'passwordChangeRequiredOnNextLogon', 'error'))
printHtmlPart(13)
invokeTag('message','g',52,['code':("shiroUser.passwordChangeRequiredOnNextLogon.label"),'default':("Password Change Required On Next Logon")],-1)
printHtmlPart(12)
invokeTag('checkBox','g',55,['name':("passwordChangeRequiredOnNextLogon"),'value':(shiroUserInstance?.passwordChangeRequiredOnNextLogon)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'permissions', 'error'))
printHtmlPart(14)
invokeTag('message','g',61,['code':("shiroUser.permissions.label"),'default':("Permissions")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: shiroUserInstance, field: 'roles', 'error'))
printHtmlPart(16)
invokeTag('message','g',70,['code':("shiroUser.roles.label"),'default':("Roles")],-1)
printHtmlPart(12)
invokeTag('select','g',73,['name':("roles"),'from':(Role.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(shiroUserInstance?.roles*.id),'class':("many-to-many")],-1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415266768000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
