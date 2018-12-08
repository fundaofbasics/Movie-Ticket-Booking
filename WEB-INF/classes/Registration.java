import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Registration extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
String s1=req.getParameter("fname");
String s2=req.getParameter("phone");
String s3=req.getParameter("city");
String s4=req.getParameter("email");
String s5=req.getParameter("pass");
String s6=req.getParameter("repass");

pw.println("<html>");
 pw.println("<body background=\"../images/5.jpg\">");


 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");
   pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");

   Connection con=DBInfo.getConnection();
   
      
   
   if (s5.equals(s6))
	{
     try
  {
  
   
	String query ="insert into reg values(?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,s1);
	ps.setString(2,s2);
	ps.setString(3,s3);
	ps.setString(4,s4);
	ps.setString(5,s5);
     ps.executeUpdate();
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
	
	  pw.println("<center> <font color=blue>You are Registered successfully ! </font></center><br><br><br><br><br <h1> <center><a href=\"Ologin\"> Login </a></center><hr><br><br><br><br><br><br><br>");
	}
	else
	{
	  pw.println("Re-entered password not matched !");
	}

	
 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");
pw.println("</body>");
pw.println("</html>");
   }
   }
   
   
   
   
   
   