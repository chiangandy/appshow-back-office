<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="layout" content="main" />
  <title>Login</title>
</head>
<body>
  <g:if test="${flash.message}">
    <div class="message">${flash.message}</div>
  </g:if>
  <br/>
  <br/>
  <br/>
  <br/>
  <br/>
  <g:form action="signIn">
    <input type="hidden" name="targetUri" value="${targetUri}" />
    <table>
      <tbody>
        <tr>
          <td><g:message code="shiroUser.username.label" default="user ID" />:</td>
          <td><input type="text" name="username" value="${username}" /></td>
        </tr>
        <tr>
          <td><g:message code="shiroUser.password.label" default="Password" />:</td>
          <td><input type="password" name="password" value="" /></td>
        </tr>
        <tr>
          <td><g:message code="shiroUser.rememberme.label" default="Remember me?" />:</td>
          <td><g:checkBox name="rememberMe" value="${rememberMe}" /></td>
        </tr>
        <tr>
          <td />
          <td><input type="submit" value="${message(code:'shiroUser.signin.label')}" /></td>
        </tr>
      </tbody>
    </table>
  </g:form>
    <br/>
    <br/>
    <br/>
</body>
</html>
