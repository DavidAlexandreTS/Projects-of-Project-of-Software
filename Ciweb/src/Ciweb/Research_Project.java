package Ciweb;

import java.util.ArrayList;

public class Research_Project
{
	//String title, String agency, String objective, String description, String Status
	private int day_of_begin;
	private int month_of_begin;
	private int year_of_begin;
	private int day_of_end;
	private int month_of_end;
	private int year_of_end;
	private int number_of_participants;
	private int number_of_publications;
	
	private double value;
	
	private String title;
	private String agency;
	private String objective;
	private String description;
	private String status;
	private String member;
	
	ArrayList<Collaborator> participants = new ArrayList();

	public int getDay_of_begin()
	{
		return day_of_begin;
	}

	public void setDay_of_begin(int day_of_begin)
	{
		this.day_of_begin = day_of_begin;
	}

	public int getMonth_of_begin()
	{
		return month_of_begin;
	}

	public void setMonth_of_begin(int month_of_begin)
	{
		this.month_of_begin = month_of_begin;
	}

	public int getYear_of_begin()
	{
		return year_of_begin;
	}

	public void setYear_of_begin(int year_of_begin)
	{
		this.year_of_begin = year_of_begin;
	}

	public int getDay_of_end()
	{
		return day_of_end;
	}

	public void setDay_of_end(int day_of_end)
	{
		this.day_of_end = day_of_end;
	}

	public int getMonth_of_end()
	{
		return month_of_end;
	}

	public void setMonth_of_end(int month_of_end)
	{
		this.month_of_end = month_of_end;
	}

	public int getYear_of_end()
	{
		return year_of_end;
	}

	public void setYear_of_end(int year_of_end)
	{
		this.year_of_end = year_of_end;
	}

	public int getNumber_of_participants()
	{
		return number_of_participants;
	}

	public void setNumber_of_participants(int number_of_participants)
	{
		this.number_of_participants = number_of_participants;
	}

	public int getNumber_of_publications()
	{
		return number_of_publications;
	}

	public void setNumber_of_publications(int number_of_publications)
	{
		this.number_of_publications = number_of_publications;
	}

	public double getValue()
	{
		return value;
	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAgency()
	{
		return agency;
	}

	public void setAgency(String agency)
	{
		this.agency = agency;
	}

	public String getObjective()
	{
		return objective;
	}

	public void setObjective(String objective)
	{
		this.objective = objective;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public ArrayList<Collaborator> getParticipants()
	{
		return participants;
	}

	public void setParticipants(ArrayList<Collaborator> participants)
	{
		this.participants = participants;
	}
	
	public String getMember()
	{
		return member;
	}

	public void setMember(String member)
	{
		this.member = member;
	}

	public static void Add_Research_Project(ArrayList<Research_Project> projects, int day_of_begin, int month_of_begin, int year_of_begin, int day_of_end, int month_of_end, int year_of_end, int number_of_publication, double value, String title, String agency, String objective, String description, String status, String member)
	{
		Research_Project project = new Research_Project();
		project.setDay_of_begin(day_of_begin);
		project.setMonth_of_begin(month_of_begin);
		project.setYear_of_begin(year_of_begin);
		project.setDay_of_end(day_of_end);
		project.setMonth_of_end(month_of_end);
		project.setYear_of_end(year_of_end);
		project.setNumber_of_publications(number_of_publication);
		project.setValue(value);
		project.setTitle(title);
		project.setAgency(agency);
		project.setObjective(objective);
		project.setDescription(description);
		project.setStatus(status);
		project.setMember(member);
		projects.add(project);
	}
	
	public static void Add_Collaborator_on_Project(ArrayList<Collaborator> participants, int number_of_projects, int number_of_publications, String name, String email, String type, String name_of_project)
	{
		Collaborator participant = new Collaborator();
		participant.setNumber_of_projects(number_of_projects);
		participant.setNumber_of_publications(number_of_publications);
		participant.setName(name);
		participant.setEmail(email);
		participant.setType(type);
		participant.setName_of_project(name_of_project);
		participants.add(participant);
	}
	
	public static int Search_Project(ArrayList<Research_Project> projects, String title, boolean found)
	{
		for(int i = 0; i < projects.size(); i ++)
		{
			if(projects.get(i).getTitle().equals(title))
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
	
	public static int Check_Quantity_of_Publications(ArrayList<Research_Project> projects, String title, int number_of_publications, boolean found)
	{
		for(int i =0; i < projects.size(); i ++)
		{
			if(projects.get(i).getTitle().equals(title))
			{
				number_of_publications = projects.get(i).getNumber_of_publications();
				found = true;
				break;
				
			}
		}
		
		if(found)
		{
			return number_of_publications;
		}
		else
		{
			return 0;
		}
	}
	
	public static String Check_Status(ArrayList<Research_Project> projects, String title, String status, boolean found)
	{
		for(int i =0; i < projects.size(); i ++)
		{
			if(projects.get(i).getTitle().equals(title))
			{
				found = true;
				status = projects.get(i).getStatus();
				break;
			}
		}
		
		if(found)
		{
			return status;
		}
		else
		{
			return status;
		}
	}
	
	public static void Show_Informations_Project(ArrayList<Research_Project> projects, int day_of_begin, int month_of_begin, int year_of_begin, int day_of_end, int month_of_end, int year_of_end, int number_of_publication, double value, String title, String agency, String objective, String description, String status, String member)
	{
		for(int i = 0; i < projects.size(); i ++)
		{
			if(projects.get(i).getTitle().equals(title))
			{
				day_of_begin = projects.get(i).getDay_of_begin();
				month_of_begin = projects.get(i).getMonth_of_begin();
				year_of_begin = projects.get(i).getYear_of_begin();
				day_of_end = projects.get(i).getDay_of_end();
				month_of_end = projects.get(i).getMonth_of_end();
				year_of_end = projects.get(i).getYear_of_end();
				number_of_publication = projects.get(i).getNumber_of_publications();
				value = projects.get(i).getValue();
				agency = projects.get(i).getAgency();
				objective = projects.get(i).getObjective();
				description = projects.get(i).getDescription();
				status = projects.get(i).getStatus();
				break;
			}
		}
		
		System.out.println("Here is the information about the Project " + title + ": ");
		System.out.printf("The Project started in: %02d/%02d/%d\n", day_of_begin, month_of_begin, year_of_begin);
		System.out.printf("Will end in: %02d/%02d/%d\n", day_of_end, month_of_end, year_of_end);
		System.out.println("The project have " + number_of_publication + " publications");
		System.out.println("The funding agency of the project is " + agency + " and the amount paid by the agency was " + value + " R$");
		System.out.println("The objective of this project is " + objective);
		System.out.println("Here's a little description about the Project: " + description);
		System.out.println("Currently the status of this project is " + status);
	}
	
}