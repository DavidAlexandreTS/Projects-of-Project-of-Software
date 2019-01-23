package iFace;

import java.util.ArrayList;

public class Community
{
	int members;
	
	String name_com;
	String description_com;
	String unserna;
	
	public int getMembers()
	{
		return members;
	}
	
	public void setMembers(int members)
	{
		this.members = members;
	}
	
	public String getName_com()
	{
		return name_com;
	}
	
	public void setName_com(String name_com) 
	{
		this.name_com = name_com;
	}
	
	public String getDescription_com()
	{
		return description_com;
	}
	
	public void setDescription_com(String description_com)
	{
		this.description_com = description_com;
	}
	
	public String getUnserna()
	{
		return unserna;
	}

	public void setUnserna(String unserna)
	{
		this.unserna = unserna;
	}

	public static void Add_Members(ArrayList<Community> communitys, int members, String userna, String name_com, String description_com)
	{
		Community comum = new Community();
		comum.setMembers(members);
		comum.setUnserna(userna);
		comum.setName_com(name_com);
		comum.setDescription_com(description_com);
		communitys.add(comum);
	}
	
}
