
public class MyCourses {
	
	public MyCourses()
	{
		System.out.println("Courses Viewed");
	}
	
	public MyCourses(String coursesName, int coursesId, String coursesDetail, String coursesCategory, String coursesInstructor)
	{
		this.coursesCategory = coursesCategory;
		this.coursesName=coursesName;
		this.coursesId=coursesId;
		this.coursesDetail=coursesDetail;
		this.coursesInstructor = coursesInstructor;
	}
	String coursesCategory;
	String coursesInstructor;
	String coursesName;
	int coursesId;
	String coursesDetail;
}
