<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>我的当当</title>

</head>
<body>
	<!-- 头部开始 -->
		<%@include file="/common/head.jsp"%>
	<!-- 头部结束 -->
	
	<div align="center">
		<h1>我的当当</h1>
		<h1>我的信息</h1>
		<!-- 订单开始 -->
		<table>
			<tr>
				<td valign="top">
					<h1>用户编号</h1>
				</td>
				<td valign="top">
					<h1>${user.id }</h1>
				</td>
			</tr>
			<tr>
				<td valign="top">
					<h1>用户昵称</h1>
				</td>
				<td valign="top">
					<h1>${user.nickname }</h1>
				</td>
			</tr>
			<tr>
				<td valign="top">
					<h1>用户邮箱</h1>
				</td>
				<td valign="top">
					<h1>${user.email }</h1>
				</td>
			</tr>
		</table>
				<!-- 订单结束 -->
		
	</div>
	
	
	<!--页尾开始 -->
	<%@include file="/common/foot.jsp"%>
	<!--页尾结束 -->
</body>
</html>