package Ciweb;

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
	
}