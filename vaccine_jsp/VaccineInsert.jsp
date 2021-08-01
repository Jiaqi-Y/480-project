<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Vaccine Insert</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Vaccine Insert</h1>
  <%--
  1. 显示errors --> 字段错误
  2. 显示异常错误
  3. 回显
   --%>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/VaccineServletInsert'/>" method="post">
	<input type="hidden" name="method" value="Vaccine Insert"/>
	Name	：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	Type	：<input type="text" name="type" value="${form.type }"/>
	<span style="color: red; font-weight: 900">${errors.type }</span>
	<br/>
	Company	：<input type="text" name="company" value="${form.company }"/>
	<span style="color: red; font-weight: 900">${errors.company }</span>
	<br/>
	ProtectionRate    :<input type="text" name="protection_rate" value="${form.protection_rate }"/>
	<span style="color: red; font-weight: 900">${errors.protection_rate }</span>
	<input type="submit" value="Vaccine Insert"/>
</form>
  </body>
</html>
