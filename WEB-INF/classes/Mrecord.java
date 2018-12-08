import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Mrecord extends HttpServlet
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
   pw1.println("</table>");
   pw1.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");




  pw1.println("<center>");
  pw1.println("<form method=post>");
  pw1.println(" Select through Theatre name  <br><select name=Theatre>");
  pw1.println("<option value=Rajmandir> Rajmandir </option> ");
  pw1.println("<option value=Inox> Inox  </option>");
  pw1.println("</select>");
  pw1.println("<br><input type=submit>");
  pw1.println("</form><br><br>");
  
  pw1.println("</center>");
  
  
  
  
   pw1.println("<center><table width=50% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw1.println("<table></center>");

   
   
   
  pw1.println("</body>");
  pw1.println("</html>");

}


 
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
 
  pw.println("<html>");
   pw.println("<body background=\"../images/5.jpg\">");
  
  
  
   pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Admin>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw.println("<td> <center><a href=About.html>About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=Contact.html>Contact</a>  </center></td> </tr>");
   pw.println("</table>");
   
   
   
  pw.println("<font color=blue>");
  pw.println("<h1> Booking Records !  </h1> ");
  pw.println("<center><table border=1>");
  pw.println("<tr>");
  pw.println("<th> Name </th> ");
  pw.println("<th> Theatre </th> ");
  pw.println("<th> Date </th> ");
  pw.println("<th> Timing </th> ");
  pw.println("<th> Update </th> ");
  pw.println("<th> Delete </th> ");
  pw.println("<th> Usertype </th> ");
  pw.println("</tr>");
  
  
     Connection con=DBInfo.getConnection();
 
  try
  {
    	 String s1=req.getParameter("Theatre");
     String query="select * from table where Theatre=?";	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,s1);
	ResultSet rs=ps.executeQuery();
	 
	while(rs.next())
	{
	String str1= rs.getString(1) ;
	String str2= rs.getString(2); 
	String str3= rs.getString(3); 
	String str4= rs.getString(4); 
	String str5= rs.getString(5); 
	String str6= rs.getString(6); 
	String str7= rs.getString(7);	 

	pw.println("<tr><td>"+str1  +" </td>");
	pw.println("<td>"+str2+"</td>");
	pw.println("<td>"+str3+" </td>");
	pw.println("<td> "+str4+"</td>");
	pw.println("<td> "+str5+" </td>");
	pw.println("<td> "+str6+"  </td>");
	pw.println("<td>"+str7+"</td></tr>");
	

	}
	pw.println("</table></center>");
	pw.println("Theatre is: "+s1+"");
	pw.println("<br><br>");
	
	pw.println("</body>");
	pw.println("</html>");
		
		
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
		
	
	
	
	}
  }
  
  
  
  
  
  
  