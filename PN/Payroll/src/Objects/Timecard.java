package Objects;

public class Timecard
{
	private int idt;
	
	private String name_of_employee;
	private String method_of_pay;

	private double worked_hours;
	private double salary_total;

	public int getIdt()
	{
		return idt;
	}

	public void setIdt(int idt)
	{
		this.idt = idt;
	}

	public String getName_of_employee()
	{
		return name_of_employee;
	}

	public void setName_of_employee(String name_of_employee)
	{
		this.name_of_employee = name_of_employee;
	}
	
	public String getMethod_of_pay()
	{
		return method_of_pay;
	}

	public void setMethod_of_pay(String method_of_pay)
	{
		this.method_of_pay = method_of_pay;
	}
	
	public double getWorked_hours()
	{
		return worked_hours;
	}

	public void setWorked_hours(double worked_hours)
	{
		this.worked_hours = worked_hours;
	}
	
	public double getSalary_total()
	{
		return salary_total;
	}

	public void setSalary_total(double salary_total)
	{
		this.salary_total = salary_total;
	}
	
}
