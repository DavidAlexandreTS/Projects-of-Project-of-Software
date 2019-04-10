package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lawyer extends Worker
{
	Scanner input = new Scanner(System.in);
	
	public static void Add_Lawyer(ArrayList<Worker> lawyers, double cpf, String name, String email, double telephone, double salary)
	{
		Lawyer lawyer = new Lawyer();
		lawyer.setCpf(cpf);
		lawyer.setName(name);
		lawyer.setEmail(email);
		lawyer.setTelephone(telephone);
		lawyer.setSalary(salary);
		lawyers.add(lawyer);
	}

	@Override
	public void execute(ArrayList<Worker> lawyers)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf and salary of the Lawyer you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			salary = input.nextDouble();
			input.nextLine();
			
			Lawyer.Add_Lawyer(lawyers, cpf, name, email, telephone, salary);
			System.out.println("New Lawyer add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}
	
}