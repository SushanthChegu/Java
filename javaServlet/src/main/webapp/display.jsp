<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
      <tr>
        <td>${country.id }</td>
        <td>${country.code }</td>
        <td>${country.name }</td>
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>