<%-- 
    Document   : user_form
    Created on : Oct 2, 2018, 2:22:15 PM
    Author     : indika
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create new user</title>
    </head>
    <body>

    <h3>Create User</h3>
    <s:form id="user_form" action="createUser">
        <s:textfield name="userBean.name" label="Full Name"></s:textfield>
        <s:textfield name="userBean.username" label="User Name"></s:textfield>
        <s:password name="userBean.password" label="Password"></s:password>
        <s:submit value="Create User"></s:submit>
    </s:form>
</body>
</html>

