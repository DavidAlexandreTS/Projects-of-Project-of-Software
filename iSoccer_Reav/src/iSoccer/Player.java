package iSoccer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player extends Worker
{
	Scanner input = new Scanner(System.in);
	
	private String type_of_player;
	private String status;
	
	public String getType_of_player()
	{
		return type_of_player;
	}
	
	public void setType_of_player(String type_of_player)
	{
		this.type_of_player = type_of_player;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public static void Add_Player(ArrayList<Worker> players, double cpf, String name, String email, String type_of_player, String status, double telephone, double salary)
	{
		Player player = new Player();
		player.setCpf(cpf);
		player.setName(name);
		player.setEmail(email);
		player.setType_of_player(type_of_player);
		player.setStatus(status);
		player.setTelephone(telephone);
		player.setSalary(salary);
		players.add(player);
	}

	@Override
	public void execute(ArrayList<Worker> players)
	{
		try
		{
			System.out.println("Please enter the name, type of player, the status, email, telephone, cpf and salary of the Player you want to add");
			name = input.nextLine();
			type_of_player = input.nextLine();
			status = input.nextLine();
			email = input.nextLine();
			telephone = input.nextDouble();
			cpf = input.nextDouble();
			salary = input.nextDouble();
			input.nextLine();
			
			Player.Add_Player(players, cpf, status, status, type_of_player, status, telephone, salary);
			System.out.println("New Player add with Success!");
			
		} catch(InputMismatchException exception)
		{
			System.out.println("Do you enter a invalid Number!");
		}
		
	}

}