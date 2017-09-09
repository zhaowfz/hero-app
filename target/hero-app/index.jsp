<%--
  Created by IntelliJ IDEA.
  User: ynzha
  Date: 2017/8/24
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script src="bootstrap/js/jquery-2.1.1.min.js" type="application/javascript"></script>
</head>
<body>
<script>
  $(function(){
    $("#hello").click(function(){
      alert("22");
    });
  });
</script>
<a href="#" id="hello">hello 贾大少!你的东风快递。</a>
<a href="WEB-INF/views/hello.html" id="hello">hello 贾大少!你的东风快递。</a>
<img src="img/ww.jpg">
</body>
</html>
