
<%@ page import="com.ann.Appcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appcategory.label', default: 'Appcategory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-appcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-appcategory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="catname" title="${message(code: 'appcategory.catname.label', default: 'Catname')}" />
					
						<g:sortableColumn property="catdesc" title="${message(code: 'appcategory.catdesc.label', default: 'Catdesc')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'appcategory.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'appcategory.lastUpdated.label', default: 'Last Updated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${appcategoryInstanceList}" status="i" var="appcategoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${appcategoryInstance.id}">${fieldValue(bean: appcategoryInstance, field: "catname")}</g:link></td>
					
						<td>${fieldValue(bean: appcategoryInstance, field: "catdesc")}</td>
					
						<td><g:formatDate date="${appcategoryInstance.dateCreated}" /></td>
					
						<td><g:formatDate date="${appcategoryInstance.lastUpdated}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${appcategoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
