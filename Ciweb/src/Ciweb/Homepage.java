package Ciweb;
import java.util.*;

public class Homepage
{
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		int day_of_begin = 0;
		int month_of_begin = 0;
		int year_of_begin = 0;
		int day_of_end = 0;
		int month_of_end = 0;
		int year_of_end = 0;
		int check_collaborator;
		int check_teacher;
		int check_project;
		int number_of_projects = 0;
		int number_of_publications;
		int total_points = 0;
		int number_of_authors = 0;
		int year_of_publication = 0;
		int total_of_collaborators = 0;
		int projects_in_preparation = 0;
		int projects_in_progress = 0;
		int projects_done = 0;
		int total_of_projects = 0;
		int number_of_orienting = 0;
		int number_of_pub = 0;
		int number_of_ori = 0;
		
		double value = 0;
		
		String title;
		String agency;
		String objective;
		String description;
		String status;
		String member;
		String name;
		String email = null;
		String type;
		String choice;
		String title_aux;
		String name_of_conference;
		String name_of_orienting;
		String type_of_orienting;
		
		@SuppressWarnings("rawtypes")
		ArrayList<Collaborator> collaborators = new ArrayList();
		@SuppressWarnings("rawtypes")
		ArrayList<Research_Project> projects = new ArrayList();
		@SuppressWarnings("rawtypes")
		ArrayList<Publication> publications = new ArrayList();
		@SuppressWarnings("rawtypes")
		ArrayList<Collaborator> orientings = new ArrayList();
		
		
		System.out.println("Welcome to the Ciweb");
		
