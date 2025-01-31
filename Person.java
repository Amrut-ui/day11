package Constructors;

public class Person {
	

	    private String name;
	    private int age;
	    private String country;

	   
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	   
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age >= 0) { 
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Age cannot be negative.");
	        }
	    }

	
	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	   
	    public static void main(String[] args) {
	        Person person = new Person();

	        person.setName("amrut desale");
	        person.setAge(24);
	        person.setCountry("India");

	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	        System.out.println("Country: " + person.getCountry());
	    }
	}

