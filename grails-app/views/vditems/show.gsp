
<%@ page import="com.ann.Vditems" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'vditems.label', default: 'Vditems')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-vditems" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-vditems" class="content scaffold-show" role="main">
			<h1><g:message code="vditems.show.label" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list vditems">
			
				<g:if test="${vditemsInstance?.vditemname}">
				<li class="fieldcontain">
					<span id="vditemname-label" class="property-label"><g:message code="vditems.vditemname.label" default="Vditemname" /></span>
					
						<span class="property-value" aria-labelledby="vditemname-label"><g:fieldValue bean="${vditemsInstance}" field="vditemname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.vditemdesc}">
				<li class="fieldcontain">
					<span id="vditemdesc-label" class="property-label"><g:message code="vditems.vditemdesc.label" default="Vditemdesc" /></span>
					
						<span class="property-value" aria-labelledby="vditemdesc-label"><g:fieldValue bean="${vditemsInstance}" field="vditemdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.vditemtype}">
				<li class="fieldcontain">
					<span id="vditemtype-label" class="property-label"><g:message code="vditems.vditemtype.label" default="Vditemtype" /></span>
					
						<span class="property-value" aria-labelledby="vditemtype-label"><g:fieldValue bean="${vditemsInstance}" field="vditemtype"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.createuser}">
				<li class="fieldcontain">
					<span id="createuser-label" class="property-label"><g:message code="vditems.createuser.label" default="Createuser" /></span>
					
						<span class="property-value" aria-labelledby="createuser-label"><g:fieldValue bean="${vditemsInstance}" field="createuser"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.mediaurl}">
				<li class="fieldcontain">
					<span id="mediaurl-label" class="property-label"><g:message code="vditems.mediaurl.label" default="Mediaurl" /></span>
					
						<span class="property-value" aria-labelledby="mediaurl-label"><g:fieldValue bean="${vditemsInstance}" field="mediaurl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.picfile}">
				<li class="fieldcontain">
					<span id="picfile-label" class="property-label"><g:message code="vditems.picfile.label" default="Picfile" /></span>
					
					<span class="property-value" aria-labelledby="picfile-label"><g:fieldValue bean="${vditemsInstance}" field="picfile"/><br/>
					<img src="${resource(dir:'files', file:fieldValue(bean:vditemsInstance, field:'picfile'))}" alt="${vditemsInstance.picfile}" width="100px"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.appowner}">
				<li class="fieldcontain">
					<span id="appowner-label" class="property-label"><g:message code="vditems.appowner.label" default="Appowner" /></span>
					
						<span class="property-value" aria-labelledby="appowner-label"><g:link controller="mtgoapp" action="show" id="${vditemsInstance?.appowner?.id}">${vditemsInstance?.appowner?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.dtsubcategory}">
				<li class="fieldcontain">
					<span id="dtsubcategory-label" class="property-label"><g:message code="vditems.dtsubcategory.label" default="Dtsubcategory" /></span>
					
						<g:each in="${vditemsInstance.dtsubcategory}" var="d">
						<span class="property-value" aria-labelledby="dtsubcategory-label"><g:link controller="dtsubcategory" action="show" id="${d.id}">${d?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="vditems.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${vditemsInstance?.dateCreated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${vditemsInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="vditems.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${vditemsInstance?.lastUpdated}"  format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:vditemsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${vditemsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
