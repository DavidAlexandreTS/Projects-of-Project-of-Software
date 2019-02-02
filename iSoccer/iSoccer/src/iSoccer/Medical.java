package iSoccer;

import java.util.ArrayList;

public class Medical extends Worker
{
	private int crm;

	public int getCrm()
	{
		return crm;
	}

	public void setCrm(int crm)
	{
		this.crm = crm;
	}
	
	public static void Add_Medical(ArrayList<Medical> medicals, int cpf, int crm, String name, String email, int telephone, double salary)
	{
		Medical medical = new Medical();
		medical.setCpf(cpf);
		medical.setCrm(crm);
		medical.setName(name);
		medical.setEmail(email);
		medical.setTelephone(telephone);
		medical.setSalary(salary);
		medicals.add(medical);
	}
	
}