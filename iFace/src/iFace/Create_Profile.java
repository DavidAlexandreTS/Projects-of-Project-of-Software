package iFace;

import java.util.ArrayList;

public class Create_Profile
{
	public static void CreateProfile(ArrayList<Profile> profile, int idprofile, int number_of_friends, int day_of_birthday, int month_of_birthday, int year_of_birthday, String addres, String bio, String user)
	{
		Profile profi = new Profile();
		profi.setIdprofile(idprofile);
		profi.setNumber_of_friends(number_of_friends);
		profi.setDay_of_birthday(day_of_birthday);
		profi.setMonth_of_birthday(month_of_birthday);
		profi.setYear_of_birthday(year_of_birthday);
		profi.setAddres(addres);
		profi.setBio(bio);
		profi.setUser(user);
		profile.add(profi);
	}
}