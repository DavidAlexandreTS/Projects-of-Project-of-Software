package iSoccer;

import java.util.ArrayList;

public class Player extends Worker
{
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
	
	public static void Add_Player(ArrayList<Player> players, int cpf, String name, String email, String type_of_player, String status, int telephone, double salary)
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

}