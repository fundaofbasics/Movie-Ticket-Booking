import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
       public class Netbanking extends HttpServlet
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


pw.println("<center><font color=blue> <h1>  Payment </h1></center><br><br>");
pw.println("<form method=post>");
pw.println("<center><table>");
pw.println("<tr><td>Select Bank </td> <td><select name=bank>");
pw.println("<option value=pnb> Punjab National Bank </option>");
pw.println("<option value=sbbj> SBBJ </option>");
pw.println("<option value=icici>  ICICI </option>");
pw.println("<option value=axis> AXIS </option>");
pw.println("<option value=bob>Bank Of Baroda </option>");
pw.println("<option value=citibank> CitiBank </option>");
pw.println("<option value=corporation> Corporation Bank </option>");
pw.println("<option value=hdfc> HDFC Bank </option>");
pw.println("<option value=idbi> IDBI Bank </option>");
pw.println("</select></td></tr>");
pw.println("<tr><td>Email </td> <td> <input type=text name=Email value=Email></td></tr>");
pw.println("<tr><td>Mobile </td> <td> <input type=text name=Mobile value=Mobile></td></tr>");
pw.println("</table> </center><center> <br><input type=submit><br><br>");
pw.println("</form");




 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta</font></center></td><tr> ");

  
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
 pw.println("<body background=\"../images/5.jpg\">");
String str1=req.getParameter("Bank");
String str2=req.getParameter("Email");
String str3=req.getParameter("Mobile");


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
  
	String query ="insert into netbanking values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,str1);
	ps.setString(2,str2);
	ps.setString(3,str3);
	ps.executeUpdate();
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
	pw.println("<center><font color=blue><h1> Payment Succeed </h1></font><br>Now your ticket is Activated and you have to bring ticket mandatory at the show time.. <br><br> <h1>");
	pw.println("</body>");
	pw.println("</html>");
}
}