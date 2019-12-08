package com.njust.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.njust.entity.Person;
import com.njust.entity.Submit;
import com.njust.entity.SubmitId;
import com.njust.util.DateUtil;
import com.njust.*;
import com.njust.dao.SubmitDao;


public class SubmitServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public SubmitServlet() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		
		// 取得表单参数的值
		String oper = null;
		String action = null;
		String ccf_time = null;
		String total_score = null;
		String first_score = null;
		String second_score = null;
		String third_score = null;
		String fourth_score = null;
		String fifth_score = null;
		String imgUrl = null;
		String id = null;
		
		
		String state = null;

		int totalScore = 0;
		int firstScore = 0;
		int secondScore = 0;
		int thirdScore = 0;
		int fourthScore = 0;
		int fifthScore = 0;
		int idInt = 0;
		
		int flag = 0;
		
		
		//获取当前用户
//		HttpSession session = request.getSession();
//		Object p = session.getAttribute("person");
 //   	Person person = (Person) p;
    	
		//测试
		Person person = new Person();
    	person.setNumber("123");
    	
    	//获取操作
    	try {
    		oper = new String(request.getParameter("oper").getBytes("ISO-8859-1"),"UTF-8");
    	} catch (Exception e) {
			e.getStackTrace();
		}
    	
    	  //test
    	oper = "submit";
    	
		if (oper.equals("submit") )//学生提交申请
		{

			try {
				ccf_time = new String(request.getParameter("ccf_time").getBytes("ISO-8859-1"),"UTF-8");
				total_score = new String(request.getParameter("total_score").getBytes("ISO-8859-1"),"UTF-8");
				first_score = new String(request.getParameter("first_score").getBytes("ISO-8859-1"),"UTF-8");
				second_score = new String(request.getParameter("second_score").getBytes("ISO-8859-1"),"UTF-8");
				third_score = new String(request.getParameter("third_score").getBytes("ISO-8859-1"),"UTF-8");
				fourth_score = new String(request.getParameter("fourth_score").getBytes("ISO-8859-1"),"UTF-8");
				fifth_score = new String(request.getParameter("fifth_score").getBytes("ISO-8859-1"),"UTF-8");
			//	gender = new String(request.getParameter("gender").getBytes("ISO-8859-1"),"UTF-8");
			} catch (Exception e) {
				e.getStackTrace();
			}finally {
				totalScore = Integer.parseInt(total_score);
				firstScore = Integer.parseInt(first_score);
				secondScore = Integer.parseInt(second_score);
				thirdScore = Integer.parseInt(third_score);
				fourthScore = Integer.parseInt(fourth_score);
				fifthScore = Integer.parseInt(fifth_score);
				
				if (ccf_time!=null )
				{
					Date ccfTime=DateUtil.parseDate(ccf_time);
					
					Submit s = new Submit();
					s.setNumber(person.getNumber());
					s.setCcfTime(ccfTime);
					s.setTotalScore(totalScore);
					s.setFirstScore(firstScore);
					s.setSecondScore(secondScore);
					s.setThirdScore(thirdScore);
					s.setFourthScore(fourthScore);
					s.setFifthScore(fifthScore);
					s.setImg(imgUrl);
					s.setApplyTime(new Timestamp(System.currentTimeMillis()));
					s.setState("审核中");
					
					
					flag = SubmitDao.submit(s);
					
					if (flag==0) {
						out.print("<script language='javascript'>alert('您已提交过，若有错误请等老师审核后再提交!');window.location.href='../stu_submit.jsp';</script>");
					}
					else if(flag==1){
						out.print("<script language='javascript'>alert('提交成功!');window.location.href='../index.jsp';</script>");
					}else {
						out.print("<script language='javascript'>alert('提交失败!');window.location.href='../stu_submit.jsp';</script>");
					}
					
				}
			}
		}
		else if (oper.equals("deal")) {//老师处理申请
			try {
				action = new String(request.getParameter("action").getBytes("ISO-8859-1"),"UTF-8");
				if (action.equals("accept")) {
					state = "已通过";
				}else if(action.equals("refuse")) {
					state = "未通过";
				}
				id = new String(request.getParameter("id").getBytes("ISO-8859-1"),"UTF-8");
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}finally {
				idInt = Integer.parseInt(id);
				flag = SubmitDao.dealSubmit(idInt, state);
				
				if (flag==0) {
					out.print("<script language='javascript'>alert('您已提交过，若有错误请等老师审核后再提交!');window.location.href='../stu_submit.jsp';</script>");
				}
				else if(flag==1){
					out.print("<script language='javascript'>alert('提交成功!');window.location.href='../index.jsp';</script>");
				}else {
					out.print("<script language='javascript'>alert('提交失败!');window.location.href='../stu_submit.jsp';</script>");
				}
			}
		}
		else if (oper.equals("listAll")) {
			List<Submit> list = SubmitDao.findAll();
			//...
		}
		else if (oper.equals("listWaiting")) {
			List<Submit> list = SubmitDao.findWaiting();
			//...
		}
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
