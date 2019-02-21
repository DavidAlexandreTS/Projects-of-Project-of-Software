package Ciweb;

import java.util.ArrayList;
import java.util.Scanner;

public class Collaborator
{
	static Scanner input = new Scanner(System.in);
	
	private int total;
	private int number_of_projects;
	private int number_of_publications;
	
	private String name;
	private String email;
	private String type;
	private String name_of_project;
	
	String[] academic_record = new String[number_of_publications];
	String[] projects_in = new String[100];
	
	@SuppressWarnings("unchecked")
	ArrayList<Research_Project> projects = new ArrayList(number_of_projects);
	@SuppressWarnings("unchecked")
	ArrayList<Collaborator> orienting = new ArrayList();
	@SuppressWarnings("unchecked")
	ArrayList<Collaborator> colllaborators_on_this_project = new ArrayList();
	
	public int getTotal()
	{
		return total;
	}
	
	public void setTotal(int total)
	{
		this.total = total;
	}
	
	public int getNumber_of_projects()
	{
		return number_of_projects;
	}
	
	public void setNumber_of_projects(int number_of_projects)
	{
		this.number_of_projects = number_of_projects;
	}
	
	public int getNumber_of_publications()
	{
		return number_of_publications;
	}
	
	public void setNumber_of_publications(int number_of_publications)
	{
		this.number_of_publications = number_of_publications;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getName_of_project()
	{
		return name_of_project;
	}

	public void setName_of_project(String name_of_project)
	{
		this.name_of_project = name_of_project;
	}
	
	public String[] getAcademic_record()
	{
		return academic_record;
	}
	
	public void setAcademic_record(String[] academic_record)
	{
		this.academic_record = academic_record;
	}
	
	public ArrayList<Research_Project> getProjects()
	{
		return projects;
	}
	
	public void setProjects(ArrayList<Research_Project> projects)
	{
		this.projects = projects;
	}
	
	public ArrayList<Collaborator> getOrienting()
	{
		return orienting;
	}
	
	public void setOrienting(ArrayList<Collaborator> orienting)
	{
		this.orienting = orienting;
	}
	
	public String[] getProjects_in()
	{
		return projects_in;
	}

	public void setProjects_in(String[] projects_in)
	{
		this.projects_in = projects_in;
	}

	public static void Add_Collaborator(ArrayList<Collaborator> collaborators, String[] projects_in, int number_of_projects, int number_of_publications, String name, String email, String type, String name_of_project)
	{
		Collaborator collaborator = new Collaborator();
		collaborator.setProjects_in(projects_in);
		collaborator.setNumber_of_projects(number_of_projects);
		collaborator.setNumber_of_publications(number_of_publications);
		collaborator.setName(name);
		collaborator.setEmail(email);
		collaborator.setType(type);
		collaborator.setName_of_project(name_of_project);
		collaborators.add(collaborator);

	}
	
	public static void Add_Collaborators_on(ArrayList<Collaborator> collaborators_on_pro, String name, String email, String type)
	{
		Collaborator collaborator = new Collaborator();
		collaborator.setName(name);
		collaborator.setEmail(email);
		collaborator.setType(type);
		collaborators_on_pro.add(collaborator);

		}
	
	public static void Add_Orienting(ArrayList<Collaborator> orientings, String ori_name, String type_ori, String teacher_responsable)
	{
		Collaborator orienting = new Collaborator();
		
		orienting.setName(ori_name);
		orienting.setType(type_ori);
		orientings.add(orienting);
		System.out.println("New orienting add with success!");
	}
	
	public static int Search_Teacher(ArrayList<Collaborator> collaborators, String name, String type, boolean found)
	{
		for(int i =0; i < collaborators.size(); i ++)
		{
			if(collaborators.get(i).getName().equals(name) && collaborators.get(i).getType().equals("Teacher"))
			{
				found = true;
				break;
				
			}
		}
		
		if(found)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static int Search_Collaborator(ArrayList<Collaborator> collaborators, String name, String type, boolean found)
	{
		for(int i = 0; i < collaborators.size(); i ++)
		{
			if(collaborators.get(i).getName().equals(name) && collaborators.get(i).getType().equals(type))
			{
				found = true;
				break;
			}
		}
		
		if(found)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static int Number_of_Projects(ArrayList<Collaborator> collaborators, int number_of_projects, String name, String type, boolean found)
	{
		for(int i = 0; i < collaborators.size(); i ++)
		{
			if(collaborators.get(i).getName().equals(name) && collaborators.get(i).getType().equals(type))
			{
				found = true;
				number_of_projects = collaborators.get(i).getNumber_of_projects();
				break;
			}
		}
		
		if(found)
		{
			return number_of_projects;
		}
		else
		{
			return 0;
		}
	}
	
	public static void Show_Informations_Collaborator(ArrayList<Collaborator> collaborators, ArrayList<Publication> publications, String[] projects_in, int number_of_projects, int number_of_publications, String name, String email, String type, String title)
	{
		for(int i = 0; i < collaborators.size(); i ++)
		{
			if(collaborators.get(i).getName().equals(name))
			{
				number_of_projects = collaborators.get(i).getNumber_of_projects();
				number_of_publications = collaborators.get(i).getNumber_of_publications();
				email = collaborators.get(i).getEmail();
				type = collaborators.get(i).getType();
				break;
			}
		}
		
		System.out.println("Here is the information about " + name + ": ");
		System.out.println("Ocupation: " + type);
		System.out.println("Email: " + email);
		System.out.println("Associated in " + number_of_projects + " projects");
		System.out.println("Have " + number_of_publications + " publications");
		
	}
}