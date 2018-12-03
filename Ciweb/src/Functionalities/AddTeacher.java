package Functionalities;

import java.util.ArrayList;
import Objects.Teacher;


public class AddTeacher
{
	public static void AddaTeacher(ArrayList<Teacher> tch, ArrayList<String> orienting, String name_T, String orienting_name, int idt)
	{
		Teacher teacher = new Teacher();
		teacher.setOrienting(orienting);
		teacher.setName_T(name_T);
		teacher.setOrienting_name(orienting_name);
		teacher.setIdt(idt);
		tch.add(teacher);
	}
}
