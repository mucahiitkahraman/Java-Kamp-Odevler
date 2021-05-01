
public class Instructor {
	
	int instructorId;
	String courses;
	String name;
	String surName;
	
	public Instructor()
	{
		System.out.println("Instructor viewed");
		System.out.println("-----------------");
	}
	
	public Instructor(int instructorId, String courses,  String name, String surName)
	{
		this.instructorId = instructorId;
		this.courses=courses;
		this.name = name;
		this.surName = surName;
	}
	
	
}
