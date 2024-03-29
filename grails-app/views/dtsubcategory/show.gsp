
<%@ page import="com.ann.Dtsubcategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dtsubcategory.label', default: 'Dtsubcategory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-dtsubcategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-dtsubcategory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list dtsubcategory">
			
				<g:if test="${dtsubcategoryInstance?.subcatname}">
				<li class="fieldcontain">
					<span id="subcatname-label" class="property-label"><g:message code="dtsubcategory.subcatname.label" default="Subcatname" /></span>
					
						<span class="property-value" aria-labelledby="subcatname-label"><g:fieldValue bean="${dtsubcategoryInstance}" field="subcatname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtsubcategoryInstance?.subcatdesc}">
				<li class="fieldcontain">
					<span id="subcatdesc-label" class="property-label"><g:message code="dtsubcategory.subcatdesc.label" default="Subcatdesc" /></span>
					
						<span class="property-value" aria-labelledby="subcatdesc-label"><g:fieldValue bean="${dtsubcategoryInstance}" field="subcatdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtsubcategoryInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="dtsubcategory.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${dtsubcategoryInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtsubcategoryInstance?.dtcategory}">
				<li class="fieldcontain">
					<span id="dtcategory-label" class="property-label"><g:message code="dtsubcategory.dtcategory.label" default="Dtcategory" /></span>
					
						<span class="property-value" aria-labelledby="dtcategory-label"><g:link controller="dtcategory" action="show" id="${dtsubcategoryInstance?.dtcategory?.id}">${dtsubcategoryInstance?.dtcategory?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtsubcategoryInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="dtsubcategory.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${dtsubcategoryInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			

			
			</ol>
			<g:form url="[resource:dtsubcategoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${dtsubcategoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
