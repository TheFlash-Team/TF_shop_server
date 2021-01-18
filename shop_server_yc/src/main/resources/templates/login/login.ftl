<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/static/login/css/login.css">
    <script type="text/javascript" src="/static/login/js/jquery-1.12.4.js"></script>
    <title>成神之路</title>
</head>

<body>
<div class="cms_login">
    <div class="cms_login_container flexCenter" style="min-height:390px;">
        <div class="cms_login_image" style="min-width: 380px;">
        </div>
        <div class="cms_login_from" style="min-width: 380px;">
            <form>
                <div class="cms_login_logo"><span style="font-size:24px;">成神之路</span></div>
                <div class="divBox"> <img class="cms_login_img" src="../static/login/img/username_mark.png">
                    <input class="cms_login_ipt" type="text" placeholder="请输入账号" id="cms_login_username"></div>
                <div class="divBox"> <img class="cms_login_img" src="../static/login/img/password_mark.png">
                    <input type="password" placeholder="请输入密码" class="cms_login_ipt" id="cms_login_passward"></div>
                <div class="divBox"> <img class="cms_login_img" src="../static/login/img/verify_mark.png">
                    <input type="text" placeholder="请输入验证码" class="cms_login_ipt60" id="cms_login_ver_ipt">
                    <span class="cms_login_ver" value="6666" id="cms_login_ver">6666</span>
                </div>
                <div class="divBox margin_top60" style="border:none;">
                    <input class="login_btn" type="button" value="登录" name="submit">
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>