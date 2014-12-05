



<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'realname', 'error')} required">
	<label for="realname">
		<g:message code="shiroUser.realname.label" default="Realname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="realname" required="" value="${shiroUserInstance?.realname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="shiroUser.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${shiroUserInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'passwordHash', 'error')} required">
	<label for="passwordHash">
		<g:message code="shiroUser.passwordHash.label" default="Password Hash" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="passwordHash" required="" value=""/>   <!-- ${shiroUserInstance?.passwordHash} -->
		<g:if  test="${shiroUserInstance?.passwordHash!=null}">密碼無法直接更新，請重新輸入密碼設定</g:if>	
</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="shiroUser.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${shiroUserInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'additionalInfo', 'error')} ">
	<label for="additionalInfo">
		<g:message code="shiroUser.additionalInfo.label" default="Additional Info" />
		
	</label>
	<g:textArea name="additionalInfo" value="${shiroUserInstance?.additionalInfo}"  rows="10" cols="200"/>

</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'passwordChangeRequiredOnNextLogon', 'error')} ">
	<label for="passwordChangeRequiredOnNextLogon">
		<g:message code="shiroUser.passwordChangeRequiredOnNextLogon.label" default="Password Change Required On Next Logon" />
		
	</label>
	<g:checkBox name="passwordChangeRequiredOnNextLogon" value="${shiroUserInstance?.passwordChangeRequiredOnNextLogon}" />

</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'permissions', 'error')} ">
	<label for="permissions">
		<g:message code="shiroUser.permissions.label" default="Permissions" />
		
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: shiroUserInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="shiroUser.roles.label" default="Roles" />
		
	</label>
	<g:select name="roles" from="${Role.list()}" multiple="multiple" optionKey="id" size="5" value="${shiroUserInstance?.roles*.id}" class="many-to-many"/>

</div>

