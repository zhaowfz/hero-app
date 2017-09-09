<%--
  Created by IntelliJ IDEA.
  User: ynzha
  Date: 2017/8/30
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">

<head>

  <meta charset="UTF-8">

  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0"/>

  <title>伟夫子 官方网站</title>

  </head>

<script>
  var _hmt = _hmt || [];
  (function() {
    var hm = document.createElement("script");
    hm.src = "/my-jquery-plug/sky-special-effects/hm.js";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
  })();
</script>


<body>

<header>

  <div class="row">
    <div class="center-block" style="width:200px">
      人未尽,杯莫停.
    </div>
  </div>
  <!-- jQuery (Bootstrap 插件需要引入) -->
  <script src="/my-jquery-plug/js/jquery-2.2.4.min.js"></script>
  <!-- 包含了所有编译插件 -->
  <script src="/bootstrap3/dist/js/bootstrap.min.js"></script>
  <script type="text/javascript" color="102,185,255" zIndex="-10" opacity="50" count="99" src="/my-jquery-plug/sky-special-effects/canvas-nest.min.js"></script>
  <link rel="stylesheet" href="/bootstrap3/dist/css/bootstrap.min.css">
</header>

<main>
  <div class="progress">
    <div class="progress-bar progress-bar-success" role="progressbar"
         aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
         style="width: 100%;">
      <span class="sr-only">100%</span>
    </div>
  </div>
  <img src="/img/error.jpg" alt="出错了" class="center-block" style="border-image-repeat: round;width: 40%;height: 40%"/>
</main>

</body>

</html>