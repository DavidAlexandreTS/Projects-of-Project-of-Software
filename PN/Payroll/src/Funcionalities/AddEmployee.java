package Funcionalities;

import java.util.ArrayList;
import Objects.Employee;

public class AddEmployee
{
	public static void AddaEmplyee(ArrayList<Employee> emp, int ide, String name, String address, String type, String method_of_pay, String pertence, double salary, double hourly_salary, double commission)
	{
		Employee employee = new Employee();
		employee.setIde(ide);
		employee.setName(name);
		employee.setAddress(address);
		employee.setType(type);
		employee.setMethod_of_pay(method_of_pay);
		employee.setPertence(pertence);
		employee.setSalary(salary);
		employee.setHourly_salary(hourly_salary);
		employee.setCommission(commission);
		emp.add(employee);
	}
}
