package Funcionalities;

import java.util.ArrayList;
import java.util.Scanner;

import Objects.Employee;
import Objects.Sale;
import Objects.Timecard;
import Objects.Syndicate;;

public class Carp_Corporation
{
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<Employee> empre = new ArrayList<Employee>();
		ArrayList<Timecard> timecard = new ArrayList<Timecard>();
		ArrayList<Sale> sale = new ArrayList<Sale>();
		ArrayList<Syndicate> syn = new ArrayList<Syndicate>();
		
		int ide = 0;
		int idt = 0;
		int ids = 0;
		int idrem = 0;
		int idsyndi = 0;
		
		String choice, estat;
		String name;
		String address;
		String type;
		String method_of_pay = null;
		String client;
		String pertence;
		
		double salary;
		double hourly_salary = 1;
		double commission;
		double worked_hours;
		double value;
		double service_charge;
		
		System.out.println("Welcome to the Carp Corporation Payroll");
		
		while(true)
		{
			System.out.println( "What do you want do?\n" +
								"1. To add a Employee\n" +
								"2. To remove a Emplyee\n" +
								"3. To launch a dot card");
			choice = input.next();
			
			if(choice.equals("1"))
			{
				while(true)
				{
					System.out.println("Enter the name, address, the type of employee and the method of pay");
					
					name = input.nextLine();
					address = input.nextLine();
					type = input.next();
					
					if(type.equals("hourly"))
					{
						System.out.println("How much does this employee earn by the hour and what method of payment does he choose? d please if you are a member of the union type 'Yes', else type 'No'");
						hourly_salary = input.nextDouble();
						input.nextLine();
						pertence = input.next();
						method_of_pay = input.nextLine();
						
						AddEmployee.AddaEmplyee(empre, ide, name, address, type, method_of_pay, pertence, 0, hourly_salary, 0);
						ide ++;
						System.out.println("New Employee Registered with Sucess!");
						
					}
					
					else if(type.equals("salaried"))
					{
						System.out.println("Enter the employee's monthly salary and payment method(If the employee belongs to the union type 'Yes' and 'Not' otherwise)");
						salary = input.nextDouble();
						input.nextLine();
						pertence = input.next();
						method_of_pay = input.nextLine();
						
						AddEmployee.AddaEmplyee(empre, ide, name, address, type, method_of_pay, pertence, salary, 0, 0);
						ide ++;
						System.out.println("New Employee Registered with Sucess!");
					}
					
					else if(type.equals("commissioned"))
					{
						System.out.println("Enter the employee's monthly salary and payment method(If the employee belongs to the union type 'Yes' and 'Not' otherwise)");
						salary = input.nextDouble();
						input.nextLine();
						pertence = input.next();
						method_of_pay = input.nextLine();
						
						AddEmployee.AddaEmplyee(empre, ide, name, address, type, method_of_pay, pertence, salary, 0, 0);
						ide ++;
						System.out.println("New Employee Registered with Sucess!");
					}
					
					else
					{
						System.out.println("this type of employee does not exist, please try again");
					}
				}
				
				
			}
			
			else if(choice.equals("2"))
			{
				System.out.println("Digit the Id and the name of Employee you want remove");
				idrem = input.nextInt();
				input.nextLine();
				name = input.nextLine();
				estat = "0";
				
				for(int i = 0; i < empre.size(); i ++)
				{
					if(empre.get(i).getName().equals(name) && empre.get(i).getIde() == idrem)
					{
						estat = "1";
						empre.remove(idrem);
						break;
					}
				}
				
				if(estat.equals("1"))
				{
					System.out.println("Employee Removed with sucess");
				}	
				else
				{
					System.out.println("Employee not Found!");
				}
				
			}
			
			else if(choice.equals("3"))
			{
				System.out.println("Enter the name of the employee you want to associate this card with");
				
				while(true)
				{
					estat = "0";
					name = input.nextLine();
					
					for(int i = 0; i < empre.size(); i ++)
					{
						if(empre.get(i).getName().equals(name) && empre.get(i).getType().equals("hourly"))
						{
							estat = "1";
							idt = empre.get(i).getIde();
							hourly_salary = empre.get(i).getHourly_salary();
							method_of_pay = empre.get(i).getMethod_of_pay();
							break;
						}
					}
					
					if(estat.equals("1"))
					{
						System.out.println("Enter the number of hours worked by him");
						
						worked_hours = input.nextDouble();
						input.nextLine();
						
						if(worked_hours > 8)
						{
							salary = (hourly_salary * 1.5) * worked_hours;
							
							LaunchTimecard.LaunchaTimecard(timecard, idt, name, worked_hours, salary, method_of_pay);
							System.out.println("New Timecard add with sucess!");
						}
						
						else
						{
							salary = hourly_salary * worked_hours;
							
							LaunchTimecard.LaunchaTimecard(timecard, idt, name, worked_hours, salary, method_of_pay);
							System.out.println("New Timecard add with sucess!");
						}
					}
					
					else
					{
						System.out.println("Employee not found or not is hourly. Please enter the data again");
					}
						
				}
			}
			
			else if(choice.equals("4"))
			{
				System.out.println("Please enter the name of the employee who made the sale");
				
				while(true)
				{
					name = input.nextLine();
					estat = "0";
					
					for(int i = 0; i < empre.size(); i ++)
					{
						if(empre.get(i).getName().equals(name))
						{
							estat = "1";
							ids = empre.get(i).getIde();
							break;
						}
					}
					
					if(estat.equals("1"))
					{
						System.out.println("Very well, now please enter the value of the purchase and the name of the customer");
						value = input.nextDouble();
						input.nextLine();
						client = input.nextLine();
						
						LaunchSale.LaunchaSale(sale, ids, value, name, client);
						System.out.println("Sale successfully registered");
						break;
					}
					else
					{
						System.out.println("Employee not found. Please digit his name again");
					}
					
				}
				
			}
			
			else if(choice.equals("5"))
			{
				System.out.println("To post a service fee enter the employee's name");
				name = input.nextLine();
				estat = "0";
				
				for(int i = 0; i < empre.size(); i ++)
				{
					if(empre.get(i).getName().equals(name) && empre.get(i).getPertence().equals("Yes"))
					{
						estat = "1";
						ids = empre.get(i).getIde();
						break;
					}
				}
				
				if(estat.equals("1"))
				{
					System.out.println("Ok, now please enter the service charge andd the Type of Employee");
					service_charge = input.nextDouble();
					input.nextLine();
					type = input.next();
					
					LaunchSyndicate.AddaMember(syn, idsyndi, service_charge, name);
					
					if(type.equals("salaried"))
					{
						//to do
					}
					else if(type.equals("commissioned"))
					{
						//to do
					}
					else if(type.equals("hourly"))
					{
						//to do
					}
					else
					{
						System.out.println("This type of employee dont exist!")
					}
					
				}
				else
				{
					System.out.println("This employee not pertence a Syndicate or not exists.");
				}
			}
		}
	}
}
