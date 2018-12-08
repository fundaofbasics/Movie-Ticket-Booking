import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Other extends HttpServlet
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
   pw.println("</table><br><br>");
   pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");



pw.println("<center><font color=blue>  <h1>  Fill Entry ! </h1>  </font>");
pw.println("<center><a href=\"Search\"> See available movies </a> </center>");
pw.println("<form action=Other1  method=get>");
pw.println("<table>");
pw.println("<tr><td>Enter name</td> <td><input type=text name=Name value=name></td></tr><br>");
pw.println("<tr><td>Select Theatre </td> <td><select name=Theatre>");
pw.println("<option value=Rajmandir> Rajmandir </option>");
pw.println("<option value=Omcineplex> Om cineplex </option>");
pw.println("</select></td></tr>");
pw.println("<br><tr><td>Select Date </td> <td> <select name=Date>");
pw.println("<option value=0> 1 </option>");
pw.println("<option value=1> 2 </option>");
pw.println("<option value=2> 3 </option>");
pw.println("<option value=3> 4 </option>");
pw.println("<option value=4>  5</option>");
pw.println("<option value=5> 6 </option>");
pw.println("<option value=6>  7</option>");
pw.println("<option value=7> 8 </option>");
pw.println("<option value=8> 9 </option>");
pw.println("<option value=9> 10 </option>");
pw.println("<option value=10> 11 </option>");
pw.println("<option value=11> 12 </option>");
pw.println("<option value=12> 13 </option>");
pw.println("<option value=13> 14 </option>");
pw.println("<option value=14> 15 </option>");
pw.println("<option value=15> 16 </option>");
pw.println("<option value=16> 17 </option>");
pw.println("<option value=17> 18 </option>");
pw.println("<option value=18> 19 </option>");
pw.println("<option value=19> 20 </option>");
pw.println("<option value=20> 21 </option>");
pw.println("<option value=21> 22 </option>");
pw.println("<option value=22> 23 </option>");
pw.println("<option value=23> 24 </option>");
pw.println("<option value=24> 25 </option>");
pw.println("<option value=25> 26 </option>");
pw.println("<option value=26> 27 </option>");
pw.println("<option value=27> 28 </option>");
pw.println("<option value=28> 29 </option>");
pw.println("<option value=29> 30 </option>");
pw.println("<option value=30> 31 </option>");
pw.println("</select></td></tr>");
pw.println("<br><tr><td> Timing </td> <td> <input type=text name=Timing value=Timing></td></tr>");
pw.println("<br><tr><td>Update </td><td><input type=text name=Update value=Update></td></tr>");
pw.println("<br><tr><td>Delete </td>  <td><input type=text name=Delete value=Delete> </td></tr>");
pw.println("<br><tr><td> Usertype </td><td><select name=Usertype>");
pw.println("<option value=Admin> Admin </option>");
pw.println("<option value=Other> Other</option>");
pw.println("</select></td></tr>");
pw.println("<br><br><center><tr><td>Submit</td> <td> <input type=submit></center></td></tr>");
pw.println("</form><br><br>");
 pw.println("<a href=\"../index.html\"><img src=\"../images/logo2.png\"> </a>");
pw.println("</center>");
   Connection con=DBInfo.getConnection();


  try
  {
     
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
		
	
	
	pw.println("</table>");
	
	
	 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
	pw.println("</body>");
	pw.println("</html>");
	}
	
  }
  