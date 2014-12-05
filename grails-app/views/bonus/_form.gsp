<%@ page import="com.ann.Bonus" %>



<div class="fieldcontain ${hasErrors(bean: bonusInstance, field: 'eventtopic', 'error')} required">
	<label for="eventtopic">
		<g:message code="bonus.eventtopic.label" default="Eventtopic" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="eventtopic" maxlength="50" required="" value="${bonusInstance?.eventtopic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bonusInstance, field: 'eventdesc', 'error')} ">
	<label for="eventdesc">
		<g:message code="bonus.eventdesc.label" default="Eventdesc" />
		
	</label>
	<g:textArea name="eventdesc" cols="80" rows="5" maxlength="512" value="${bonusInstance?.eventdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bonusInstance, field: 'eventfrom', 'error')} ">
	<label for="eventfrom">
		<g:message code="bonus.eventfrom.label" default="Eventfrom" />
		
	</label>
	<g:if test="${bonusInstance?.eventfrom != null}">
		<g:textField name="eventfrom" value="${bonusInstance?.eventfrom}"/>
	</g:if>
	<g:else>
		<g:textField name="eventfrom" value="後台操作"/>     // App產生
	</g:else>
</div>

<div class="fieldcontain ${hasErrors(bean: bonusInstance, field: 'bonus', 'error')} required">
	<label for="bonus">
		<g:message code="bonus.bonus.label" default="Bonus" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="bonus" type="number" value="${bonusInstance.bonus}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: bonusInstance, field: 'activeevent', 'error')} ">
	<label for="activeevent">
		<g:message code="bonus.activeevent.label" default="Activeevent" />
		
	</label>
	<g:checkBox name="activeevent" value="${bonusInstance?.activeevent}" />

</div>

<div class="fieldcontain ${hasErrors(bean: bonusInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="bonus.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${com.ann.User.list()}" optionKey="id" required="" value="${bonusInstance?.user?.id}" class="many-to-one"/>

</div>

