
<%@ page import="com.ann.Mtgoapp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'mtgoapp.label', default: 'Mtgoapp')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-mtgoapp" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-mtgoapp" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list mtgoapp">

				<g:if test="${mtgoappInstance?.appsubcategory}">
				<li class="fieldcontain">
					<span id="appsubcategory-label" class="property-label"><g:message code="mtgoapp.appsubcategory.label" default="App sub category" /></span>
					
						<g:each in="${mtgoappInstance.appsubcategory}" var="d">
						<span class="property-value" aria-labelledby="appsubcategory-label"><g:link controller="appsubcategory" action="show" id="${d.id}">${d?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${mtgoappInstance?.appname}">
				<li class="fieldcontain">
					<span id="appname-label" class="property-label"><g:message code="mtgoapp.appname.label" default="Appname" /></span>
					
						<span class="property-value" aria-labelledby="appname-label"><g:fieldValue bean="${mtgoappInstance}" field="appname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mtgoappInstance?.appdesc}">
				<li class="fieldcontain">
					<span id="appdesc-label" class="property-label"><g:message code="mtgoapp.appdesc.label" default="Appdesc" /></span>
					
						<span class="property-value" aria-labelledby="appdesc-label"><g:fieldValue bean="${mtgoappInstance}" field="appdesc"/></span>
					
				</li>
				</g:if>

				<g:if test="${mtgoappInstance?.picfile}">
				<li class="fieldcontain">
					<span id="picfile-label" class="property-label"><g:message code="mtgoapp.picfile.label" default="Picfile" /></span>
					
					<span class="property-value" aria-labelledby="picfile-label"><g:fieldValue bean="${mtgoappInstance}" field="picfile"/><br/>
					<img src="${resource(dir:'files', file:fieldValue(bean:mtgoappInstance, field:'picfile'))}" alt="${mtgoappInstance.picfile}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${mtgoappInstance?.dtversion}">
				<li class="fieldcontain">
					<span id="dtversion-label" class="property-label"><g:message code="mtgoapp.dtversion.label" default="Dtversion" /></span>
					
						<span class="property-value" aria-labelledby="dtversion-label"><g:fieldValue bean="${mtgoappInstance}" field="dtversion"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mtgoappInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="mtgoapp.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${mtgoappInstance?.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mtgoappInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="mtgoapp.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${mtgoappInstance?.lastUpdated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${mtgoappInstance?.vditems}">
				<li class="fieldcontain">
					<span id="vditems-label" class="property-label"><g:message code="mtgoapp.vditems.label" default="Vditems" /></span>
					
						<g:each in="${mtgoappInstance.vditems}" var="v">
						<span class="property-value" aria-labelledby="vditems-label"><g:link controller="vditems" action="show" id="${v.id}">${v?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:mtgoappInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${mtgoappInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
