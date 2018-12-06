package Functionalities;

import java.util.ArrayList;
import Objects.Publications;

public class AddPublication
{
	public static void AddaPublication(ArrayList<Publications> publi, String titlep, String nameofconf, String yearpubd, String projectasso)
	{
		Publications pub = new Publications();
		pub.setTitle_P(titlep);
		pub.setNameofconference(nameofconf);
		pub.setYearofpublication(yearpubd);
		pub.setProjectasso(projectasso);
		publi.add(pub);
	}
}
