<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Countries List</title>
</head>
<body>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Id</th>
        <th>Code</th>
        <th>Name</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="e">
      <tr>
        <td>${e.id}</td>
        <td>${e.code}</td>
        <td>${e.name}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>