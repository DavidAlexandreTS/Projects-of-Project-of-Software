package System;

import java.util.ArrayList;

public class Teacher
{
	ArrayList<String> orienting = new ArrayList<String>();
	
	private String name_t;
	
	public void setOrienting(ArrayList<String> orienting)
	{
		this.orienting = orienting;
	}
	
	public ArrayList<String> getOrienting()
	{
		return orienting;
	}
	
	public void setName_t(String name_t)
	{
		this.name_t = name_t;
	}
	
	public String getName_t()
	{
		return name_t;
	}
	
}
