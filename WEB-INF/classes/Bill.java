import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;

public class Bill extends HttpServlet
{

public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{
 PrintWriter pw=res.getWriter();
 String str1=req.getParameter("id1");
 String str3=req.getParameter("id2");
 String str4=req.getParameter("id"); 
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



  pw.println("<form action=Smatrix method=get>");
  pw.println("<center><h1><font color=blue> Fill your Complete details  </font></h1> <br><br>");
  pw.println("<table>");
  pw.println("<tr><td>  Your Name  </td><td><input type=text name=yname value=name></td></tr>");
  pw.println("<tr><td>  Seat Quantity  </td> <td> <select name=seatq>");
  pw.println("<option name=1 > 1 </option>");
  pw.println("<option name=2 > 2 </option>");
  pw.println("<option name=3 > 3 </option>");
  
  pw.println("</select></td></tr>");
  pw.println("<tr><td> Movie </td><td>"+str1+"</td></tr>");
  pw.println("<tr><td> Seat type </td><td> <select name=stype>");
  pw.println("<option name=golden> Golden </option>");
  pw.println("<option name=silver> Silver </option>");
  pw.println("</select></td></tr>");
  pw.println("<tr><td> Show time </td><td>"+str3+"</td></tr>" );
 
 
  pw.println("</table>");
    pw.println("<input type=hidden name=id10 value="+str1+">");
  pw.println("<input type=hidden name=id11 value="+str3+">");
  pw.println("<input type=hidden name=id12 value="+str4+">");

   pw.println("<center> <input type=submit value=submit>  </center>" );
  pw.println("</center>");
  pw.println("</form><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
  
   
  
  
   pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
   
  pw.println("</body>");
  pw.println("</html>");
  }
 
  }
