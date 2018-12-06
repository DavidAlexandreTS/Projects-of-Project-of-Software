package Objects;

import java.util.ArrayList;

public class Projects
{
	
	ArrayList<Publications> Messagese = new ArrayList<Publications>();
	ArrayList<Collaborator> stud = new ArrayList<Collaborator>();
	
	private String col_name;
	private String title;
	private String startday;
	private String enddate;
	private String fundingagency;
	private String financedamount;
	private String objective;
	private String description;
	private String status;
	
	private int idp, numberofpub;

	public void setNumberofpub(int numberofpub)
	{
		this.numberofpub = numberofpub;
	}
	
	public int getNumberofpub()
	{
		return numberofpub;
	}
	
	public void setIdp(int idp)
	{
		this.idp = idp;
	}
	
	public int getIdp()
	{
		return idp;
	}

	public void setStud(ArrayList<Collaborator> stud)
	{
		this.stud = stud;
	}
	
	public ArrayList<Collaborator> getStud()
	{
		return stud;
	}
	
	public void setColname(String col_name)
	{
		this.col_name = col_name;
	}
	
	public String getColname()
	{
		return col_name;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setStartday(String startday)
	{
		this.startday = startday;
	}
	
	public String getStartday()
	{
		return startday;
	}
	
	public void setEnddate(String enddate)
	{
		this.enddate = enddate;
	}
	
	public String getEnddate()
	{
		return enddate;
	}
	
	public void setFundingagency(String fundingagency)
	{
		this.fundingagency = fundingagency;
	}
	
	public String getFundingagency()
	{
		return fundingagency;
	}
	
	public void setFinancedamount(String financedamount)
	{
		this.financedamount = financedamount;
	}
	
	public String getFinancedamount()
	{
		return financedamount;
	}
	
	public void setObjective(String objective)
	{
		this.objective = objective;
	}
	
	public String getObejective()
	{
		return objective;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
		
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getStatus()
	{
		return status;
	}
}
