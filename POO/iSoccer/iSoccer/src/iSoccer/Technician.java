package iSoccer;

import java.util.ArrayList;

public class Technician extends Worker
{
	public static void Add_Technician(ArrayList<Technician> technicians, int cpf, String name, String email, int telephone, double salary)
	{
		Technician technician = new Technician();
		technician.setCpf(cpf);
		technician.setName(name);
		technician.setEmail(email);
		technician.setTelephone(telephone);
		technician.setSalary(salary);
		technicians.add(technician);
	}
	
}