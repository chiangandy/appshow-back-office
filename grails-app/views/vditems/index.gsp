
<%@ page import="com.ann.Vditems" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'vditems.label', default: 'Vditems')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-vditems" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-vditems" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th>抬頭圖示</th>
						
						<g:sortableColumn property="vditemname" title="${message(code: 'vditems.vditemname.label', default: 'Vditemname')}" />
					
						<g:sortableColumn property="vditemdesc" title="${message(code: 'vditems.vditemdesc.label', default: 'Vditemdesc')}" />
					
						<g:sortableColumn property="vditemtype" title="${message(code: 'vditems.vditemtype.label', default: 'Vditemtype')}" />
					
						<g:sortableColumn property="createuser" title="${message(code: 'vditems.createuser.label', default: 'Createuser')}" />
					
						<g:sortableColumn property="mediaurl" title="${message(code: 'vditems.mediaurl.label', default: 'Mediaurl')}" />
					
						<!-- <g:sortableColumn property="picfile" title="${message(code: 'vditems.picfile.label', default: 'Picfile')}" /> -->
					
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${vditemsInstanceList}" status="i" var="vditemsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${vditemsInstance.id}"><img src="${resource(dir:'files', file:fieldValue(bean:vditemsInstance, field:'picfile'))}" alt="${vditemsInstance.picfile}" width="100px"/></g:link></td>
					
						<td><g:link action="show" id="${vditemsInstance.id}">${fieldValue(bean: vditemsInstance, field: "vditemname")}</g:link></td>
					
						<td>${fieldValue(bean: vditemsInstance, field: "vditemdesc")}</td>
					
						<td>${fieldValue(bean: vditemsInstance, field: "vditemtype")}</td>
					
						<td>${fieldValue(bean: vditemsInstance, field: "createuser")}</td>
					
						<td>${fieldValue(bean: vditemsInstance, field: "mediaurl")}</td>
					
						<!-- <td>${fieldValue(bean: vditemsInstance, field: "picfile")}</td>  -->
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${vditemsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
