
public class Student extends User {
	
    private int studentId;
	private String address;
	private int courseProgressPercentage;
	
	public Student(int studentId, String courses, String firstName, String lastName, String eMail, String password, String address, int courseProgressPercentage)
	{
		super(firstName, lastName, eMail, password, courses);
		this.studentId = studentId;
		this.address = address;
		this.courseProgressPercentage = courseProgressPercentage;
	}

	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getCourseProgressPercentage() {
		return courseProgressPercentage;
	}


	public void setCourseProgressPercentage(int courseProgressPercentage) {
		this.courseProgressPercentage = courseProgressPercentage;
	}


	public Student()
	{
		System.out.println("        Student viewed       ");
		System.out.println("-----------------------------");
	}
	
}
