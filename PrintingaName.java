package Constructors;

public class PrintingaName {
	

	     String name;

	    
	    public PrintingaName() {
	        name = "amrut desale";
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	    }

	    public static void main(String[] args) {
	        PrintingaName obj = new PrintingaName(); 
	        obj.display(); 
	    }
	}

