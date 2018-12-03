package Objects;

import java.util.ArrayList;

public class Teacher
{
	ArrayList<String> orienting = new ArrayList<String>();

	private String name_T;
	private String orienting_name;

	private int idt;
	
	public void setOrienting(ArrayList<String> orienting)
	{
		this.orienting = orienting;
	}
	
	public ArrayList<String> getOrienting()
	{
		return orienting;
	}
	
	public void setName_T(String name_t)
	{
		this.name_T = name_t;
	}
	
	public String getName_T()
	{
		return name_T;
	}
	
	public void setOrienting_name(String orienting_name)
	{
		this.orienting_name = orienting_name;
	}
	
	public String getOrienting_name()
	{
		return orienting_name;
	}
	
	public void setIdt(int idt)
	{
		this.idt = idt;
	}
	
	public int getIdt()
	{
		return idt;
	}
	
}
