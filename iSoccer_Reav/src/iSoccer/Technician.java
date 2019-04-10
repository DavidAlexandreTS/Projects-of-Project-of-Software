package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Technician extends Worker
{
	Scanner input = new Scanner(System.in);
	
	public static void Add_Technician(ArrayList<Worker> technicians, double cpf, String name, String email, double telephone, double salary)
	{
		Technician technician = new Technician();
		technician.setCpf(cpf);
		technician.setName(name);
		technician.setEmail(email);
		technician.setTelephone(telephone);
		technician.setSalary(salary);
		technicians.add(technician);
	}

	@Override
	public void execute(ArrayList<Worker> technicians)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf and salary of the Technician you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			salary = input.nextDouble();
			input.nextLine();
			
			Technician.Add_Technician(technicians, cpf, name, email, telephone, salary);
			System.out.println("New Technician add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}
	
}