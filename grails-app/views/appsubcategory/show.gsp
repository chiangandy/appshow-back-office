
<%@ page import="com.ann.Appsubcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appsubcategory.label', default: 'Appsubcategory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-appsubcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-appsubcategory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list appsubcategory">
			
				<g:if test="${appsubcategoryInstance?.subcatname}">
				<li class="fieldcontain">
					<span id="subcatname-label" class="property-label"><g:message code="appsubcategory.subcatname.label" default="Subcatname" /></span>
					
						<span class="property-value" aria-labelledby="subcatname-label"><g:fieldValue bean="${appsubcategoryInstance}" field="subcatname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appsubcategoryInstance?.subcatdesc}">
				<li class="fieldcontain">
					<span id="subcatdesc-label" class="property-label"><g:message code="appsubcategory.subcatdesc.label" default="Subcatdesc" /></span>
					
						<span class="property-value" aria-labelledby="subcatdesc-label"><g:fieldValue bean="${appsubcategoryInstance}" field="subcatdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appsubcategoryInstance?.appcategory}">
				<li class="fieldcontain">
					<span id="appcategory-label" class="property-label"><g:message code="appsubcategory.appcategory.label" default="Appcategory" /></span>
					
						<span class="property-value" aria-labelledby="appcategory-label"><g:link controller="appcategory" action="show" id="${appsubcategoryInstance?.appcategory?.id}">${appsubcategoryInstance?.appcategory?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${appsubcategoryInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="appsubcategory.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${appsubcategoryInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${appsubcategoryInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="appsubcategory.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${appsubcategoryInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${appsubcategoryInstance?.mtgoapp}">
				<li class="fieldcontain">
					<span id="mtgoapp-label" class="property-label"><g:message code="appsubcategory.mtgoapp.label" default="Mtgoapp" /></span>
					
						<g:each in="${appsubcategoryInstance.mtgoapp}" var="m">
						<span class="property-value" aria-labelledby="mtgoapp-label"><g:link controller="mtgoapp" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:appsubcategoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${appsubcategoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
