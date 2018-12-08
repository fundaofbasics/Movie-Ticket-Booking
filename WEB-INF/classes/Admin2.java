import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Admin2 extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
  String str1=req.getParameter("Movie1");
    String str2=req.getParameter("id");

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
pw.println("<center><table border=1 bgcolor=tan>");
pw.println("<tr> <th> Movies </th> <th> Location </th> <th> Shows </th></tr>");

    Connection con=DBInfo.getConnection();
  
   try
  {
      
	if(str2.equalsIgnoreCase("pratapnagar") )
	{
	String query="delete from pratapnagar where movies=?";
     PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,str1);
    ps.executeUpdate();
	
	
	
	String query1="select * from pratapnagar ";	
	     PreparedStatement ps1=con.prepareStatement(query1);

	
	


	
	ResultSet rs1=ps1.executeQuery();
while(rs1.next())
{
	 String str5= rs1.getString(1) ;
	String str6= rs1.getString(2); 
	String str7= rs1.getString(3);	
 pw.println("<tr> <td>"+str5+ "</td><td> "+str6+" </td> <td> "+str7+"</td></tr>");
 }
	
	
	
	
	
	
	
	
	
		}
		if(str2.equalsIgnoreCase("malviyanagar") )
	{
	String query="delete from malviyanagar where movies=?";
     PreparedStatement ps3=con.prepareStatement(query);
	ps3.setString(1,str1);
    ps3.executeUpdate();
	
	
	String query1="select * from pratapnagar ";	
	 PreparedStatement ps2=con.prepareStatement(query1);

	
	


	
	ResultSet rs2=ps2.executeQuery();
while(rs2.next())
{
	 String str5= rs2.getString(1) ;
	String str6= rs2.getString(2); 
	String str7= rs2.getString(3);	
 pw.println("<tr> <td>"+str5+ "</td><td> "+str6+" </td> <td> "+str7+"</td></tr>");
 }
	
	
	
	
	
		}
		else
		{
		String query="delete from tonkroad where movies=?";
     PreparedStatement ps5=con.prepareStatement(query);
	ps5.setString(1,str1);
    ps5.executeUpdate();
	
	String query1="select * from tonkroad";	
	 PreparedStatement ps4=con.prepareStatement(query1);

	
	


	
	ResultSet rs3=ps4.executeQuery();
while(rs3.next())
{
	 String str5= rs3.getString(1) ;
	String str6= rs3.getString(2); 
	String str7= rs3.getString(3);	
 pw.println("<tr> <td>"+str5+ "</td><td> "+str6+" </td> <td> "+str7+"</td></tr>");
 }	
		
		
		
		
		}
	}
	
	catch(Exception e)
	{
	  e.printStackTrace();
	}
		
  pw.println("</table></center>");
    pw.println("<center><font color=blue> <h1> Records Updated Successfully ! </h1> </font></center>") ;
	
  pw.println("<table></center>");	
    pw.println("<center><a href=\"Admin\"><img src=\"../images/logo2.png\"> </a></center>");

	

 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");  
 

   
   
   
   
   pw.println("</body>");
  pw.println("</html>");
}
}