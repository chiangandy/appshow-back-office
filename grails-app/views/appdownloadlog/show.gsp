
<%@ page import="com.ann.Appdownloadlog" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'appdownloadlog.label', default: 'Appdownloadlog')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-appdownloadlog" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-appdownloadlog" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list appdownloadlog">
			
				<g:if test="${appdownloadlogInstance?.eventname}">
				<li class="fieldcontain">
					<span id="eventname-label" class="property-label"><g:message code="appdownloadlog.eventname.label" default="Eventname" /></span>
					
						<span class="property-value" aria-labelledby="eventname-label"><g:fieldValue bean="${appdownloadlogInstance}" field="eventname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.eventdesc}">
				<li class="fieldcontain">
					<span id="eventdesc-label" class="property-label"><g:message code="appdownloadlog.eventdesc.label" default="Eventdesc" /></span>
					
						<span class="property-value" aria-labelledby="eventdesc-label"><g:fieldValue bean="${appdownloadlogInstance}" field="eventdesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.storekey}">
				<li class="fieldcontain">
					<span id="storekey-label" class="property-label"><g:message code="appdownloadlog.storekey.label" default="Storekey" /></span>
					
						<span class="property-value" aria-labelledby="storekey-label"><g:fieldValue bean="${appdownloadlogInstance}" field="storekey"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.deviceid}">
				<li class="fieldcontain">
					<span id="deviceid-label" class="property-label"><g:message code="appdownloadlog.deviceid.label" default="Deviceid" /></span>
					
						<span class="property-value" aria-labelledby="deviceid-label"><g:fieldValue bean="${appdownloadlogInstance}" field="deviceid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.openudid}">
				<li class="fieldcontain">
					<span id="openudid-label" class="property-label"><g:message code="appdownloadlog.openudid.label" default="Openudid" /></span>
					
						<span class="property-value" aria-labelledby="openudid-label"><g:fieldValue bean="${appdownloadlogInstance}" field="openudid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.ipaddress}">
				<li class="fieldcontain">
					<span id="ipaddress-label" class="property-label"><g:message code="appdownloadlog.ipaddress.label" default="Ipaddress" /></span>
					
						<span class="property-value" aria-labelledby="ipaddress-label"><g:fieldValue bean="${appdownloadlogInstance}" field="ipaddress"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.eventstatus}">
				<li class="fieldcontain">
					<span id="eventstatus-label" class="property-label"><g:message code="appdownloadlog.eventstatus.label" default="Eventstatus" /></span>
					
						<span class="property-value" aria-labelledby="eventstatus-label"><g:fieldValue bean="${appdownloadlogInstance}" field="eventstatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.checkstatusdetail}">
				<li class="fieldcontain">
					<span id="checkstatusdetail-label" class="property-label"><g:message code="appdownloadlog.checkstatusdetail.label" default="Checkstatusdetail" /></span>
					
						<span class="property-value" aria-labelledby="checkstatusdetail-label"><g:fieldValue bean="${appdownloadlogInstance}" field="checkstatusdetail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.aux1}">
				<li class="fieldcontain">
					<span id="aux1-label" class="property-label"><g:message code="appdownloadlog.aux1.label" default="Aux1" /></span>
					
						<span class="property-value" aria-labelledby="aux1-label"><g:fieldValue bean="${appdownloadlogInstance}" field="aux1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.aux2}">
				<li class="fieldcontain">
					<span id="aux2-label" class="property-label"><g:message code="appdownloadlog.aux2.label" default="Aux2" /></span>
					
						<span class="property-value" aria-labelledby="aux2-label"><g:fieldValue bean="${appdownloadlogInstance}" field="aux2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.aux3}">
				<li class="fieldcontain">
					<span id="aux3-label" class="property-label"><g:message code="appdownloadlog.aux3.label" default="Aux3" /></span>
					
						<span class="property-value" aria-labelledby="aux3-label"><g:fieldValue bean="${appdownloadlogInstance}" field="aux3"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.aux4}">
				<li class="fieldcontain">
					<span id="aux4-label" class="property-label"><g:message code="appdownloadlog.aux4.label" default="Aux4" /></span>
					
						<span class="property-value" aria-labelledby="aux4-label"><g:fieldValue bean="${appdownloadlogInstance}" field="aux4"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.aux5}">
				<li class="fieldcontain">
					<span id="aux5-label" class="property-label"><g:message code="appdownloadlog.aux5.label" default="Aux5" /></span>
					
						<span class="property-value" aria-labelledby="aux5-label"><g:fieldValue bean="${appdownloadlogInstance}" field="aux5"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.amount}">
				<li class="fieldcontain">
					<span id="amount-label" class="property-label"><g:message code="appdownloadlog.amount.label" default="Amount" /></span>
					
						<span class="property-value" aria-labelledby="amount-label"><g:fieldValue bean="${appdownloadlogInstance}" field="amount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="appdownloadlog.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${appdownloadlogInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${appdownloadlogInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="appdownloadlog.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${appdownloadlogInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:appdownloadlogInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${appdownloadlogInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
