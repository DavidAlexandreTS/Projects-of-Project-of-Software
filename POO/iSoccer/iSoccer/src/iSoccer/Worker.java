package iSoccer;

public abstract class Worker
{
	protected int cpf;
	protected int telephone;
	
	protected double salary;
	
	protected String name;
	protected String email;
	
	public int getCpf()
	{
		return cpf;
	}
	
	public void setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	
	public int getTelephone()
	{
		return telephone;
	}
	
	public void setTelephone(int telephone)
	{
		this.telephone = telephone;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
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
	
}