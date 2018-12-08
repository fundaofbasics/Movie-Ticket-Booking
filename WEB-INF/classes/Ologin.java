
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;

public class Ologin extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();


pw.println("<html>");
pw.println("<head>");
pw.println("<script src=\"../js/valid.js\"> </script> ");
pw.println("</head>");
 pw.println("<body background=\"../images/5.jpg\">");

Date date=new Date();
pw.println( " <center><font color=blue>" );
pw.println( " Current Date is :"+date.toString() );
pw.println( " </font></center>");




 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");
pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");


pw.println("<form name=\"myform\" onSubmit=\"return valid()\" method=post>");
pw.println("<center>");
pw.println("<font color=green>");
pw.println("<h1> Enter your Detail</h1>");
pw.println("</font>");
pw.println("<h3> Id  <input type=text name=id ></h3>");
pw.println("<h3> password  <input type=password name=pass ></h3>");
pw.println("<br><input type=submit value=submit><br><br>");

pw.println("</center>");
pw.println("</form><br><br>");
pw.println("<center><a href=\"../Registration.html\"> <h1><font color=blue > Sign up </font></h1> </a></center><br><br>");
  pw.println("<center><a href=\"../index.html\"><img src=\"../images/logo2.png\"> </a></center><br><br><br><br><br><br><br>");
  









 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("</table></center>");

   
   
   
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
 

  PrintWriter pw=res.getWriter();


pw.println("<html>");
pw.println("<body bgcolor=cyan>");
String s1=req.getParameter("id");
String s2=req.getParameter("pass");
String str1="";
String str2="";


 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact</a>  </center></td> </tr>");
   pw.println("</table>");    
      Connection con=DBInfo.getConnection();
   try
  {

	String query ="select * from reg";
	PreparedStatement ps=con.prepareStatement(query);
	
	 ResultSet rs=ps.executeQuery();
	 while(rs.next())
	 {
  str1=rs.getString(4);
 str2=rs.getString(5);
		



	 
		
		}	


if( s1!=null &&  s1.equals(str1) && s2!=null && s2.equals(str2))
{
res.sendRedirect("Search");
   
}
else
{
   pw.println("<center><font color=red>Wrong Password entered !</font>");
    pw.println("<form method=get>");
    pw.println("<input type=submit value=Back>");
    pw.println("</form></center>");
}
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
	



pw.println("</body>");pw.println("</html>");


}
}