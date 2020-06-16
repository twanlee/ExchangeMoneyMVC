<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/16/2020
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exchange</title>
</head>
<body>
<fieldset>
    <legend>Exchange</legend>
    <form method="post" action="/exchange">
        <p>USD</p>
        <input type="number" name="usd"><br>
        <p>Rate</p>
        <input type="number" name="rate"><br>

        <input type="submit">
    </form>
</fieldset>
</body>
</html>
