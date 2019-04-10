package iSoccer;

import java.util.ArrayList;

public class Add_Worker
{
	
	ArrayList<Worker> cooks = new ArrayList<Worker>();
	ArrayList<Worker> drivers = new ArrayList<Worker>();
	ArrayList<Worker> lawyers = new ArrayList<Worker>();
	ArrayList<Worker> medicals = new ArrayList<Worker>();
	ArrayList<Worker> physical_trainers = new ArrayList<Worker>();
	ArrayList<Worker> players = new ArrayList<Worker>();
	ArrayList<Worker> presidents = new ArrayList<Worker>();
	ArrayList<Worker> technicians = new ArrayList<Worker>();
	ArrayList<Partner> partners = new ArrayList<Partner>();
	ArrayList<Resource> resources = new ArrayList<Resource>();
	
	private Command[] commands;
	
	public Add_Worker(Command Cook, Command Driver, Command Lawyer, Command Medical, Command Physical_Trainer, Command Player, Command President, Command Technician)
	{
		this.commands = new Command[8];
		commands[0] = Cook;
		commands[1] = Driver;
		commands[2] = Lawyer;
		commands[3] = Medical;
		commands[4] = Physical_Trainer;
		commands[5] = Player;
		commands[6] = President;
		commands[7] = Technician;
	}
	
	public void Add_Cook(ArrayList<Worker> cooks)
	{
		commands[0].execute(cooks);
	}
	
	public void Add_Driver(ArrayList<Worker> drivers)
	{
		commands[1].execute(drivers);
	}
	
	public void Add_Lawyer(ArrayList<Worker> lawyers)
	{
		commands[2].execute(lawyers);
	}
	
	public void Add_Medical(ArrayList<Worker> medicals)
	{
		commands[3].execute(medicals);
	}
	
	public void Add_Physical_Trainer(ArrayList<Worker> physical_trainers)
	{
		commands[4].execute(physical_trainers);
	}
	
	public void Add_Player(ArrayList<Worker> players)
	{
		commands[5].execute(players);
	}
	
	public void Add_President(ArrayList<Worker> presidents)
	{
		commands[6].execute(presidents);
	}
	
	public void Add_Technician(ArrayList<Worker> technichians)
	{
		commands[7].execute(technichians);
	}
	
}
