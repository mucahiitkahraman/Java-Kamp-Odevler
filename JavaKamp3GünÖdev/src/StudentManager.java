public class StudentManager extends UserManager{
	
	public void addStudent(Student student)
	{
		System.out.println("--------------------------------------------------------------");
		System.out.println("A new student" + " " +
	                       student.getFirstName() + " " + 
				           student.getLastName() + " " + "has been successfully added to the" + " " + 
	                       student.getCourses() + " " + "Course");
		
	}
	
	public void removeStudent(Student student) 
	{
		System.out.println(student.getFirstName() + " " + 
	                       student.getLastName() + " " + "student was successfully evacuated from the" + " " + 
	                       student.getCourses());
		
	}
	
	public void updateStudent(Student student) 
	{
		//16-20 satýrlar profil güncelleme komutlarý yorum satýrýna alýndýlar.Kullanýlacaðý zaman yorum satýrlarý kaldýrýlýp yeni bilgiler yazýlabilir.
		// student.setFirstName("New Name");
		// student.setLastName("New LastName");
		// student.setPassword("New password");
		// student.seteMail("New eMail");
		// student.getAddress("New Address");
		student.setFirstName("Mücahit1");
		System.out.println("Your profile has been updated by changing your name and your new name is : " + " " + 
		                   student.getFirstName());

	}
	public void myCourses(Student student)
	{
		System.out.println("My Courses : " + student.getCourses());
	}
	public void courseProgressPercentage(Student student)
	{
		System.out.println("Your course progress :" + " "+  "%" + student.getCourseProgressPercentage());
		
	}

}