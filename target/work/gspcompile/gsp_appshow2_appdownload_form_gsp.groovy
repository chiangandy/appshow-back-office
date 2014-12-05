import com.ann.Appdownload
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_appdownload_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/appdownload/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'apptopic', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("appdownload.apptopic.label"),'default':("Apptopic")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("apptopic"),'maxlength':("80"),'required':(""),'value':(appdownloadInstance?.apptopic)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'apppublisher', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("appdownload.apppublisher.label"),'default':("Apppublisher")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("apppublisher"),'maxlength':("60"),'value':(appdownloadInstance?.apppublisher)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'appdesc', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("appdownload.appdesc.label"),'default':("Appdesc")],-1)
printHtmlPart(5)
invokeTag('textArea','g',28,['name':("appdesc"),'cols':("40"),'rows':("5"),'maxlength':("500"),'value':(appdownloadInstance?.appdesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'storekey', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("appdownload.storekey.label"),'default':("Storekey")],-1)
printHtmlPart(5)
invokeTag('textField','g',37,['name':("storekey"),'maxlength':("40"),'value':(appdownloadInstance?.storekey)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'mediaurl', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("appdownload.mediaurl.label"),'default':("Mediaurl")],-1)
printHtmlPart(5)
invokeTag('textField','g',46,['name':("mediaurl"),'maxlength':("128"),'value':(appdownloadInstance?.mediaurl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'picfile', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("appdownload.picfile.label"),'default':("Picfile")],-1)
printHtmlPart(2)
if(true && (appdownloadInstance?.picfile != null)) {
printHtmlPart(10)
invokeTag('hiddenField','g',56,['name':("picfile"),'value':(appdownloadInstance?.picfile)],-1)
printHtmlPart(11)
}
else {
printHtmlPart(10)
invokeTag('hiddenField','g',59,['name':("picfile"),'value':("--")],-1)
printHtmlPart(11)
}
printHtmlPart(11)
invokeTag('field','g',61,['type':("file"),'name':("ufile")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'comrate', 'error'))
printHtmlPart(12)
invokeTag('message','g',67,['code':("appdownload.comrate.label"),'default':("Comrate")],-1)
printHtmlPart(2)
invokeTag('select','g',70,['name':("comrate"),'from':(0..5),'class':("range"),'required':(""),'value':(fieldValue(bean: appdownloadInstance, field: 'comrate'))],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'datestart', 'error'))
printHtmlPart(13)
invokeTag('message','g',76,['code':("appdownload.datestart.label"),'default':("Datestart")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',79,['name':("datestart"),'precision':("day"),'value':(appdownloadInstance?.datestart)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'datestop', 'error'))
printHtmlPart(14)
invokeTag('message','g',85,['code':("appdownload.datestop.label"),'default':("Datestop")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',88,['name':("datestop"),'precision':("day"),'value':(appdownloadInstance?.datestop)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'mtgoapp', 'error'))
printHtmlPart(15)
invokeTag('message','g',94,['code':("appdownload.mtgoapp.label"),'default':("Mtgoapp")],-1)
printHtmlPart(2)
invokeTag('select','g',97,['id':("mtgoapp"),'name':("mtgoapp.id"),'from':(com.ann.Mtgoapp.list()),'optionKey':("id"),'required':(""),'value':(appdownloadInstance?.mtgoapp?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'picfiled1', 'error'))
printHtmlPart(16)
invokeTag('message','g',103,['code':("appdownload.picfiled1.label"),'default':("Picfiled1")],-1)
printHtmlPart(2)
if(true && (appdownloadInstance?.picfiled1 != null)) {
printHtmlPart(10)
invokeTag('hiddenField','g',107,['name':("picfiled1"),'d1 value':(appdownloadInstance?.picfiled1)],-1)
printHtmlPart(11)
}
else {
printHtmlPart(10)
invokeTag('hiddenField','g',110,['name':("picfiled1"),'value':("--")],-1)
printHtmlPart(11)
}
printHtmlPart(11)
invokeTag('field','g',112,['type':("file"),'name':("ufile1")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'picfiled2', 'error'))
printHtmlPart(17)
invokeTag('message','g',118,['code':("appdownload.picfiled2.label"),'default':("Picfiled2")],-1)
printHtmlPart(2)
if(true && (appdownloadInstance?.picfiled2 != null)) {
printHtmlPart(10)
invokeTag('hiddenField','g',122,['name':("picfiled2"),'d1 value':(appdownloadInstance?.picfiled2)],-1)
printHtmlPart(11)
}
else {
printHtmlPart(10)
invokeTag('hiddenField','g',125,['name':("picfiled2"),'value':("--")],-1)
printHtmlPart(11)
}
printHtmlPart(11)
invokeTag('field','g',127,['type':("file"),'name':("ufile2")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: appdownloadInstance, field: 'picfiled3', 'error'))
printHtmlPart(18)
invokeTag('message','g',133,['code':("appdownload.picfiled3.label"),'default':("Picfiled3")],-1)
printHtmlPart(2)
if(true && (appdownloadInstance?.picfiled3 != null)) {
printHtmlPart(10)
invokeTag('hiddenField','g',137,['name':("picfiled3"),'d1 value':(appdownloadInstance?.picfiled3)],-1)
printHtmlPart(11)
}
else {
printHtmlPart(10)
invokeTag('hiddenField','g',140,['name':("picfiled3"),'value':("--")],-1)
printHtmlPart(11)
}
printHtmlPart(11)
invokeTag('field','g',142,['type':("file"),'name':("ufile3")],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1415868783000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
