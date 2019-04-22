<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://cdn.bootcss.com/jquery/1.12.1/jquery.min.js"></script>
	<script type="">
    $(document).ready(function(){
		$("#btnHello").click(function(){
			var param = {};
        	$.ajax({
				type: "get",
				url: "helloworld",
				data: param,
				async: false,
				error: function() {
			    	alert("ERROR");
				},
				success: function(data) {
			    	alert(data);
			    }
			});
      	});

      	$("#btnSubmit").click(function(){
			var param = {};
			$("#result").html("");
        	var nickName = $("#txtNickName").val();
 			$.ajax({
				type: "get",
				url: "hello/" + nickName,
				data: param,
				async: false,
				error: function() {
			    	alert("ERROR");
				},
				success: function(data) {
			    	$("#result").html(data);
			    }
			});
      	});

			$("#btnGetUserName").click(function(){
				var id = parseInt($("#txtSysId").val());
				$.ajax({
					type: "get",
					url: "rest/v1/user/name/" + id,
					async: false,
					error: function() {
			    	alert("ERROR");
					},
					success: function(data) {
			    	alert(data);
			    }
				});
			});

			$("#btnGetUserInfo").click(function(){
				$("#txtUserInfo").html("");
				var userId = $("#txtUserId").val();
				var param = {"userId": userId};
				$.ajax({
					type: "get",
					url: "rest/v1/user/info",
					data: param,
					async: false,
					error: function() {
			    	alert("ERROR");
					},
					success: function(data) {
						var userInfo = "用户id：" + userId + "，系统编号：" + data.id + "，用户名：" + data.userName;
			    	$("#txtUserInfo").html(userInfo);
			    }
				});
			});

			$("#btnGetUserList").click(function(){
				$("#txtUserList").html("");
				$.ajax({
					type: "get",
					url: "rest/v1/user/list",
					async: false,
					error: function() {
			    	alert("ERROR");
					},
					success: function(data) {
						var userInfo = "";
						$.each(data, function(i, item){
							userInfo += "用户id：" + item.userId + "，系统编号：" + item.id + "，用户名：" + item.userName + "，注册时间：" + item.onTime + "<br/>";
						});
			    	$("#txtUserList").html(userInfo);
			    }
				});
			});
    });
	</script>
</head>

<body>
	<h2>Hello World Test</h2>
	<p style="cursor: pointer;" id="btnHello">点击这里，获取hello</p>
	<p>输入昵称：</p>
	<p><input type="text" id="txtNickName"><span style="cursor: pointer;" id="btnSubmit">提交</span></p>
	<div id="result"></div>
	<hr/>
	<h2>Database Test</h2>
	<p>输入用户注册时系统自动生成的数字编号（比如1/2）：</p>
	<p><input type="text" id="txtSysId"><button type="button" id="btnGetUserName">根据系统编号查询用户名</button></p>

	<p>输入用户id（比如zhangsan/lisi）：</p>
	<p><input type="text" id="txtUserId"><button type="button" id="btnGetUserInfo">根据用户id查询用户信息</button></p>
	<div id="txtUserInfo"></div>
	
	<p><button type="button" id="btnGetUserList">查询所有用户信息</button></p>
	<div id="txtUserList"></div>
</body>
</html>
