<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>自定义登录</title>
  </head>

  <%@ page pageEncoding="UTF-8" %>
  <%@ page contentType="text/html; charset=UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  <form:form method="post" id="fm1" commandName="${commandName}" htmlEscape="true" class="sui-form">
    <body>
      用户名：<form:input id="username" tabindex="1"
	              accesskey="${userNameAccessKey}" path="username" autocomplete="off" htmlEscape="true"
	              placeholder="邮箱/用户名/手机号" />
      <br/>
      密码：<form:password  id="password" tabindex="2" path="password"
                accesskey="${passwordAccessKey}" htmlEscape="true" autocomplete="off"
	              placeholder="请输入密码" class="span2 input-xfat"/>
      <br/>
      <input type="hidden" name="lt" value="${loginTicket}" />
      <input type="hidden" name="execution" value="${flowExecutionKey}" />
      <input type="hidden" name="_eventId" value="submit" />
      <input accesskey="l" value="登陆" type="submit" />
      <form:errors path="*" id="msg" cssClass="errors" element="div" htmlEscape="false" />
  </form:form>
  </body>
</html>
