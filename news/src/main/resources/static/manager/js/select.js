$(function() {
    //加载第一个栏目
    LoadFirst();



    //使用async/await语句的fetch 
    async function LoadFirst() {
        try {
            // 注意这里的await语句，其所在的函数必须有async关键字声明
            let response = await fetch('/football/dict/list?pid=15000');
            let data = await response.json();
            
            $("#first").append("<option value= -1 >请选择新闻栏目</option>");
            for (let i = 0; i < data.length; i++) {
                $("#first").append("<option value="+data[i].id+" >"+data[i].name+"</option>");
            } 
        } catch(error) {
                console.error(error);
        }
    }

});
