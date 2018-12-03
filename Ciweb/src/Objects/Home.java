package Objects;

import java.util.ArrayList;
import java.util.Scanner;
import Functionalities.AddStudent;
import Functionalities.AddTeacher;
import Functionalities.AddResearcher;;

public class Home
{
	public static void main(String args [])
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		ArrayList<Researcher> researcher = new ArrayList<Researcher>();
		ArrayList<Projects> pro = new ArrayList<Projects>();
		ArrayList<String> guiding = new ArrayList<String>();

		String name, type, advisor;
		String name_T, orienting_name;
		String name_R;
		String choice, typeofcol;
		int ids = 0, idt = 0, idr = 0;
		
		System.out.println("Welcome to Ciweb, your Academic System");
		while(true)
		{
			System.out.println(	"1. To add a Collaborator\n" +
								"2. To add a Research Project\n" +
								"3. To edit a Reseach Project\n" +
								"4. To add or change a search project status\n" +
								"5. To add a post\n" +
								"6. To consult by collaborator\n" +
								"7. To Generate report\n");
			choice = input.nextLine();
			
			if(choice.equals("1"))
			{
				System.out.println("Is the Contributor you want to add a Student, Teacher or Researcher?");
				
				while(true)
				{
					typeofcol = input.nextLine();
					if(typeofcol.equals("Student"))
					{
						System.out.println("Gimme the Name, the Type of Student(undergraduate student, master's student or doctoral student) and the Name of Advisor(if he has, if dont digit 'Not')");
						name = input.nextLine();
						type = input.nextLine();
						advisor = input.nextLine();
						
						if(advisor.equals("Not"))
						{
							AddStudent.AddaStudent(student, name, type, " ", ids);
							ids ++;
							System.out.println("New Student successfully registered!");
							break;
						}
						AddStudent.AddaStudent(student, name, type, advisor, ids);
						ids ++;
						System.out.println("New Contributor successfully registered!");
						break;
						
					}else if(typeofcol.equals("Teacher"))
					{
						System.out.println("Enter the name and the name of a targeting (if it does not have a targeting, type 'No')");
						name_T = input.nextLine();
						orienting_name = input.nextLine();
						
						if(orienting_name.equals("No"))
						{
							AddTeacher.AddaTeacher(teacher, guiding, name_T, orienting_name, idt);
							break;
						}else
						{
							AddTeacher.AddaTeacher(teacher, guiding, name_T, orienting_name, idt);
							break;
						}
						
					}else if(typeofcol.equals("Researcher"))
					{
						System.out.println("What is the name of the Researcher you want add?");
						name_R = input.nextLine();
						AddResearcher.AddaResearcher(researcher, name_R, idr);
						idr ++;
						System.out.println("New Contributor successfully registered!");
					}else
					{
						System.out.println("This type of contributor does not exist, please try again...");
					}
				}		
			}else if(choice.equals("2"))
			{
				
			}else if(choice.equals("3"))
			{
				
			}else if(choice.equals("4"))
			{
				
			}else if(choice.equals("5"))
			{
				
			}else if(choice.equals("6"))
			{
				
			}else if(choice.equals("7"))
			{
				
			}
		}
	}
	
}
