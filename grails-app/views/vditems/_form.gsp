<%@ page import="com.ann.Vditems" %>



<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'vditemname', 'error')} required">
	<label for="vditemname">
		<g:message code="vditems.vditemname.label" default="Vditemname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="vditemname" maxlength="50" required="" value="${vditemsInstance?.vditemname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'vditemdesc', 'error')} ">
	<label for="vditemdesc">
		<g:message code="vditems.vditemdesc.label" default="Vditemdesc" />
		
	</label>
	<g:textField name="vditemdesc" maxlength="200" value="${vditemsInstance?.vditemdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'vditemtype', 'error')} ">
	<label for="vditemtype">
		<g:message code="vditems.vditemtype.label" default="Vditemtype" />
		
	</label>
	<g:textField name="vditemtype" maxlength="20" value="${vditemsInstance?.vditemtype}"/>

</div>

<g:hiddenField name="createuser" value="${vditemsInstance?.createuser}" />

<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'mediaurl', 'error')} required">
	<label for="mediaurl">
		<g:message code="vditems.mediaurl.label" default="Mediaurl" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mediaurl" maxlength="128" required="" value="${vditemsInstance?.mediaurl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'picfile', 'error')} required">
	<label for="picFile" >
		<g:message code="vditems.ufile.label" default="picfile" />
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${vditemsInstance?.mediaurl != null}">
		<g:hiddenField name="picfile" value="${vditemsInstance?.mediaurl}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfile" value="--" />
	</g:else>
	<g:field type='file' name="ufile"/>
</div>

<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'appowner', 'error')} required">
	<label for="appowner">
		<g:message code="vditems.appowner.label" default="Appowner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="appowner" name="appowner.id" from="${com.ann.Mtgoapp.list()}" optionKey="id" required="" value="${vditemsInstance?.appowner?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: vditemsInstance, field: 'dtsubcategory', 'error')} ">
	<label for="dtsubcategory">
		<g:message code="dtsubcategory.subcatname.label" default="Dtsubcategory" />
		
	</label>
	<g:select name="dtsubcategory" from="${com.ann.Dtsubcategory.list()}" multiple="multiple" optionKey="id" size="10" value="${vditemsInstance?.dtsubcategory*.id}" class="many-to-many"/>

</div>

