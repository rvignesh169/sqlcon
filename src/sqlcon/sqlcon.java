package sqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class sqlcon {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//Load Driver
	Class.forName("com.mysql.jdbc.Driver");
	//connect to database
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/testdb","root","");  
	//Write sql query
	String sql = "select * from  employee ";
	//Prepare the statement
	Statement stmt=con.createStatement();
	//Execute query
	ResultSet rs=stmt.executeQuery(sql)  ;
	while(rs.next()){
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	
	con.close();  
}
}
