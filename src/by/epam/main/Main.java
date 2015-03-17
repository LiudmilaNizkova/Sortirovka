package by.epam.main;


import by.epam.execution.Execution;

public class Main {
	public static String[] massive;
	
	public static void main(String[] args) {
		 
		massive =  new String [3];
		
		massive[0] = "It returns a newly allocated character arraY";
		massive[1] = "whOse length Is the length of this string And";
		massive[2] = "contents Are initializEd to contain the character seqUence";
		Execution mas = new Execution ();
		mas.printArray(massive);
		mas.sortirovka(massive);
		System.out.println("RESULT:");
		mas.printArray(massive);
				
	}
}