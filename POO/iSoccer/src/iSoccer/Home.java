package iSoccer;

import java.util.Scanner;

import java.util.ArrayList;

public class Home
{

	public static void main(String args [])
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		ArrayList<Admin> admins = new ArrayList<Admin>();
		ArrayList<Cook> cooks = new ArrayList<Cook>();
		ArrayList<Driver> drivers = new ArrayList<Driver>();
		ArrayList<Lawyer> lawyers = new ArrayList<Lawyer>();
		ArrayList<Medical> medicals = new ArrayList<Medical>();
		ArrayList<Physical_Trainer> physical_trainers = new ArrayList<Physical_Trainer>();
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<President> presidents = new ArrayList<President>();
		ArrayList<Technician> technicians = new ArrayList<Technician>();
		ArrayList<Partner> partners = new ArrayList<Partner>();
		
		int cpf;
		int crm;
		int enrollment_number;
		int telephone;
		
		double salary;
		double value_of_contribution;
		
		String login;
		String password;
		String name;
		String email;
		String status;
		String type_of_player;
		String addres;
		String status_of_pay;
		String type_of_partner = null;
		
		
		String  choice;
		
		Admin.Add_Admin(admins, "CSA", "omaiordeal123");
		
		while(true)
		{
			System.out.println("Welcome to the iSoccer, to continue please enter the Login and password.");
			login = input.nextLine();
			password = input.nextLine();
			
			
			int found = 0;
			if (admins.get(0).getLogin().equals(login) && admins.get(0).getPassword().equals(password))
			{
				found = 1;
			}
			
			if(found == 1)
			{
				while(true)
				{
					System.out.println("Welcome Ms. Admin");
					System.out.println( "What do you want to do?\n" + "1. To add employees\n");
					choice = input.nextLine();
					
					if(choice.equals("1"))
					{
						System.out.println("Okay, now to choose an option:\n" + "1. To add an President\n" + "2. To add an Doctor\n" +
						"3. To add an Technician\n" + "4. To add an Physical Trainer\n" + "5. To add an Driver\n" +
						"6. To add an Cook\n" + "7. To add an Lawyer\n" + "8. To add an Player\n" + "9. To add an Partner");
						
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("Please enter the name, email, telephone, cpf and salary of the President you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							President.Add_President(presidents, cpf, name, email, telephone, salary);
							System.out.println("New President add with sucess!");
						}
						else if(choice.equals("2"))
						{
							System.out.println("Please enter the name, email, telephone, cpf, crm and salary of the Medical you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							crm = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Medical.Add_Medical(medicals, cpf, crm, name, email, telephone, salary);
							System.out.println("New Medical add with sucess!");
						}
						else if(choice.equals("3"))
						{
							System.out.println("Please enter the name, email, telephone, cpf and salary of the Technician you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Technician.Add_Technician(technicians, cpf, name, email, telephone, salary);
							System.out.println("New Technician add with sucess!");
						}
						else if(choice.equals("4"))
						{
							System.out.println("Please enter the name, email, telephone, cpf and salary of the Physical Trainer you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Physical_Trainer.Add_Physical_Trainer(physical_trainers, cpf, name, email, telephone, salary);
							System.out.println("New Physical Trainer add with sucess!");
						}
						else if(choice.equals("5"))
						{
							System.out.println("Please enter the name, email, telephone, cpf, enrollment number and salary of the Driver you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							enrollment_number = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Driver.Add_Driver(drivers, cpf, enrollment_number, name, email, telephone, salary);
							System.out.println("New Driver add with sucess!");
						}
						else if(choice.equals("6"))
						{
							System.out.println("Please enter the name, email, telephone, cpf and salary of the Cook you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Cook.Add_Cook(cooks, cpf, name, email, telephone, salary);
							System.out.println("New Cook add with sucess!");
						}
						else if(choice.equals("7"))
						{
							System.out.println("Please enter the name, email, telephone, cpf and salary of the Lawyer you want to add");
							name = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Lawyer.Add_Lawyer(lawyers, cpf, name, email, telephone, salary);
							System.out.println("New Lawyer add with sucess!");
						}
						else if(choice.equals("8"))
						{
							System.out.println("Please enter the name, type of player, the status, email, telephone, cpf and salary of the Player you want to add");
							name = input.nextLine();
							type_of_player = input.nextLine();
							status = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							salary = input.nextDouble();
							input.nextLine();
							
							Player.Add_Player(players, cpf, name, email, type_of_player, status, telephone, salary);
							System.out.println("New Player add with sucess!");
						}
						else if(choice.equals("9"))
						{
							System.out.println("Please enter the name, the addres, email, telephone, cpf and value of contribution of the Partner you want to add");
							name = input.nextLine();
							addres = input.nextLine();
							email = input.nextLine();
							telephone = input.nextInt();
							cpf = input.nextInt();
							value_of_contribution = input.nextDouble();
							input.nextLine();
							
							if(value_of_contribution >= 1000 && value_of_contribution < 5000)
							{
								type_of_partner = "Junior";
							}
							else if(value_of_contribution >= 5000 && value_of_contribution < 10000)
							{
								type_of_partner = "Senior";
							}
							else if(value_of_contribution >= 10000)
							{
								type_of_partner = "Elite";
							}
							
							Partner.Add_Partner(partners, cpf, name, addres, email, telephone, value_of_contribution, "Adimplente", type_of_partner);
							System.out.println("New Player add with sucess!");
						}
						else
						{
							System.out.println("Invalid Option!");
						}
					}
					
					else if(choice.equals("2"))
					{
						
					}
				}
			}else
			{
				System.out.println("Invalid Login or Password");
			}
		}

	}

}
