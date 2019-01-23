package Functionalities;

import java.util.ArrayList;
import Objects.Collaborator;

public class AddCollaborator
{
	public static void AddaCollaborator(ArrayList<Collaborator> cola, String name, String type, String advisor, String guiding, String protitle, int ids)
	{
		Collaborator colabo = new Collaborator();
		colabo.setName(name);
		colabo.setType(type);
		colabo.setAdvisor(advisor);
		colabo.setGuiding(guiding);
		colabo.setProtitle(protitle);
		colabo.setId(ids);
		cola.add(colabo);
	}
}