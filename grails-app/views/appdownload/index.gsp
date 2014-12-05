
<%@ page import="com.ann.Appdownload" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appdownload.label', default: 'Appdownload')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-appdownload" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-appdownload" class="content scaffold-list" role="main">
			<h1><g:message code="default.downloadlist.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
						<th>${message(code: 'appdownload.picfile.label', default: '下載App圖示')}</th>
					
						<g:sortableColumn property="apptopic" title="${message(code: 'appdownload.apptopic.label', default: 'Apptopic')}" />
					
						<g:sortableColumn property="apppublisher" title="${message(code: 'appdownload.apppublisher.label', default: 'Apppublisher')}" />
					
						<g:sortableColumn property="appdesc" title="${message(code: 'appdownload.appdesc.label', default: 'Appdesc')}" />
					
						<g:sortableColumn property="storekey" title="${message(code: 'appdownload.datestart.label', default: 'Data Start')}" />
					
						<g:sortableColumn property="mediaurl" title="${message(code: 'appdownload.datestop.label', default: 'Date Stop')}" />
										
					</tr>
				</thead>
				<tbody>
				<g:each in="${appdownloadInstanceList}" status="i" var="appdownloadInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
						<td><g:link action="show" id="${appdownloadInstance.id}"><img src="${resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfile'))}" alt="${appdownloadInstance.picfile}" width="60px"/></g:link></td>
					
						<td><g:link action="show" id="${appdownloadInstance.id}">${fieldValue(bean: appdownloadInstance, field: "apptopic")}</g:link></td>
					
						<td>${fieldValue(bean: appdownloadInstance, field: "apppublisher")}</td>
					
						<td width="360">${fieldValue(bean: appdownloadInstance, field: "appdesc")}</td>
					
						<td><g:formatDate date="${appdownloadInstance?.datestart}"  format="yyyy-MM-dd"/></td>
					
						<td><g:formatDate date="${appdownloadInstance?.datestop}"  format="yyyy-MM-dd"/></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${appdownloadInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
