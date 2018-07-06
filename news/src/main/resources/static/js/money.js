const findMoneyListPath = " /fishskills/Fish?method=showFish";
const selectFishListPath = "/fishskills/Fish?method=selectFish";
const getAllPagePath = "/fishskills/Fish?method=allPage";
getAllPage();
function findMoneyList(p){
  
clearTable();
    $.ajax({
			
			 type:"get",
			 url:findMoneyListPath,                                   
			 dataType : "json",
			 data : {"pageNum":p},
			 success : function(data, textStatus) {
				var list = eval(data);
				for(var i = 0 ;i<list.length;i++){
					var d = list[i].date;
					var date = d.substr(0,10);
					$(".rightTable table").append("<tr><td>"+list[i].fishname+"</td><td>"+list[i].type+"</td><td>"+list[i].size+"</td><td>"+list[i].price+"</td><td></td><td>"+date+"</td></tr>");
				}
                //tp = list[i].totalPage;
               
			 	},
			 error : function(xhr, status, errMsg) {
				 alert("水产行情数据传输失败！！抱歉");
			   }
	 });
    
    setPage();
    
}
function selectFishList(n){ 
	
clearTable();
    $.ajax({
			
			 type:"get",
			 url:selectFishListPath,                                  
			 dataType : "json",
			 data : {"fishname":n},
			 success : function(data, textStatus) {
				var list = eval(data);
				var len = list.length;
				if(list.length>=20)
					len = 20;
				for(var i = 0 ;i<len;i++){
					var d = list[i].date;
					var date = d.substr(0,10);
					$(".rightTable table").append("<tr><td>"+list[i].fishname+"</td><td>"+list[i].type+"</td><td>"+list[i].size+"</td><td>"+list[i].price+"</td><td></td><td>"+date+"</td></tr>");
				}
                //tp = list[i].totalPage;
               
			 	},
			 error : function(xhr, status, errMsg) {
				 alert("查询对应鱼类的数据传输失败！！抱歉");
			   }
	 });
    
}
function getAllPage(){
	$.ajax({
		 type:"post",
		 url:getAllPagePath,                                  
		 dataType:"json",
		 success : function(data, textStatus) {
			var list = data.allPage;
            	tp = list;
            	setPage();
            	//console.log(tp);
		 	},
		 error : function(xhr, status, errMsg) {
			 alert("获取总页数失败！！抱歉");
		   }
});
}
function clearTable(){

    $(".rightTable table tr:gt(0)").empty();

}
function nextPage(){
    var pn = ++page;
    if(pn<=tp)
    findMoneyList(pn);
	if(page>=tp)
		page=tp;
}
function forePage(){
    var pn = --page;
    if(pn>=1)
    findMoneyList(pn);
	if(page<=0)
		page=1;
}
function jeep(){
    var pn = $("#jeepPage").val();
	if(pn.length!=0&&pn<=tp)
    findMoneyList(pn);
	else
		alert("请输入正确页码");
}
function setPage(){

    $(".pageDiv #nowP").text("第"+page+"页/");
	$(".pageDiv #tp").text("共"+tp+"页");
	
}
var tp = 7;
var page = 1;
$(document).ready(function(){
	$(".pageDiv #jeep").click(function(){
		jeep();
	});
	$(".rightTable #select").click(function(){
		var name = $(".rightTable #fishName").val();
		selectFishList(name);
	});
});
