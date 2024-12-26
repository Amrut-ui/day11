package Constructors;

public class ProgrammingLanguages {
	

	    String language1;
	    String language2;
	    String language3;

	    
	    public ProgrammingLanguages(String lang1, String lang2, String lang3) {
	        language1 = lang1;
	        language2 = lang2;
	        language3 = lang3;
	    }

	    public void printLanguages() {
	        System.out.println("Programming Languages:");
	        System.out.println(language1);
	        System.out.println(language2);
	        System.out.println(language3);
	    }

	    public static void main(String[] args) {
	        ProgrammingLanguages languages = new ProgrammingLanguages("Java", "Python", "C++");
	        languages.printLanguages();
	    }
	}


