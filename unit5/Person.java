public class Person{
	//constructor - constructing the object of the class
	
	//initating private member or basically a parameter/possible customization
	private String name;
	private int pet;
	
	
	public Person(String nameIn, int petIn){
	//input of public constructor setting customization
	//public member function
		name = nameIn;
		pet = petIn;
	}

   //a method/functions of returning smth of the object
    public String getName(){
        return name;
    }
    
    public int getPet(){
		return pet;
	}
    
    public String greeting(){
		return "Hello, my name is " + name + " and I have " + pet + " pets.";
	}
	

}
