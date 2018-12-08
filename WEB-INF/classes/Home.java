import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Home extends HttpServlet
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
   pw.println("<table>");
   pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");



  pw.println("<br>");
  pw.println("<br>");
  pw.println("<br>");
  pw.println("<br>");
  pw.println("<br>");
  pw.println("<hr>");
  
  
  
   pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved </font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
   
  pw.println("</body>");
  pw.println("</html>");
  
  
     Connection con=DBInfo.getConnection();
  
 try
  {
  	  String query="select * from moviephoto";
	    PreparedStatement ps=con.prepareStatement(query);
	ResultSet rs=ps.executeQuery(); 
	while(rs.next())
	{
     Blob s1=rs.getBlob(1);
	pw.println(s1);
	
	
	}
	}
	catch(Exception e1)
	{
	  e1.printStackTrace();
	}
}
}	