

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
       public class Smatrix extends HttpServlet
	   {
	   

	  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
  PrintWriter pw=res.getWriter();
String str2=req.getParameter("yname");
 String str3=req.getParameter("seatq");
 String str4=req.getParameter("id10");
 String str5=req.getParameter("id11");
 String str6=req.getParameter("id12");

  
pw.println("<html>");
 pw.println("<body background=\"../images/5.jpg\">");



 pw.println("<table width=100% height=40px>");
  pw.println("<tr bgcolor=tan><td><center> <a href=Login>Admin</a> </center></td> ");
  pw.println("<td><center> <a href=Ologin>Guest User </a></center> </td> ");
  pw.println("<td><center> <a href=Search>Search by Theatre </a></center> </td> ");
  pw.println("<td> <center><a href=\"../About.html\">About Us</a> </center> </td> ");
  pw.println("<td><center> <a href=\"../Contact.html\">Contact </a> </center></td> </tr>");
   pw.println("</table>");

pw.println("<center> <font size=5><a href=\"../index.html\"> Log Out </a></font></center>");
   pw.println("<form action=Seat1 method=get>");
pw.println("<center> <h1> <font color=blue> Book your ticket </h1></center>");
pw.println("<center><table bgcolor=tan border=1 width=500><tr><center>Theatre Screen</center></tr></table></center>");
pw.println("<center><table border=1 bgcolor=tan width=500 height=500>");
pw.println("<tr><td><center><input type=checkbox name=seat value=1 >1</center></td> <td><center><input type=checkbox name=seat value=2>2 </center> </td><td><center><input type=checkbox name=seat value=3>3</center> </td>  <td> Gallery </td>  <td> Gallery </td><td><center><input type=checkbox name=seat value=31>31 </center></td> <td><center><input type=checkbox name=seat value=32>32 </center> </td><td><input type=checkbox name=seat value=33>33 </td><tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=4>4 </center></td> <td><center><input type=checkbox name=seat value=5>5 </center> </td><td><center><input type=checkbox name=seat value=6> 6</center> </td>  <td>  </td><td>  </td><td><center><input type=checkbox name=seat value=34>34 </center></td> <td><center><input type=checkbox name=seat value=35>35 </center> </td><td><input type=checkbox name=seat value=36>36</td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=7>7 </center></td> <td><center><input type=checkbox name=seat value=8>8 </center> </td><td><center><input type=checkbox name=seat value=9>9</center> </td>  <td>  </td><td>  </td><td><center><input type=checkbox name=seat value=37>37 </center></td> <td><center><input type=checkbox name=seat value=38>38 </center> </td><td><input type=checkbox name=seat value=39>39</td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=10>10 </center></td> <td><center><input type=checkbox name=seat value=11>11 </center> </td>  <td><center><input type=checkbox name=seat value=12>12</center> </td>  <td>  </td><td>  </td><td><center><input type=checkbox name=seat value=40>40 </center></td> <td><center><input type=checkbox name=seat value=41>41 </center> </td><td><input type=checkbox name=seat value=42>42 </td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=13>13 </center></td> <td><center><input type=checkbox name=seat value=14>14</center> </td>  <td><center><input type=checkbox name=seat value=15>15</center> </td>  <td>  </td>  <td></td><td><center><input type=checkbox name=seat value=43>43 </center></td> <td><center><input type=checkbox name=seat value=44>44 </center> </td><td><input type=checkbox name=seat value=45>45</td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=16>16 </center></td> <td><center><input type=checkbox name=seat value=17>17 </center> </td>  <td><center><input type=checkbox name=seat value=18> 18</center> </td>  <td>  </td><td>  </td><td><center><input type=checkbox name=seat value=46>46 </center></td> <td><center><input type=checkbox name=seat value=47>47 </center> </td><td><input type=checkbox name=seat value=48>48</td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=19>19 </center></td> <td><center><input type=checkbox name=seat value=20>20</center> </td>  <td><center><input type=checkbox name=seat value=21>21</center> </td><td>  </td><td>  </td><td><center><input type=checkbox name=seat value=49>49 </center></td> <td><center><input type=checkbox name=seat value=50>50 </center> </td><td><input type=checkbox name=seat value=51>51</td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=22>22 </center></td> <td><center><input type=checkbox name=seat value=23>23 </center> </td>  <td><center><input type=checkbox name=seat value=24>24</center> </td><td>  </td><td>  </td><td><center><input type=checkbox name=seat value=52>52 </center></td> <td><center><input type=checkbox name=seat value=53>53 </center> </td><td><input type=checkbox name=seat value=54>54</td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=25>25 </center></td> <td><center><input type=checkbox name=seat value=26>26</center> </td>  <td><center><input type=checkbox name=seat value=27>27</center> </td><td>  </td><td>  </td><td><center><input type=checkbox name=seat value=55>55</center></td> <td><center><input type=checkbox name=seat value=56>56 </center> </td><td><input type=checkbox name=seat value=55>57 </td></tr>");
pw.println("<tr><td><center><input type=checkbox name=seat value=28>28 </center></td> <td><center><input type=checkbox name=seat value=29>29 </center> </d>  <td><center><input type=checkbox name=seat value=30>30</center> </td><td>  </td><td>  </td><td><center><input type=checkbox name=seat value=58>58 </center></td> <td><center><input type=checkbox name=seat value=59>59 </center> </td><td><input type=checkbox name=seat value=60>60 </td></tr>");
pw.println("</table></center>");
pw.println("<input type=hidden name=yname value="+str2+">");
pw.println("<input type=hidden name=seatq value="+str3+">");
pw.println("<input type=hidden name=id10 value="+str4+">");
pw.println("<input type=hidden name=id11 value="+str5+">");
pw.println("<input type=hidden name=id12 value="+str6+">");
pw.println("<center><input type=submit value=Next></center>");
pw.println("</form>");







try
{
}
catch(Exception e)
{
  e.printStackTrace();
}




pw.println("</body>");
pw.println("</html>");
}
}