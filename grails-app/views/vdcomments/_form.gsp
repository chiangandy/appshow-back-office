<%@ page import="com.ann.Vdcomments" %>
<%@ page import="com.ann.Vditems" %>

<div class="fieldcontain ${hasErrors(bean: vdcommentsInstance, field: 'comtopic', 'error')} required">
	<label for="comtopic">
		<g:message code="vdcomments.comtopic.label" default="Comtopic" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="comtopic" maxlength="140" required="" value="${vdcommentsInstance?.comtopic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vdcommentsInstance, field: 'comtext', 'error')} required">
	<label for="comtext">
		<g:message code="vdcomments.comtext.label" default="Comtext" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="comtext" maxlength="140" required="" rows="5" maxlength="512"  value="${vdcommentsInstance?.comtext}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vdcommentsInstance, field: 'comrate', 'error')} required">
	<label for="comrate">
		<g:message code="vdcomments.comrate.label" default="Comrate" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="comrate" from="${0..5}" class="range" required="" value="${fieldValue(bean: vdcommentsInstance, field: 'comrate')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vdcommentsInstance, field: 'vditems', 'error')} required">
	<label for="videoshow">
		<g:message code="vdcomments.vditems.label" default="Video Show" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="vditems" name="vditems.id" from="${com.ann.Vditems.list()}" optionKey="id" required="" value="${vdcommentsInstance?.vditems?.id}" class="many-to-one"/>

</div>

