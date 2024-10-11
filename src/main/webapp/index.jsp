<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Home Page</title>
</head>
<body>
<h1>
  <%!
    int num = 20;
    int func(){
      return num;
    }
  %>
  <%=func()%>
</h1>
</body>
</html>