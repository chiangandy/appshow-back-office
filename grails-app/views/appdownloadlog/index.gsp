
<%@ page import="com.ann.Appdownloadlog" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appdownloadlog.label', default: 'Appdownloadlog')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-appdownloadlog" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-appdownloadlog" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="eventname" title="${message(code: 'appdownloadlog.eventname.label', default: 'Eventname')}" />
					
						<g:sortableColumn property="eventdesc" title="${message(code: 'appdownloadlog.eventdesc.label', default: 'Eventdesc')}" />
					
						<g:sortableColumn property="storekey" title="${message(code: 'appdownloadlog.storekey.label', default: 'Storekey')}" />
					
						<g:sortableColumn property="deviceid" title="${message(code: 'appdownloadlog.deviceid.label', default: 'Deviceid')}" />
					
						<g:sortableColumn property="openudid" title="${message(code: 'appdownloadlog.openudid.label', default: 'Openudid')}" />
					
						<g:sortableColumn property="ipaddress" title="${message(code: 'appdownloadlog.ipaddress.label', default: 'Ipaddress')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${appdownloadlogInstanceList}" status="i" var="appdownloadlogInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${appdownloadlogInstance.id}">${fieldValue(bean: appdownloadlogInstance, field: "eventname")}</g:link></td>
					
						<td>${fieldValue(bean: appdownloadlogInstance, field: "eventdesc")}</td>
					
						<td>${fieldValue(bean: appdownloadlogInstance, field: "storekey")}</td>
					
						<td>${fieldValue(bean: appdownloadlogInstance, field: "deviceid")}</td>
					
						<td>${fieldValue(bean: appdownloadlogInstance, field: "openudid")}</td>
					
						<td>${fieldValue(bean: appdownloadlogInstance, field: "ipaddress")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${appdownloadlogInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
