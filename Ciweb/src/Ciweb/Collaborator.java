package Ciweb;

import java.util.ArrayList;

public class Collaborator
{
	private int total;
	private int number_of_projects;
	private int number_of_publications;
	
	private String name;
	private String email;
	private String type;
	
	String[] academic_record = new String[number_of_publications];
	ArrayList<Research_Project> projects = new ArrayList(number_of_projects);
	ArrayList<Collaborator> orienting = new ArrayList();
	
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
	
	public static void Add_Collaborator(ArrayList<Collaborator> collaborators, int number_of_projects, int number_of_publications, String name, String email, String type)
	{
		Collaborator collaborator = new Collaborator();
		collaborator.setNumber_of_projects(number_of_projects);
		collaborator.setNumber_of_publications(number_of_publications);
		collaborator.setName(name);
		collaborator.setEmail(email);
		collaborator.setType(type);
		collaborators.add(collaborator);
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
}