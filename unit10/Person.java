import java.util.*;

class Person{
	public Person(String name, int pets){
		this.name = name;
		this.pets = pets;
	}
	
	// public accessor functions
    public String getName() { return name;}
    public int getPets() {return pets;}

	// private variables
    private String name;
    private int pets;
}
