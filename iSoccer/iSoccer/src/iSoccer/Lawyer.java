package iSoccer;

import java.util.ArrayList;

public class Lawyer extends Worker
{
	public static void Add_Lawyer(ArrayList<Lawyer> lawyers, int cpf, String name, String email, int telephone, double salary)
	{
		Lawyer lawyer = new Lawyer();
		lawyer.setCpf(cpf);
		lawyer.setName(name);
		lawyer.setEmail(email);
		lawyer.setTelephone(telephone);
		lawyer.setSalary(salary);
		lawyers.add(lawyer);
	}
	
}