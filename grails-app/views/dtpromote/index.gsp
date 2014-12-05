
<%@ page import="com.ann.Dtpromote" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dtpromote.label', default: 'Dtpromote')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dtpromote" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-dtpromote" class="content scaffold-list" role="main">
			<h1><g:message code="dtpromote.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>

						<th>${message(code: 'dtpromote.picfile.label', default: '廣告圖示')}</th>
					
						<g:sortableColumn property="promote_topic" title="${message(code: 'dtpromote.promote_topic.label', default: 'Promotetopic')}" />
					
						<g:sortableColumn property="picfile" title="${message(code: 'dtpromote.promotedesc.label', default: 'Picfile')}" />
					
						<g:sortableColumn property="left_XY" title="${message(code: 'dtpromote.left_XY.label', default: 'Left XY')}" />
					
						<g:sortableColumn property="top_XY" title="${message(code: 'dtpromote.top_XY.label', default: 'Top XY')}" />
					
						<g:sortableColumn property="width_XY" title="${message(code: 'dtpromote.width_XY.label', default: 'Width XY')}" />
					
						<g:sortableColumn property="high_XY" title="${message(code: 'dtpromote.high_XY.label', default: 'High XY')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dtpromoteInstanceList}" status="i" var="dtpromoteInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
						<td><g:link action="show" id="${dtpromoteInstance.id}"><img src="${resource(dir:'files', file:fieldValue(bean:dtpromoteInstance, field:'picfile'))}" alt="${dtpromoteInstance.picfile}" width="60px"/></g:link></td>
					
						<td><g:link action="show" id="${dtpromoteInstance.id}">${fieldValue(bean: dtpromoteInstance, field: "promote_topic")}</g:link></td>
					
						<td width="360">${fieldValue(bean: dtpromoteInstance, field: "promotedesc")}</td>
					
						<td>${fieldValue(bean: dtpromoteInstance, field: "left_XY")}</td>
					
						<td>${fieldValue(bean: dtpromoteInstance, field: "top_XY")}</td>
					
						<td>${fieldValue(bean: dtpromoteInstance, field: "width_XY")}</td>
					
						<td>${fieldValue(bean: dtpromoteInstance, field: "high_XY")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dtpromoteInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
