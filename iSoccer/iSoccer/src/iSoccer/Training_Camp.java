package iSoccer;

import java.util.ArrayList;

public class Training_Camp extends Resource
{
	public static void Add_Training_Camp(ArrayList<Resource> resources, int qtd, String type, String status)
	{
		Training_Camp tc = new Training_Camp();
		tc.setQtd(qtd);
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
}