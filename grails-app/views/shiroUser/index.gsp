

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'shiroUser.label', default: 'ShiroUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-shiroUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-shiroUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="realname" title="${message(code: 'shiroUser.realname.label', default: 'Realname')}" style="width: 300px"/>
					
						<g:sortableColumn property="username" title="${message(code: 'shiroUser.username.label', default: 'Username')}" style="width: 200px"/>

						<g:sortableColumn property="email" title="${message(code: 'shiroUser.email.label', default: 'Email')}" style="width: 200px"/>
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'shiroUser.dateCreated.label', default: 'Date Created')}" />
						
						<th  style="width: 200px"></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${shiroUserInstanceList}" status="i" var="shiroUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${shiroUserInstance.id}">${fieldValue(bean: shiroUserInstance, field: "realname")}</g:link></td>
					
						<td>${fieldValue(bean: shiroUserInstance, field: "username")}</td>
					
						<td>${fieldValue(bean: shiroUserInstance, field: "email")}</td>
					
						<td><g:formatDate date="${shiroUserInstance.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></td>
						
						<td>
			<g:form url="[resource:shiroUserInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${shiroUserInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>						
						</td>
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${shiroUserInstanceCount ?: 0}" />
			</div>
		</div>
		
	</body>
</html>
