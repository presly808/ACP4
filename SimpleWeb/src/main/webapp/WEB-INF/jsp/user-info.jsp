<%@ page import="model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<h3>User</h3>

<% User user = (User) request.getAttribute("user");%>
    ID : <%=user.getId()%><br/>
    Name : <%=user.getName()%><br/>
    Salary : <%=user.getSalary()%><br/>

</body>
</html>
