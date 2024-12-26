package Constructors;

public class AverageUsingParameterrize {
	
	    private int subject1Marks;
	    private int subject2Marks;

	   
	    public AverageUsingParameterrize(int sub1, int sub2) {
	        subject1Marks = sub1;
	        subject2Marks = sub2;
	    }

	    public double calculateAverage() {
	        return (subject1Marks + subject2Marks) / 2.0; 
	    }

	    public static void main(String[] args) {
	    	AverageUsingParameterrize student = new AverageUsingParameterrize(85, 90); 
	        double average = student.calculateAverage();
	        System.out.println("Average marks: " + average); 
	    }
	}


