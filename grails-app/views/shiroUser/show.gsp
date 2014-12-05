

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'shiroUser.label', default: 'ShiroUser')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-shiroUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-shiroUser" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list shiroUser">
			
				<g:if test="${shiroUserInstance?.realname}">
				<li class="fieldcontain">
					<span id="realname-label" class="property-label"><g:message code="shiroUser.realname.label" default="Realname" /></span>
					
						<span class="property-value" aria-labelledby="realname-label"><g:fieldValue bean="${shiroUserInstance}" field="realname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="shiroUser.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${shiroUserInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="shiroUser.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${shiroUserInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.additionalInfo}">
				<li class="fieldcontain">
					<span id="additionalInfo-label" class="property-label"><g:message code="shiroUser.additionalInfo.label" default="Additional Info" /></span>
					
						<span class="property-value" aria-labelledby="additionalInfo-label"><g:fieldValue bean="${shiroUserInstance}" field="additionalInfo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="shiroUser.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${shiroUserInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="shiroUser.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${shiroUserInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.passwordChangeRequiredOnNextLogon}">
				<li class="fieldcontain">
					<span id="passwordChangeRequiredOnNextLogon-label" class="property-label"><g:message code="shiroUser.passwordChangeRequiredOnNextLogon.label" default="Password Change Required On Next Logon" /></span>
					
						<span class="property-value" aria-labelledby="passwordChangeRequiredOnNextLogon-label"><g:formatBoolean boolean="${shiroUserInstance?.passwordChangeRequiredOnNextLogon}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.permissions}">
				<li class="fieldcontain">
					<span id="permissions-label" class="property-label"><g:message code="shiroUser.permissions.label" default="Permissions" /></span>
					
						<span class="property-value" aria-labelledby="permissions-label"><g:fieldValue bean="${shiroUserInstance}" field="permissions"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiroUserInstance?.roles}">
				<li class="fieldcontain">
					<span id="roles-label" class="property-label"><g:message code="shiroUser.roles.label" default="Roles" /></span>
					
						<g:each in="${shiroUserInstance.roles}" var="r">
						<span class="property-value" aria-labelledby="roles-label">${r?.encodeAsHTML()}</span>
						
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<!--  
			<g:form url="[resource:shiroUserInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${shiroUserInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
			-->
		</div>
	</body>
</html>
