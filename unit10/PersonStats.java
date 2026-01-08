import java.util.*;

class PersonStats{
	public static double averagePets(ArrayList<Person>people){
		double total = 0.0;
		double average = 0.0;
		for(Person p : people){
			total += p.getPets();
		}
		average = total/people.size();
		return average;
	}
	
	public static String namePets(ArrayList<Person>people){
		String name = " ";
		double compare = -1.0;
		for(Person p : people){
			if(p.getPets() > compare){
				compare = p.getPets();
				name = p.getName();
			}
		}
		return name;
	}
	
	public static ArrayList<Person> getPerson(ArrayList<Person>people){
		ArrayList<Person> a = new ArrayList<Person>();

        for(Person p : people){
            if(p.getPets() >= 2)
                a.add(p);
        }
		return a;
	}
	
	 public static void main(String[] args){
        ArrayList<Person> p = new ArrayList<Person>(); 

        p.add(new Person("Felicia", 1));
        p.add(new Person("Ding Dong", 0));
        p.add(new Person("Bing Bong", 4));
        p.add(new Person("Marlon", 2));

        System.out.println("average pets: " + averagePets(p));
        System.out.println();

        System.out.println("person with most pets: " + namePets(p));
        System.out.println();
        
        ArrayList<Person> names = getPerson(p);
        System.out.println("names:");
        for (Person name : names)
            System.out.println(name);
    }

}
	
