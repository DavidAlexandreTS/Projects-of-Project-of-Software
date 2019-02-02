package iSoccer;

import java.util.ArrayList;

public class President extends Worker
{
	public static void Add_President(ArrayList<President> presidents, int cpf, String name, String email, int telephone, double salary)
	{
		President president = new President();
		president.setCpf(cpf);
		president.setName(name);
		president.setEmail(email);
		president.setTelephone(telephone);
		president.setSalary(salary);
		presidents.add(president);
	}
	
}