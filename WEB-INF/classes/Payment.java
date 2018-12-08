
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
       public class Payment extends HttpServlet
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
   pw.println("</table>");

pw.println("<center> <font size=5><a href=\"../index.html\"> Log Out </a></font></center>");
pw.println("<center>");
pw.println("<font color=blue>");
pw.println("<h1>Make Payment</h1>");
pw.println("<form method=post>");
pw.println("Payment through <select name=Pay value=select>");
pw.println("<option  value=NetBanking > NetBanking</option>");
pw.println("<option  value=Credit > CreditCard</option>");
pw.println("<option  value=Debit > DebitCard</option>");
pw.println("</select>");
pw.println("<br><br><br><input type=submit value=Proceed>");
pw.println("</form><br><br>");

pw.println("</center>");


 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta</font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
pw.println("</body>");
pw.println("</html>");
 try
  {
		
	}
	catch(Exception e1)
	{
	  e1.printStackTrace();
	}
	
}

 public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
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
   pw.println("</table>");
pw.println("<center> <font size=5><a href=\"../index.html\"> Log Out </a></font></center>");   
   pw.println("<br><br><center><a href=\"../index.html\"><img src=\"../images/logo2.png\"> </a></center>");
   
   
String str=req.getParameter("Pay");
pw.println("string is "+ str +"");
if(str.equalsIgnoreCase("NetBanking"))
{
res.sendRedirect("Netbanking");
}
else
{
  res.sendRedirect("Card");
}



 pw.println("<center><table width=50% height=40px>");
  pw.println("<tr bgcolor=tan><td><center><font color=red> Copyright @ copy;2015 All rights Reserved  <br><br><br>Developed by Kuldeep gupta </font></center></td><tr> ");

  
   pw.println("<table></center>");

   
   
pw.println("</body>");
pw.println("</html>");
}
}