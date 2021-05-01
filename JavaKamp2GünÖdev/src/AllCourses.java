
public class AllCourses {
	
	
	public AllCourses()
	{
		System.out.println("All Courses Viewed");
	}
	
	public AllCourses(int coursesId, String coursesName, String coursesDetail,String coursesInstructor, String coursesCategory )
	{
		this.coursesCategory = coursesCategory;
		this.coursesId = coursesId;
		this.coursesName = coursesName;
		this.coursesDetail = coursesDetail;
		this.coursesInstructor = coursesInstructor;
	}
	
	String coursesCategory;
	int coursesId;
	String coursesName;
	String coursesDetail;
	String coursesInstructor;
	
}
