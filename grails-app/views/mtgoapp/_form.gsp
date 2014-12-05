<%@ page import="com.ann.Mtgoapp" %>


<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'dtsubcategory', 'error')} ">
	<label for="appsubcategory">
		<g:message code="appsubcategory.subcatname.label" default="Appsubcategory" />
		
	</label>
	<g:select name="appsubcategory" from="${com.ann.Appsubcategory.list()}" multiple="multiple" optionKey="id" size="10" value="${mtgoappInstance?.appsubcategory*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: mtgoappInstance, field: 'appname', 'error')} required">
	<label for="appname">
		<g:message code="mtgoapp.appname.label" default="Appname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="appname" maxlength="30" required="" value="${mtgoappInstance?.appname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: mtgoappInstance, field: 'appdesc', 'error')} ">
	<label for="appdesc">
		<g:message code="mtgoapp.appdesc.label" default="Appdesc" />
		
	</label>
	<g:textArea name="appdesc" cols="40" rows="5" maxlength="512" value="${mtgoappInstance?.appdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: mtgoappInstance, field: 'picfile', 'error')} required">
	<label for="picFile" >
		<g:message code="mtgoapp.ufile.label" default="picfile" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${mtgoappInstance?.picfile != null}">
		<g:hiddenField name="picfile" value="${mtgoappInstance?.picfile}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfile" value="--" />
	</g:else>
	<g:field type='file' name="ufile"/>
</div>

<div class="fieldcontain ${hasErrors(bean: mtgoappInstance, field: 'dtversion', 'error')} required">
	<label for="dtversion">
		<g:message code="mtgoapp.dtversion.label" default="Dtversion" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="dtversion" required="" value="${mtgoappInstance?.dtversion}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: mtgoappInstance, field: 'vditems', 'error')} ">
	<label for="vditems">
		<g:message code="mtgoapp.vditems.label" default="Vditems" />
		
	</label>
	<g:select name="vditems" from="${com.ann.Vditems.list()}" multiple="multiple" optionKey="id" size="5" value="${mtgoappInstance?.vditems*.id}" class="many-to-many"/>

</div>

