
<%@ page import="com.ann.Bullletin" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'bullletin.label', default: 'Bullletin')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-bullletin" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-bullletin" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list bullletin">
			
				<g:if test="${bullletinInstance?.bulletin_topic}">
				<li class="fieldcontain">
					<span id="bulletin_topic-label" class="property-label"><g:message code="bullletin.bulletin_topic.label" default="Bulletintopic" /></span>
					
						<span class="property-value" aria-labelledby="bulletin_topic-label"><g:fieldValue bean="${bullletinInstance}" field="bulletin_topic"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.bulletin_content}">
				<li class="fieldcontain">
					<span id="bulletin_content-label" class="property-label"><g:message code="bullletin.bulletin_content.label" default="Bulletincontent" /></span>
					
						<span class="property-value" aria-labelledby="bulletin_content-label"><g:fieldValue bean="${bullletinInstance}" field="bulletin_content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.picfile}">
				<li class="fieldcontain">
					<span id="picfile-label" class="property-label"><g:message code="bullletin.picfile.label" default="Picfile" /></span>
					
					<span class="property-value" aria-labelledby="picfile-label"><g:fieldValue bean="${bullletinInstance}" field="picfile"/><br/>
					<img src="${resource(dir:'files', file:fieldValue(bean:bullletinInstance, field:'picfile'))}" alt="${bullletinInstance.picfile}" width="100px"/></span>
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.startdate}">
				<li class="fieldcontain">
					<span id="startdate-label" class="property-label"><g:message code="bullletin.startdate.label" default="Startdate" /></span>
					
						<span class="property-value" aria-labelledby="startdate-label"><g:formatDate date="${bullletinInstance?.startdate}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.enddate}">
				<li class="fieldcontain">
					<span id="enddate-label" class="property-label"><g:message code="bullletin.enddate.label" default="Enddate" /></span>
					
						<span class="property-value" aria-labelledby="enddate-label"><g:formatDate date="${bullletinInstance?.enddate}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.gotop}">
				<li class="fieldcontain">
					<span id="gotop-label" class="property-label"><g:message code="bullletin.gotop.label" default="Gotop" /></span>
					
						<span class="property-value" aria-labelledby="gotop-label"><g:formatBoolean boolean="${bullletinInstance?.gotop}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.keep}">
				<li class="fieldcontain">
					<span id="keep-label" class="property-label"><g:message code="bullletin.keep.label" default="Keep" /></span>
					
						<span class="property-value" aria-labelledby="keep-label"><g:formatBoolean boolean="${bullletinInstance?.keep}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="bullletin.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${bullletinInstance?.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bullletinInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="bullletin.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${bullletinInstance?.lastUpdated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:bullletinInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${bullletinInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
