
<%@ page import="com.ann.Dtsubcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dtsubcategory.label', default: 'Dtsubcategory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dtsubcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-dtsubcategory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						
						<g:sortableColumn property="subcatname" title="${message(code: 'dtsubcategory.subcatname.label', default: 'Subcatname')}" />
					
						<g:sortableColumn property="subcatdesc" title="${message(code: 'dtsubcategory.subcatdesc.label', default: 'Subcatdesc')}" />
					
						<g:sortableColumn property="subcatdesc" title="${message(code: 'dtsubcategory.dtcategory.label', default: 'Dtcategory')}" />
						
						<g:sortableColumn property="dateCreated" title="${message(code: 'dtsubcategory.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'dtsubcategory.lastUpdated.label', default: 'Last Updated')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dtsubcategoryInstanceList}" status="i" var="dtsubcategoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dtsubcategoryInstance.id}">${fieldValue(bean: dtsubcategoryInstance, field: "subcatname")}</g:link></td>
					
						<td>${fieldValue(bean: dtsubcategoryInstance, field: "subcatdesc")}</td>
					
						<td>${fieldValue(bean: dtsubcategoryInstance, field: "dtcategory")}</td>
					
						<td><g:formatDate date="${dtsubcategoryInstance.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></td>
					
						<td><g:formatDate date="${dtsubcategoryInstance.lastUpdated}" format="yyyy-MM-dd HH:mm:ss"/></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dtsubcategoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
