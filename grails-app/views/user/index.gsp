
<%@ page import="com.ann.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-user" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="realname" title="${message(code: 'user.realname.label', default: 'Realname')}" />
					
						<g:sortableColumn property="username" title="${message(code: 'user.username.label', default: 'Username')}" />
									
						<g:sortableColumn property="roles" title="${message(code: 'user.roles.label', default: 'roles')}" />
						
						<g:sortableColumn property="email" title="${message(code: 'user.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="additionalInfo" title="${message(code: 'user.additionalInfo.label', default: 'Additional Info')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'user.dateCreated.label', default: 'Date Created')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${userInstanceList}" status="i" var="userInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${userInstance.id}">${fieldValue(bean: userInstance, field: "realname")}</g:link></td>
					
						<td>${fieldValue(bean: userInstance, field: "username")}</td>
						
						<td>
						    
							<g:each status="id" in="${userInstance.roles}" var="r">			    
								<g:if test="${id!=0}">,</g:if>
								${r?.encodeAsHTML()} 
							</g:each>
						</td>
										
						<td>${fieldValue(bean: userInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "additionalInfo")}</td>
					    <td><g:formatDate date="${userInstance.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></td>
					
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${userInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
