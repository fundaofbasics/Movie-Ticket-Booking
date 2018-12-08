import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Admin1 extends HttpServlet
{
  
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
  String str1=req.getParameter("Movie");
  String str2=req.getParameter("Location");
  String str3=req.getParameter("Shows");
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
   pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");
pw.println("<center><table border=1 background=\"../images/5.jpg\" width=100%>");
pw.println(" <th> Movies </th> ");
pw.println(" <th> Location </th> ");
pw.println(" <th> Shows </th></tr> ");


 
 
    Connection con=DBInfo.getConnection();
  
   try
  {
	if(str4.equalsIgnoreCase("pratapnagar") )
	{
	String query="insert into pratapnagar values(?,?,?)";
     PreparedStatement ps=con.prepareStatement(query);
	 
	      String query1="select * from pratapnagar ";	
	PreparedStatement ps1=con.prepareStatement(query1);
	 
	 
	 
	ps.setString(1,str1);
	ps.setString(2,str2);
	ps.setString(3,str3);
	    ps.executeUpdate();

	ResultSet rs=ps1.executeQuery();
while(rs.next())
{
	 String str5= rs.getString(1) ;
	String str6= rs.getString(2); 
	String str7= rs.getString(3);	
 pw.println("<tr> <td>"+str5+ "</td><td> "+str6+" </td> <td> "+str7+"</td></tr>");
 }
		
		}
		if(str4.equalsIgnoreCase("malviyanagar") )
	{
	String query="insert into malviyanagar values(?,?,?)";
     PreparedStatement ps2=con.prepareStatement(query);
	   String query1="select * from malviyanagar ";	
	PreparedStatement ps3=con.prepareStatement(query1);
	ps2.setString(1,str1);
	ps2.setString(2,str2);
	ps2.setString(3,str3);
    ps2.executeUpdate();
	
	ResultSet rs1=ps3.executeQuery();
while(rs1.next())
{
	 String str5= rs1.getString(1) ;
	String str6= rs1.getString(2); 
	String str7= rs1.getString(3);	
 pw.println("<tr> <td>"+str5+ "</td><td> "+str6+" </td> <td> "+str7+"</td></tr>");
 }
		}
		else
		{
		String query="insert into tonkroad values(?,?,?)";
     PreparedStatement ps4=con.prepareStatement(query);
	   String query1="select * from malviyanagar ";	
	PreparedStatement ps5=con.prepareStatement(query1);
	ps4.setString(1,str1);
	ps4.setString(2,str2);
	ps4.setString(3,str3);
    ps4.executeUpdate();
	ResultSet rs2=ps5.executeQuery();
while(rs2.next())
{
	 String str5= rs2.getString(1) ;
	String str6= rs2.getString(2); 
	String str7= rs2.getString(3);	
 pw.println("<tr> <td>"+str5+ "</td><td> "+str6+" </td> <td> "+str7+"</td></tr>");
 }
		}
		




		
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
		
  pw.println("</table></center>");
    pw.println("<center><font color=blue> <h1> Records Updated Successfully ! </h1> </font></center><br> <br>") ;
	  pw.println("<center><a href=\"Admin\"><img src=\"../images/logo2.png\"> </a></center>");

	
	
	
	
 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");

  
   pw.println("</table></center>");

   
   
   
   
   pw.println("</body>");
  pw.println("</html>");
}
}