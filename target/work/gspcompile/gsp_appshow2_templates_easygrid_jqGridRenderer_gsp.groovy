import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_appshow2_templates_easygrid_jqGridRenderer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/easygrid/_jqGridRenderer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',2,['var':("gridId"),'value':("${attrs.id}_table")],-1)
printHtmlPart(0)
invokeTag('set','g',3,['var':("pagerId"),'value':("${attrs.id}Pager")],-1)
printHtmlPart(0)
invokeTag('set','g',4,['var':("conf"),'value':(gridConfig.jqgrid)],-1)
printHtmlPart(1)
expressionOut.print(gridId)
printHtmlPart(2)
expressionOut.print(pagerId)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(gridId)
printHtmlPart(5)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.id}Rows", params: GridUtils.externalParams(gridConfig)))
printHtmlPart(6)
expressionOut.print(pagerId)
printHtmlPart(7)
expressionOut.print(JsUtils.convertToJs(conf - [navGrid: conf.navGrid] - [filterToolbar: conf.filterToolbar], gridId, true))
printHtmlPart(8)
if(true && (gridConfig.subGrid)) {
printHtmlPart(9)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.subGrid}Html"))
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (gridConfig.childGrid)) {
printHtmlPart(12)
expressionOut.print(gridConfig.childGrid)
printHtmlPart(13)
expressionOut.print(gridConfig.childParamName)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (gridConfig.inlineEdit)) {
printHtmlPart(14)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.id}InlineEdit"))
printHtmlPart(15)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.id}InlineEdit"))
printHtmlPart(16)
expressionOut.print(gridId)
printHtmlPart(10)
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
if(true && (col.render)) {
printHtmlPart(19)
expressionOut.print(JsUtils.convertToJs(col.jqgrid + [name: col.name, search: col.enableFilter, sortable: col.sortable, label: g.message(code: col.label, default: col.label)], gridId, true))
printHtmlPart(20)
if(true && (col.otherProperties)) {
printHtmlPart(21)
expressionOut.print(col.otherProperties)
printHtmlPart(20)
}
printHtmlPart(22)
}
printHtmlPart(11)
})
invokeTag('eachColumn','grid',37,['gridConfig':(gridConfig)],2)
printHtmlPart(23)
if(true && (gridConfig.otherProperties)) {
printHtmlPart(18)
expressionOut.print(gridConfig.otherProperties.trim())
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (gridConfig.masterGrid)) {
printHtmlPart(26)
expressionOut.print(gridConfig.masterGrid)
printHtmlPart(27)
expressionOut.print(gridId)
printHtmlPart(28)
expressionOut.print(gridConfig.childParamName)
printHtmlPart(29)
}
printHtmlPart(11)
if(true && (gridConfig.enableFilter)) {
printHtmlPart(26)
expressionOut.print(gridId)
printHtmlPart(30)
expressionOut.print(JsUtils.convertToJs(conf.filterToolbar, gridId))
printHtmlPart(31)
}
printHtmlPart(32)
if(true && (gridConfig.addNavGrid)) {
printHtmlPart(26)
expressionOut.print(gridId)
printHtmlPart(33)
expressionOut.print(pagerId)
printHtmlPart(34)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.generalOpts, gridId))
printHtmlPart(35)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.editOpts, gridId))
printHtmlPart(36)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.addOpts, gridId))
printHtmlPart(37)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.delOpts, gridId))
printHtmlPart(38)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.searchOpts, gridId))
printHtmlPart(39)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.viewOpts, gridId))
printHtmlPart(40)
if(true && (gridConfig.addUrl)) {
printHtmlPart(41)
expressionOut.print(pagerId)
printHtmlPart(42)
expressionOut.print(gridConfig.addUrl)
printHtmlPart(43)
}
printHtmlPart(18)
if(true && (gridConfig.addFunction)) {
printHtmlPart(41)
expressionOut.print(pagerId)
printHtmlPart(44)
expressionOut.print(gridConfig.addFunction)
printHtmlPart(45)
}
printHtmlPart(11)
}
printHtmlPart(0)
})
invokeTag('jquery','jq',65,[:],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416468521000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
