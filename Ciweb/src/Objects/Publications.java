package Objects;

import java.util.ArrayList;

public class Publications
{
	ArrayList<Projects> Messagese = new ArrayList<Projects>();
	
	private String title_P;
	private String nameofconference;
	private String yearofpublication;
	
	public void setTitle_P(String title_P)
	{
		this.title_P = title_P;
	}
	
	public String getTitle_P()
	{
		return title_P;
	}
	
	public void setNameofconference(String nameofconference)
	{
		this.nameofconference = nameofconference;
	}
	
	public String getNameofconference()
	{
		return nameofconference;
	}
	
	public void setYearofpublication(String yearofpublication)
	{
		this.yearofpublication = yearofpublication;
	}
	
	public String getYearofpublication()
	{
		return yearofpublication;
	}
	
}
