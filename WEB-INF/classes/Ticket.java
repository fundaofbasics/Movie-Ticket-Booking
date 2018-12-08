 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
public class Ticket extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{
 PrintWriter pw1=res.getWriter();


 
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

   
    Connection con=DBInfo.getConnection();
   
   
   
  try
  {
    
	 String query="select * from ticket where yname=? movie=? showtime=?";
	 PreparedStatement ps=con.prepareStatement(query);
	 
	 
	  ResultSet rs=ps.executeQuery();
	  while(rs.next())
	  {
	 String seat=rs.getString(1);
	 String yname=rs.getString(2);
	 String seatq=rs.getString(3);
	 String movie=rs.getString(4);
	 String showtime=rs.getString(5);
	 String stype=rs.getString(6);
	 
	   
    pw1.println("<center>");
  pw1.println("<table border=1 bgcolor=tan width=200 height=200>");
  pw1.println("<tr><td>  Your Name  </td> <td>"+yname+"</td></tr>");
  pw1.println("<tr><td> Movie </td><td>"+movie+"</td></tr>");
  pw1.println("<tr><td>  Seat Quantity  </td> <td>"+seatq+"</td></tr>");
  
  pw1.println("<tr><td> Seat type </td><td>"+stype+"</td></tr>");
  pw1.println("<tr><td> Seat No. </td><td>"+seat+"</td></tr>");
  
  pw1.println("<tr><td> Show time </td><td>"+showtime+"</td></tr>" );
  pw1.println("<tr><td> Booking Time </td><td>"+date.toString()+"</td></tr>" );
   
   if(stype.equalsIgnoreCase("Golden"))
  {
  pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 150</h3></td></tr>" );
  }
  else
  {
     pw1.println("<tr><td> Ticket charge </td> <td> <h3>Rs 120</h3></td></tr>" );
            
  }  
  pw1.println("</table>");
 


	 
	 
	 
	}
  }
  catch(Exception e)
  {
    e.printStackTrace();
  }  
   
 
  
  
   pw1.println("<center><table width=50% height=40px>");
  pw1.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw1.println("<table></center>");

  pw1.println("</body>");
  pw1.println("</html>");
 
  }
  }