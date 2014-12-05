
<%@ page import="com.ann.Mtgoapp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'mtgoapp.label', default: 'Mtgoapp')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-mtgoapp" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-mtgoapp" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
						<th>${message(code: 'mtgoapp.appnpic.label', default: 'App圖示')}</th>
					
						<g:sortableColumn property="appname" title="${message(code: 'mtgoapp.appname.label', default: 'Appname')}" />
					
						<g:sortableColumn property="appdesc" title="${message(code: 'mtgoapp.appdesc.label', default: 'Appdesc')}" />
					
						<g:sortableColumn property="dtversion" title="${message(code: 'mtgoapp.dtversion.label', default: 'Dtversion')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'mtgoapp.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'mtgoapp.lastUpdated.label', default: 'Last Updated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${mtgoappInstanceList}" status="i" var="mtgoappInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
						<td><g:link action="show" id="${mtgoappInstance.id}"><img src="${resource(dir:'files', file:fieldValue(bean:mtgoappInstance, field:'picfile'))}" alt="${mtgoappInstance.picfile}" width="60px"/></g:link></td>
					
						<td><g:link action="show" id="${mtgoappInstance.id}">${fieldValue(bean: mtgoappInstance, field: "appname")}</g:link></td>
					
						<td width="360">${fieldValue(bean: mtgoappInstance, field: "appdesc")}</td>
					
						<td>${fieldValue(bean: mtgoappInstance, field: "dtversion")}</td>
					
						<td><g:formatDate date="${mtgoappInstance.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></td>
					
						<td><g:formatDate date="${mtgoappInstance.lastUpdated}"  format="yyyy-MM-dd HH:mm:ss"/></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${mtgoappInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
