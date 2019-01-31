package iSoccer;

import java.util.ArrayList;

public class Bus extends Resource
{
	public static void Add_Bus(ArrayList<Resource> resources, int qtd, String type, String status)
	{
		Bus bus = new Bus();
		bus.setQtd(qtd);
		bus.setType(type);
		
		if(qtd == 0)
		{
			status = "Not Available";
			bus.setStatus(status);
		}
		else
		{
			status = "Available";
			bus.setStatus(status);
		}
		
		resources.add(bus);
	}

}