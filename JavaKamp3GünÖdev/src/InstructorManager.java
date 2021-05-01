
public class InstructorManager extends UserManager{
	
	public void addInstructor(Instructor instructor)
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("The" + " " + instructor.getFirstName() + " " + 
	                      instructor.getLastName() + " " + "Trainer has been successfully added to the system.");
	}
	
	public void removeInstructor(Instructor instructor) 
	{
		System.out.println("The " + " " + instructor.getFirstName() + " " + 
	                       instructor.getLastName() + " " + "Instructor has been successfully removed from the system.");
	}
	
	public void addLesson(Instructor instructor) 
	{
		System.out.println(instructor.getLessons() + " " + "Lesson has been successfully added to the profile.");
	}
	public void removeLesson(Instructor instructor) 
	{
		System.out.println(instructor.getLessons() + " " + "Course has been successfully removed from the profile.");
	}
	
	public void updateInstructor(Instructor instructor)
	{
		//28-33 satýrlarý ile Instructor hakkýndaki bilgiler güncellenebilir. 
		//instructor.setCourses("courses");
		//instructor.seteMail("New eMail");
		//instructor.setFirstName("New firstName");
		//instructor.setLastName("New lastName");
		//instructor.setPassword("New password");
		//instructor.setInstructorId("New id");
		System.out.println("Instructor information has been updated successfully.");
	}

}