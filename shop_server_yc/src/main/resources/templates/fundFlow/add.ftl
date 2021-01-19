<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<button>
    <a href="/fundFlow/findAll">
        返回列表
    </a>
</button>
<form method="post" action="/fundFlow/add">
    金额:<input type="text" name="money">
    <div>类型:
        <label><input type="radio" name="moneyType" value="0" required>支出</label>
        <label><input type="radio" name="moneyType" value="1" required>收入</label>
    </div>
    备注:<input type="text" name="remark">
    用户:<input type="text" name="userName" required>
    <input type="submit" value="Submit普通提交">
</form>
</body>
</html>