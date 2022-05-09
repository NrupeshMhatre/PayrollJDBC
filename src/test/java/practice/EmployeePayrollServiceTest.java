package practice;

import static org.junit.Assert.*;

import org.junit.Test;

import Practice.EmployeePayrollService;

public class EmployeePayrollServiceTest {
	@Test
	public void givenEmployeePayrollDatabase_ShouldConnectToDatabase() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.checkDatabaseConnection();
	}
	
}
