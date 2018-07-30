<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用AJAX以JSON方式提交数据</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
<form >
    id：<input type="text" id="page" value="2" /><br/>
    名称：<input type="text" id="row" value="3"/><br/>
    <input type="button" value="提交" id="sender">
</form>
<div id="messageDiv"></div>

<script>
    $('#sender').click(function(){
        var page=document.getElementById('page').value;
        var row=document.getElementById('row').value;
        var pager={"page":page,"row":row};
        var jsonData = JSON.stringify(pager);
        var page="/bbs/user/getUserListByPage";

        $.ajax({
            type:"get",
            url:page ,
            data:pager,
            dataType:"json",
            contentType : "application/json;charset=UTF-8",
            success: function(result){
                console.log(result);
                $.each(result,function(n,value) {
                    console.log(n+' '+value);
                    console.log(value.name+value.password) ;
                });
                // var array = result.toArray();
                // alert(array);
                // $.each(array, function (i, n)
                // {
                //     alert("id:"+n.id+" name"+n.name);
                // });
            }
        });
        alert("提交成功，请在Tomcat控制台查看服务端接收到的数据");

    });
</script>
</body>

</html>
