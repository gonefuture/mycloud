// JavaScript Document
var speedx=60; //数字越大速度越慢 
var tabx=document.getElementById("demox"); 
var tab1x=document.getElementById("demo1x"); 
var tab2x=document.getElementById("demo2x"); 
tab2x.innerHTML=tab1x.innerHTML; 
function Marqueex(){ 
if(tab2x.offsetWidth-tabx.scrollLeft<=0) 
tabx.scrollLeft-=tab1x.offsetWidth 
else{ 
tabx.scrollLeft++; 
} 
} 
var MyMarx=setInterval(Marqueex,speedx); 
tabx.onmouseover=function() {clearInterval(MyMarx)}; 
tabx.onmouseout=function() {MyMarx=setInterval(Marqueex,speedx)}; 
   
   
