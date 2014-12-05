<%@ page import="com.ann.Bullletin" %>

<resource:include components="autoComplete, dateChooser" autoComplete="[skin: 'default']" />


<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'bulletin_topic', 'error')} required">
	<label for="bulletin_topic">
		<g:message code="bullletin.bulletin_topic.label" default="Bulletintopic" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bulletin_topic" maxlength="60" required="" value="${bullletinInstance?.bulletin_topic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'bulletin_content', 'error')} required">
	<label for="bulletin_content">
		<g:message code="bullletin.bulletin_content.label" default="Bulletincontent" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="bulletin_content" cols="40" rows="5" maxlength="1024" required="" value="${bullletinInstance?.bulletin_content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'picfile', 'error')} ">
	<label for="picfile">
		<g:message code="bullletin.picfile.label" default="Picfile" />
		
	</label>
	<g:if test="${bullletinInstance?.picfile != null}">
		<g:hiddenField name="picfile" value="${bullletinInstance?.picfile}" />
	</g:if>
	<g:else>
		<g:hiddenField name="picfile" value="--" />
	</g:else>
	<g:field type='file' name="ufile"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'startdate', 'error')} ">
	<label for="startdate">
		<g:message code="bullletin.startdate.label" default="Startdate" />
		
	</label>
	<richui:dateChooser name="startdate" format="yyyy-MM-dd" value="${bullletinInstance?.startdate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'enddate', 'error')} ">
	<label for="enddate">
		<g:message code="bullletin.enddate.label" default="Enddate" />
		
	</label>
	<richui:dateChooser name="enddate" format="yyyy-MM-dd" value="${bullletinInstance?.enddate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'gotop', 'error')} ">
	<label for="gotop">
		<g:message code="bullletin.gotop.label" default="Gotop" />
		
	</label>
	<g:checkBox name="gotop" value="${bullletinInstance?.gotop}" />

</div>

<div class="fieldcontain ${hasErrors(bean: bullletinInstance, field: 'keep', 'error')} ">
	<label for="keep">
		<g:message code="bullletin.keep.label" default="Keep" />
		
	</label>
	<g:checkBox name="keep" value="${bullletinInstance?.keep}" />

</div>

