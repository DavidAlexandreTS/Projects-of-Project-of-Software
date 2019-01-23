package Objects;

import java.util.ArrayList;
import java.util.Scanner;
import Functionalities.AddCollaborator;
import Functionalities.AddProject;
import Functionalities.AddPublication;

public class Home
{
	public static void main(String args [])
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ArrayList<Collaborator> col = new ArrayList<Collaborator>();
		ArrayList<Projects> pro = new ArrayList<Projects>();
		ArrayList<Publications> pubs = new ArrayList<Publications>();

		String name, type = null, advisor, guiding, titlepro;
		String colname, title, startday, enddate, fundingagency, financedamount, objective, description, status;
		String title_P, nameofconference, yearofpublication, projectasso;
		String choice, typeofcol, estat = "0";
		int ids = 0, idp = 0, numberofpub = 0;
		
		System.out.println("Welcome to Ciweb, your Academic System. Type it: ");
		
		while(true)
		{
			
			System.out.println(	"1. To add a Research Project\n" +
								"2. To add a Collaborator\n" +
								"3. To edit a Reseach Project\n" +
								"4. To change a search project status\n" +
								"5. To add a post\n" +
								"6. To consult by Collaborator\n" +
								"7. To Generate report\n");
			choice = input.nextLine();
			
			if(choice.equals("1"))
			{
				
				while(true)
				{
					
					System.out.println("To add a research project you need to be a teacher. Please enter your name");
					colname = input.nextLine();
					
					for(int i = 0; i < col.size(); i ++)
					{
						if(col.get(i).getName().equals(colname))
						{
							estat = "1";
							type = col.get(i).getType();
							break;
						}
					}
					
					if(estat.equals("1") && type.equals("Teacher"))
					{
						System.out.println("OK. Now enter the project title, start day, completion day, funding agency, amount of funding, objective and description");
						title = input.nextLine();
						startday = input.nextLine();
						enddate = input.nextLine();
						fundingagency = input.nextLine();
						financedamount = input.nextLine();
						objective = input.nextLine();
						description = input.nextLine();
						AddProject.AddaProject(pro, colname, title, startday, enddate, fundingagency, financedamount, objective, description, "Em Elaboracao", idp, numberofpub);
						idp ++;
						System.out.println("New Project successfully registered!");
						break;
					}
					
					else
					{
						System.out.println("Collaborator not Found. Do you want add a Teacher to create a Project?(Enter 1 for Yes or 0 for Not)?");
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("Gimme the Name of Teacher");
							name = input.nextLine();
							type = "Teacher";
							AddCollaborator.AddaCollaborator(col, name, type, " ", " ", " ", ids);
							ids ++;
							System.out.println("New Contributor successfully registered!");
							break;
						}
						
					}
				}
				
			}
			
