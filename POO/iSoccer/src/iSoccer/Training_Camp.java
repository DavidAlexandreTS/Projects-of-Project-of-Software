package iSoccer;

import java.util.ArrayList;

public class Training_Camp extends Resource
{
	private String name;
	
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}

	public static void Add_Training_Camp(ArrayList<Resource> resources, int qtd, String name, String type, String status)
	{
		Training_Camp tc = new Training_Camp();
		tc.setQtd(qtd);
		tc.setName(name);
		tc.setType(type);
		
		if(qtd == 0)
		{
			status = "Not Available";
			tc.setStatus(status);
		}
		else
		{
			status = "Available";
			tc.setStatus(status);
		}
		
		resources.add(tc);
	}
	
	public static String Check_Status_T(ArrayList<Resource> resources, String name, String type, String status, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				Resource r = resources.get(i);
				
				if(r.getClass().equals(Stadium.class))
				{
					if(((Stadium)r).getName().equals(name))
					{
						status = ((Stadium)r).getStatus();
						found = true;
						break;
					}
				}
			}
		}
		
		if(found)
		{
			return status;
		}
		else
		{
			return status;
		}
	}
	
	public static int Number_of_Rooms(ArrayList<Resource> resources, int qtd, String name, String type, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				Resource r = resources.get(i);
				
				if(r.getClass().equals(Training_Camp.class))
				{
					if(((Training_Camp)r).getName().equals(name))
					{
						qtd = ((Training_Camp)r).getQtd();
						found = true;
						break;
					}
				}
			}
		}
		
		if(found)
		{
			return qtd;
		}
		else
		{
			return qtd;
		}
	}
}