
   // JavaScript Document
$(function(){
	//var pagename=$(".postiton span a:last").html();
	var pagename2=$(".fwmain_nright .label .label_title").html();
	//alert(pagename2);
	$("#ulMenu li a").removeClass("cur");
	
	if(pagename2=="关于我们"){
		$("#ulMenu li:eq(1) a").addClass("cur");
	}else if(pagename2=="新闻动态"){
		$("#ulMenu li:eq(2) a").addClass("cur");
	}else if(pagename2=="环境设备"){
		$("#ulMenu li:eq(3) a").addClass("cur");
	}else if(pagename2=="多彩生活"||pagename2=="社会关爱"){
		$("#ulMenu li:eq(4) a").addClass("cur");
	}else if(pagename2=="老年养身"){
		$("#ulMenu li:eq(5) a").addClass("cur");
	}else if(pagename2=="联系我们"){
		$("#ulMenu li:eq(6) a ").addClass("cur");
	}else {
		$("#ulMenu li:eq(0) a").addClass("cur");
	}
});
