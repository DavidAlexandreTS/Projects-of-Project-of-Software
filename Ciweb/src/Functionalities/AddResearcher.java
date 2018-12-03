package Functionalities;

import java.util.ArrayList;
import Objects.Researcher;

public class AddResearcher
{
	public static void AddaResearcher(ArrayList<Researcher> rsc, String name_R, int id_R)
	{
		Researcher researcher = new Researcher();
		researcher.setName_R(name_R);
		researcher.setId_R(id_R);
		rsc.add(researcher);
	}
}
