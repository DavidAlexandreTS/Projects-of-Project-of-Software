package Ciweb;

import java.util.ArrayList;

public class Publication
{
	private int number_of_authors;
	private int year_of_publication;
	
	private String title;
	private String name_of_conference;
	private String research_project_associate;
	
	String[] authors = new String[number_of_authors];

	public int getNumber_of_authors()
	{
		return number_of_authors;
	}

	public void setNumber_of_authors(int number_of_authors)
	{
		this.number_of_authors = number_of_authors;
	}

	public int getYear_of_publication()
	{
		return year_of_publication;
	}

	public void setYear_of_publication(int year_of_publication)
	{
		this.year_of_publication = year_of_publication;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getName_of_conference()
	{
		return name_of_conference;
	}

	public void setName_of_conference(String name_of_conference)
	{
		this.name_of_conference = name_of_conference;
	}

	public String getResearch_project_associate()
	{
		return research_project_associate;
	}

	public void setResearch_project_associate(String research_project_associate)
	{
		this.research_project_associate = research_project_associate;
	}

	public String[] getAuthors()
	{
		return authors;
	}

	public void setAuthors(String[] authors)
	{
		this.authors = authors;
	}
	
	public static void Add_Publication(ArrayList<Publication> publications, String [] authors, String title, String research_project_associate, String name_of_conference, int number_of_authors, int year_of_publication)
	{
		Publication publication = new Publication();
		publication.setAuthors(authors);
		publication.setTitle(title);
		publication.setResearch_project_associate(research_project_associate);
		publication.setName_of_conference(name_of_conference);
		publication.setNumber_of_authors(number_of_authors);
		publication.setYear_of_publication(year_of_publication);
		publications.add(publication);
		
		System.out.println("New Publication add with success!");
	}
	
	public static void Add_Pub_on(ArrayList<Publication> publics, String title, int year)
	{
		Publication publication = new Publication();
		publication.setTitle(title);
		publication.setYear_of_publication(year);
		publics.add(publication);
	}
	
	public static void bubblesort(int[] vet)
	{
		for(int i = 1; i < vet.length; i ++)
		{
		    for(int j = 0; j < i; j ++)
		    {
		        if(vet[i] > vet[j])
		        {
		            int temp = vet[i];
		            vet[i] = vet[j];
		            vet[j] = temp;
		        }
		    }
		}
	}

}