<%@ page import="com.ann.Appcategory" %>



<div class="fieldcontain ${hasErrors(bean: appcategoryInstance, field: 'catname', 'error')} required">
	<label for="catname">
		<g:message code="appcategory.catname.label" default="Catname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="catname" maxlength="30" required="" value="${appcategoryInstance?.catname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appcategoryInstance, field: 'catdesc', 'error')} ">
	<label for="catdesc">
		<g:message code="appcategory.catdesc.label" default="Catdesc" />
		
	</label>
	<g:textField name="catdesc" maxlength="120" value="${appcategoryInstance?.catdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appcategoryInstance, field: 'appsubcategory', 'error')} ">
	<label for="appsubcategory">
		<g:message code="appcategory.appsubcategory.label" default="Appsubcategory" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${appcategoryInstance?.appsubcategory?}" var="a">
    <li><g:link controller="appsubcategory" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="appsubcategory" action="create" params="['appcategory.id': appcategoryInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'appsubcategory.label', default: 'Appsubcategory')])}</g:link>
</li>
</ul>


</div>

