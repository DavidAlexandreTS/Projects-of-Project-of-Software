package iSoccer;

public abstract class Worker implements Command
{
	protected double cpf;
	protected double telephone;
	
	protected double salary;
	
	protected String name;
	protected String email;
	
	public double getCpf()
	{
		return cpf;
	}
	
	public void setCpf(double cpf)
	{
		this.cpf = cpf;
	}
	
	public double getTelephone()
	{
		return telephone;
	}
	
	public void setTelephone(double telephone)
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

	public String getType_of_player()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getStatus()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int getCrm()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int getEnrollment_number()
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}