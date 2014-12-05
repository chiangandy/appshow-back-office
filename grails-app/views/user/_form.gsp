<%@ page import="com.ann.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'realname', 'error')} required">
	<label for="realname">
		<g:message code="user.realname.label" default="Realname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="realname" required="" value="${userInstance?.realname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="user.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${userInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'passwordHash', 'error')} required">
	<label for="passwordHash">
		<g:message code="user.passwordHash.label" default="Password Hash" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="passwordHash" required="" value=""/> <!-- ${userInstance?.passwordHash} -->
	<g:if test="${userInstance?.passwordHash!=null}">密碼無法直接更新，請重新輸入密碼設定</g:if>	
	
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${userInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'additionalInfo', 'error')} ">
	<label for="additionalInfo">
		<g:message code="user.additionalInfo.label" default="Additional Info" />
		
	</label>
	
	<g:textArea name="additionalInfo" value="${userInstance?.additionalInfo}"  rows="10" cols="150"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'passwordChangeRequiredOnNextLogon', 'error')} ">
	<label for="passwordChangeRequiredOnNextLogon">
		<g:message code="user.passwordChangeRequiredOnNextLogon.label" default="Password Change Required On Next Logon" />
		
	</label>
	<g:checkBox name="passwordChangeRequiredOnNextLogon" value="${userInstance?.passwordChangeRequiredOnNextLogon}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'active', 'error')} ">
	<label for="active">
		<g:message code="user.active.label" default="account active" />
		
	</label>
	<g:checkBox name="active" value="${userInstance?.active}" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'permissions', 'error')} ">
	<label for="permissions">
		<g:message code="user.permissions.label" default="Permissions" />
		
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="user.roles.label" default="Roles" />
		
	</label>
	<g:select name="roles" from="${com.ann.Role.list()}" multiple="multiple" optionKey="id" size="5" value="${userInstance?.roles*.id}" class="many-to-many"/>

</div>

