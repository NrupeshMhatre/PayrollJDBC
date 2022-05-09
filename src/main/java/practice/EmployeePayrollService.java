package Practice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import com.mysql.cj.xdevapi.Statement;

public class EmployeePayrollService {
	private static final String url = "jdbc:mysql://localhost:3306/employee_payroll";
	private static final String userName = "root";
	private static final String password = "Sanjana555@mhatre";

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection connection = null;
		connection = DriverManager.getConnection(url, userName, password);
		System.out.println("connected to database" + connection);
		return connection;

	}

	
	public void checkDatabaseConnection() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		listDrivers();

	}

	
	private void listDrivers() {
		Enumeration<java.sql.Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println(" " + driverClass.getClass().getName());
		}
	}

	
	public void selectData() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		java.sql.Statement statement = connection.createStatement();
		ResultSet resultSet = ((java.sql.Statement) statement).executeQuery("select * from employee_payroll");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getDouble(4) + " " + resultSet.getDate(5));
		}

	}
}
