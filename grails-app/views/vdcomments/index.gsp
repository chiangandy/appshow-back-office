
<%@ page import="com.ann.Vdcomments" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'vdcomments.label', default: 'Vdcomments')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-vdcomments" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-vdcomments" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="comtopic" title="${message(code: 'vdcomments.comtopic.label', default: 'Comtopic')}" style="width: 400px"/>
					
						<g:sortableColumn property="comrate" title="${message(code: 'vdcomments.comrate.label', default: 'Comrate')}" style="width: 140px"/>
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'vdcomments.dateCreated.label', default: 'Date Created')}" style="width: 190px"/>
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'vdcomments.lastUpdated.label', default: 'Last Updated')}" style="width: 190px"/>
					
						<th><g:message code="dtsubcategory.subcatname.label" default="Vditems" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${vdcommentsInstanceList}" status="i" var="vdcommentsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td ><g:link action="show" id="${vdcommentsInstance.id}">${fieldValue(bean: vdcommentsInstance, field: "comtopic")}</g:link></td>
					
						<td><% 
								v = vdcommentsInstance.comrate
								if (v<=2) 		clr = "red" 
								else if (v>=4) 	clr = "blue" 
								else 			clr = "black"
							%> <font color="${clr}"> <% 
								(1..v).each { pi ->
									println "★"
								}
								
							 %>
						 </font>
						</td>
					
						<td><g:formatDate date="${vdcommentsInstance.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></td>
					
						<td><g:formatDate date="${vdcommentsInstance.lastUpdated}"  format="yyyy-MM-dd HH:mm:ss"/></td>
					
						<td>${fieldValue(bean: vdcommentsInstance, field: "vditems")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${vdcommentsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
