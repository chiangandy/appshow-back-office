
<%@ page import="com.ann.Bonus" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'bonus.label', default: 'Bonus')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-bonus" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-bonus" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="eventtopic" title="${message(code: 'bonus.eventtopic.label', default: 'Eventtopic')}" />
					
						<g:sortableColumn property="eventdesc" title="${message(code: 'bonus.eventdesc.label', default: 'Eventdesc')}" />
					
						<g:sortableColumn property="eventfrom" title="${message(code: 'bonus.eventfrom.label', default: 'Eventfrom')}" />
					
						<g:sortableColumn property="bonus" title="${message(code: 'bonus.bonus.label', default: 'Bonus')}" />
					
						<g:sortableColumn property="activeevent" title="${message(code: 'bonus.activeevent.label', default: 'Activeevent')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'bonus.dateCreated.label', default: 'Date Created')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${bonusInstanceList}" status="i" var="bonusInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${bonusInstance.id}">${fieldValue(bean: bonusInstance, field: "eventtopic")}</g:link></td>
					
						<td>${fieldValue(bean: bonusInstance, field: "eventdesc")}</td>
					
						<td>${fieldValue(bean: bonusInstance, field: "eventfrom")}</td>
					
						<td>${fieldValue(bean: bonusInstance, field: "bonus")}</td>
					
						<td><g:formatBoolean boolean="${bonusInstance.activeevent}" /></td>
					
						<td><g:formatDate date="${bonusInstance.dateCreated}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${bonusInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
