
public class Instructor extends User {
	
	private int instructorId;
	private String lessons;
	
	public Instructor(int id, String  lessons, String firstName, String lastName, String eMail, String password)
	{
		super(firstName, lastName, eMail, password);
		this.instructorId = id;
		this.lessons=lessons;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}


	public String getLessons() {
		return lessons;
	}
	
	
	public void setLessons(String lessons) {
		this.lessons = lessons;
	}


	public Instructor()
	{
		System.out.println("      Instructor viewed      ");
		System.out.println("-----------------------------");
	}
	
}
