import java.sql.*;
public class DBInfo
{
 static Connection con=null;
 static
 { 
 try
 {
 
 Class.forName("com.mysql.jdbc.Driver");
 System.out.println("Driver loaded");
 }
 catch(ClassNotFoundException e)
 {
   e.printStackTrace();
 }
 }
 public static Connection getConnection()
 {

 String url="jdbc:mysql://localhost:3306/movie";
	 String uname="root";
	  String pass="ksr";
	  try
	  { 
	  
	    con=DriverManager.getConnection(url,uname,pass);
	  }
	  	catch(SQLException e)
	{
	  e.printStackTrace();
	} 
	return con;
	}
}

  
     
    
