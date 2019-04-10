package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver extends Worker
{
	Scanner input = new Scanner(System.in);
	
	private int enrollment_number;

	public int getEnrollment_number()
	{
		return enrollment_number;
	}

	public void setEnrollment_number(int enrollment_number)
	{
		this.enrollment_number = enrollment_number;
	}
	
	public static void Add_Driver(ArrayList<Worker> drivers, double cpf, int enrollment_number, String name, String email, double telephone, double salary)
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

	@Override
	public void execute(ArrayList<Worker> drivers)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf, enrollment number and salary of the Driver you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			enrollment_number = input.nextInt();
			salary = input.nextDouble();
			input.nextLine();
			
			Driver.Add_Driver(drivers, enrollment_number, enrollment_number, name, email, enrollment_number, enrollment_number);
			System.out.println("New Driver add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}
	
}