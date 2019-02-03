package Ciweb;
import java.util.*;

public class Homepage
{
	@SuppressWarnings("resource")
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		int day_of_begin;
		int month_of_begin;
		int year_of_begin;
		int day_of_end;
		int month_of_end;
		int year_of_end;
		int number_of_participants;
		int check_teacher;
		int check_project;
		int total;
		int number_of_projects;
		int number_of_publications;
		
		double value;
		
		String title;
		String agency;
		String objective;
		String description;
		String status;
		String member;
		String name;
		String email;
		String type;
		String choice;
		
		ArrayList<Collaborator> collaborators = new ArrayList();
		ArrayList<Research_Project> projects = new ArrayList();
		
		System.out.println("Welcome to the Ciweb");
		
		while(true)
		{
			System.out.println("Please choose an option:\n" + "1. To add a Collaborator on the Lab\n" + "2. To add a Collaborator on a Research Project\n" +
			"3. To add or edit a Research Project\n" + "4. To add an Physical Trainer\n" + "5. To add an Driver\n" +
			"6. To add an Cook\n" + "7. To add an Lawyer\n" + "8. To add an Player\n" + "9. To add an Partner");
			choice = input.nextLine();
			
			if(choice.equals("1"))
			{
				System.out.println("Please gimme the Name, the Email and the Type(Teacher, Undergraduate Students, Master's Students, Doctoral Students or Researchers) of Collaborator");
				name = input.nextLine();
				email = input.nextLine();
				type = input.nextLine();
				
				Collaborator.Add_Collaborator(collaborators, 0, 0, name, email, type);
				System.out.println("New Collaborator add on the Lab with Success!");
			}
			
			else if(choice.equals("2"))
			{
				System.out.println("Enter the name of the search project in which you want to add a new entrant");
				title = input.nextLine();
				
				check_project = Research_Project.Search_Project(projects, title, false);
				
				if(check_project == 1)
				{
					System.out.println("Enter the name and type of Collaborator you want to add to this project");
					name = input.nextLine();
					type = input.nextLine();
					
					for(int i = 0; i < collaborators.size(); i ++)
					{
						if(collaborators.get(i).getName().equals(name) && collaborators.get(i).getType().equals(type))
						{
							
							break;
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
					value = input.nextDouble();
					day_of_begin = input.nextInt();
					month_of_begin = input.nextInt();
					year_of_begin = input.nextInt();
					day_of_end = input.nextInt();
					month_of_end = input.nextInt();
					year_of_end = input.nextInt();
					input.nextLine();
					
					check_teacher = Collaborator.Search_Teacher(collaborators, member, "Teacher", false);
					
					if(check_teacher == 1)
					{
						Research_Project.Add_Research_Project(projects, day_of_begin, month_of_begin, year_of_begin, day_of_end, month_of_end, year_of_end, value, title, agency, objective, description, "In Preparation", member);
						System.out.println("New Project add with Success!");
					}
				}
			}
		}
	}

}
