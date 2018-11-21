
public class Empregado
{
	private String name, adress, type;
	private double salary_hour, salary_month, commission;
	
	public Empregado(String name, String adress, String type, double salary_hour, double salary_month, double comission)
	{
		this.name = name;
		this.adress = adress;
		this.type = type;
		this.salary_hour = salary_hour;
		this.salary_month = salary_month;
		this.commission = commission;
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAdress(String adress)
	{
		this.adress = adress;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setSalary_Hour(double salary_hour)
	{
		this.salary_hour = salary_hour;
	}
	
	public void setSalary_Month(double salary_month)
	{
		this.salary_month = salary_month;
	}
	
	public void setCommission(double commission)
	{
		this.commission = commission;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAdress()
	{
		return adress;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getSalary_Hour()
	{
		return salary_hour;
	}
	
	public double getSalary_Month()
	{
		return salary_month;
	}
	
	public double Commission()
	{
		return commission;
	}

}
