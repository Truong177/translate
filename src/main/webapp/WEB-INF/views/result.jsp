<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 7/15/2024
  Time: 09:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Kết quả tra cứu</title>
</head>
<body>
<h1>Kết quả tra cứu từ Anh-Việt</h1>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
<c:if test="${not empty meaning}">
    <p>Nghĩa của từ "<strong>${word}</strong>" là: ${meaning}</p>
</c:if>
<a href="/">Quay lại</a>
</body>
</html>

