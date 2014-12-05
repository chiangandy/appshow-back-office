
<%@ page import="com.ann.Vdcomments" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'vdcomments.label', default: 'Vdcomments')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-vdcomments" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-vdcomments" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list vdcomments">
			
				<g:if test="${vdcommentsInstance?.comtopic}">
				<li class="fieldcontain">
					<span id="comtopic-label" class="property-label"><g:message code="vdcomments.comtopic.label" default="Comtopic" /></span>
					
						<span class="property-value" aria-labelledby="comtopic-label"><g:fieldValue bean="${vdcommentsInstance}" field="comtopic"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vdcommentsInstance?.comtext}">
				<li class="fieldcontain">
					<span id="comtext-label" class="property-label"><g:message code="vdcomments.comtext.label" default="Comtext" /></span>
					
						<span class="property-value" aria-labelledby="comtext-label"><g:fieldValue bean="${vdcommentsInstance}" field="comtext"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vdcommentsInstance?.comrate}">
				<li class="fieldcontain">
					<span id="comrate-label" class="property-label"><g:message code="vdcomments.comrate.label" default="Comrate" /></span>
					
						<span class="property-value" aria-labelledby="comrate-label"><g:fieldValue bean="${vdcommentsInstance}" field="comrate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vdcommentsInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="vdcomments.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${vdcommentsInstance?.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vdcommentsInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="vdcomments.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${vdcommentsInstance?.lastUpdated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vdcommentsInstance?.vditems}">
				<li class="fieldcontain">
					<span id="vditems-label" class="property-label"><g:message code="vdcomments.vditems.label" default="video show" /></span>
					
						<span class="property-value" aria-labelledby="vditems-label"><g:link controller="vditems" action="show" id="${vdcommentsInstance?.vditems?.id}">${vdcommentsInstance?.vditems?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:vdcommentsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${vdcommentsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
