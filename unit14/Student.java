import java.util.*;

public class Student{

	private String name;
	private int favNum;
	
	
	public Student(String name, int favNum){
	//input of public constructor setting customization
	//public member function
		this.name = name;
		this.favNum = favNum;
	}

   //a method/functions of returning smth of the object
    public String getName(){
        return name;
    }
    
    public int getFavNum(){
		return favNum;
	}

}
