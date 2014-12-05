import com.ann.Dtpromote
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_dtpromote_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dtpromote/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('include','resource',3,['components':("autoComplete, dateChooser"),'autoComplete':([skin: 'default'])],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'promote_topic', 'error'))
printHtmlPart(2)
invokeTag('message','g',7,['code':("dtpromote.promote_topic.label"),'default':("Promotetopic")],-1)
printHtmlPart(3)
invokeTag('textField','g',10,['name':("promote_topic"),'maxlength':("50"),'required':(""),'value':(dtpromoteInstance?.promote_topic)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'promotedesc', 'error'))
printHtmlPart(5)
invokeTag('message','g',16,['code':("dtpromote.promotedesc.label"),'default':("Promote description ")],-1)
printHtmlPart(3)
invokeTag('textArea','g',19,['name':("promotedesc"),'cols':("40"),'rows':("5"),'maxlength':("1024"),'required':(""),'value':(dtpromoteInstance?.promotedesc)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'picfile', 'error'))
printHtmlPart(7)
invokeTag('message','g',26,['code':("dtpromote.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(8)
if(true && (dtpromoteInstance?.picfile != null)) {
printHtmlPart(9)
invokeTag('hiddenField','g',30,['name':("picfile"),'value':(dtpromoteInstance?.picfile)],-1)
printHtmlPart(10)
}
else {
printHtmlPart(9)
invokeTag('hiddenField','g',33,['name':("picfile"),'value':("--")],-1)
printHtmlPart(10)
}
printHtmlPart(10)
invokeTag('field','g',35,['type':("file"),'name':("ufile")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'left_XY', 'error'))
printHtmlPart(11)
invokeTag('message','g',41,['code':("dtpromote.left_XY.label"),'default':("Left XY")],-1)
printHtmlPart(3)
invokeTag('field','g',44,['name':("left_XY"),'type':("number"),'value':(dtpromoteInstance.left_XY),'required':("")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'top_XY', 'error'))
printHtmlPart(12)
invokeTag('message','g',50,['code':("dtpromote.top_XY.label"),'default':("Top XY")],-1)
printHtmlPart(3)
invokeTag('field','g',53,['name':("top_XY"),'type':("number"),'value':(dtpromoteInstance.top_XY),'required':("")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'width_XY', 'error'))
printHtmlPart(13)
invokeTag('message','g',59,['code':("dtpromote.width_XY.label"),'default':("Width XY")],-1)
printHtmlPart(3)
invokeTag('field','g',62,['name':("width_XY"),'type':("number"),'value':(dtpromoteInstance.width_XY),'required':("")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'high_XY', 'error'))
printHtmlPart(14)
invokeTag('message','g',68,['code':("dtpromote.high_XY.label"),'default':("High XY")],-1)
printHtmlPart(3)
invokeTag('field','g',71,['name':("high_XY"),'type':("number"),'value':(dtpromoteInstance.high_XY),'required':("")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'startdate', 'error'))
printHtmlPart(15)
invokeTag('message','g',77,['code':("dtpromote.startdate.label"),'default':("Startdate")],-1)
printHtmlPart(8)
invokeTag('dateChooser','richui',80,['name':("startdate"),'format':("yyyy-MM-dd"),'value':(dtpromoteInstance?.startdate),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'enddate', 'error'))
printHtmlPart(17)
invokeTag('message','g',84,['code':("dtpromote.enddate.label"),'default':("Enddate")],-1)
printHtmlPart(8)
invokeTag('dateChooser','richui',87,['name':("enddate"),'format':("yyyy-MM-dd"),'value':(dtpromoteInstance?.enddate),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'appowner', 'error'))
printHtmlPart(19)
invokeTag('message','g',93,['code':("dtpromote.appowner.label"),'default':("Appowner")],-1)
printHtmlPart(3)
invokeTag('select','g',96,['id':("appowner"),'name':("appowner.id"),'from':(com.ann.Mtgoapp.list()),'optionKey':("id"),'required':(""),'value':(dtpromoteInstance?.appowner?.id),'class':("many-to-one")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'keep_active', 'error'))
printHtmlPart(20)
invokeTag('message','g',102,['code':("dtpromote.keep_active.label"),'default':("Keepactive")],-1)
printHtmlPart(8)
invokeTag('checkBox','g',105,['name':("keep_active"),'value':(dtpromoteInstance?.keep_active)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: dtpromoteInstance, field: 'vditems_id', 'error'))
printHtmlPart(21)
invokeTag('message','g',111,['code':("dtpromote.vditems_id.label"),'default':("Vditemsid")],-1)
printHtmlPart(3)
invokeTag('select','g',114,['id':("vditems_id"),'name':("vditems_id.id"),'from':(com.ann.Vditems.list()),'optionKey':("id"),'required':(""),'value':(dtpromoteInstance?.vditems_id?.id),'class':("many-to-one")],-1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415865357000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