		while(true)
		{
			System.out.println("Please choose an option:\n" + "1. To add a Collaborator on the Lab\n" + "2. To add a Collaborator on a Research Project\n" +
			"3. To add a New Research Project or edit a Status from the Research Project\n" + "4. To add a publication\n" + "5. To view Collaborator informations\n" +
			"6. To view Project informations\n" + "7. To Generate an Report");
			choice = input.nextLine();
			
			if(choice.equals("1"))
			{
				while(true)
				{
					System.out.println("Please gimme the Name, the Email and the Type(Teacher, Undergraduate Students, Master's Students, Doctoral Students or Researchers) of Collaborator");
					name = input.nextLine();
					email = input.nextLine();
					type = input.nextLine();
					int aux = 0;
					
					for(int i = 0; i < collaborators.size(); i ++)
					{
						if(collaborators.get(i).getName().equals(name) && collaborators.get(i).getEmail().equals(email) && collaborators.get(i).getType().equals(type))
						{
							System.out.println("That person is already in the lab. Please, try add another");
							aux = 1;
							break;
							
						}
					}
					
					if(aux == 1)
					{
						continue;
					}
					else
					{
						break;
					}
				}
				
				String[] projects_in = new String[100];
				projects_in[0] = " ";
				
				if(type.equals("Teacher"))
				{
					System.out.println("Do you wanna add some orienting for this teacher(type 1 to yes or 0 for no)?");
					choice = input.nextLine();
					
					if(choice.equals("1"))
					{
						System.out.println("How many orientings do you wish add?");
						number_of_orienting = input.nextInt();
						input.nextLine();
						
						for(int i = 0; i < number_of_orienting; i = i)
						{
							check_collaborator = 0;
							
							System.out.println("Gimme the name and the ocupation of this orienting");
							name_of_orienting = input.nextLine();
							type_of_orienting = input.nextLine();
							
							check_collaborator = Collaborator.Search_Collaborator(collaborators, name_of_orienting, type_of_orienting, false);
							
							if(check_collaborator == 1 && type_of_orienting != "Teacher")
							{
								Collaborator.Add_Orienting(orientings, name_of_orienting, type_of_orienting, name);
								i ++;
								number_of_ori ++;
							}
							
							else
							{
								System.out.println("Invalid name or type or orienting, please try again!");
							}
						}
						
						Collaborator.Add_Collaborator(collaborators, projects_in, 0, 0, name, email, type, "");
						System.out.println("New Collaborator add on the Lab with Success!");
						total_of_collaborators ++;
					}
					
					else if(choice.equals("0"))
					{
						Collaborator.Add_Collaborator(collaborators, projects_in, 0, 0, name, email, type, "");
						System.out.println("New Collaborator add on the Lab with Success!");
						total_of_collaborators ++;
					}
					
					else
					{
						System.out.println("Invalid Option, try again latter.");
					}
				}
				
				else
				{
					Collaborator.Add_Collaborator(collaborators, projects_in, 0, 0, name, email, type, "");
					System.out.println("New Collaborator add on the Lab with Success!");
					total_of_collaborators ++;
				}
				
			}
			
			else if(choice.equals("2"))
			{
				System.out.println("Enter the name of the search project in which you want to add a new entrant");
				title = input.nextLine();
				
				check_project = Research_Project.Search_Project(projects, title, false);
				
				if(check_project == 1)
				{
					System.out.println("Enter the name, email and type of the Collaborator you want to add to this project(Remember that you can only add people from the lab");
					name = input.nextLine();
					email = input.nextLine();
					type = input.nextLine();
					
					check_collaborator = Collaborator.Search_Collaborator(collaborators, name, type, false);
					status = Research_Project.Check_Status(projects, title, " ", false);
					String[] projects_in = new String[100];
					
					if(check_collaborator == 1 && status.equals("In Preparation"))
					{
						number_of_projects = Collaborator.Number_of_Projects(collaborators, 0, name, type, false);
						
						if(type.equals("Undergraduate Students"))
						{
							
							if(number_of_projects > 2 && type.equals( "In Progress"))
							{
								System.out.println("This student can not participate in more than 2 projects");
							}
							else
							{
								for(int i = 0; i <= number_of_projects; i ++)
								{
									if(projects_in[i] != " ")
									{
										projects_in[i] = " ";
									}
								}
								
								for(int i = 0; i <= number_of_projects; i ++)
								{
									if(projects_in[i] == " ")
									{
										projects_in[i] = title;
									}
								}
								
								Collaborator.Add_Collaborator(collaborators, projects_in, number_of_projects ++, 0, name, email, type, title);
								System.out.println("New Collaborator Add with success on " + title + "!");
							}
						}
						
						else
						{
							
							Collaborator.Add_Collaborator(collaborators, projects_in, number_of_projects ++, 0, name, email, type, title);
							System.out.println("New Collaborator Add with success on " + title + "!");
						}
						
					}
				}
				
				else
				{
					System.out.println("Project not found, try again later");
				}
			}
			
			else if(choice.equals("3"))
			{
				System.out.println("Okay, now type 1 to add a New Research Project or 2 for edit one");
				choice = input.nextLine();
				
				if(choice.equals("1"))
				{
					System.out.println("Now type for me the Title of Project, the Teacher Responsible, Objective, Description, Agency Funder, the Financed amount, the date of begin(d/m/y) and date of end(d/m/y)");
					title = input.nextLine();
					member = input.nextLine();
					objective = input.nextLine();
					description = input.nextLine();
					agency = input.nextLine();
					
					try
					{
						value = input.nextDouble();
						day_of_begin = input.nextInt();
						month_of_begin = input.nextInt();
						year_of_begin = input.nextInt();
						day_of_end = input.nextInt();
						month_of_end = input.nextInt();
						year_of_end = input.nextInt();
						input.nextLine();
						
						if((day_of_begin < 0 || day_of_begin > 31) || (month_of_begin < 0 || month_of_begin > 12) || (day_of_end < 0 || day_of_end > 31) || (month_of_end < 0 || month_of_end > 12))
						{
							System.out.println("You need to add correct data about the date! Please type enter and try again after");
							input.nextLine();
						}
						
						else
						{
							check_teacher = Collaborator.Search_Teacher(collaborators, member, "Teacher", false);
							
							if(check_teacher == 1)
							{
								for(int i = 0; i < collaborators.size(); i ++)
								{
									if(collaborators.get(i).getName().equals(member) && collaborators.get(i).getType().equals("Teacher"))
									{
										email = collaborators.get(i).getEmail();
										number_of_projects = collaborators.get(i).getNumber_of_projects();
										break;
									}
								}
								
								String[] projects_in = new String[100];
								Collaborator.Add_Collaborator(collaborators, projects_in, number_of_projects ++, 0, member, email, "Teacher", title);
								Research_Project.Add_Research_Project(projects, day_of_begin, month_of_begin, year_of_begin, day_of_end, month_of_end, year_of_end, 0, value, title, agency, objective, description, "In Preparation", member);
								System.out.println("New Project add with Success!");
								projects_in_preparation ++;
							}
							else
							{
								System.out.println("Sorry we cannot find that Teacher, try again after");
							}
						}
						
					}
					catch(InputMismatchException exception)
					{
						System.out.println("You must enter a number, please try again later");
						input.nextLine();
					}
					
					
					
				}
				
				else if(choice.equals("2"))
				{
					System.out.println("Please enter the Title of Project");
					title = input.nextLine();
					total_points = 0;
					
					for(int i = 0; i < projects.size(); i ++)
					{
						if(projects.get(i).getTitle().equals(title))
						{
							status = projects.get(i).getStatus();
							objective = projects.get(i).getObjective();
							description = projects.get(i).getDescription();
							agency = projects.get(i).getAgency();
							value = projects.get(i).getValue();
							day_of_begin = projects.get(i).getDay_of_begin();
							month_of_begin = projects.get(i).getMonth_of_begin();
							year_of_begin = projects.get(i).getYear_of_begin();
							day_of_end = projects.get(i).getDay_of_end();
							month_of_end = projects.get(i).getMonth_of_end();
							year_of_end = projects.get(i).getYear_of_end();
							
							if((day_of_begin != 0 && month_of_begin != 0 && year_of_begin != 0) && (day_of_end != 0 && month_of_end != 0 && year_of_end != 0 && value != 0))
							{
								total_points ++;
							}
							
							if(title != "" && status != "" && agency != "" && objective != "" && description != "")
							{
								total_points ++;
							}
							break;
							
						}
					}
					
					if(total_points == 2)
					{
						System.out.println("Do you want alter the Status of Research Project to In Progress(type 1 for it) or for Completed(2)?");
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							for(int i = 0; i < projects.size(); i ++)
							{
								if(projects.get(i).getTitle().equals(title))
								{
									projects.get(i).setStatus("In Progress");
									System.out.println("Status Alter with Success!");
									projects_in_preparation --;
									projects_in_progress ++;
									break;
									
								}
							}
						}
						
						else if(choice.equals("2"))
						{
							number_of_publications = Research_Project.Check_Quantity_of_Publications(projects, title, 0, false);
							status = Research_Project.Check_Status(projects, title, "", false);
							
							if(number_of_publications > 0 && status.equals("In Progress"))
							{
								for(int i = 0; i < projects.size(); i ++)
								{
									if(projects.get(i).getTitle().equals(title))
									{
										projects.get(i).setStatus("Completed");
										System.out.println("Status Alter with Success!");
										projects_in_progress --;
										projects_done ++;
										break;
										
									}
								}
							}
							
						}
						
						else
						{
							System.out.println("Invalid Option, try again after");
						}
					}
					
					else
					{
						System.out.println("This Project cannot be alter status cause his incomplete!");
					}
				}
			}
			
