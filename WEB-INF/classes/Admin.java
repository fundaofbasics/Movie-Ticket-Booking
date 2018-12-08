import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Admin extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
  
  pw.println("<html>");
  pw.println("<head>");
 
  pw.println("</head>");
  pw.println("</html>");
   pw.println("<body background=\"../images/5.jpg\">");
  pw.println("<img src=\"../images/logo.jpg\" >");
  
  
  pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");
  pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");
  pw.println("<center> <font color=blue><h1>Select place where you want to make changes !</h1></font>");
  pw.println("<form method=post>");
  pw.println("<br><br><br>Location <select name=Place >");
  pw.println("<option value=pratapNagar> Pratap Nagar </option>");
  pw.println("<option value=malviyaNagar> Malviya Nagar </option>");
  pw.println("<option value=tonkRoad > Tonk Road  </option> ");
  pw.println("</select>");
 
  pw.println("<br><br><input type=submit><br> <br>");
  pw.println("<a href=\"../index.html\"><img src=\"../images/logo2.png\"> </a>");
  pw.println("</form><center>");
  pw.println("<br><br><br><br><br><br><br><br>");
  
  
  
  
    pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
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
	  String s1= req.getParameter("Place");
 pw1.println("<html>");
 pw1.println("<head>");
  
 pw1.println("</head>");
   pw1.println("<body background=\"../images/5.jpg\">");
  pw1.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");
  pw1.println("<center>");
  pw1.println("<center> <font color=blue> <h1> Insert new Record into"  +s1);
  pw1.println("<script src=\"../js/validate.js\">  </script>");
  pw1.println("<form name=\"myform\" onSubmit=\"return validate()\" action=Admin1 method=get>");
  pw1.println("<table>");
  pw1.println("<tr><td> Movie</td> <td> <input type=text name=\"Movie\" > </td></tr>");
  pw1.println("<tr><td> Location</td> <td> <input type=text name=\"Location\"> </td></tr>");
  pw1.println("<tr><td >Shows</td> <td> <select name=\"Shows\">");
  pw1.println("<option value=9Am>9Am </option>");
  pw1.println("<option value=12Pm>12Pm</option>");
  pw1.println("<option value=3Am>3Pm </option>");
  pw1.println("<option value=9Pm>9Pm </option>");
  pw1.println("</select></td></tr>");
  pw1.println("</table>");
  pw1.println("<input type=hidden name=id value="+s1+">");
  	  
	   pw1.println("<center><input type=submit></center>");
  pw1.println("</form><br><br>");
  pw1.println("<form name=\"myform1\" onSubmit=\"return validate()\" action=Admin2>");
pw1.println("<center> <font color=blue>To delete the movie data from "+s1+" </font></center><br>");                         
pw1.println(" movie name <input type=text name=Movie1><br>");                         
pw1.println("  <input type=hidden name=id value="+s1+"><br>");                         
pw1.println("<input type=submit>");                         
pw1.println("</form>");                         
  
  pw1.println("</center>");
  pw1.println("<form method=get>");
    pw1.println("<input type=submit value=Back> ");
pw1.println("</form>");
  
 
 
 
 
  pw1.println("<center><table width=50% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw1.println("</table></center>");

   
   
   
   
  pw1.println("</body>");
  pw1.println("</html>");


  
   }
   }