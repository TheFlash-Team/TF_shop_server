<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<f2>列表</f2>
<button>
    <a href="/fundFlow/toAdd">
        添加
    </a>
</button>
<table border="1">
      <tr>
          <td>容量</td>
          <td>类型</td>
          <td>备注</td>
          <td>操作时间</td>
          <td>用户</td>

      </tr>
    <#if list??>
    <#list list as l>
        <tr>
            <td>${l.money?default('')}</td>
            <td>${l.moneyType?default('')}</td>
            <td>${l.remark?default('')}</td>
            <td>${l.creatTime?string('yyyy-MM-dd')}</td>
            <td>${l.userName?default('')}</td>
        </tr>
    </#list>
    </#if>

</table>
<hr>
<b>当期系统正在开发中，如有问题请联系<font color="red">管理员</font>管理员，敬请谅解。。。</b>
<hr>
<div>
    <img class="cms_login_img" src="../static/login/img/weixin.png">
</div>

</body>
<script type="text/javascript">
    function flush() {

    }
    // function add() {
    //
    // }
</script>
</html>