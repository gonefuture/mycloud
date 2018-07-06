
<!--使用 jq对象的方式实现解析json并构建dom展示-->
function showUserList() {
    let url = "/football/news/list";   // 这里可以加各种参数，例如 url = "/admin/user/list"+ param   ,param是根据用户行为有不同的值，例如 param="?type=1&duty=饲养员"
    let tboby = $("#tbody");  //    找到挂在的dom节点
    $.ajax({ url:url, data:{

    },success :function (pageBean) {    //  ajax成功后执行的函数
        let data = pageBean.content;   //  从pageBean提取需要的信息,这里是List<User>
        $(data).each(function (index,element) { //  遍历用户列表List
            let tr = $("<tr/>");    //  创建新的<tr>节点

                let td = $("<td>    "+"<a href='/football/detail_fastInfo.html?id="+element.id+" 'target='blank' title='"+element.title+"'>"+element.title+" </a>"+"    </td>");  //  //  创建新的<td>节点,并填充数据
                $(tr).append(td);   //  将td节点放入tr节点

            $(tbody).append(tr);    //  将tr节点放入tbody中
        });
    }
    });
}
showUserList(); //  执行渲染的函数