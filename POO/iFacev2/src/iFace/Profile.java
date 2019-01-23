package iFace;

public class Profile extends Account
{
	private int idprofile;
	private int number_of_friends;
	private int day_of_birthday;
	private int month_of_birthday;
	private int year_of_birthday;
	
	private String bio;
	private String addres;
	private String user;
	
	public int getIdprofile()
	{
		return idprofile;
	}

	public void setIdprofile(int idprofile)
	{
		this.idprofile = idprofile;
	}

	public int getNumber_of_friends()
	{
		return number_of_friends;
	}
	
	public void setNumber_of_friends(int number_of_friends)
	{
		this.number_of_friends = number_of_friends;
	}
	
	public int getDay_of_birthday()
	{
		return day_of_birthday;
	}
	
	public void setDay_of_birthday(int day_of_birthday)
	{
		this.day_of_birthday = day_of_birthday;
	}
	
	public int getMonth_of_birthday()
	{
		return month_of_birthday;
	}
	
	public void setMonth_of_birthday(int month_of_birthday)
	{
		this.month_of_birthday = month_of_birthday;
	}
	
	public int getYear_of_birthday()
	{
		return year_of_birthday;
	}
	
	public void setYear_of_birthday(int year_of_birthday)
	{
		this.year_of_birthday = year_of_birthday;
	}
	
	public String getBio()
	{
		return bio;
	}
	
	public void setBio(String bio)
	{
		this.bio = bio;
	}
	
	public String getAddres()
	{
		return addres;
	}
	
	public void setAddres(String addres)
	{
		this.addres = addres;
	}

	public String getUser()
	{
		return user;
	}

	public void setUser(String user)
	{
		this.user = user;
	}
	
}
