import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Contact extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
 String s1=req.getParameter("query");
 String s2=req.getParameter("email");
 
  pw.println("<html>");
   pw.println("<body background=\"../images/5.jpg\">");


  if(s2==null)
  {
     res.sendRedirect("../Contact1.html");
  }
  
  
 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");
   pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");
   
   
      Connection con=DBInfo.getConnection();

  try
  {
     
	String query1="insert into contact values(?,?)";
	PreparedStatement ps=con.prepareStatement(query1);
	ps.setString(1,s1);
	ps.setString(2,s2);
	ps.executeUpdate();
    
		   
  
  }
  catch(Exception e)
  {
     e.printStackTrace();
  }
  pw.println("<center> <h1> Your query and email are submitted Successfully ! </h1></center>");
  pw.println("<center> <h1> We will reply you shortly ! </h1></center><br> <br>");
  pw.println("<a href=\"../Contact.html\"><img src=\"../images/logo2.png\"> </a>");
  
  
 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");
  pw.println("</body>");
  pw.println("</html>");
  
   }

}
