<%-- 
    Document   : hello
    Created on : Sep 30, 2018, 9:18:20 PM
    Author     : indika
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h2><s:property value="messageStore.message" /></h2>
        
        <a href="./">Home</a>
    </body>
</html>

