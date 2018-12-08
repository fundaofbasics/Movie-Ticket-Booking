 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
public class Seat1 extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{
 PrintWriter pw1=res.getWriter();
 String str1=req.getParameter("seat");
 String str2=req.getParameter("yname");
 String str3=req.getParameter("seatq");
 String str4=req.getParameter("id10");
 String str5=req.getParameter("id11");
 String str6=req.getParameter("id12");

 
  pw1.println("<html>");
   pw1.println("<body background=\"../images/5.jpg\">");
  Date date=new Date();
  
  
   pw1.println("<table width=100% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center> <a href=Admin>Admin</a> </center></td> ");
  pw1.println("<td><center> <a href=Ologin>Guest User</a> </center> </td> ");
  pw1.println("<td><center> <a href=Search>Search by Theatre</a> </center> </td> ");
  pw1.println("<td> <center><a href=About.html>About Us</a> </center> </td> ");
  pw1.println("<td><center> <a href=Contact.html>Contact</a>  </center></td> </tr>");
   pw1.println("</table>");
   pw1.println("<center> <font size=5><a href=\"../index.html\"> Log Out </a></font></center>");

 if(str3.equals("1"))
{ 
   
  
    pw1.println("<center>");
  pw1.println("<table border=1 bgcolor=tan width=200 height=200>");
  pw1.println("<tr><td>  Your Name  </td> <td>"+str2+"</td></tr>");
  pw1.println("<tr><td> Movie </td><td>"+str4+"</td></tr>");
  pw1.println("<tr><td>  Seat Quantity  </td> <td>"+str3+"</td></tr>");
  
  pw1.println("<tr><td> Seat type </td><td></td></tr>");
  pw1.println("<tr><td> Seat No. </td><td>"+str1+"</td></tr>");
  
  pw1.println("<tr><td> Show time </td><td>"+str5+"</td></tr>" );
  pw1.println("<tr><td> Booking Time </td><td>"+date.toString()+"</td></tr>" );
   
   if(str6.equalsIgnoreCase("Golden"))
  {
  pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 150</h3></td></tr>" );
  }
  else
  {
     pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 120</h3></td></tr>" );
            
  }  
  pw1.println("</table>");
 }
 if(str3.equals("2"))
 {
      
    pw1.println("<center>");
  pw1.println("<table border=1 bgcolor=tan width=200 height=200>");
  pw1.println("<tr><td>  Your Name  </td> <td>"+str2+"</td></tr>");
  pw1.println("<tr><td> Movie </td><td>"+str4+"</td></tr>");
  pw1.println("<tr><td>  Seat Quantity  </td> <td>"+str3+"</td></tr>");
  
  pw1.println("<tr><td> Seat type </td><td>"+str6+"</td></tr>");
  pw1.println("<tr><td> Seat No. </td><td>"+str1+"</td><td> seat2 </td></tr>");
  
  pw1.println("<tr><td> Show time </td><td>"+str5+"</td></tr>" );
  pw1.println("<tr><td> Booking Time </td><td>"+date.toString()+"</td></tr>" );
   
   if(str6.equalsIgnoreCase("Golden"))
  {
  pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 150</h3></td></tr>" );
  }
  else
  {
     pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 120</h3></td></tr>" );
            
  }  
  pw1.println("</table>");
 


 }

 if(str3.equals("3"))
 {
      
    pw1.println("<center>");
  pw1.println("<table border=1 bgcolor=tan width=200 height=200>");
  pw1.println("<tr><td>  Your Name  </td> <td>"+str2+"</td></tr>");
  pw1.println("<tr><td> Movie </td><td>"+str4+"</td></tr>");
  pw1.println("<tr><td>  Seat Quantity  </td> <td>"+str3+"</td></tr>");
  
  pw1.println("<tr><td> Seat type </td><td></td></tr>");
  pw1.println("<tr><td> Seat No. </td><td>"+str1+"</td> <td>seat2 </td> <td> seat3</td></tr>");
  
  pw1.println("<tr><td> Show time </td><td>"+str5+"</td></tr>" );
  pw1.println("<tr><td> Booking Time </td><td>"+date.toString()+"</td></tr>" );
   
   if(str6.equalsIgnoreCase("Golden"))
  {
  pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 150</h3></td></tr>" );
  }
  else
  {
     pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 120</h3></td></tr>" );
            
  }  
  pw1.println("</table>");
 


 }
 
  
  pw1.println("</form><br><br><br><br><br><center> <h1> <a href=Payment> Procced</a ></h1><br>If you agree above Ticket details !</center><br>");
  
  
   pw1.println("<center><table width=50% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw1.println("<table></center>");

  pw1.println("</body>");
  pw1.println("</html>");
  try
  {
     Connection con=DBInfo.getConnection();
	 String query="insert into ticket values(?,?,?,?,?,?)";
	 PreparedStatement ps=con.prepareStatement(query);
	 ps.setString(1,str1);
	 ps.setString(2,str2);
	 ps.setString(3,str3);
	 ps.setString(4,str4);
	 ps.setString(5,str5);
	 ps.setString(6,str6);
	 ps.executeUpdate();
  }
  catch(Exception e)
  {
    e.printStackTrace();
  }
  }
  }