<%--
  Created by IntelliJ IDEA.
  User: ynzha
  Date: 2017/8/30
  Time: 1:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="/bootstrap3/dist/css/bootstrap.min.css">

    <link type="text/css" rel="stylesheet" href="/my-jquery-plug/date-special-effects/css/jquery.range.css" />
    <link type="text/css" rel="stylesheet" href="/my-jquery-plug/date-special-effects/css/css.css" />
    <script type="application/javascript" src="/my-jquery-plug/js/jquery-2.1.1.min.js"></script>
    <script type="application/javascript" src="/bootstrap3/dist/js/bootstrap.min.js"></script>
    <script type="application/javascript" src="/my-jquery-plug/date-special-effects/js/jquery.range.js"></script>
</head>
<body>
   <div class="time clearfix">
       <div class="btn-group year_group fl">
           <button data-toggle="dropdown" class="btn dropdown-toggle" type="button">
               <span id="year">2017年</span><i class="caret"></i>
           </button>
           <ul class="dropdown-menu">
               <li><a href="#">2021年</a></li>
               <li><a href="#">2020年</a></li>
               <li><a href="#">2019年</a></li>
               <li><a href="#">2018年</a></li>
               <li><a href="#">2017年</a></li>
               <li><a href="#">2016年</a></li>
               <li><a href="#">2015年</a></li>
           </ul>
       </div>
       <div class="btn-group mon_group fl">
           <button data-toggle="dropdown" class="btn dropdown-toggle" type="button">
               <span id="month">5月</span><i class="caret"></i>
           </button>
           <ul class="dropdown-menu">
               <li><a href="#">1月</a></li>
               <li><a href="#">2月</a></li>
               <li><a href="#">3月</a></li>
               <li><a href="#">4月</a></li>
               <li><a href="#">5月</a></li>
               <li><a href="#">6月</a></li>
               <li><a href="#">7月</a></li>
               <li><a href="#">8月</a></li>
               <li><a href="#">9月</a></li>
               <li><a href="#">10月</a></li>
               <li><a href="#">11月</a></li>
               <li><a href="#">12月</a></li>
           </ul>
       </div>
       <div class="demo fl">
           <input type="hidden" value="" class="single-slider none">
       </div>
   </div>

   <script type="application/javascript">
       $(document).ready(function(){
           // 下拉选择框
           $('.dropdown-menu li').click(function(){
               var txt=$(this).text();
               $(this).parent().prev().find('span').eq(0).text(txt);
           })

           changeY();
           $('.dropdown-menu li').click(function(){
               var name=$('a',this).text();
               $(this).parents('.btn-group').find('.dropdown-toggle span').text(name);
               changeY();
           })

           function changeY(){
               var year=$('#year').text().replace(/[^0-9]/ig,"")
               var month=$('#month').text().replace(/[^0-9]/ig,"")
               var days=totalDays(year, month);
               var dayArr=[];
               for(var i=1;i<=days;i++)
               {
                   dayArr.push(i+'号');
               }
               var last=parseInt(dayArr[dayArr.length-1]);
               $('.demo').children().remove();
               var div='<input type="hidden" value="" class="single-slider none">';
               $('.demo').html(div)
               //
               $('.single-slider').jRange({
                   from:1,
                   to:last,
                   step: 1,
                   scale: dayArr,
                   format: '%s',
                   width:850,
                   showLabels: true,
                   snap: true
               });
           }

           //一个月的总天数
           function totalDays(years,months){
               var d = new Date(years, months, 0);
               return d.getDate();
           }
       })
   </script>

</body>
</html>
