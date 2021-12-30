<%--
  Created by IntelliJ IDEA.
  User: hwangduil
  Date: 2021/12/30
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
  <h1>사용자 로그인</h1>
  <form action="" method="post">
    <input type="text" name="userId" id="userId" placeholder="ID" />
    <input type="password" name="pwd" id="pwd" placeholder="비밀번호" />
    <button type="button" onclick="onSubmit()">로그인</button>
  </form>
  <div><a href="">가입요청</a></div>
</div>

<script>
  function onSubmit() {
    const userId = document.getElementById("userId").value;
    const pwd = document.getElementById("pwd").value;

    if (userId === "" || pwd === "") {
      alert("ID 또는 비밀번호가 입력되지 않았습니다.")
    }
  }
</script>

</body>
</html>
