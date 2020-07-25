<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.njust.dao.SubmitDao"%>
<%@page import="com.njust.entity.Submit"%>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tea_deal.jsp' starting page</title>
    
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
     <%
 		
		ArrayList list = (ArrayList)SubmitDao.findAll();
	%>  
	
	   <script type="text/javascript">
   	function myAction(id,action){
   		document.forms[0].id.value=id;
   		document.forms[0].action.value=action;
   		document.forms[0].submit();
   	}
   </script>
  <body>
	<div class="col-md-11 column">
				<form class="form-horizontal" role="form"action="servlet/SubmitServlet" method="post">
					<input type="hidden" name="oper" value="deal">
					<input type="hidden" name="id">
					<input type="hidden" name="action">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>
									学号
								</th>
								<th>
									ccf
								</th>
								<th>
									时间
								</th>
								<th>
									1
								</th>
								<th>
									状态
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
							<%
							for (int i = 0; i<list.size(); i++){
								Submit obj = (Submit)list.get(i);
								SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							 %>
								<tr class="">
									<td>
										<%=obj.getNumber() %>
									</td>
									<td>
										<%=obj.getCcfTime() %>
									</td>
									<td>
										<%=obj.getTotalScore() %>
									</td>
									<td>
										<%=sdf.format(obj.getApplyTime()) %>
									</td>
									<td>
										<%=obj.getState() %>
									</td>
									<td>
									<% if(obj.getState().equals("审核中")){ %>
										<input type="submit" class="btn btn-link btn-default"value="通过" onclick="myAction('<%=obj.getId()%>','<%="accept"%>')">
										<input type="submit" class="btn btn-link btn-default"value="不通过" onclick="myAction('<%=obj.getId()%>','<%="refuse"%>')">
										<%} %>
									</td>
								</tr>
							<%
							}
							 %>
						</tbody>
					</table>
				</form>
			</div>
  </body>
</html>