			else if(choice.equals("4"))
			{
				System.out.println("To continue type 1 for add a publication in a Research Project or 0 to just add a publication");
				choice = input.nextLine();
				
				if(choice.equals("1"))
				{
					System.out.println("Gimme the name of the search project you want to add the publication");
					title_aux = input.nextLine();
					check_project = Research_Project.Search_Project(projects, title_aux, false);
					status = Research_Project.Check_Status(projects, title_aux, "", false);
					number_of_publications = Research_Project.Check_Quantity_of_Publications(projects, title_aux, 0, false);
				
					if(check_project == 1 && status.equals("In Progress"))
					{
						try
						{
							System.out.println("How many authors this publication has?");
							number_of_authors = input.nextInt();
							input.nextLine();
							String[] authors = new String[number_of_authors];
							
							System.out.println("Now enter your names please");
							for(int i = 0; i < number_of_authors; i = i)
							{
								name = input.nextLine();
								for(int j = 0; j < collaborators.size(); j ++)
								{
									if(collaborators.get(j).getName().equals(name))
									{
										authors[i] = name;
										i ++;
										break;
									}
								}
							}
							
							System.out.println("Now gimme the Title, Name of conference and the year of publication");
							title = input.nextLine();
							name_of_conference = input.nextLine();
							year_of_publication = input.nextInt();
							input.nextLine();
							
							Publication.Add_Publication(publications, authors, title, title_aux, name_of_conference, number_of_authors, year_of_publication);
							number_of_pub ++;
							
							for(int i = 0; i < projects.size(); i ++)
							{
								if(projects.get(i).getTitle().equals(title_aux))
								{
									projects.get(i).setNumber_of_publications(number_of_publications++);
								}
							}
						}
						catch(IndexOutOfBoundsException exception)
						{
							System.out.println("This person dont pertence of the lab or you are trying to add more authors than allowed!");
						}
						catch(InputMismatchException exception)
						{
							System.out.println("Please enter a number in the next time!");
						}
						
					}
					
					else
					{
						System.out.println("Project not found!");
					}
					
				}
				
				else if(choice.equals("0"))
				{
					try 
					{
						System.out.println("How many authors this publication has?");
						number_of_authors = input.nextInt();
						input.nextLine();
						String[] authors = new String[number_of_authors];
						
						System.out.println("Now enter your names please");
						for(int i = 0; i < number_of_authors; i = i)
						{
							name = input.nextLine();
							
							if(collaborators.get(i).getName().equals(name))
							{
								authors[i] = name;
								i ++;
							}
							else
							{
								System.out.println("Invalid name, try again");
							}
							
						}
						
						System.out.println("Now gimme the Title, Name of conference and the year of publication");
						title = input.nextLine();
						name_of_conference = input.nextLine();
						year_of_publication = input.nextInt();
						input.nextLine();
						
						Publication.Add_Publication(publications, authors, title, "", name_of_conference, number_of_authors, year_of_publication);
						number_of_pub ++;
					}
					catch(IndexOutOfBoundsException exception)
					{
						System.out.println("This person dont pertence of the lab or you are trying to add more authors than allowed!");
					}
					catch(InputMismatchException exception)
					{
						System.out.println("Please digit a number in the next time!");
					}
					
				}
				
				else
				{
					System.out.println("Invalid Option");
				}
				
			}
			
