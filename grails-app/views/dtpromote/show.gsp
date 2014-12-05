
<%@ page import="com.ann.Dtpromote" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'dtpromote.label', default: 'Dtpromote')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-dtpromote" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-dtpromote" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list dtpromote">
			
				<g:if test="${dtpromoteInstance?.promote_topic}">
				<li class="fieldcontain">
					<span id="promote_topic-label" class="property-label"><g:message code="dtpromote.promote_topic.label" default="Promotetopic" /></span>
					
						<span class="property-value" aria-labelledby="promote_topic-label"><g:fieldValue bean="${dtpromoteInstance}" field="promote_topic"/></span>
					
				</li>
				</g:if>

				<g:if test="${dtpromoteInstance?.promotedesc}">
				<li class="fieldcontain">
					<span id="promote_topic-label" class="property-label"><g:message code="dtpromote.promotedesc.label" default="Promote description" /></span>
					
						<span class="property-value" aria-labelledby="promote_topic-label"><g:fieldValue bean="${dtpromoteInstance}" field="promotedesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.picfile}">
				<li class="fieldcontain">
					<span id="picfile-label" class="property-label"><g:message code="dtpromote.picfile.label" default="Picfile" /></span>
					
						<span class="property-value" aria-labelledby="picfile-label"><g:fieldValue bean="${dtpromoteInstance}" field="picfile"/><br/>
					<img src="${resource(dir:'files', file:fieldValue(bean:dtpromoteInstance, field:'picfile'))}" alt="${dtpromoteInstance.picfile}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.left_XY}">
				<li class="fieldcontain">
					<span id="left_XY-label" class="property-label"><g:message code="dtpromote.left_XY.label" default="Left XY" /></span>
					
						<span class="property-value" aria-labelledby="left_XY-label"><g:fieldValue bean="${dtpromoteInstance}" field="left_XY"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.top_XY}">
				<li class="fieldcontain">
					<span id="top_XY-label" class="property-label"><g:message code="dtpromote.top_XY.label" default="Top XY" /></span>
					
						<span class="property-value" aria-labelledby="top_XY-label"><g:fieldValue bean="${dtpromoteInstance}" field="top_XY"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.width_XY}">
				<li class="fieldcontain">
					<span id="width_XY-label" class="property-label"><g:message code="dtpromote.width_XY.label" default="Width XY" /></span>
					
						<span class="property-value" aria-labelledby="width_XY-label"><g:fieldValue bean="${dtpromoteInstance}" field="width_XY"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.high_XY}">
				<li class="fieldcontain">
					<span id="high_XY-label" class="property-label"><g:message code="dtpromote.high_XY.label" default="High XY" /></span>
					
						<span class="property-value" aria-labelledby="high_XY-label"><g:fieldValue bean="${dtpromoteInstance}" field="high_XY"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.startdate}">
				<li class="fieldcontain">
					<span id="startdate-label" class="property-label"><g:message code="dtpromote.startdate.label" default="Startdate" /></span>
					
						<span class="property-value" aria-labelledby="startdate-label"><g:formatDate date="${dtpromoteInstance?.startdate}" format="yyyy-MM-dd" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.enddate}">
				<li class="fieldcontain">
					<span id="enddate-label" class="property-label"><g:message code="dtpromote.enddate.label" default="Enddate" /></span>
					
						<span class="property-value" aria-labelledby="enddate-label"><g:formatDate date="${dtpromoteInstance?.enddate}" format="yyyy-MM-dd" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.appowner}">
				<li class="fieldcontain">
					<span id="appowner-label" class="property-label"><g:message code="dtpromote.appowner.label" default="Appowner" /></span>
					
						<span class="property-value" aria-labelledby="appowner-label"><g:link controller="mtgoapp" action="show" id="${dtpromoteInstance?.appowner?.id}">${dtpromoteInstance?.appowner?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.keep_active}">
				<li class="fieldcontain">
					<span id="keep_active-label" class="property-label"><g:message code="dtpromote.keep_active.label" default="Keepactive" /></span>
					
						<span class="property-value" aria-labelledby="keep_active-label"><g:formatBoolean boolean="${dtpromoteInstance?.keep_active}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${dtpromoteInstance?.vditems_id}">
				<li class="fieldcontain">
					<span id="vditems_id-label" class="property-label"><g:message code="dtpromote.vditems_id.label" default="Vditemsid" /></span>
					
						<span class="property-value" aria-labelledby="vditems_id-label"><g:link controller="vditems" action="show" id="${dtpromoteInstance?.vditems_id?.id}">${dtpromoteInstance?.vditems_id?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:dtpromoteInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${dtpromoteInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
