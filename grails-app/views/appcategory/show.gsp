
<%@ page import="com.ann.Appcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appcategory.label', default: 'Appcategory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-appcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-appcategory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list appcategory">
			
				<g:if test="${appcategoryInstance?.catname}">
				<li class="fieldcontain">
					<span id="catname-label" class="property-label"><g:message code="appcategory.catname.label" default="Catname" /></span>
					
						<span class="property-value" aria-labelledby="catname-label"><g:fieldValue bean="${appcategoryInstance}" field="catname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appcategoryInstance?.catdesc}">
				<li class="fieldcontain">
					<span id="catdesc-label" class="property-label"><g:message code="appcategory.catdesc.label" default="Catdesc" /></span>
					
						<span class="property-value" aria-labelledby="catdesc-label"><g:fieldValue bean="${appcategoryInstance}" field="catdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appcategoryInstance?.appsubcategory}">
				<li class="fieldcontain">
					<span id="appsubcategory-label" class="property-label"><g:message code="appcategory.appsubcategory.label" default="Appsubcategory" /></span>
					
						<g:each in="${appcategoryInstance.appsubcategory}" var="a">
						<span class="property-value" aria-labelledby="appsubcategory-label"><g:link controller="appsubcategory" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${appcategoryInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="appcategory.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${appcategoryInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${appcategoryInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="appcategory.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${appcategoryInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:appcategoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${appcategoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
