package Objects;

public class Employee
{
	private int ide;
	
	private double salary;
	private double hourly_salary;
	private double commission;
	
	private String name;
	private String address;
	private String type;
	private String method_of_pay;
	private String pertence;

	public int getIde()
	{
		return ide;
	}

	public void setIde(int ide)
	{
		this.ide = ide;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getMethod_of_pay()
	{
		return method_of_pay;
	}

	public void setMethod_of_pay(String method_of_pay)
	{
		this.method_of_pay = method_of_pay;
	}
	
	public String getPertence()
	{
		return pertence;
	}

	public void setPertence(String pertence)
	{
		this.pertence = pertence;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double getHourly_salary()
	{
		return hourly_salary;
	}
	
	public void setHourly_salary(double hourly_salary)
	{
		this.hourly_salary = hourly_salary;
	}
	
	public double getCommission()
	{
		return commission;
	}
	
	public void setCommission(double commission)
	{
		this.commission = commission;
	}
	
}
