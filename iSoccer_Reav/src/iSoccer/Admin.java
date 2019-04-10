package iSoccer;

import java.util.ArrayList;

public class Admin
{
	
	private String login;
	private String password;
	private static Admin uniqueInstance = new Admin();
	
	private Admin()
	{
		
	}
	
	public static Admin getInstance()
	{
		return uniqueInstance;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public static void Add_Admin(ArrayList<Admin> admins, String login,String password)
	{
		Admin administrator = new Admin();
		administrator.setLogin(login);
		administrator.setPassword(password);
		admins.add(administrator);
	}
	
}
