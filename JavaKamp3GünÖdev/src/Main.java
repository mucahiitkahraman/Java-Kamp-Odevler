
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setLessons("JAVA + REACT CAMP");
		instructor1.seteMail("xxxxxxxx@gmail.com");
		instructor1.setPassword("123456789");
		instructor1.setInstructorId(190);
		
		Student student1 = new Student();
		student1.setStudentId(1903);
		student1.setFirstName("Mücahit");
		student1.setLastName("Kahraman");
		student1.setCourses("JAVA + REACT CAMP");
		student1.seteMail("xxxxxxx@hotmail.com");
		student1.setPassword("1234567");
		student1.setAddress("XXXX Adres");
		student1.setCourseProgressPercentage(0);	
		
		UserManager userManager = new UserManager();
		userManager.SignIn(student1);

		userManager.SignIn(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.myCourses(student1);
		studentManager.courseProgressPercentage(student1);
		studentManager.updateStudent(student1);
		studentManager.removeStudent(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		instructorManager.addLesson(instructor1);
		instructorManager.updateInstructor(instructor1);
		instructorManager.removeLesson(instructor1);
		instructorManager.removeInstructor(instructor1);
		System.out.println("--------------------------------------------------------------");
		UserManager userManager1 = new UserManager();
		userManager.SignOut(student1);
		userManager.SignOut(instructor1);
		System.out.println("--------------------------------------------------------------");
		userManager.deletedAccount(student1);
		userManager.deletedAccount(instructor1);
		
	}

}