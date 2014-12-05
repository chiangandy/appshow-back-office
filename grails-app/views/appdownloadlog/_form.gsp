<%@ page import="com.ann.Appdownloadlog" %>



<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'eventname', 'error')} ">
	<label for="eventname">
		<g:message code="appdownloadlog.eventname.label" default="Eventname" />
		
	</label>
	<g:textField name="eventname" maxlength="80" value="${appdownloadlogInstance?.eventname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'eventdesc', 'error')} ">
	<label for="eventdesc">
		<g:message code="appdownloadlog.eventdesc.label" default="Eventdesc" />
		
	</label>
	<g:textField name="eventdesc" maxlength="180" value="${appdownloadlogInstance?.eventdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'storekey', 'error')} ">
	<label for="storekey">
		<g:message code="appdownloadlog.storekey.label" default="Storekey" />
		
	</label>
	<g:textField name="storekey" maxlength="70" value="${appdownloadlogInstance?.storekey}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'deviceid', 'error')} ">
	<label for="deviceid">
		<g:message code="appdownloadlog.deviceid.label" default="Deviceid" />
		
	</label>
	<g:textField name="deviceid" maxlength="40" value="${appdownloadlogInstance?.deviceid}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'openudid', 'error')} ">
	<label for="openudid">
		<g:message code="appdownloadlog.openudid.label" default="Openudid" />
		
	</label>
	<g:textField name="openudid" maxlength="40" value="${appdownloadlogInstance?.openudid}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'ipaddress', 'error')} ">
	<label for="ipaddress">
		<g:message code="appdownloadlog.ipaddress.label" default="Ipaddress" />
		
	</label>
	<g:textField name="ipaddress" maxlength="20" value="${appdownloadlogInstance?.ipaddress}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'eventstatus', 'error')} ">
	<label for="eventstatus">
		<g:message code="appdownloadlog.eventstatus.label" default="Eventstatus" />
		
	</label>
	<g:textField name="eventstatus" maxlength="16" value="${appdownloadlogInstance?.eventstatus}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'checkstatusdetail', 'error')} ">
	<label for="checkstatusdetail">
		<g:message code="appdownloadlog.checkstatusdetail.label" default="Checkstatusdetail" />
		
	</label>
	<g:textField name="checkstatusdetail" maxlength="100" value="${appdownloadlogInstance?.checkstatusdetail}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'aux1', 'error')} ">
	<label for="aux1">
		<g:message code="appdownloadlog.aux1.label" default="Aux1" />
		
	</label>
	<g:textField name="aux1" maxlength="80" value="${appdownloadlogInstance?.aux1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'aux2', 'error')} ">
	<label for="aux2">
		<g:message code="appdownloadlog.aux2.label" default="Aux2" />
		
	</label>
	<g:textArea name="aux2" cols="40" rows="5" maxlength="255" value="${appdownloadlogInstance?.aux2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'aux3', 'error')} ">
	<label for="aux3">
		<g:message code="appdownloadlog.aux3.label" default="Aux3" />
		
	</label>
	<g:textArea name="aux3" cols="40" rows="5" maxlength="255" value="${appdownloadlogInstance?.aux3}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'aux4', 'error')} ">
	<label for="aux4">
		<g:message code="appdownloadlog.aux4.label" default="Aux4" />
		
	</label>
	<g:textArea name="aux4" cols="40" rows="5" maxlength="255" value="${appdownloadlogInstance?.aux4}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'aux5', 'error')} ">
	<label for="aux5">
		<g:message code="appdownloadlog.aux5.label" default="Aux5" />
		
	</label>
	<g:textArea name="aux5" cols="40" rows="5" maxlength="255" value="${appdownloadlogInstance?.aux5}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadlogInstance, field: 'amount', 'error')} required">
	<label for="amount">
		<g:message code="appdownloadlog.amount.label" default="Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="amount" type="number" value="${appdownloadlogInstance.amount}" required=""/>

</div>

