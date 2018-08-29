package retrivedatafromtable;

import java.sql.SQLException;
import java.util.List;

public class Employee1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Base b = new Base();
		List<Employee> l = b.getTableInfo();
		for (Employee x : l) {
			System.out.println("Employee ID: "+x.getEid());
			System.out.println("Employee Name: "+x.getEname());
			System.out.println("Employee Salary: "+x.getEsal());
			System.out.println("Employee Joining Year: "+x.getEjyear());
		}
	}
}
