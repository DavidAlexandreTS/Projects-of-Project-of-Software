package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Medical extends Worker
{
	Scanner input = new Scanner(System.in);
	
	private int crm;

	public int getCrm()
	{
		return crm;
	}

	public void setCrm(int crm)
	{
		this.crm = crm;
	}
	
	public static void Add_Medical(ArrayList<Worker> medicals, double cpf, int crm, String name, String email, double telephone, double salary)
	{
		
		Medical medical = new Medical();
		medical.setCpf(cpf);
		medical.setCrm(crm);
		medical.setName(name);
		medical.setEmail(email);
		medical.setTelephone(telephone);
		medical.setSalary(salary);
		medicals.add(medical);
	}

	@Override
	public void execute(ArrayList<Worker> medicals)
	{
		try
		{
			System.out.println("Please enter the name, email, telephone, cpf, crm and salary of the Medical you want to add");
			name = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			crm = input.nextInt();
			salary = input.nextDouble();
			input.nextLine();
			
			Medical.Add_Medical(medicals, crm, crm, name, email, crm, crm);
			System.out.println("New Medical add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}
	
	
	
}