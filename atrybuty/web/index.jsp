<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 26.05.2018
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ZALOGUJ SIĘ</title>
  </head>
  <body>
    <form action="LoginServlet" method="post" >
      <label>
        <input type="text" name="login">
      </label>
      <label>
        <input type="password" name="password">
      </label>
      <input type="submit" value="Wyślij">

    </form>




  </body>
</html>
