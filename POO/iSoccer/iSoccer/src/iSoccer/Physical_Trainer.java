package iSoccer;

import java.util.ArrayList;

public class Physical_Trainer extends Worker
{
	public static void Add_Physical_Trainer(ArrayList<Physical_Trainer> physical_trainers, int cpf, String name, String email, int telephone, double salary)
	{
		Physical_Trainer physical_trainer = new Physical_Trainer();
		physical_trainer.setCpf(cpf);
		physical_trainer.setName(name);
		physical_trainer.setEmail(email);
		physical_trainer.setTelephone(telephone);
		physical_trainer.setSalary(salary);
		physical_trainers.add(physical_trainer);
	}
}
