import java.util.*;

public class Teacher{

	private String name;
	private String subject;
	
	public Teacher(String name, String subject){
	//input of public constructor setting customization
	//public member function
		this.name = name;
		this.subject = subject;
	}

   //a method/functions of returning smth of the object
    public String getName(){
        return name;
    }
    
    public String getSubject(){
		return subject;
	}

}
