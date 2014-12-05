import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_shiroUserindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiroUser/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',27,['property':("realname"),'title':(message(code: 'shiroUser.realname.label', default: 'Realname')),'style':("width: 300px")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("username"),'title':(message(code: 'shiroUser.username.label', default: 'Username')),'style':("width: 200px")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("email"),'title':(message(code: 'shiroUser.email.label', default: 'Email')),'style':("width: 200px")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',33,['property':("dateCreated"),'title':(message(code: 'shiroUser.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( shiroUserInstance in (shiroUserInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: shiroUserInstance, field: "realname"))
})
invokeTag('link','g',43,['action':("show"),'id':(shiroUserInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: shiroUserInstance, field: "username"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: shiroUserInstance, field: "email"))
printHtmlPart(17)
invokeTag('formatDate','g',49,['date':(shiroUserInstance.dateCreated),'format':("yyyy-MM-dd HH:mm:ss")],-1)
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
createTagBody(4, {->
invokeTag('message','g',54,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',54,['class':("edit"),'action':("edit"),'resource':(shiroUserInstance)],4)
printHtmlPart(20)
invokeTag('actionSubmit','g',55,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
})
invokeTag('form','g',57,['url':([resource:shiroUserInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',64,['total':(shiroUserInstanceCount ?: 0)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',68,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407227370000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
