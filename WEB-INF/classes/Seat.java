import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import java.sql.*;

public class Seat extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
  String str=req.getParameter("id");
String str1="";
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


pw.println("<center><a href=Smatrix><img src=\"../images/s1.png\"></center>");
Connection con=DBInfo.getConnection();
 try
  {
  String query="insert into guest values(?)";
  PreparedStatement ps=con.prepareStatement(query);
  ps.setString(1,str);
  ps.executeUpdate();
  }
  catch(Exception e)
  {
     e.printStackTrace();
  }
  pw.println("<center> <h1> You Selected: "+str+"</h1> <br><br>");
  pw.println("<a href=Smatrix> Back </a></center>");
  
  pw.println("</body>");
  pw.println("</html>");
 }
}
 