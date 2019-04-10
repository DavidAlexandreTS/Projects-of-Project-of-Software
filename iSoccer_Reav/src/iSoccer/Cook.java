package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cook extends Worker
{
	Scanner input = new Scanner(System.in);
	
	public static void Add_Cooks(ArrayList<Worker> cooks, double cpf, String name, String email, double telephone, double salary)
	{
		Cook cook = new Cook();
		cook.setCpf(cpf);
		cook.setName(name);
		cook.setEmail(email);
		cook.setTelephone(telephone);
		cook.setSalary(salary);
		cooks.add(cook);
	}

	@Override
	public void execute(ArrayList<Worker> cooks)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf and salary of the Cook you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			salary = input.nextDouble();
			input.nextLine();
			Cook.Add_Cooks(cooks, cpf, name, email, telephone, salary);
			
			System.out.println("New Cook add with Success!");
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}
	
}