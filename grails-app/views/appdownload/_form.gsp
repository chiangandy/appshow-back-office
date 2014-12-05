<%@ page import="com.ann.Appdownload" %>



<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'apptopic', 'error')} required">
	<label for="apptopic">
		<g:message code="appdownload.apptopic.label" default="Apptopic" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="apptopic" maxlength="80" required="" value="${appdownloadInstance?.apptopic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'apppublisher', 'error')} ">
	<label for="apppublisher">
		<g:message code="appdownload.apppublisher.label" default="Apppublisher" />
		
	</label>
	<g:textField name="apppublisher" maxlength="60" value="${appdownloadInstance?.apppublisher}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'appdesc', 'error')} ">
	<label for="appdesc">
		<g:message code="appdownload.appdesc.label" default="Appdesc" />
		
	</label>
	<g:textArea name="appdesc" cols="40" rows="5" maxlength="500" value="${appdownloadInstance?.appdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'storekey', 'error')} ">
	<label for="storekey">
		<g:message code="appdownload.storekey.label" default="Storekey" />
		
	</label>
	<g:textField name="storekey" maxlength="40" value="${appdownloadInstance?.storekey}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'mediaurl', 'error')} ">
	<label for="mediaurl">
		<g:message code="appdownload.mediaurl.label" default="Mediaurl" />
		
	</label>
	<g:textField name="mediaurl" maxlength="128" value="${appdownloadInstance?.mediaurl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'picfile', 'error')} required">
	<label for="picfile">
		<g:message code="appdownload.picfile.label" default="Picfile" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${appdownloadInstance?.picfile != null}">
		<g:hiddenField name="picfile" value="${appdownloadInstance?.picfile}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfile" value="--" />
	</g:else>
	<g:field type='file' name="ufile"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'comrate', 'error')} required">
	<label for="comrate">
		<g:message code="appdownload.comrate.label" default="Comrate" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="comrate" from="${0..5}" class="range" required="" value="${fieldValue(bean: appdownloadInstance, field: 'comrate')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'datestart', 'error')} required">
	<label for="datestart">
		<g:message code="appdownload.datestart.label" default="Datestart" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="datestart" precision="day"  value="${appdownloadInstance?.datestart}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'datestop', 'error')} required">
	<label for="datestop">
		<g:message code="appdownload.datestop.label" default="Datestop" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="datestop" precision="day"  value="${appdownloadInstance?.datestop}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'mtgoapp', 'error')} required">
	<label for="mtgoapp">
		<g:message code="appdownload.mtgoapp.label" default="Mtgoapp" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="mtgoapp" name="mtgoapp.id" from="${com.ann.Mtgoapp.list()}" optionKey="id" required="" value="${appdownloadInstance?.mtgoapp?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'picfiled1', 'error')}">
	<label for="picfiled1">
		<g:message code="appdownload.picfiled1.label" default="Picfiled1" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${appdownloadInstance?.picfiled1 != null}">
		<g:hiddenField name="picfiled1"d1 value="${appdownloadInstance?.picfiled1}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfiled1" value="--" />
	</g:else>
	<g:field type='file' name="ufile1"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'picfiled2', 'error')}">
	<label for="picfiled2">
		<g:message code="appdownload.picfiled2.label" default="Picfiled2" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${appdownloadInstance?.picfiled2 != null}">
		<g:hiddenField name="picfiled2"d1 value="${appdownloadInstance?.picfiled2}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfiled2" value="--" />
	</g:else>
	<g:field type='file' name="ufile2"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appdownloadInstance, field: 'picfiled3', 'error')}">
	<label for="picfiled3">
		<g:message code="appdownload.picfiled3.label" default="Picfiled3" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${appdownloadInstance?.picfiled3 != null}">
		<g:hiddenField name="picfiled3"d1 value="${appdownloadInstance?.picfiled3}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfiled3" value="--" />
	</g:else>
	<g:field type='file' name="ufile3"/>

</div>

