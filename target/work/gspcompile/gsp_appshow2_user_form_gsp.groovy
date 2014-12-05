import com.ann.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'realname', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.realname.label"),'default':("Realname")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("realname"),'required':(""),'value':(userInstance?.realname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'username', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("username"),'required':(""),'value':(userInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'passwordHash', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.passwordHash.label"),'default':("Password Hash")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("passwordHash"),'required':(""),'value':("")],-1)
printHtmlPart(6)
expressionOut.print(userInstance?.passwordHash)
printHtmlPart(7)
if(true && (userInstance?.passwordHash!=null)) {
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(10)
invokeTag('message','g',35,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',38,['type':("email"),'name':("email"),'required':(""),'value':(userInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'additionalInfo', 'error'))
printHtmlPart(11)
invokeTag('message','g',44,['code':("user.additionalInfo.label"),'default':("Additional Info")],-1)
printHtmlPart(12)
invokeTag('textArea','g',48,['name':("additionalInfo"),'value':(userInstance?.additionalInfo),'rows':("10"),'cols':("150")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: userInstance, field: 'passwordChangeRequiredOnNextLogon', 'error'))
printHtmlPart(14)
invokeTag('message','g',53,['code':("user.passwordChangeRequiredOnNextLogon.label"),'default':("Password Change Required On Next Logon")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',56,['name':("passwordChangeRequiredOnNextLogon"),'value':(userInstance?.passwordChangeRequiredOnNextLogon)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'active', 'error'))
printHtmlPart(16)
invokeTag('message','g',62,['code':("user.active.label"),'default':("account active")],-1)
printHtmlPart(15)
invokeTag('checkBox','g',65,['name':("active"),'value':(userInstance?.active)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'permissions', 'error'))
printHtmlPart(17)
invokeTag('message','g',71,['code':("user.permissions.label"),'default':("Permissions")],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: userInstance, field: 'roles', 'error'))
printHtmlPart(19)
invokeTag('message','g',80,['code':("user.roles.label"),'default':("Roles")],-1)
printHtmlPart(15)
invokeTag('select','g',83,['name':("roles"),'from':(com.ann.Role.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(userInstance?.roles*.id),'class':("many-to-many")],-1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415690301000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
