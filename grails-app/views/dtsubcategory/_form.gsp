<%@ page import="com.ann.Dtsubcategory" %>


<div class="fieldcontain ${hasErrors(bean: dtsubcategoryInstance, field: 'dtcategory', 'error')} required">
	<label for="dtcategory">
		<g:message code="dtsubcategory.dtcategory.label" default="Dtcategory" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="dtcategory" name="dtcategory.id" from="${com.ann.Dtcategory.list()}" optionKey="id" required="" value="${dtsubcategoryInstance?.dtcategory?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtsubcategoryInstance, field: 'subcatname', 'error')} required">
	<label for="subcatname">
		<g:message code="dtsubcategory.subcatname.label" default="Subcatname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="subcatname" maxlength="30" required="" value="${dtsubcategoryInstance?.subcatname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtsubcategoryInstance, field: 'subcatdesc', 'error')} ">
	<label for="subcatdesc">
		<g:message code="dtsubcategory.subcatdesc.label" default="Subcatdesc" />
		
	</label>
	<g:textArea name="subcatdesc" maxlength="120" value="${dtsubcategoryInstance?.subcatdesc}" rows="10" cols="200"/>

</div>




