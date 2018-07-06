const insertedPath = "/fishskills/que?method=insert";
function  inserted(name,phone,email,theme,details) {
    if(confirm("确认要发布此问题吗？")){
    $.ajax({
        type:'post',
        url:insertedPath,
        data:{"name":name,"phone":phone,"email":email,"theme":theme,"details":details},
        dataTyep:'json',
        success:function(data,textStatus){
            alert(JSON.parse(data).msg);
        },
        error:function(xhr,status,errMsg){
            alert("发布失败，抱歉！！！");
        }
    });
    }
}
function save(){
    var name = $("#name").val();
    var phone = $("#phone").val();
    var email = $("#email").val();
    var theme = $("#theme").val();
    var details = $("#details").val();
    inserted(name,phone,email,theme,details);
}
function reset(){
    $("input").val("");
    $("textarea").val("");
}