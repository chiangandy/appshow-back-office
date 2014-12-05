import com.ann.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_userindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/index.gsp" }
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
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("realname"),'title':(message(code: 'user.realname.label', default: 'Realname'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("username"),'title':(message(code: 'user.username.label', default: 'Username'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("roles"),'title':(message(code: 'user.roles.label', default: 'roles'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',33,['property':("email"),'title':(message(code: 'user.email.label', default: 'Email'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("additionalInfo"),'title':(message(code: 'user.additionalInfo.label', default: 'Additional Info'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("dateCreated"),'title':(message(code: 'user.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( userInstance in (userInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: userInstance, field: "realname"))
})
invokeTag('link','g',45,['action':("show"),'id':(userInstance.id)],3)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: userInstance, field: "username"))
printHtmlPart(20)
loop:{
int id = 0
for( r in (userInstance.roles) ) {
printHtmlPart(21)
if(true && (id!=0)) {
printHtmlPart(22)
}
printHtmlPart(23)
expressionOut.print(r?.encodeAsHTML())
printHtmlPart(24)
id++
}
}
printHtmlPart(25)
expressionOut.print(fieldValue(bean: userInstance, field: "email"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: userInstance, field: "additionalInfo"))
printHtmlPart(26)
invokeTag('formatDate','g',60,['date':(userInstance.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('paginate','g',68,['total':(userInstanceCount ?: 0)],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416143308000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
