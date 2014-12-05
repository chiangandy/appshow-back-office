
<%@ page import="com.ann.Bonus" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'bonus.label', default: 'Bonus')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-bonus" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-bonus" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list bonus">
			
				<g:if test="${bonusInstance?.eventtopic}">
				<li class="fieldcontain">
					<span id="eventtopic-label" class="property-label"><g:message code="bonus.eventtopic.label" default="Eventtopic" /></span>
					
						<span class="property-value" aria-labelledby="eventtopic-label"><g:fieldValue bean="${bonusInstance}" field="eventtopic"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.eventdesc}">
				<li class="fieldcontain">
					<span id="eventdesc-label" class="property-label"><g:message code="bonus.eventdesc.label" default="Eventdesc" /></span>
					
						<span class="property-value" aria-labelledby="eventdesc-label"><g:fieldValue bean="${bonusInstance}" field="eventdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.eventfrom}">
				<li class="fieldcontain">
					<span id="eventfrom-label" class="property-label"><g:message code="bonus.eventfrom.label" default="Eventfrom" /></span>
					
						<span class="property-value" aria-labelledby="eventfrom-label"><g:fieldValue bean="${bonusInstance}" field="eventfrom"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.bonus}">
				<li class="fieldcontain">
					<span id="bonus-label" class="property-label"><g:message code="bonus.bonus.label" default="Bonus" /></span>
					
						<span class="property-value" aria-labelledby="bonus-label"><g:fieldValue bean="${bonusInstance}" field="bonus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.activeevent}">
				<li class="fieldcontain">
					<span id="activeevent-label" class="property-label"><g:message code="bonus.activeevent.label" default="Activeevent" /></span>
					
						<span class="property-value" aria-labelledby="activeevent-label"><g:formatBoolean boolean="${bonusInstance?.activeevent}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="bonus.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${bonusInstance?.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="bonus.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${bonusInstance?.lastUpdated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bonusInstance?.user}">
				<li class="fieldcontain">
					<span id="user-label" class="property-label"><g:message code="bonus.user.label" default="User" /></span>
					
						<span class="property-value" aria-labelledby="user-label"><g:link controller="user" action="show" id="${bonusInstance?.user?.id}">${bonusInstance?.user?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:bonusInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${bonusInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
