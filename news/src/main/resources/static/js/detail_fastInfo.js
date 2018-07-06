const findNewsByNidPath = "/football/news/show/";
function GetRequest() {
    var url = location.search;         //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for (var i = 0; i < strs.length; i++) {
            theRequest[strs[i].split("=")[0]] = decodeURIComponent(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}
var a=GetRequest();
const nid = a['id'];
findFastInfoList(nid);

function findFastInfoList(p){
  
   $.ajax({
		 type:"get",
		 url:findNewsByNidPath+p,
		 dataType : "json",
		 success : function(data, textStatus){
			 
			var list = data.object;
			console.log(data);
            $("#title").append(list.title);
            $("#souceName").append(list.soucename);
            $(".newsFields p").text(list.content);
			var date = list.newsDate;
            var t  = new Date(date);
            var time = t.toLocaleString();
            time = time.substr(0,10);
            $("#date").append(time);
            $("#author").append(list.adminid);
            if(list.image){
            	$(".img").attr('src',"pic/"+list.image);
            }else{
            	$(".img").hide();
            }
            
            
		 	},
		 error : function(xhr, status, errMsg) {
			 alert("足球新闻详情数据传输失败！！抱歉");
		   }
});
    
}