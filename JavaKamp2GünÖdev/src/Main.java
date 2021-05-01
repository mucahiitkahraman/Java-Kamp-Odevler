public class Main {

	public static void main(String[] args) {
		
		//Eðitmmen ile ilgili bölüm. Yeni eðitmen ekleyip veya silinebilir.
		
		Instructor instructor1 = new Instructor(
				1903, 
				"JAVA + REACT Camp", 
				"Engin", 
				"Demiroð");
		
		Instructor instructor2= new Instructor(
				1903, 
				"C# + Angular", 
				"Engin", 
				"Demiroð");
		
		Instructor instructor3 = new Instructor(
				1903, 
				"Programlamaya Giriþ", 
				"Engin", 
				"Demiroð");
		
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
		
		Student Mücahit = new Student(
				"Mücahit", 
				"Kahraman", 
				19, 
				"xxxxxxx@gmail.com");
		
		Student[] student = {Mücahit};
		
		for(Student std : student)
		{
			System.out.println("Student Name and Surname : " + std.name + " " + std.surName);
			System.out.println("Student ID : " + std.studentid);
			System.out.println("Student E-Mail " + std.eMail);
		}
		
		System.out.println("Number of Student : " + student.length);
		
		System.out.println("------------------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addToStudent(Mücahit);
		
		System.out.println("------------------------------------------------------");
		
		
		//Anasayfada görüntülenecek Bütün kurslar ve Kurslarým ile ilgili bölüm
		
		AllCourses allCourses = new AllCourses(1900, "JAVA + REACT Camp", 
				"JAVA + REACT Yazýlýmcý Geliþtirme Kampý",
				"Programming", 
				"Engin Demiroð");
		AllCourses allCourses2 = new AllCourses(1990, 
				"C# + Angular", 
				"C# + Angular Geliþtirme", 
				"Programming", 
				"Engin Demiroð");
		AllCourses allCourses3 = new AllCourses(2000, 
				"Programlamaya Giriþ", 
				"Programlamaya Temel Giriþ", 
				"Programming", 
				"Engin Demiroð");
		MyCourses myCourses = new MyCourses("JAVA + REACT Camp", 
				1900, 
				"JAVA + REACT Yazýlým Geliþtirme Kampý", 
				"Programming", 
				"Engin Demiroð");
		MyCourses myCourses2 = new MyCourses("C# + Angular", 
				1990, 
				"C# + Angular Geliþtirme ", 
				"Programming", 
				"Engin Demiroð");
		MyCourses myCourses3 = new MyCourses("Programlamaya Giriþ", 
				2000, 
				"Programlamaya Temel Giriþ", 
				"Programming", 
				"Engin Demiroð");
		
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
		
		//Kategoriler ile ilgili bölüm. Ýsteðe göre kategori eklenip / silinebilir.
		
		Category category1 = new Category();
		category1.id = 2021;
		category1.name="Programming";
		System.out.println("Category ID and Name : " + category1.id + " / " + category1.name);
		
		CategoryManager categoryManager = new CategoryManager();
		
		categoryManager.addToCategory(category1);
		
		System.out.println("------------------------------------------------------");		
		}
}
