
<%@ page import="com.ann.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-user" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list user">
			
				<g:if test="${userInstance?.realname}">
				<li class="fieldcontain">
					<span id="realname-label" class="property-label"><g:message code="user.realname.label" default="Realname" /></span>
					
						<span class="property-value" aria-labelledby="realname-label"><g:fieldValue bean="${userInstance}" field="realname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="user.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${userInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
				<!-- 
				<g:if test="${userInstance?.passwordHash}">
				<li class="fieldcontain">
					<span id="passwordHash-label" class="property-label"><g:message code="user.passwordHash.label" default="Password Hash" /></span>
					
						<span class="property-value" aria-labelledby="passwordHash-label"><g:fieldValue bean="${userInstance}" field="passwordHash"/></span>
					
				</li>
				</g:if>
				 -->
				 
				<g:if test="${UserInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="User.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${UserInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
				

			
				<g:if test="${userInstance?.additionalInfo}">
				<li class="fieldcontain">
					<span id="additionalInfo-label" class="property-label"><g:message code="user.additionalInfo.label" default="Additional Info" /></span>
					
						<span class="property-value" aria-labelledby="additionalInfo-label"><g:fieldValue bean="${userInstance}" field="additionalInfo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="user.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${userInstance?.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="user.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${userInstance?.lastUpdated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.passwordChangeRequiredOnNextLogon}">
				<li class="fieldcontain">
					<span id="passwordChangeRequiredOnNextLogon-label" class="property-label"><g:message code="user.passwordChangeRequiredOnNextLogon.label" default="Password Change Required On Next Logon" /></span>
					
						<span class="property-value" aria-labelledby="passwordChangeRequiredOnNextLogon-label"><g:formatBoolean boolean="${userInstance?.passwordChangeRequiredOnNextLogon}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.permissions}">
				<li class="fieldcontain">
					<span id="permissions-label" class="property-label"><g:message code="user.permissions.label" default="Permissions" /></span>
					
						<span class="property-value" aria-labelledby="permissions-label"><g:fieldValue bean="${userInstance}" field="permissions"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.roles}">
				<li class="fieldcontain">
					<span id="roles-label" class="property-label"><g:message code="user.roles.label" default="Roles" /></span>
					
						<g:each in="${userInstance.roles}" var="r">
						<span class="property-value" aria-labelledby="roles-label">${r?.encodeAsHTML()}</span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:userInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${userInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
