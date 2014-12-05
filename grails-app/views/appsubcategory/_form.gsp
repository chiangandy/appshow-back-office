<%@ page import="com.ann.Appsubcategory" %>



<div class="fieldcontain ${hasErrors(bean: appsubcategoryInstance, field: 'subcatname', 'error')} required">
	<label for="subcatname">
		<g:message code="appsubcategory.subcatname.label" default="Subcatname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="subcatname" maxlength="30" required="" value="${appsubcategoryInstance?.subcatname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appsubcategoryInstance, field: 'subcatdesc', 'error')} ">
	<label for="subcatdesc">
		<g:message code="appsubcategory.subcatdesc.label" default="Subcatdesc" />
		
	</label>
	<g:textField name="subcatdesc" maxlength="120" value="${appsubcategoryInstance?.subcatdesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appsubcategoryInstance, field: 'appcategory', 'error')} required">
	<label for="appcategory">
		<g:message code="appsubcategory.appcategory.label" default="Appcategory" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="appcategory" name="appcategory.id" from="${com.ann.Appcategory.list()}" optionKey="id" required="" value="${appsubcategoryInstance?.appcategory?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appsubcategoryInstance, field: 'mtgoapp', 'error')} ">
	<label for="mtgoapp">
		<g:message code="appsubcategory.mtgoapp.label" default="Mtgoapp" />
		
	</label>
	<g:select name="mtgoapp" from="${com.ann.Mtgoapp.list()}" multiple="multiple" optionKey="id" size="5" value="${appsubcategoryInstance?.mtgoapp*.id}" class="many-to-many"/>

</div>