			else if(choice.equals("2"))
			{
				System.out.println("Is the Contributor you want to add a Student, Teacher or Researcher?");

				while(true)
				{
					
					typeofcol = input.nextLine();
					if(typeofcol.equals("Student"))
					{
						System.out.println("To add it to some project, press 1. To just include it in the lab, type 2");
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("Gimme the Name, the Type of Student(undergraduate student, master's student or doctoral student), the Name of Advisor(if he has, if dont digit 'Not') and the Title of Project");
							name = input.nextLine();
							type = input.nextLine();
							advisor = input.nextLine();
							titlepro = input.nextLine();
							estat = "0";
							
							for(int i = 0; i < pro.size(); i ++)
							{
								if(pro.get(i).getTitle().equals(titlepro))
								{
									estat = "1";
									break;
								}
							}
							
							if(estat.equals("1"))
							{
								
								if(advisor.equals("Not"))
								{
									AddCollaborator.AddaCollaborator(col, name, type, " ", " ", titlepro, ids);
									ids ++;
									System.out.println("New Contributor successfully registered!");
									break;
								}
								
								else
								{
									estat = "0";
									for(int i = 0; i < col.size(); i ++)
									{
										if(col.get(i).getName().equals(advisor) && col.get(i).getType().equals("Teacher"))
										{
											estat = "1";
											break;
										}
									}
									
									if(estat.equals("1"))
									{
										AddCollaborator.AddaCollaborator(col, name, type, advisor, " ", titlepro, ids);
										ids ++;
										System.out.println("New Contributor successfully registered!");
										break;
									}
									
									else
									{
										System.out.println("The advisor need to be a Collaborator and Teacher!");
									}
									
								}
								
							}
							
							else
							{
								System.out.println("Project not Found, try again later.");
							}
							
							
						}
						
						else
						{
							System.out.println("Gimme the Name, the Type of Student(undergraduate student, master's student or doctoral student) and the Name of Advisor(if he has, if dont digit 'Not')");
							name = input.nextLine();
							type = input.nextLine();
							advisor = input.nextLine();
							
							if(advisor.equals("Not"))
							{
								AddCollaborator.AddaCollaborator(col, name, type, " ", " ", " ", ids);
								ids ++;
								System.out.println("New Contributor successfully registered!");
								break;
							}
							
							else
							{
								AddCollaborator.AddaCollaborator(col, name, type, advisor, " ", " ", ids);
								ids ++;
								System.out.println("New Contributor successfully registered!");
								break;
							}
						}
						
					}
					
					else if(typeofcol.equals("Teacher"))
					{
						
						System.out.println("If you want to add a teacher only to the lab press 1, but if you want to add a project to the project press 2");
						choice = input.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("Gimme the Name of Teacher and the name of Guiding(if he has, if dont digit 'Not')");
							name = input.nextLine();
							type = "Teacher";
							guiding = input.nextLine();
							
							if(guiding.equals("Not"))
							{
								AddCollaborator.AddaCollaborator(col, name, type, " ", " ", " ", ids);
								ids ++;
								System.out.println("New Contributor successfully registered!");
								break;
							}
							
							else
							{
								estat = "0";
								for(int i = 0; i < col.size(); i ++)
								{
									if(col.get(i).getName().equals(guiding) && col.get(i).getType().equals("Student"))
									{
										estat = "1";
										break;
									}
								}
								
								if(estat.equals("1"))
								{
									AddCollaborator.AddaCollaborator(col, name, type, " ", guiding, " ", ids);
									ids ++;
									System.out.println("New Contributor successfully registered!");
									break;
								}
								
								else
								{
									System.out.println("Guiding not found...");
									break;
								}
								
							}
							
							
						}
						
						else if(choice.equals("2"))
						{
							
							System.out.println("Gimme the Name of Teacher, the name of Guiding(if he has, if dont digit 'Not') and the title of Project");
							name = input.nextLine();
							type = "Teacher";
							guiding = input.nextLine();
							titlepro = input.nextLine();
							estat = "0";
							
							for(int i = 0; i < pro.size(); i ++)
							{
								if(pro.get(i).getTitle().equals(titlepro))
								{
									estat = "1";
									break;
								}
							}
							
							if(estat.equals("1"))
							{
								
								if(guiding.equals("Not"))
								{
									AddCollaborator.AddaCollaborator(col, name, type, " ", " ", titlepro, ids);
									ids ++;
									System.out.println("New Contributor successfully registered!");
									break;
								}
								
								else
								{
									AddCollaborator.AddaCollaborator(col, name, type, " ", guiding, titlepro, ids);
									ids ++;
									System.out.println("New Contributor successfully registered!");
									break;
								}
								
							}
							
							else
							{
								System.out.println("Project not Found, try again later.");
							}
							
							
						}
						
						else
						{
							System.out.println("Plz, enter 1 or 2");
						}
							
					}
					
					else if(typeofcol.equals("Researcher"))
					{
						
						System.out.println("Gimme the Name of Reseacher and the title of Project");
						name = input.nextLine();
						type = "Researcher";
						titlepro = input.nextLine();
						estat = "0";
						
						for(int i = 0; i < pro.size(); i ++)
						{
							if(pro.get(i).getTitle().equals(titlepro))
							{
								estat = "1";
								break;
							}
						}
						
						if(estat.equals("1"))
						{
							AddCollaborator.AddaCollaborator(col, name, type, " ", " ", titlepro, ids);
							ids ++;
							System.out.println("New Contributor successfully registered!");
							break;
						}
						
						else
						{
							System.out.println("Project not Found");
						}
						
					}
					
