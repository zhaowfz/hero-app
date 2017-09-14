$(document).ready(function() {
//绑定元素点击事件
$(".menu_list ul li").click(function() {
	//判断对象是显示还是隐藏
	if($(this).children(".div1").is(":hidden")){
		//表示隐藏
		if(!$(this).children(".div1").is(":animated")) {
			//下拉箭头旋转
			//判断是否是IE浏览器
			if(myBrowser()=="IE"){
				//IE浏览器不兼容transform属性，使用filter属性
				$(this).children(".xiala").css({'filter':'progid:DXImageTransform.Microsoft.BasicImage(rotation:1)'});
			}else{
				$(this).children(".xiala").css({'transform':'rotate(90deg)'});
			}
			//如果当前没有进行动画，则添加新动画
			$(this).children(".div1").animate({
					height: 'show'
				}, 1000)
				//siblings遍历div1的元素
				.end().siblings().find(".div1").hide(1000);
		}
	} else {
		//表示显示
		if(!$(this).children(".div1").is(":animated")) {
			//下拉箭头旋转恢复
			//判断是否是IE浏览器
			if(myBrowser()=="IE"){
				//IE浏览器不兼容transform属性，使用filter属性
				$(this).children(".xiala").css({'filter':'progid:DXImageTransform.Microsoft.BasicImage(rotation:0)'});
			}else{
				$(this).children(".xiala").css({'transform':'rotate(0deg)'});  
			}
			
			$(this).children(".div1").animate({
					height: 'hide'
				}, 1000)
				.end().siblings().find(".div1").hide(1000);
		}
	}
});

//阻止事件冒泡，子元素不再继承父元素的点击事件
$('.div1').click(function(e){
	e.stopPropagation();
});

//点击子菜单为子菜单添加样式，并移除所有其他子菜单样式
$(".menu_list ul li .div1 .zcd").click(function() {
	//设置当前菜单为选中状态的样式，并移除同类同级别的其他元素的样式
	$(this).addClass("removes").siblings().removeClass("removes");
	//遍历获取所有父菜单元素
	  $(".div1").each(function(){
	  		//判断当前的父菜单是否是隐藏状态
	  		if($(this).is(":hidden")){
	  			//如果是隐藏状态则移除其样式
	  			$(this).children(".zcd").removeClass("removes");
		  		}
		  });
	});
	
	//循环所有div1元素，下拉箭头在
	$(".lis>.fuMenu").click(function() {
		$(".div1").each(function(){
		//判断当前的父菜单是否是隐藏状态
		if(!$(this).is(":hidden")){
			//如果当前点击时不是隐藏状态则将其箭头显示为原始状态
			if(myBrowser()=="IE"){
				//判断是否是IE浏览器
				//IE浏览器不兼容transform属性，使用filter属性
				$(this).parent().children("img").css({'filter':'progid:DXImageTransform.Microsoft.BasicImage(rotation:0)'});
			}else{
				$(this).parent().children("img").css({'transform':'rotate(0deg)'});
			}
		}
	  });
	});
	//点击收缩菜单
	$("#hidIcon").click(function(){
		//隐藏菜单并显示隐藏后的左侧菜单
		$(".leftMenu").animate({"margin-left":"-220px"},"slow",function(){
			$(".hidLeftMenu").css("display","block");
			$(".leftMenu").css("display","none")
		})
	})
	//点击图标展开菜单显示
	$(".openMenu").click(function(){
		$(".hidLeftMenu").css("display","none");
		$(".leftMenu").css("display","block")
		.animate({"margin-left":"0px"},"slow");
	})
	
});

//判断浏览器类型
function myBrowser(){
    var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
    var isOpera = userAgent.indexOf("Opera") > -1;
    if (isOpera) {
        return "Opera"
    }; //判断是否Opera浏览器
    if (userAgent.indexOf("Firefox") > -1) {
        return "FF";
    } //判断是否Firefox浏览器
    if (userAgent.indexOf("Chrome") > -1){
        return "Chrome";
    }
    if (userAgent.indexOf("Safari") > -1) {
        return "Safari";
    } //判断是否Safari浏览器
    if (userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera) {
        return "IE";
    }; //判断是否IE浏览器
    if (userAgent.indexOf("Trident") > -1) {
        return "Edge";
    } //判断是否Edge浏览器
}