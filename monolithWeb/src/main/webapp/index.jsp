<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h3>Welcome User, please enter you name below</h3><br>
        <s:form id="hello_form" action="hello">
            <s:textfield name="name" label="Name"></s:textfield>
            <s:submit value="Get Message"></s:submit>
        </s:form>

        <h3>Admin Login</h3>
        <s:form id="login_form" action="login">
            <s:textfield name="userBean.username" label="User Name"></s:textfield>
            <s:password name="userBean.password" label="Password"></s:password>
            <s:submit value="Login"></s:submit>
        </s:form>
    </body>
</html>
