if(!+[1,]);else
$(function(){
	$('#wrapper').hide().fadeIn(1000);
	
//下拉菜单
    $('#more').hover(function() {
        $('.select_more').stop().slideDown(200);
    }, function() {
        $('.select_more').stop().slideUp(200);
    });
     $('#game').hover(function() {
        $('.select_more_G').stop().slideDown(200);
    }, function() {
        $('.select_more_G').stop().slideUp(200);
    });
//统计点击事件通用函数
// function webDownloadCollect(key){
// 	$.ajax({
// 		url: 'http://relay.ushareit.com/relayserver/SinglePageStatistical',
// 		type: 'get',
// 		dataType:'jsonp',
// 		data: {key: key,type:'click'}
// 	});
// }
	$('.downbtn').on('click', function() {
		var data = $(this).attr('data-click');
		data = JSON.parse(data);
		var key = data.key;
		var lang = data.lang;
		if (key && lang) {
			if (lang == "en") {
				MtaH5.clickStat(key,{'en':'true'})
			}else if(lang == "zh"){
				MtaH5.clickStat(key,{'zh':'true'})
			}else if (lang == 'phonezh') {
				MtaH5.clickStat(key,{'phonezh':'true'})
			}else if(lang == 'phoneen'){
				MtaH5.clickStat(key,{'phoneen':'true'})
			}
		}
	});
})
