<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.servlet.Greens1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greens Tech OMR</title>
</head>
<body>
 <center>Greens Course Details</center>

 

<%List<Greens1> a=(List<Greens1>)request.getAttribute("userdef") ;%>
<%for( Greens1 b:a){%><br>
<%=b.getCourse() %>
<%=b.getFees() %>
<%} %>




</body>
</html>