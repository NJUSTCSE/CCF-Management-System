<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
 <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"> 
 <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script> 
 <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  
  </head>
  
  <body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<form role="form" action="servlet/SubmitServlet" method="post">
				<div class="form-group">
					 <label for="exampleInputEmail1">第几次ccf</label><input type="text" class="form-control" name="ccf_time"/>
				</div>
				<div class="form-group">
					 <label for="exampleInputEmail1">总分</label><input type="text" class="form-control" name="total_score"/>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">第1题</label><input type="text" class="form-control"  name="first_score"/>
				</div>
								<div class="form-group">
					 <label for="exampleInputPassword1">第2题</label><input type="text" class="form-control" name="second_score" />
				</div>
								<div class="form-group">
					 <label for="exampleInputPassword1">第3题</label><input type="text" class="form-control" name="third_score" />
				</div>
								<div class="form-group">
					 <label for="exampleInputPassword1">第4题</label><input type="text" class="form-control"name="fourth_score" />
				</div>
								<div class="form-group">
					 <label for="exampleInputPassword1">第5题</label><input type="text" class="form-control"name="fifth_score"/>
				</div>
				<div class="form-group">
					 <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" name="img"/>
					<p class="help-block">
						Example block-level help text here.
					</p>
				</div>
				<div class="checkbox">
				</div> <button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</div>
  </body>
</html>
