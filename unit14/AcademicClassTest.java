import java.util.*;
 
public class AcademicClassTest{
	public static void main(String[] args){
		AcademicClass test = new AcademicClass();
   
		test.addStudent("Kira", 6);
        test.addStudent("Elissa", 7);
		test.addStudent("Lexi", 13);
        test.addStudent("Ally", 8);
        test.addStudent("Sofia", 4);
        test.addTeacher("Kessner", "APCP");

		System.out.println("Students and Teacher: ");
		test.info();
		
		for (Student s : test.fav(7)){
			System.out.println("Favorite Number is 7: " + s.getName());
			
		}
		
		for (Student s : test.odd()){
			System.out.println("Favorite Number is odd: " + s.getName());
		}
	}
}
