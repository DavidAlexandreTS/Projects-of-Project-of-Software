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
		ArrayList<Resource> resources = new ArrayList<Resource>();
		
		int cpf;
		int crm;
		int enrollment_number;
		int telephone;
		int check;
		int qtd;
		int qtd_bathroom;
		int qtd_snack_bar;
		int capacity_of_spectators;
		int qtd_of_rooms;
		
		double salary;
		double value_of_contribution;
		
		String login;
		String password;
		String name;
		String email;
		String status;
		String type_of_player;
		String addres;
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
					System.out.println( "What do you want to do?\n" + "1. To add employees or an Partner\n" + "2. To change a partner payment status or update the value of the contribution\n" +
					"3. To administer the Resources\n" + "4. To Generate Reports");
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
							System.out.println("New President add with Success!");
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
							System.out.println("New Medical add with Success!");
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
							System.out.println("New Technician add with Success!");
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
							System.out.println("New Physical Trainer add with Success!");
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
							System.out.println("New Driver add with Success!");
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
							System.out.println("New Cook add with Success!");
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
							System.out.println("New Lawyer add with Success!");
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
							System.out.println("New Player add with Success!");
						}
						
						else if(choice.equals("9"))
						{
							System.out.println("Please enter the name, the addres, email, status, telephone, cpf and value of contribution of the Partner you want to add");
							name = input.nextLine();
							addres = input.nextLine();
							email = input.nextLine();
							status = input.nextLine();
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
							
							Partner.Add_Partner(partners, cpf, name, addres, email, telephone, value_of_contribution, status, type_of_partner);
							System.out.println("New Partner add with Success!");
						}
						
						else
						{
							System.out.println("Invalid Option!");
						}
						
					}
					
					else if(choice.equals("2"))
					{
						System.out.println("Ok, now digit the name and the CPF of Partner");
						name = input.nextLine();
						cpf = input.nextInt();
						input.nextLine();
						
						check = Partner.Search_Partner(partners, name, cpf, false);
						
						if(check == 1)
						{
							System.out.println("Do you wanna change the status[1] or update the value of the contribution[2]?");
							choice = input.nextLine();
							
							if(choice.equals("1"))
							{
								status = Partner.Take_Status(partners, name, " ", cpf, false);
								System.out.println(" The current state of this Partner is " + status + ". Do you wanna change it(1 to Yes or 2 to No)?");
								choice = input.nextLine();
								
								if(choice.equals("1"))
								{
									System.out.println("Ok, please digit the Now Status");
									status = input.nextLine();
									Partner.Alter_Status(partners, status, cpf);
									System.out.println("Status changed with Success!");
								}
								
								else
								{
									System.out.println("See ya!");
								}
							}
							
							else if(choice.equals("2"))
							{
								System.out.println("Please digit the new value");
								value_of_contribution = input.nextDouble();
								input.nextLine();
								
								Partner.Alter_Contribution(partners, value_of_contribution, cpf);
								System.out.println("New value changed with Success!");
							}
							
						}
						
						else
						{
							System.out.println( "This Partner does not exist.");
						}
						
					}
					
					else if(choice.equals("3"))
					{
						System.out.println("For Bus information type 1, to information about Stadium type 2 or type 3 to information about Training Camps");
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("To add Bus type 1, if you want to know the amount of Bus type 2 of to see the availability of this Resource type 3");
							choice = input.nextLine();
							
							if(choice.equals("1"))
							{
								System.out.println("How many Bus do you want to add?");
								qtd = input.nextInt();
								input.nextLine();
								
								if(qtd > 0)
								{
									Bus.Add_Bus(resources, qtd, "Bus", "Available");
									System.out.println("Bus add with Success!");
								}
								
								else
								{
									Bus.Add_Bus(resources, qtd, "Bus", "Not Available");
									System.out.println("Bus Not Added!");
								}
								
							}
							
							else if(choice.equals("2"))
							{
								qtd = Resource.Check_Quantity(resources, 0, "Bus", false);
								System.out.println("The Quantity of Bus is " + qtd);
							}
							
							else if(choice.equals("3"))
							{
								status = Resource.Check_Status(resources, "Bus", " ", false);
								System.out.println("The Status of Bus is " + status);
							}
							
							else
							{
								System.out.println("Invalid Option.");
							}
						}
						
						else if(choice.equals("2"))
						{
							System.out.println("To add a Stadium type 1, to view additionals informations about a Stadium type 2 and to see the availability of this Resource type 3");
							choice = input.nextLine();
							
							if(choice.equals("1"))
							{
								System.out.println("Ok, now please Gimme the Name of Stadium, the Quantity of Bathrooms, the Quantity of Snack Bars and the Capacity of Spectators");
								name = input.nextLine();
								qtd_bathroom = input.nextInt();
								qtd_snack_bar = input.nextInt();
								capacity_of_spectators = input.nextInt();
								input.nextLine();
								
								Stadium.Add_Stadium(resources, 1, qtd_bathroom, qtd_snack_bar, capacity_of_spectators, name, "Stadium", "Available");
								System.out.println("New Stadium add with Success!");
							}
							
							else if(choice.equals("2"))
							{
								System.out.println("Gimme the name of Stadium please");
								name = input.nextLine();
									
								capacity_of_spectators = Stadium.Check_Quantity_of_Capacity_of_Spectators(resources, 0, name, "Stadium", false);
								qtd_bathroom = Stadium.Check_Quantity_of_Bathroom(resources, 0, name, "Stadium", false);
								qtd_snack_bar = Stadium.Check_Quantity_of_Snack_Bar(resources, 0, name, "Stadium", false);
									
								System.out.println("The Max Capacity of Spectators is " + capacity_of_spectators);
								System.out.println("The Quantity of Bathrooms is " + qtd_bathroom);
								System.out.println("The Quantity of Snack Bars is " + qtd_snack_bar);
								
							}
							
							else if(choice.equals("3"))
							{
								System.out.println("Gimme the name of Stadium");
								name = input.nextLine();
								
								status = Training_Camp.Check_Status_T(resources, name, "Stadium", " ", false);
								System.out.println("The Status of Stadium is " + status);
							}
							
							else
							{
								System.out.println("Invalid Option.");
							}
						}
						
						else if(choice.equals("3"))
						{
							System.out.println("To add a Training Camp type 1, to see the number of bedrooms type 2 and to see the availability of this Resource type 3");
							choice = input.nextLine();
							
							if(choice.equals("1"))
							{
								System.out.println("Ok, please Gimme the name of Training Camp and the Quantity of Rooms");
								name = input.nextLine();
								qtd = input.nextInt();
								input.nextLine();
								
								Training_Camp.Add_Training_Camp(resources, qtd, name, "Training Camp", "Avaliable");
								System.out.println("New Training Camp add with Success!");
							}
							
							else if(choice.equals("2"))
							{
								System.out.println("Gimme the name of the Training Camp please");
								name = input.nextLine();
								qtd = input.nextInt();
								input.nextLine();
								
								qtd_of_rooms = Training_Camp.Number_of_Rooms(resources, qtd, name, "Training Camp", false);
								System.out.println("The Quantity of Rooms is " + qtd_of_rooms);
							}
							
							else if(choice.equals("3"))
							{
								System.out.println("Gimme the name of the Training Camp");
								name = input.nextLine();
								
								status = Training_Camp.Check_Status_T(resources, name, "Training Camp", " ", false);
								System.out.println("The Status of the Training Camp is " + status);
							}
							
							else
							{
								System.out.println("Invalid Option.");
							}
							
						}
					}
					
					else if(choice.equals("4"))
					{
						System.out.println("Choose one option to continue:\n" + "1. To view informations about the Team or General Services\n" +
						"2. To view informations about Physical Resources\n" + "3. To view informations about the Partnes");
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("You want to see information from the team[1] or other employees[2]");
							choice = input.nextLine();
							
							if(choice.equals("1"))
							{
								System.out.println("Here is the information about the team: ");
								
								System.out.println("Technician");
								for(int i = 0; i < technicians.size(); i ++)
								{
									name = technicians.get(i).getName();
									email = technicians.get(i).getEmail();
									cpf = technicians.get(i).getCpf();
									telephone = technicians.get(i).getTelephone();
									salary = technicians.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
								System.out.println("");
								System.out.println("Players");
								for(int i = 0; i < players.size(); i ++)
								{
									name = players.get(i).getName();
									type_of_player = players.get(i).getType_of_player();
									email = players.get(i).getEmail();
									status = players.get(i).getStatus();
									cpf = players.get(i).getCpf();
									telephone = players.get(i).getTelephone();
									salary = players.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Type: " + type_of_player);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
									System.out.println("Status: " + status);
											
								}
								
								System.out.println("");
								System.out.println("Physical Trainers");
								for(int i = 0; i < physical_trainers.size(); i ++)
								{
									name = physical_trainers.get(i).getName();
									email = physical_trainers.get(i).getEmail();
									cpf = physical_trainers.get(i).getCpf();
									telephone = physical_trainers.get(i).getTelephone();
									salary = physical_trainers.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
							}
							
							else if(choice.equals("2"))
							{
								System.out.println("Here is the information about the Workers: ");
								
								System.out.println("Presidents");
								for(int i = 0; i < presidents.size(); i ++)
								{
									name = presidents.get(i).getName();
									email = presidents.get(i).getEmail();
									cpf = presidents.get(i).getCpf();
									telephone = presidents.get(i).getTelephone();
									salary = presidents.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
								System.out.println("");
								System.out.println("Medicals");
								for(int i = 0; i < medicals.size(); i ++)
								{
									name = medicals.get(i).getName();
									email = medicals.get(i).getEmail();
									cpf = medicals.get(i).getCpf();
									crm = medicals.get(i).getCrm();
									telephone = medicals.get(i).getTelephone();
									salary = medicals.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("CRM: " + crm);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
								System.out.println("");
								System.out.println("Drivers");
								for(int i = 0; i < drivers.size(); i ++)
								{
									name = drivers.get(i).getName();
									email = drivers.get(i).getEmail();
									cpf = drivers.get(i).getCpf();
									enrollment_number = drivers.get(i).getEnrollment_number();
									telephone = drivers.get(i).getTelephone();
									salary = drivers.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Enrollment Number: " + enrollment_number);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
								System.out.println("");
								System.out.println("Cooks");
								for(int i = 0; i < cooks.size(); i ++)
								{
									name = cooks.get(i).getName();
									email = cooks.get(i).getEmail();
									cpf = cooks.get(i).getCpf();
									telephone = cooks.get(i).getTelephone();
									salary = cooks.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
								System.out.println("");
								System.out.println("Lawyers");
								for(int i = 0; i < lawyers.size(); i ++)
								{
									name = lawyers.get(i).getName();
									email = lawyers.get(i).getEmail();
									cpf = lawyers.get(i).getCpf();
									telephone = lawyers.get(i).getTelephone();
									salary = lawyers.get(i).getSalary();
									
									System.out.println("Name: " + name);
									System.out.println("Email: " + email);
									System.out.println("CPF: " + cpf);
									System.out.println("Telephone: " + telephone);
									System.out.println("Salary: " + salary + "R$");
											
								}
								
							}
							
							else
							{
								System.out.println("Invalid Option!");
							}
						}
						
						else if(choice.equals("2"))
						{
							System.out.println("Here is the Physics Resources");
							
							System.out.println("The Bus");
							for(int i = 0; i < resources.size(); i ++)
							{
								if(resources.get(i).getType().equals("Bus"))
								{
									qtd = resources.get(i).getQtd();
									
									System.out.println("The team have a Total of: " + qtd + " bus");
								}
							}
							
							System.out.println("");
							System.out.println("The Stadium");
							for(int i = 0; i < resources.size(); i ++)
							{
								if(resources.get(i).getType().equals("Stadium"))
								{
									status = resources.get(i).getStatus();
									
									System.out.println("The status of Stadium is: " + status);
								}
							}
							
							System.out.println("");
							System.out.println("The Training Camp");
							for(int i = 0; i < resources.size(); i ++)
							{
								if(resources.get(i).getType().equals("Training Camp"))
								{
									status = resources.get(i).getStatus();
									
									System.out.println("The status of Training Camp is: " + status);
								}
							}
						}
						
						else if(choice.equals("3"))
						{
							int count_t1 = 0, count_t2 = 0, count_general = 0;
							
							System.out.println("Here is the Partnes:");
							for(int i = 0; i < partners.size(); i ++)
							{
								name = partners.get(i).getName();
								email = partners.get(i).getEmail();
								addres = partners.get(i).getAddres();
								status = partners.get(i).getStatus_of_Pay();
								type_of_partner = partners.get(i).getType_of_Partner();
								cpf = partners.get(i).getCpf();
								telephone = partners.get(i).getTelephone();
								
								System.out.println("Name: " + name);
								System.out.println("Addres: " + addres);
								System.out.println("Email: " + email);
								System.out.println("CPF: " + cpf);
								System.out.println("Telephone: " + telephone);
								System.out.println("Type of Partner: " + type_of_partner);
								System.out.println("Status: " + status);
								
								count_general = i;
								
								if(status.equals("Available"))
								{
									count_t1 ++;
								}
								else
								{
									count_t2 ++;
								}
							}
							
							System.out.printf("So we have a Total of %d Partnes, %d are Available and %d are Not Available" + count_general + count_t1 + count_t2);
						}
						
						else
						{
							System.out.println("Invalid Option!");
						}
					}
				}
			}
			
			else
			{
				System.out.println("Invalid Login or Password");
			}
		}

	}

}
