package iFace;

import java.util.ArrayList;

public class Community
{
    private String admin, name, description;
    private int idcom;
    private ArrayList<Integer> Membersnum = new ArrayList<>();
    private ArrayList<String> Chat = new ArrayList<>();

    public void setAdmin(String admin)
    {
    	this.admin = admin;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void setIdcom(int idcom)
    {
        this.idcom = idcom;
    }
    
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getIdcom()
    {
        return idcom;
    }
    
    public String getAdmin()
    {
    	return admin;
    }
    
    public ArrayList<Integer> getMembers()
    {
        return Membersnum;
    }

    public ArrayList<String> getChat()
    {
        return Chat;
    }

}