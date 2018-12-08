
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login1 extends HttpServlet
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
pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");



pw.println("<center>");
pw.println("<center><font color=red><h2> Either id or password is incorrect !</h2></font></center>");
pw.println("<form method=post>");
pw.println("<font color=green>");
pw.println("<h1> Enter your Detail</h1>");
pw.println("</font>");
pw.println("<h3> Id  <input type=text name=Id value=Id></h3>");
pw.println("<h3> password  <input type=password name=pass value=pass></h3>");
pw.println("<br><input type=submit value=submit><br><br>");
pw.println("</form>");
pw.println("</center>");


 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved </font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
   
pw.println("</body>");
pw.println("</html>");
try
{
  
}
catch(Exception e)
{
  e.printStackTrace();
}
}
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
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
   pw1.println("</table><br><br><br>");
   pw1.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");
    pw1.println("<a href=\"../index.html\"><img src=\"../images/logo2.png\"> </a>");
   
   
   
   


 pw1.println("<center><table width=50% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw1.println("</table></center>");

   
   
   
pw1.println("</body >");
pw1.println("</html>");
String str=req.getParameter("Id");
String str1=req.getParameter("pass");
if(str.equalsIgnoreCase("kuldeep") && str1.equalsIgnoreCase("kuldeepgupta923"))
{
res.sendRedirect("Admin");
}
else
{
res.sendRedirect("Login1");
}
}
}