			else if(choice.equals("5"))
			{
				System.out.println("Enter the name of Collaborator");
				name = input.nextLine();
				String[] projects_in = new String[100];
				Collaborator.Show_Informations_Collaborator(collaborators, publications, projects_in, 0, 0, name, "", "", "");
				
			}
			
			else if(choice.equals("6"))
			{
				@SuppressWarnings("rawtypes")
				ArrayList<Collaborator> collaborators_on_this_project = new ArrayList();
				ArrayList<Publication> pubs_on_this_project = new ArrayList();
				
				System.out.println("Enter the title of Research Project");
				title = input.nextLine();
				
				String aux_name = null;
				
				for(int i = 0; i < projects.size(); i ++)
				{
					if(projects.get(i).getTitle().equals(title))
					{
						aux_name = projects.get(i).getMember();
					}
				}
				
				for(int i = 0; i < 1; i ++)
				{
					Collaborator.Add_Collaborators_on(collaborators_on_this_project, aux_name, "", "Teacher");
				}
				
				for(int i = 1; i < collaborators.size(); i ++)
				{
					if(collaborators.get(i).getName_of_project().equals(title))
					{
						name = collaborators.get(i).getName();
						email = collaborators.get(i).getEmail();
						type = collaborators.get(i).getType();
						
						Collaborator.Add_Collaborators_on(collaborators_on_this_project, name, email, type);
					}
				}
				
				for(int i = 0; i < collaborators_on_this_project.size(); i ++)
				{
					name = collaborators_on_this_project.get(i).getName();
					type = collaborators_on_this_project.get(i).getType();
					
					for(int j = i + 1; j < collaborators_on_this_project.size(); j ++)
					{
						if(collaborators_on_this_project.get(i).getName().equals(name) && collaborators_on_this_project.get(i).getType().equals(type))
						{
							collaborators_on_this_project.remove(i);
							break;
						}
					}
				}
				
				int [] years;
				years = new int[1000];
				
				for(int i = 0; i < publications.size(); i ++)
				{
					if(publications.get(i).getResearch_project_associate().equals(title))
					{
						title_aux = publications.get(i).getTitle();
						year_of_publication = publications.get(i).getYear_of_publication();
						years[i] = year_of_publication;
						Publication.Add_Pub_on(pubs_on_this_project, title_aux, year_of_publication);
					}
				}
				
				Publication.bubblesort(years);
				Research_Project.Show_Informations_Project(projects, 0, 0, 0, 0, 0, 0, 0, 0, title, "", "", "", "", "");
				
				System.out.println("Here is a List of the Collaborators on this Project:");
				for(int i = 0; i < collaborators_on_this_project.size(); i ++)
				{
					name = collaborators_on_this_project.get(i).getName();
					System.out.printf(name + "-> ");
				}
				
				System.out.println();
				System.out.println("Now all publications of this Research Project:");
				for(int i = 0; i < years.length; i ++)
				{
					if(years[i] != 0)
					{
						for(int j = 0; j < pubs_on_this_project.size(); j ++)
						{
							if(years[i] == pubs_on_this_project.get(j).getYear_of_publication())
							{
								title = pubs_on_this_project.get(j).getTitle();
								System.out.printf(title + "-> ");
							}
						}
						
					}
				}
				System.out.println();
				
			}
			
			else if(choice.equals("7"))
			{
				total_of_projects = projects_in_preparation + projects_in_progress + projects_done;
				System.out.println("Currently, we have " +  total_of_collaborators + " Collaborators in the laboratory, in addition, the laboratory has " +
				total_of_projects + " projects, we have " + projects_in_preparation + " in preparation, " + projects_in_progress + " projects in progress and we conclued " + projects_done + ". We also have " + number_of_ori + " students being oriented and " + number_of_pub + " laboratory publications.");
			}
			
			else
			{
				System.out.println("Invalid Option, please try again!");
			}
		}
	}

}
