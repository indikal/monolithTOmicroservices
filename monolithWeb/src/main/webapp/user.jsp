<%-- 
    Document   : user
    Created on : Oct 2, 2018, 12:54:08 PM
    Author     : indika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Welcome <s:property value="userBean.name" /></title>
    </head>
    <body>
        <h3>User Profile</h3>

        <p>User ID: <s:property value="userBean.id" /> </p>
        <p>Full Name: <s:property value="userBean.name" /> </p>
        <p>Username: <s:property value="userBean.username" /> </p>
        <p>Password: <s:property value="userBean.password" /> </p>

<p><a href="user_form.jsp" >Create User</a></p>
</body>
</html>
