package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class President extends Worker
{
	Scanner input = new Scanner(System.in);
	
	public static void Add_President(ArrayList<Worker> presidents, double cpf, String name, String email, double telephone, double salary)
	{
		President president = new President();
		president.setCpf(cpf);
		president.setName(name);
		president.setEmail(email);
		president.setTelephone(telephone);
		president.setSalary(salary);
		presidents.add(president);
	}

	@Override
	public void execute(ArrayList<Worker> presidents)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf and salary of the President you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			salary = input.nextDouble();
			input.nextLine();
			
			President.Add_President(presidents, cpf, name, email, telephone, salary);
			System.out.println("New President add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}
	
}