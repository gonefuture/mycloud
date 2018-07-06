
getAllPower();
function getAllPower(){  //填充所有权限
    $("#allPower").empty(); 
    $.ajax({
        type:"get",
        dataType:"json",
        url:"/fishskills/power?method=showAllPower",
        success:function(data,textStatus){
            var powerList = data;
            for(var p in powerList){

            $("#allPower").append("<button id='p"+powerList[p].pid+"' class='cls btn big gray '>&lt"+powerList[p].name+"</button>");
            
        }
        var powerCount = powerList.length;
        $("#showNum").append("("+powerCount+")");
        },error:function(xhr,errMsg,status){
             alert("获取所有可用权限失败！！抱歉");
        }
    });
}

function addPowerSave(id){//为管理员权限
   
    var powerArr = [];
    var pgl = $(".powerGet button").length; 
    for(var p = 0;p<pgl;p++){
        var rid = $(".powerGet button:eq("+p+")").attr("id");
        var r_id = rid.substr(1);
        powerArr[p] = r_id;
    }
    
    /*var permissions = "[";  //也可以用字符串连接
    for(var p in powerArr){
        if(p==0)
        permissions +=powerArr[p];
        else
        permissions +=","+powerArr[p];
    }
    permissions+="]";*/
    var powObj = {"pids":powerArr};
    var powerJson = JSON.stringify(powObj);
    console.log(powerJson);	
    
     $.ajax({
       
        type:"post",
        data:{"pidJson":powerJson},//["1","2"]
        dataType:"json",
        url:"/fishskills/back/power?method=addPrivilege&adminid="+id,
        success:function(data,textStatus){
            var stat = eval(data).status;
            var verb = eval(data).verbose;
            alert(verb);
           
        },error:function(xhr,errMsg,status){
             alert("新增角色权限失败！！抱歉");
        }
    });
}

function addRoleSave(){
	
	 var adminid = $("#adminNum").val();
	 var adminname = $("#adminname").val();
	 var adminphone = $("#adminphone").val();
	 var adminemail = $("#adminemail").val();
	 var password = $("#password").val();
	 var note = $("#note").val();
	 if(confirm("确认添加:"+adminname+"为管理员吗？")){
	 $.ajax({
	        type:"post",
	        data:{"adminname":adminname,"adminphone":adminphone,"adminemail":adminemail,"adminid":adminid,"password":password,"note":note,"adminflag":"1"},
	        dataType:"json",
	        url:"/fishskills/back/Admin?method=addAdmin",
	        success:function(data,textStatus){
	        	
	        	addPowerSave(adminid);
	           
	        },error:function(xhr,errMsg,status){
	             alert("新增角色失败！！抱歉");
	        }
	    });
	 }
}


function reset(){
	$("input").val("");
	$(".powerGet").empty();
	getAllPower();
}









$(document).ready(function(){
	
    $(".powerSum").on("click","[id*='p']",function(){
        var i = $(this).attr("id");
        var id = i.substr(1);
        var str = $(this).text();
        var text = str.substr(1);
        $(this).remove();
        $(".powerGet").append("<button id='g"+id+"'class='cls btn big blue'>"+text+"&gt</button>");
    });
    $(".powerGet").on("click","[id*='g']",function(){
        var i = $(this).attr("id");
        var id  = i.substr(1);
        var str = $(this).text();
        var text = str.substring(0,str.length-1);
        $(this).remove();
        $(".powerSum").append("<button id='p"+id+"' class='cls btn big gray'>&lt"+text+"</button>");
    });
});   