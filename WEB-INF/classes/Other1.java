import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
       public class Other1 extends HttpServlet
	   {

	  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw1=res.getWriter();
pw1.println("<html>");
 pw1.println("<body background=\"../images/5.jpg\">");



 pw1.println("<table width=100% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw1.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw1.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw1.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw1.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw1.println("</table><br><br>");
   pw1.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");
   



String s1=req.getParameter("Name");
String s2=req.getParameter("Theatre");
String s3=req.getParameter("Date");
String s4=req.getParameter("Timing");
String s5=req.getParameter("Update");
String s6=req.getParameter("Delete");
String s7=req.getParameter("Usertype");

   Connection con=DBInfo.getConnection();
String query="insert into table register(?,?,?,?,?,?,?)";
 try
  {
   
	PreparedStatement ps1=con.prepareStatement(query);
	
	ps1.setString(1,s1);
	ps1.setString(2,s2);
	ps1.setString(3,s3);
	ps1.setString(4,s4);
	ps1.setString(5,s5);
	ps1.setString(6,s6);
	ps1.setString(7,s7);
     ps1.executeUpdate();
		
	}
	catch(Exception e1)
	{
	  e1.printStackTrace();
	}
		
	
	pw1.println("Record Inserted successfully !");
	pw1.println("<center>");
	pw1.println("<br>");
	pw1.println("<br>");
	pw1.println("<br>");
	pw1.println("<br>");
	pw1.println("<br>");
	pw1.println("<br>");
	pw1.println("<br>");
	pw1.println("<h1>   Make your Payment :- </h1>");
	
	pw1.println("<h2>  <a href=Payment>Make Payment </a> </h2>");
	pw1.println("</center>");
	pw1.println("</table>");
	
	
	 pw1.println("<center><table width=50% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta</font></center></td><tr> ");

  
   pw1.println("<table></center>");

   
   
   
	pw1.println("</body>");
	pw1.println("</html>");

	
	
	
	}
  }
  