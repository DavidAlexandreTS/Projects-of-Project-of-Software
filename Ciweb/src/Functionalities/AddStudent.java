package Functionalities;

import java.util.ArrayList;
import Objects.Student;


public class AddStudent
{
	public static void AddaStudent(ArrayList<Student> std, String name, String type, String advisor, int ids)
	{
		Student student = new Student();
		student.setName(name);
		student.setType(type);
		student.setAdvisor(advisor);
		student.setId(ids);
		std.add(student);
	}
}
