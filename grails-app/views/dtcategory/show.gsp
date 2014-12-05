
<%@ page import="com.ann.Dtcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dtcategory.label', default: 'Dtcategory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-dtcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-dtcategory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list dtcategory">
			
				<g:if test="${dtcategoryInstance?.catname}">
				<li class="fieldcontain">
					<span id="catname-label" class="property-label"><g:message code="dtcategory.catname.label" default="Catname" /></span>
					
						<span class="property-value" aria-labelledby="catname-label"><g:fieldValue bean="${dtcategoryInstance}" field="catname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtcategoryInstance?.catdesc}">
				<li class="fieldcontain">
					<span id="catdesc-label" class="property-label"><g:message code="dtcategory.catdesc.label" default="Catdesc" /></span>
					
						<span class="property-value" aria-labelledby="catdesc-label"><g:fieldValue bean="${dtcategoryInstance}" field="catdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtcategoryInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="dtcategory.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${dtcategoryInstance?.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtcategoryInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="dtcategory.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${dtcategoryInstance?.lastUpdated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtcategoryInstance?.subcategory}">
				<li class="fieldcontain">
					<span id="subcategory-label" class="property-label"><g:message code="dtcategory.subcategory.label" default="Subcategory" /></span>
					
						<g:each in="${dtcategoryInstance.subcategory}" var="s">
						<span class="property-value" aria-labelledby="subcategory-label"><g:link controller="dtsubcategory" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:dtcategoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${dtcategoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
