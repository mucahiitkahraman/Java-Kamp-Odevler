public class Main {

	public static void main(String[] args) {
		
		//E�itmmen ile ilgili b�l�m. Yeni e�itmen ekleyip veya silinebilir.
		
		Instructor instructor1 = new Instructor(
				1903, 
				"JAVA + REACT Camp", 
				"Engin", 
				"Demiro�");
		
		Instructor instructor2= new Instructor(
				1903, 
				"C# + Angular", 
				"Engin", 
				"Demiro�");
		
		Instructor instructor3 = new Instructor(
				1903, 
				"Programlamaya Giri�", 
				"Engin", 
				"Demiro�");
		
		Instructor[] instructors = { instructor1, instructor2, instructor3};
		
		System.out.println("------------------------------------------------------");
		
		for(Instructor inst : instructors )
		{
			System.out.println("Instructer Name and Surname : " + inst.name + " " + inst.surName);
			System.out.println("Course Name : " + inst.courses);
			System.out.println("Insturctor ID : " + inst.instructorId);
			System.out.println("------------------------------------------------------");
		}
		
		System.out.println("Number of Instructors : " + instructors.length);
		
		System.out.println("------------------------------------------------------");
		
		Student M�cahit = new Student(
				"M�cahit", 
				"Kahraman", 
				19, 
				"xxxxxxx@gmail.com");
		
		Student[] student = {M�cahit};
		
		for(Student std : student)
		{
			System.out.println("Student Name and Surname : " + std.name + " " + std.surName);
			System.out.println("Student ID : " + std.studentid);
			System.out.println("Student E-Mail " + std.eMail);
		}
		
		System.out.println("Number of Student : " + student.length);
		
		System.out.println("------------------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addToStudent(M�cahit);
		
		System.out.println("------------------------------------------------------");
		
		
		//Anasayfada g�r�nt�lenecek B�t�n kurslar ve Kurslar�m ile ilgili b�l�m
		
		AllCourses allCourses = new AllCourses(1900, "JAVA + REACT Camp", 
				"JAVA + REACT Yaz�l�mc� Geli�tirme Kamp�",
				"Programming", 
				"Engin Demiro�");
		AllCourses allCourses2 = new AllCourses(1990, 
				"C# + Angular", 
				"C# + Angular Geli�tirme", 
				"Programming", 
				"Engin Demiro�");
		AllCourses allCourses3 = new AllCourses(2000, 
				"Programlamaya Giri�", 
				"Programlamaya Temel Giri�", 
				"Programming", 
				"Engin Demiro�");
		MyCourses myCourses = new MyCourses("JAVA + REACT Camp", 
				1900, 
				"JAVA + REACT Yaz�l�m Geli�tirme Kamp�", 
				"Programming", 
				"Engin Demiro�");
		MyCourses myCourses2 = new MyCourses("C# + Angular", 
				1990, 
				"C# + Angular Geli�tirme ", 
				"Programming", 
				"Engin Demiro�");
		MyCourses myCourses3 = new MyCourses("Programlamaya Giri�", 
				2000, 
				"Programlamaya Temel Giri�", 
				"Programming", 
				"Engin Demiro�");
		
		AllCourses[] allCours = {allCourses, allCourses2, allCourses3};
		
		for(AllCourses cours : allCours)
		{
			System.out.println("Courses Name : " + cours.coursesName);
			System.out.println("------------------------------------------------------");
		}
		
		
		CoursesManager coursesManager = new CoursesManager();
		
		coursesManager.addToCourses(allCourses);
		coursesManager.addToCourses(allCourses2);
		coursesManager.addToCourses(allCourses3);
		coursesManager.addToCourses(myCourses);
		coursesManager.addToCourses(myCourses2);
		coursesManager.addToCourses(myCourses3);
		
		//Kategoriler ile ilgili b�l�m. �ste�e g�re kategori eklenip / silinebilir.
		
		Category category1 = new Category();
		category1.id = 2021;
		category1.name="Programming";
		System.out.println("Category ID and Name : " + category1.id + " / " + category1.name);
		
		CategoryManager categoryManager = new CategoryManager();
		
		categoryManager.addToCategory(category1);
		
		System.out.println("------------------------------------------------------");		
		}
}
