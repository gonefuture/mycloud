var tp = 4;
var page = 1;
var optionChange = 1311;
function findFastInfoList(p,dic){
clearTable();
   $.ajax({
		 type:"get",
		 url:"/football/news/list",
		 dataType : "json",
         data:{"pc":p,"dic":dic},
		 success : function(data, textStatus){
			var list = eval(data).content;
			tp = data.totalPages;
			for(var i in list){
				var t = list[i].newsDate;
				var time = new Date( t ) ;
				var d = time.toLocaleString();
				var date = d.substr(0,10);
				var title = list[i].title;
				if(title.length>30)
					{title = title.substr(0,30)+"...";}
				else 
					{title = title.substr(0);}
				if(i>0&&i%4==0)	
					$(".rightTable table").append("<tr><td ></td><td></td><td ></td></tr><tr ><td ></td><td ></td><td ></td><td ></td></tr>");
					
                $(".rightTable table").append("<tr><td class='color-oran' style='text-align:left;font-size:14px;letter-spacing:3px'>&#9830"+
				"<a href='/football/detail_fastInfo.html?id="+list[i].id+" 'target='blank' title='"+title+"'>"+title+" </a>"+
					"</td><td class='color-oran'>"+date+"</td>"+
				"<td><button class='btn red'style='width:50px;height:28px' id='de"+list[i].id+"'>删除</button></td>"+
				"<td><button class='btn gray'style='width:50px;height:28px'id='u"+list[i].id+"'>修改</button></td>"+
				"</tr>");
                   
				}
			setPage();  
			setPath();
		 	},
		 error : function(xhr, status, errMsg) {
			 alert("信息快讯模块数据传输失败！！抱歉");
		   }
});
    
}

function deleted(i){
	if(confirm("确认删除该条信息吗？")){
	$.ajax({
			
			 type:"get",
			 url:"/football/admin/news/delete/"+i,
			 // data : {"nid":i},
			 // dataType:"json",
			 success : function(data, textStatus) {
				alert(data.msg);
				findFastInfoList(page,optionChange);
				
               },
			 error : function(xhr, status, errMsg) {
				 alert("删除失败！！抱歉");
			   }
	 });
	 }
}

function addNews(){
	window.location.href="manager_addNews.html";
}
function clearTable(){

    $(".rightTable table tr:gt(0)").empty();

}
function nextPage(){

    var pn = ++page;
    if(pn<=tp)
    findFastInfoList(pn,optionChange);
	if(page>=tp)
		page=tp;

}
function forePage(){
    var pn = --page;
    if(pn>=1)
    findFastInfoList(pn,optionChange);
	if(page<=0)
		page=1;
}
function jeep(){
    var pn = $("#jeepPage").val();
	if(pn.length!=0&&pn<=tp)
    {
		findFastInfoList(pn,optionChange);
		page = pn;
	}
	else
		alert("请输入正确页码");
	$("#jeepPage").val("");
	setPage();
}
function setPage(){
	var p ;
	if(tp==0)
		p = 0;
	else
		p = page;
    $(".pageDiv #nowP").text("第"+p+"页/");
	$(".pageDiv #tp").text("共"+tp+"页");

}
function setPath(){
	optionChange = $(":selected").val();
	$("#path2").text("");
	switch (optionChange) {
		case '1311':$("#path2").text("本地快讯");break;
		case '1312':$("#path2").text("省内快讯");break;
		case '1313':$("#path2").text("国内快讯");break;
		case '1314':$("#path2").text("国际快讯");break;
	}
}
function checkOption(){
	optionChange = $(":selected").val();
	findFastInfoList(page,optionChange);
}

$(document).ready(function(){
	$(".pageDiv #jeep").click(function(){
		jeep();
	});
	$(".rightTable table").on("click","[id*='de']",function(){
		var i = $(this).attr('id');
		var id = i.substr(2);
		deleted(id);
	});
	$(".rightTable table").on("click","[id*='u']",function(){
		var i = $(this).attr('id');
		var id = i.substr(1);
		window.location.href="manager_newsUpdate.jsp?nid="+id;
	});
});
