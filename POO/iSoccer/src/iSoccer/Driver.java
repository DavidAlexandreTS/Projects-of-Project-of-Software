package iSoccer;

import java.util.ArrayList;

public class Driver extends Worker
{
	private int enrollment_number;

	public int getEnrollment_number()
	{
		return enrollment_number;
	}

	public void setEnrollment_number(int enrollment_number)
	{
		this.enrollment_number = enrollment_number;
	}
	
	public static void Add_Driver(ArrayList<Driver> drivers, int cpf, int enrollment_number, String name, String email, int telephone, double salary)
	{
		Driver driver = new Driver();
		driver.setCpf(cpf);
		driver.setEnrollment_number(enrollment_number);
		driver.setName(name);
		driver.setEmail(email);
		driver.setTelephone(telephone);
		driver.setSalary(salary);
		drivers.add(driver);
	}
	
}