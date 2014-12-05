
<%@ page import="com.ann.Appsubcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appsubcategory.label', default: 'Appsubcategory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-appsubcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-appsubcategory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="subcatname" title="${message(code: 'appsubcategory.subcatname.label', default: 'Subcatname')}" />
					
						<g:sortableColumn property="subcatdesc" title="${message(code: 'appsubcategory.subcatdesc.label', default: 'Subcatdesc')}" />
					
						<th><g:message code="appsubcategory.appcategory.label" default="Appcategory" /></th>
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'appsubcategory.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'appsubcategory.lastUpdated.label', default: 'Last Updated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${appsubcategoryInstanceList}" status="i" var="appsubcategoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${appsubcategoryInstance.id}">${fieldValue(bean: appsubcategoryInstance, field: "subcatname")}</g:link></td>
					
						<td>${fieldValue(bean: appsubcategoryInstance, field: "subcatdesc")}</td>
					
						<td>${fieldValue(bean: appsubcategoryInstance, field: "appcategory")}</td>
					
						<td><g:formatDate date="${appsubcategoryInstance.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></td>
					
						<td><g:formatDate date="${appsubcategoryInstance.lastUpdated}" format="yyyy-MM-dd HH:mm:ss"/></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${appsubcategoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
