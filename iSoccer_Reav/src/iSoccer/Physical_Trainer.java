package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Physical_Trainer extends Worker
{
	Scanner input = new Scanner(System.in);
	
	public static void Add_Physical_Trainer(ArrayList<Worker> physical_trainers, double cpf, String name, String email, double telephone, double salary)
	{
		Physical_Trainer physical_trainer = new Physical_Trainer();
		physical_trainer.setCpf(cpf);
		physical_trainer.setName(name);
		physical_trainer.setEmail(email);
		physical_trainer.setTelephone(telephone);
		physical_trainer.setSalary(salary);
		physical_trainers.add(physical_trainer);
	}

	@Override
	public void execute(ArrayList<Worker> physical_trainers)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf and salary of the Physical Trainer you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			salary = input.nextDouble();
			input.nextLine();
			
			Physical_Trainer.Add_Physical_Trainer(physical_trainers, cpf, name, email, telephone, salary);
			System.out.println("New Physical Trainer add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}

}