<%@ page import="com.ann.Dtcategory" %>



<div class="fieldcontain ${hasErrors(bean: dtcategoryInstance, field: 'catname', 'error')} required">
	<label for="catname">
		<g:message code="dtcategory.catname.label" default="Catname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="catname" maxlength="30" required="" value="${dtcategoryInstance?.catname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtcategoryInstance, field: 'catdesc', 'error')} ">
	<label for="catdesc">
		<g:message code="dtcategory.catdesc.label" default="Catdesc" />
		
	</label>
	<g:textArea name="catdesc" maxlength="120" value="${dtcategoryInstance?.catdesc}" rows="10" cols="200"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtcategoryInstance, field: 'subcategory', 'error')} ">
	<label for="subcategory">
		<g:message code="dtcategory.subcategory.label" default="Subcategory" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${dtcategoryInstance?.subcategory?}" var="s">
    <li><g:link controller="dtsubcategory" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="dtsubcategory" action="create" params="['dtcategory.id': dtcategoryInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'dtsubcategory.label', default: 'Dtsubcategory')])}</g:link>
</li>
</ul>


</div>

