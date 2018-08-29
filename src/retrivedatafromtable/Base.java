package retrivedatafromtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Base {

	public List<Employee> getTableInfo() throws ClassNotFoundException, SQLException{
		List<Employee> emp = new ArrayList<Employee>();
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
		
		String sql = "select * from employee";
		
		PreparedStatement psmt = c.prepareStatement(sql);
		
		ResultSet rs = psmt.executeQuery();
		
		while (rs.next()){
			Employee e = new Employee();
			int eid = rs.getInt("eid");
			String ename = rs.getString("ename");
			long esal = rs.getLong("esalary");
			int ejyear = rs.getInt("Join_Year");
			e.setEid(eid);
			e.setEname(ename);
			e.setEsal(esal);
			e.setEjyear(ejyear);
			emp.add(e);
		}
	return emp;	
	}
}
