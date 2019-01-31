package iSoccer;

import java.util.ArrayList;

public abstract class Resource
{
	private int qtd;
	
	private String status;
	private String type;

	public int getQtd()
	{
		return qtd;
	}

	public void setQtd(int qtd)
	{
		this.qtd = qtd;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	
	public static String Check_Status(ArrayList<Resource> resources, String type, String status, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				status = resources.get(i).getStatus();
				found = true;
				break;
			}
		}
		
		if(found)
		{
			return status;
		}
		else
		{
			status = "Not Available";
			return status;
		}
	}
	
	public static int Check_Quantity(ArrayList<Resource> resources, int qtd, String type, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				qtd = resources.get(i).getQtd();
				found = true;
				break;
			}
		}
		
		if(found)
		{
			return qtd;
		}
		else
		{
			return 0;
		}
	}
	
}