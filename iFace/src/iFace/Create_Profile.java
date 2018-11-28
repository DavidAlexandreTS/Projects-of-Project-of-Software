package iFace;

import java.util.ArrayList;

public class Create_Profile
{
	public static void CreateProfile(ArrayList<Profile> profile, String birthday, String bio, String addres, int idprof)
	{
		Profile profi = new Profile();
		profi.setBirthday(birthday);
		profi.setBio(bio);
		profi.setAddres(addres);
		profi.setIdprofi(idprof);
		profile.add(profi);
	}
}
