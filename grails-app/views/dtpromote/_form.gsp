<%@ page import="com.ann.Dtpromote" %>

<resource:include components="autoComplete, dateChooser" autoComplete="[skin: 'default']" />

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'promote_topic', 'error')} required">
	<label for="promote_topic">
		<g:message code="dtpromote.promote_topic.label" default="Promotetopic" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="promote_topic" maxlength="50" required="" value="${dtpromoteInstance?.promote_topic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'promotedesc', 'error')}">
	<label for="promotedesc">
		<g:message code="dtpromote.promotedesc.label" default="Promote description " />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="promotedesc" cols="40" rows="5" maxlength="1024" required="" value="${dtpromoteInstance?.promotedesc}"/>

</div>


<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'picfile', 'error')} ">
	<label for="picfile">
		<g:message code="dtpromote.picfile.label" default="Picfile" />
		
	</label>
	<g:if test="${dtpromoteInstance?.picfile != null}">
		<g:hiddenField name="picfile" value="${dtpromoteInstance?.picfile}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfile" value="--" />
	</g:else>
	<g:field type='file' name="ufile"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'left_XY', 'error')} required">
	<label for="left_XY">
		<g:message code="dtpromote.left_XY.label" default="Left XY" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="left_XY" type="number" value="${dtpromoteInstance.left_XY}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'top_XY', 'error')} required">
	<label for="top_XY">
		<g:message code="dtpromote.top_XY.label" default="Top XY" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="top_XY" type="number" value="${dtpromoteInstance.top_XY}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'width_XY', 'error')} required">
	<label for="width_XY">
		<g:message code="dtpromote.width_XY.label" default="Width XY" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="width_XY" type="number" value="${dtpromoteInstance.width_XY}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'high_XY', 'error')} required">
	<label for="high_XY">
		<g:message code="dtpromote.high_XY.label" default="High XY" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="high_XY" type="number" value="${dtpromoteInstance.high_XY}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'startdate', 'error')} ">
	<label for="startdate">
		<g:message code="dtpromote.startdate.label" default="Startdate" />
		
	</label>
	<richui:dateChooser name="startdate" format="yyyy-MM-dd" value="${dtpromoteInstance?.startdate}" default="none" noSelection="['': '']" /></div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'enddate', 'error')} ">
	<label for="enddate">
		<g:message code="dtpromote.enddate.label" default="Enddate" />
		
	</label>
	<richui:dateChooser name="enddate" format="yyyy-MM-dd" value="${dtpromoteInstance?.enddate}" default="none" noSelection="['': '']" /></div>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'appowner', 'error')} required">
	<label for="appowner">
		<g:message code="dtpromote.appowner.label" default="Appowner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="appowner" name="appowner.id" from="${com.ann.Mtgoapp.list()}" optionKey="id" required="" value="${dtpromoteInstance?.appowner?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'keep_active', 'error')} ">
	<label for="keep_active">
		<g:message code="dtpromote.keep_active.label" default="Keepactive" />
		
	</label>
	<g:checkBox name="keep_active" value="${dtpromoteInstance?.keep_active}" />

</div>

<div class="fieldcontain ${hasErrors(bean: dtpromoteInstance, field: 'vditems_id', 'error')} required">
	<label for="vditems_id">
		<g:message code="dtpromote.vditems_id.label" default="Vditemsid" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="vditems_id" name="vditems_id.id" from="${com.ann.Vditems.list()}" optionKey="id" required="" value="${dtpromoteInstance?.vditems_id?.id}" class="many-to-one"/>

</div>

