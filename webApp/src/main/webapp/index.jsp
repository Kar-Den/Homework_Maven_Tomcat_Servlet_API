<%--
  Created by IntelliJ IDEA.
  User: Happy Family
  Date: 09.08.2020
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Homework: Maven + Tomcat + Servlet API</title>
</head>
<body>

<form action="/webapp/secondServlet" method="POST">
    <h3>Simple calculate form</h3>
    <p>
        <label for="firstNum">First Num</label>
    </p>
    <p>
        <input id="firstNum" name="firstNum" type="text" placeholder="Enter num"/>
    </p>
    <p>
        <label for="secondNum">Second Num</label>
    </p>
    <p>
        <input id="secondNum" name="secondNum" type="text" placeholder="Enter num"/>
    </p>
    <p>
        <label for="operation">Operation</label>
    </p>
    <p>
        <select id="operation" name="operation">
            <option selected="selected" value="plus">+</option>
            <option value="minus">-</option>
            <option value="mul">*</option>
            <option value="div">:</option>
        </select>
    <p>

    <p>
        <input  type="submit" value="Отправить"/>
    </p>


</form>

</body>
</html>
