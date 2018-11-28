package iFace;

import java.util.ArrayList;

public class Account
{
	ArrayList<String> Friends = new ArrayList<String>();
	ArrayList<String> Messages = new ArrayList<String>();
	ArrayList<String> Friendship_Request = new ArrayList<String>();
	
	@SuppressWarnings("unused")
	private int idacc;
	private String login, username, password;
	private ArrayList<Friendship_Request> Solicitacions = new ArrayList<Friendship_Request>();
	
	/*public Account(ArrayList<String> friends, String login, String username, String password)
	{
		this.login = login;
		this.username = username;
		this.password = password;
		this.Friends = friends;
	}*/
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setFriends(String friend)
	{
		this.Friends.add(friend);
	}
	
	public void setIdacc(int idacc)
	{
		this.idacc = idacc;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public int getIdacc()
	{
		return idacc;
	}
	
	public ArrayList<String> getFriends()
	{
		return Friends;
	}
	
	public void Requests(String username, String friendusername)
	{
		Friendship_Request reques =  new Friendship_Request();
		reques.setSent(username);
		reques.setReceive(friendusername);
		this.Solicitacions.add(reques);
	}
	
	public ArrayList<Friendship_Request> getRequests()
	{
		return Solicitacions;
	}
	
	public void removeFriend(String friend)
	{
		if(Friends.contains(friend))
		{
			this.Friends.remove(friend);
		}else
		{
			System.out.println("Error! Friend dont found.");
		}
	}

}