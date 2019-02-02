package iSoccer;

import java.util.ArrayList;

public class Stadium extends Resource
{
	private int qtd_bathroom;
	private int qtd_snack_bar;
	private int capacity_of_spectators;
	
	public int getQtd_bathroom()
	{
		return qtd_bathroom;
	}
	
	public void setQtd_bathroom(int qtd_bathroom)
	{
		this.qtd_bathroom = qtd_bathroom;
	}
	
	public int getQtd_snack_bar()
	{
		return qtd_snack_bar;
	}
	
	public void setQtd_snack_bar(int qtd_snack_bar)
	{
		this.qtd_snack_bar = qtd_snack_bar;
	}
	
	public int getCapacity_of_spectators()
	{
		return capacity_of_spectators;
	}
	
	public void setCapacity_of_spectators(int capacity_of_spectators)
	{
		this.capacity_of_spectators = capacity_of_spectators;
	}
	
	public static void Add_Stadium(ArrayList<Resource> resources, int qtd, int qtd_bathroom, int qtd_snack_bar, int capacity_of_spectators, String type, String status)
	{
		Stadium stadium = new Stadium();
		stadium.setQtd(qtd);
		stadium.setQtd_bathroom(qtd_bathroom);
		stadium.setQtd_snack_bar(qtd_snack_bar);
		stadium.setCapacity_of_spectators(capacity_of_spectators);
		stadium.setType(type);
		
		if(qtd == 0)
		{
			status = "Not Available";
			stadium.setStatus(status);
		}
		else
		{
			status = "Available";
			stadium.setStatus(status);
		}
		
		resources.add(stadium);
	}
	
	public int Check_Quantity_of_Bathroom(ArrayList<Resource> resources, int qtd, String type, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				Resource r = resources.get(i);
				
				if(r.getClass().equals(Stadium.class))
				{
					qtd = ((Stadium)r).getQtd_bathroom();
					found = true;
					break;
				}
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
	
	public int Check_Quantity_of_Snack_Bar(ArrayList<Resource> resources, int qtd, String type, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				Resource r = resources.get(i);
				
				if(r.getClass().equals(Stadium.class))
				{
					qtd = ((Stadium)r).getQtd_snack_bar();
					found = true;
					break;
				}
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
	
	public int Check_Quantity_of_Capacity_of_Spectators(ArrayList<Resource> resources, int qtd, String type, boolean found)
	{
		for(int i = 0;i < resources.size(); i ++)
		{
			if(resources.get(i).getType().equals(type))
			{
				Resource r = resources.get(i);
				
				if(r.getClass().equals(Stadium.class))
				{
					qtd = ((Stadium)r).getCapacity_of_spectators();
					found = true;
					break;
				}
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