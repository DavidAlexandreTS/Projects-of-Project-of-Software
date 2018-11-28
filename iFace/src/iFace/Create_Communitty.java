package iFace;

import java.util.ArrayList;

public class Create_Communitty
{
	public static void AddCommunity(ArrayList<Community> Comum, String admin, String name, String description, int idcom)
	{
		Community com = new Community();
		com.setAdmin(admin);
		com.setName(name);
		com.setDescription(description);
		com.setIdcom(idcom);
		Comum.add(com);
	}
}
