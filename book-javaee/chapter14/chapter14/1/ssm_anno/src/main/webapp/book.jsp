<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head><title>图书信息查询</title></head>
<body>
<table border="1">
    <tr>
        <th>图书id</th>
        <th>图书名称</th>
        <th>出版社</th>
        <th>作者</th>
    </tr>
    <tr>
        <td>${books.id}</td>
        <td>${books.name}</td>
        <td>${books.press}</td>
        <td>${books.author}</td>
    </tr>
</table>
</body>
</html>

