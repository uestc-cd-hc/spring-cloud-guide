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
    });
	</script>
</head>

<body>
	<h2>Web UI</h2>
	<p style="cursor: pointer;" id="btnHello">点击这里，获取hello</p>
	<p>输入昵称：</p>
	<p><input type="text" id="txtNickName"><span style="cursor: pointer;" id="btnSubmit">提交</span></p>
	<div id="result"></div>
</body>
</html>
