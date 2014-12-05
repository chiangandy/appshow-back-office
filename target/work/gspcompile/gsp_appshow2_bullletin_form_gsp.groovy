import com.ann.Bullletin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_bullletin_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bullletin/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('include','resource',3,['components':("autoComplete, dateChooser"),'autoComplete':([skin: 'default'])],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'bulletin_topic', 'error'))
printHtmlPart(2)
invokeTag('message','g',8,['code':("bullletin.bulletin_topic.label"),'default':("Bulletintopic")],-1)
printHtmlPart(3)
invokeTag('textField','g',11,['name':("bulletin_topic"),'maxlength':("60"),'required':(""),'value':(bullletinInstance?.bulletin_topic)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'bulletin_content', 'error'))
printHtmlPart(5)
invokeTag('message','g',17,['code':("bullletin.bulletin_content.label"),'default':("Bulletincontent")],-1)
printHtmlPart(3)
invokeTag('textArea','g',20,['name':("bulletin_content"),'cols':("40"),'rows':("5"),'maxlength':("1024"),'required':(""),'value':(bullletinInstance?.bulletin_content)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'picfile', 'error'))
printHtmlPart(6)
invokeTag('message','g',26,['code':("bullletin.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(7)
if(true && (bullletinInstance?.picfile != null)) {
printHtmlPart(8)
invokeTag('hiddenField','g',30,['name':("picfile"),'value':(bullletinInstance?.picfile)],-1)
printHtmlPart(9)
}
else {
printHtmlPart(8)
invokeTag('hiddenField','g',33,['name':("picfile"),'value':("--")],-1)
printHtmlPart(9)
}
printHtmlPart(9)
invokeTag('field','g',35,['type':("file"),'name':("ufile")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'startdate', 'error'))
printHtmlPart(11)
invokeTag('message','g',40,['code':("bullletin.startdate.label"),'default':("Startdate")],-1)
printHtmlPart(7)
invokeTag('dateChooser','richui',43,['name':("startdate"),'format':("yyyy-MM-dd"),'value':(bullletinInstance?.startdate),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'enddate', 'error'))
printHtmlPart(12)
invokeTag('message','g',49,['code':("bullletin.enddate.label"),'default':("Enddate")],-1)
printHtmlPart(7)
invokeTag('dateChooser','richui',52,['name':("enddate"),'format':("yyyy-MM-dd"),'value':(bullletinInstance?.enddate),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'gotop', 'error'))
printHtmlPart(13)
invokeTag('message','g',58,['code':("bullletin.gotop.label"),'default':("Gotop")],-1)
printHtmlPart(7)
invokeTag('checkBox','g',61,['name':("gotop"),'value':(bullletinInstance?.gotop)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: bullletinInstance, field: 'keep', 'error'))
printHtmlPart(14)
invokeTag('message','g',67,['code':("bullletin.keep.label"),'default':("Keep")],-1)
printHtmlPart(7)
invokeTag('checkBox','g',70,['name':("keep"),'value':(bullletinInstance?.keep)],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415858725000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
