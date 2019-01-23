package iFace;

public class Profile {
	int numberoffriends, idp;
	String birthday, bio, addres;

	/*
	 * public Profile(int numberoffriends, String birthday, String bio, String
	 * addres) { this.numberoffriends = numberoffriends; this.birthday = birthday;
	 * this.bio = bio; this.addres = addres; }
	 */

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public void setIdprofi(int idp) {
		this.idp = idp;
	}

	public int getNumberofFriends() {
		return numberoffriends;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getBio() {
		return bio;
	}

	public String getAddres() {
		return addres;
	}
}
