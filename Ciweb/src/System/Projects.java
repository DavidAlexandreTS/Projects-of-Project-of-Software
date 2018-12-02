package System;

import java.util.ArrayList;

public class Projects
{
	ArrayList<Publications> Messagese = new ArrayList<Publications>();
	ArrayList<Student> stud = new ArrayList<Student>();
	ArrayList<Teacher> teach = new ArrayList<Teacher>();
	
	private String title;
	private String startday;
	private String enddate;
	private String fundingagency;
	private String financedamount;
	private String objective;
	private String description;
	private String status;
	
	public void setStud(ArrayList<Student> stud)
	{
		this.stud = stud;
	}
	
	public ArrayList<Student> getStud()
	{
		return stud;
	}
	
	public void setTeach(ArrayList<Teacher> teach)
	{
		this.teach = teach;
	}
	
	public ArrayList<Teacher> getTeach()
	{
		return teach;
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
