import com.ann.Vditems
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_vditemsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vditems/index.gsp" }
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
invokeTag('sortableColumn','g',29,['property':("vditemname"),'title':(message(code: 'vditems.vditemname.label', default: 'Vditemname'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("vditemdesc"),'title':(message(code: 'vditems.vditemdesc.label', default: 'Vditemdesc'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("vditemtype"),'title':(message(code: 'vditems.vditemtype.label', default: 'Vditemtype'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("createuser"),'title':(message(code: 'vditems.createuser.label', default: 'Createuser'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("mediaurl"),'title':(message(code: 'vditems.mediaurl.label', default: 'Mediaurl'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',39,['property':("picfile"),'title':(message(code: 'vditems.picfile.label', default: 'Picfile'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( vditemsInstance in (vditemsInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(resource(dir:'files', file:fieldValue(bean:vditemsInstance, field:'picfile')))
printHtmlPart(19)
expressionOut.print(vditemsInstance.picfile)
printHtmlPart(20)
})
invokeTag('link','g',48,['action':("show"),'id':(vditemsInstance.id)],3)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: vditemsInstance, field: "vditemname"))
})
invokeTag('link','g',50,['action':("show"),'id':(vditemsInstance.id)],3)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: vditemsInstance, field: "vditemdesc"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: vditemsInstance, field: "vditemtype"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: vditemsInstance, field: "createuser"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: vditemsInstance, field: "mediaurl"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: vditemsInstance, field: "picfile"))
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',67,['total':(vditemsInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415270800000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
