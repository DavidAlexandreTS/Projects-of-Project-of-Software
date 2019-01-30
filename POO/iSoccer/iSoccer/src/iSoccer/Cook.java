package iSoccer;

import java.util.ArrayList;

public class Cook extends Worker
{
	public static void Add_Cook(ArrayList<Cook> cooks, int cpf, String name, String email, int telephone, double salary)
	{
		Cook cook = new Cook();
		cook.setCpf(cpf);
		cook.setName(name);
		cook.setEmail(email);
		cook.setTelephone(telephone);
		cook.setSalary(salary);
		cooks.add(cook);
	}
}