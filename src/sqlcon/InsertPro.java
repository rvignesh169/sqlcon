package sqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertPro {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//Load Driver
	Class.forName("com.mysql.jdbc.Driver");
	
	//connect to DataBase 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
	
	//write SQL Query
	String sql = "INSERT INTO `employee` (`EID`, `Ename`, `Esalary`, `Join_Year`) VALUES (?, ?, ?, ?)";
			
	//Prepare Statement
			PreparedStatement prst = con.prepareStatement(sql);
	
	//Set the values
	int eid = 6;
	String name = "Bala";
	long sal = 250000;
	int year = 2017;
	prst.setInt(1, eid);
	prst.setString(2, name);
	prst.setLong(3, sal);
	prst.setInt(4, year);
	//Execute Query
	prst.executeUpdate();
	System.out.println("sucess");
}
}
