package Funcionalities;

import java.util.ArrayList;
import Objects.Syndicate;

public class LaunchSyndicate
{
	public static void AddaMember(ArrayList<Syndicate> syndi, int idsyndi, double taxa, String employee)
	{
		Syndicate syndicate = new Syndicate();
		syndicate.setIdsyndi(idsyndi);
		syndicate.setTaxa(taxa);
		syndicate.setEmployee(employee);
		syndi.add(syndicate);
	}
}
