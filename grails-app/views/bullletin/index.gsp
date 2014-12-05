
<%@ page import="com.ann.Bullletin" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'bullletin.label', default: 'Bullletin')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-bullletin" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-bullletin" class="content scaffold-list" role="main">
			<h1><g:message code="bulletin.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="bulletin_topic" title="${message(code: 'bullletin.bulletin_topic.label', default: 'Bulletintopic')}" />
					
						<g:sortableColumn property="bulletin_content" title="${message(code: 'bullletin.bulletin_content.label', default: 'Bulletincontent')}" />
					
						<g:sortableColumn property="startdate" title="${message(code: 'bullletin.startdate.label', default: 'Startdate')}" />
					
						<g:sortableColumn property="enddate" title="${message(code: 'bullletin.enddate.label', default: 'Enddate')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'bullletin.dateCreated.label', default: 'Date Created')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${bullletinInstanceList}" status="i" var="bullletinInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${bullletinInstance.id}">${fieldValue(bean: bullletinInstance, field: "bulletin_topic")}</g:link></td>
					
						<td>${fieldValue(bean: bullletinInstance, field: "bulletin_content")}</td>
					
						<td><g:formatDate date="${bullletinInstance.startdate}" format="yyyy-MM-dd"/></td>
					
						<td><g:formatDate date="${bullletinInstance.enddate}" format="yyyy-MM-dd"/></td>
					
						<td><g:formatDate date="${bullletinInstance.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${bullletinInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
