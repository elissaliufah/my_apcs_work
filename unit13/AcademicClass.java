import java.util.*;
public class AcademicClass{
	
	private Teacher teacher;
	private ArrayList<Student> students;
	
	public AcademicClass(){
		students = new ArrayList<Student>();
	}
	
	public void addStudent(String name, int favNum){
        students.add(new Student(name, favNum));
    }
   
   
   public void addTeacher(String name, String subject){
		teacher = new Teacher(name, subject);
	   
   }
    
    public void info(){
        for (Student s : students){
            System.out.println(s.getName());
        }
		System.out.println(this.teacher.getName());
	}
	
	public ArrayList <Student> fav(int n){
		ArrayList<Student> favN = new ArrayList<Student>();
		for(Student s : students){
			if(s.getFavNum() == n){
				favN.add(s);
			}
		}
		
		return favN;
	}
	
	public ArrayList <Student> odd(){
		ArrayList<Student> favOdd = new ArrayList<Student>();
		for(Student s : students){
			if(s.getFavNum()%2 == 1){
				favOdd.add(s);
			}
		}
		
		return favOdd;

	}

}
