
public class CoursesManager {

	public void addToCourses(MyCourses myCourses)
	{
		System.out.println("New Courses Added : " + myCourses.coursesName);
		System.out.println("------------------------------------------------------");
	}
	
	public void deleteToCourses(MyCourses myCourses)
	{
		System.out.println("The Specified Course Has Been Deleted : " + myCourses.coursesName);
		System.out.println("------------------------------------------------------");
	}	
	
	public void addToCourses(AllCourses allCourses)
	{
		System.out.println("New Course Added To All Courses : " + allCourses.coursesName);
		System.out.println("------------------------------------------------------");
	}
	
	public void deleteToCourses(AllCourses allCourses)
	{
		System.out.println("A Course Was Deleted From All Courses : " + allCourses.coursesName);
		System.out.println("------------------------------------------------------");
	}
	
	
}