					else
					{
						System.out.println("This type of contributor does not exist, please try again...");
					}
				}
			}
			
			else if(choice.equals("3"))
			{
				System.out.println("To Edit a Project Digit his Title");
				title = input.nextLine();
				int res = 0;
				estat = "0";
				
				for(int i = 0; i < pro.size(); i ++)
				{
					if(pro.get(i).getTitle().equals(title))
					{
						res = pro.get(i).getIdp();
						estat = "1";
						break;
					}
				}
				
				if(estat.equals("1"))
				{
					System.out.println("Ok, enter the Atribute do you want change in Project(Title, Startday, Enddate, Agency, Finance, Objective or Description)");
					choice = input.nextLine();
					
					if(choice.equals("Title"))
					{
						System.out.println("Digit the new Title");
						title = input.nextLine();
						pro.get(res).setTitle(title);
						System.out.println("Title changed with success!");
					}
					
					else if(choice.equals("Startday"))
					{
						System.out.println("Digit the new Startday");
						startday = input.nextLine();
						pro.get(res).setStartday(startday);
						System.out.println("Startday changed with success!");
					}
					
					else if(choice.equals("Enddate"))
					{
						System.out.println("Digit the new Enddate");
						enddate = input.nextLine();
						pro.get(res).setEnddate(enddate);
						System.out.println("Enddate changed with success!");
					}
					
					else if(choice.equals("Agency"))
					{
						System.out.println("Digit the new Agency");
						fundingagency = input.nextLine();
						pro.get(res).setFundingagency(fundingagency);
						System.out.println("Agency changed with success!");
					}
					
					else if(choice.equals("Finance"))
					{
						System.out.println("Digit the new Finance Value");
						financedamount = input.nextLine();
						pro.get(res).setFinancedamount(financedamount);
						System.out.println("Finance Value changed with success!");
					}
					
					else if(choice.equals("Objective"))
					{
						System.out.println("Digit the new Objective");
						objective = input.nextLine();
						pro.get(res).setObjective(objective);
						System.out.println("Objective changed with success!");
					}
					
					else if(choice.equals("Description"))
					{
						System.out.println("Digit the new Description");
						description = input.nextLine();
						pro.get(res).setDescription(description);
						System.out.println("Description changed with success!");
					}
					
					else
					{
						System.out.println("This atribut dont exist");
					}
					
				}else
				{
					System.out.println("This Project dont exist");
				}
			}
			
			else if(choice.equals("4"))
			{
				System.out.println("To change a status from a Project, Digit his Title");
				title = input.nextLine();
				int res = 0;
				estat = "0";
				
				for(int i = 0; i < pro.size(); i ++)
				{
					if(pro.get(i).getTitle().equals(title))
					{
						res = pro.get(i).getIdp();
						estat = "1";
						break;
					}
				}
				
				if(estat.equals("1"))
				{
					System.out.println("Ok, enter the status that you want to place your project");
					status = input.nextLine();
					
					if(status.equals("Concluido"))
					{
						
					}else
					{
						pro.get(res).setStatus(status);
					}	
					
				}else
				{
					System.out.println("This Project dont exist");
				}
			}else if(choice.equals("5"))
			{
				System.out.println("To Add a publication to a Project Digit his Title");
				title = input.nextLine();
				@SuppressWarnings("unused")
				int res = 0;
				estat = "0";
				
				for(int i = 0; i < pro.size(); i ++)
				{
					if(pro.get(i).getTitle().equals(title) && pro.get(i).getStatus().equals("Em andamento"))
					{
						res = pro.get(i).getIdp();
						estat = "1";
						break;
					}
				}
				
				if(estat.equals("1"))
				{
					System.out.println("Ok, now enter the Title of Publication, the conference that was presented and the Year of publication");
					title_P = input.nextLine();
					nameofconference = input.nextLine();
					yearofpublication = input.nextLine();
					AddPublication.AddaPublication(pubs, title_P, nameofconference, yearofpublication, title);
					
				}else
				{
					System.out.println("This Project dont exist");
				}
			}else if(choice.equals("6"))
			{
				
			}else if(choice.equals("7"))
			{
				
			}
		}
	}
	
}
