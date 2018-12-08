import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
       public class Card extends HttpServlet
	   {
	   

	  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
pw.println("<html>");
 pw.println("<body background=\"../images/5.jpg\">");


 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");
pw.println("<center> <font size=5><a href=\"../index.html\"> Log Out </a></font></center>");



pw.println("<form method=post><center><font color=blue> <h1>  Payment </h1></center>");
pw.println("<center><table>");
pw.println("<tr><td>Email </td> <td> <input type=text name=Email value=Email></td></tr>");
pw.println("<tr><td>Mobile </td> <td> <input type=text name=Mobile value=Mobile></td></tr>");
pw.println("<br><br>");
pw.println("<tr> <td> Card Type </td><td> <select name=CardType>");
pw.println("<option value=visa> visa </option>");
pw.println("<option value=mastercard> Master Card </option>");
pw.println("<option value=american> American Express </option>");
pw.println("<option value=maestro> Maestro Card </option>");
pw.println("<option value=rupay> RuPay Card</option>");
pw.println("</select></td></tr>");
pw.println("<tr> <td>Card Number </td><td> <input type=text name=CardNumber value=CardNumber></td></tr> ");
pw.println("<tr><td> Name On Card </td> <td><input type=text name=NameOnCard value=Name>");
pw.println("<tr><td> Card Expiry </td> <td> <select name=month>");
pw.println("<option value=jan> Jan </option>");
pw.println("<option value=feb> Feb </option>");
pw.println("<option value=mar> Mar </option>");
pw.println("<option value=apr> Apr </option>");
pw.println("<option value=may> May </option>");
pw.println("<option value=june> June </option>");
pw.println("<option value=july> July </option>");
pw.println("<option value=aug> Aug </option>");
pw.println("<option value=sep> Sep </option>");
pw.println("<option value=oct> Oct </option>");
pw.println("<option value=nov> Nov </option>");
pw.println("<option value=dec> Dec </option>");
pw.println("</select>");
pw.println("<select name=year>");
pw.println("<option value=2015> 2015 </option>");
pw.println("<option value=2016> 2016 </option>");
pw.println("<option value=2017> 2017</option>");
pw.println("<option value=2018> 2018 </option>");
pw.println("<option value=2019> 2019</option>");
pw.println("<option value=2020> 2020 </option>");
pw.println("<option value=2025> 2025 </option>");
pw.println("</td></tr>");
pw.println("<tr><td> CVV </td> <td> <input type=text name=cvv value=CVV></td></tr>");

pw.println("</table>");
pw.println("</center>");
pw.println("<center> <input type=submit value=Pay>");
pw.println("<center> </form>");
pw.println("<br><br><br><font color=blue><a href=Card> Cancel </a>");



 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
   
pw.println("</body>");
pw.println("</html>");
  
 try
  { 

		
	}
	catch(Exception e1)
	{
	  e1.printStackTrace();
	}
	
}
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
pw.println("<html>");
pw.println("<body>");
String s1=req.getParameter("Email");
String s2=req.getParameter("Mobile");
String s3=req.getParameter("CardType");
String s4=req.getParameter("CardNumber");
String s5=req.getParameter("NameOnCard");
String s6=req.getParameter("month");
String s7=req.getParameter("year");
String s8=req.getParameter("cvv");


 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");
pw.println("<center> <font size=5><a href=\"../index.html\"> Log Out </a></font></center>");
Connection con=DBInfo.getConnection();
 try
  { 
  String query="insert into card values(?,?,?,?,?,?,?,?)";
  PreparedStatement ps=con.prepareStatement(query);
  ps.setString(1,s1);
  ps.setString(2,s2);
  ps.setString(3,s3);
  ps.setString(4,s4);
  ps.setString(5,s5);
  ps.setString(6,s6);
  ps.setString(7,s7);
  ps.setString(8,s8);
		ps.executeUpdate();
	}
	catch(Exception e1)
	{
	  e1.printStackTrace();
	}
	pw.println("<h1> <font color=blue> Payment Succeed !</font><br> Now your ticket is activated and you have to bring your ticket mandatory at show time..</h1>");
	pw.println("<center><a href=Ticket> <img src=\"../images/s2.png\"> </center>");
pw.println("</body>");
pw.println("</html>");

}
}