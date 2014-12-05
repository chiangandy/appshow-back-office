
<%@ page import="com.ann.Appdownload" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appdownload.label', default: 'Appdownload')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-appdownload" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-appdownload" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list appdownload">
			
				<g:if test="${appdownloadInstance?.apptopic}">
				<li class="fieldcontain">
					<span id="apptopic-label" class="property-label"><g:message code="appdownload.apptopic.label" default="Apptopic" /></span>
					
						<span class="property-value" aria-labelledby="apptopic-label"><g:fieldValue bean="${appdownloadInstance}" field="apptopic"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.apppublisher}">
				<li class="fieldcontain">
					<span id="apppublisher-label" class="property-label"><g:message code="appdownload.apppublisher.label" default="Apppublisher" /></span>
					
						<span class="property-value" aria-labelledby="apppublisher-label"><g:fieldValue bean="${appdownloadInstance}" field="apppublisher"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.appdesc}">
				<li class="fieldcontain">
					<span id="appdesc-label" class="property-label"><g:message code="appdownload.appdesc.label" default="Appdesc" /></span>
					
						<span class="property-value" aria-labelledby="appdesc-label"><g:fieldValue bean="${appdownloadInstance}" field="appdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.storekey}">
				<li class="fieldcontain">
					<span id="storekey-label" class="property-label"><g:message code="appdownload.storekey.label" default="Storekey" /></span>
					
						<span class="property-value" aria-labelledby="storekey-label"><g:fieldValue bean="${appdownloadInstance}" field="storekey"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.mediaurl}">
				<li class="fieldcontain">
					<span id="mediaurl-label" class="property-label"><g:message code="appdownload.mediaurl.label" default="Mediaurl" /></span>
					
						<span class="property-value" aria-labelledby="mediaurl-label"><g:fieldValue bean="${appdownloadInstance}" field="mediaurl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.picfile}">
				<li class="fieldcontain">
					<span id="picfile-label" class="property-label"><g:message code="appdownload.picfile.label" default="Picfile" /></span>
					
						<span class="property-value" aria-labelledby="picfile-label"><g:fieldValue bean="${appdownloadInstance}" field="picfile"/><br/>
								<img src="${resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfile'))}" alt="${appdownloadInstance.picfile}" width="60px"/>
						</span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.opuser}">
				<li class="fieldcontain">
					<span id="opuser-label" class="property-label"><g:message code="appdownload.opuser.label" default="Opuser" /></span>
					
						<span class="property-value" aria-labelledby="opuser-label"><g:fieldValue bean="${appdownloadInstance}" field="opuser"/>
						</span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.comrate}">
				<li class="fieldcontain">
					<span id="comrate-label" class="property-label"><g:message code="appdownload.comrate.label" default="Comrate" /></span>
					
						<span class="property-value" aria-labelledby="comrate-label"><g:fieldValue bean="${appdownloadInstance}" field="comrate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.datestart}">
				<li class="fieldcontain">
					<span id="datestart-label" class="property-label"><g:message code="appdownload.datestart.label" default="Datestart" /></span>
					
						<span class="property-value" aria-labelledby="datestart-label"><g:formatDate date="${appdownloadInstance?.datestart}" format="yyyy-MM-dd"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.datestop}">
				<li class="fieldcontain">
					<span id="datestop-label" class="property-label"><g:message code="appdownload.datestop.label" default="Datestop" /></span>
					
						<span class="property-value" aria-labelledby="datestop-label"><g:formatDate date="${appdownloadInstance?.datestop}" format="yyyy-MM-dd"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="appdownload.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${appdownloadInstance?.dateCreated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="appdownload.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${appdownloadInstance?.lastUpdated}" format="yyyy-MM-dd HH:mm:ss"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.mtgoapp}">
				<li class="fieldcontain">
					<span id="mtgoapp-label" class="property-label"><g:message code="appdownload.mtgoapp.label" default="Mtgoapp" /></span>
					
						<span class="property-value" aria-labelledby="mtgoapp-label"><g:link controller="mtgoapp" action="show" id="${appdownloadInstance?.mtgoapp?.id}">${appdownloadInstance?.mtgoapp?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.picfiled1}">
				<li class="fieldcontain">
					<span id="picfiled1-label" class="property-label"><g:message code="appdownload.picfiled1.label" default="Picfiled1" /></span>
					
						<span class="property-value" aria-labelledby="picfiled1-label">
							<img src="${resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfiled1'))}" alt="${appdownloadInstance.picfiled1}" />			
						</span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.picfiled2}">
				<li class="fieldcontain">
					<span id="picfiled2-label" class="property-label"><g:message code="appdownload.picfiled2.label" default="Picfiled2" /></span>
					
						<span class="property-value" aria-labelledby="picfiled2-label">
							<img src="${resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfiled2'))}" alt="${appdownloadInstance.picfiled2}" />			
						</span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadInstance?.picfiled3}">
				<li class="fieldcontain">
					<span id="picfiled3-label" class="property-label"><g:message code="appdownload.picfiled3.label" default="Picfiled3" /></span>
					
						<span class="property-value" aria-labelledby="picfiled3-label">
							<img src="${resource(dir:'files', file:fieldValue(bean:appdownloadInstance, field:'picfiled3'))}" alt="${appdownloadInstance.picfiled3}" />					
						</span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:appdownloadInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${appdownloadInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
