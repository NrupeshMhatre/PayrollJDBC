package practice;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import Practice.EmployeePayrollException;
import Practice.EmployeePayrollService;
import junit.framework.Assert;

public class EmployeePayrollServiceTest {
	@Test
	public void givenEmployeePayrollDatabase_ShouldConnectToDatabase() throws ClassNotFoundException, SQLException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.checkDatabaseConnection();
	}

	
	@Test
	public void givenEmployeePayrollDatabase_ShouldRetrieveData() throws ClassNotFoundException, SQLException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.selectData();
	}

	
	@Test
	public void givenEmployeePayrollDatabase_ShouldUpdateSalary() throws EmployeePayrollException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		boolean result = employeePayrollService.updateSalary();
		Assert.assertTrue(result);

	}

	
	@Test
	public void givenEmployeePayrollDatabase_ShouldUpdateSalaryUsingPreparedStatement()
			throws EmployeePayrollException {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		boolean result = employeePayrollService.updateSalaryPrepared();
		Assert.assertTrue(result);

	}

	
	
}
