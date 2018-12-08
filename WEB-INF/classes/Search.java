import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Search extends HttpServlet
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
   pw.println("<table>");
pw.println("<center> <a href=\"../index.html\"> <img src=\"../images/Home.png\"> </a></center>");



  pw.println("<center> <font color=blue><h1>Search show by Theatre !</h1></font>");
  pw.println("<form method=post>");
  pw.println("<br><br><br>Location <select name=Place >");
  pw.println("<option value=pratapNagar> Pratap Nagar </option>");
  pw.println("<option value=malviyaNagar> Malviya Nagar </option>");
  pw.println("<option value=tonkRoad > Tonk Road  </option> ");
  pw.println("</select>");
  pw.println("<br><br><input type=submit>");
  pw.println("</form><br><br>");
  pw.println("</center>");
  pw.println("<center><a href=\"../index.html\"><img src=\"../images/logo2.png\"> </a></center><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");  
  
  
   pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
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
	  String s1= req.getParameter("Place");
 pw.println("<html>");
 pw.println("<body background=\"../images/5.jpg\">");
  pw.println("<center> <a href=\"../index.html\"> Log Out </a></center>");
  pw.println("<center> <font color=blue> <h1> Current Details for  <u><font color=red >"  +s1 +"</font></u>");
  pw.println("</center>");
   pw.println("<center><table border=1 background=\"../images/5.jpg\" width=100%>");
   pw.println("<tr><th> Movies </th>");
   pw.println("<th> Location </th>");
   pw.println("<th> Shows </th></tr>");
      Connection con=DBInfo.getConnection();
  try
  {

	 if(s1.equalsIgnoreCase("pratapnagar"))
	 {
     String query="select * from pratapnagar ";	
	PreparedStatement ps=con.prepareStatement(query);
	ResultSet rs=ps.executeQuery();
	
	 
	while(rs.next())
	{
	 String str1= rs.getString(1) ;
	String str2= rs.getString(2); 
	String str3= rs.getString(3);	
 
	
   
    pw.println("<tr><td><a href=Bill?id1="+str1+"&id2="+str3+"> "+str1+" </a></td>");
    pw.println("<td>"+str2+  "</td>");
    pw.println("<td> "+str3+ "</td></tr>");
}
}

if(s1.equalsIgnoreCase("malviyanagar"))
{
     String query="select * from malviyanagar ";	
	PreparedStatement ps=con.prepareStatement(query);
	ResultSet rs=ps.executeQuery();
	
	 
	while(rs.next())
	{
	 String str1= rs.getString(1) ;
	String str2= rs.getString(2); 
	String str3= rs.getString(3);	 

   
    pw.println("<tr><td><a href=Bill?id1="+str1+"&id2="+str3+">" +str1+ "</a></td>");
    pw.println("<td>"+str2+ "</td>");
    pw.println("<td> "+str3+ "</td></tr>");
}
}
if(s1.equalsIgnoreCase("tonkroad"))
{
     String query="select * from tonkroad ";	
	PreparedStatement ps=con.prepareStatement(query);
	ResultSet rs=ps.executeQuery();
	
	 
	while(rs.next())
	{
	 String str1= rs.getString(1) ;
	String str2= rs.getString(2); 
	String str3= rs.getString(3);	 
   
    pw.println("<tr><td><a href=Bill?id1="+str1+"&id2="+str3+">"+str1+" </a></td>");
    pw.println("<td>"+str2+ "</td>");
    pw.println("<td>" +str3+ "</td></tr>");
}

}    pw.println("</table></center><br><br>");
	
		
		
		
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
		

		
		pw.println("<form method=get>");
		pw.println("<center><input type=submit value=Back></center>");
		pw.println("</form><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
		
		 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("</table></center>");

   
   
   

  pw.println("</body>");
  pw.println("</html>");


  
   }
   }