$(document).ready(function () {

    $(".leftMoneyBottom li a:gt(0)").mousemove(function(){
        $(".leftMoneyBottom li a:gt(0)").css("background","#fff");
        $(this).css("background","#f0f0f0");
    });
    $(".leftMoneyBottom li a:gt(0)").mouseleave(function(){
        $(".leftMoneyBottom li a:gt(0)").css("background","#fff");
    });
    
});