package app;

import models.Student;

public class App {
	
	public static void main(String[] args)
	{
		//Creating a Student record using Parameterized Constructor
		Student s1 = new Student(1,"Namita", 21, "namita@gmail.com");
		System.out.println("Student created with parameterized constructor");
		System.out.println(s1);  
		/*We have not called the toString method that is overridden in Student class.
		 * the println method calls the object's .toSring() internally. If we did not over ride the .toString() it would give something like Student@6f539caf
		 * which is not useful.
		 *If the overridden method was not written then writing System.out.println(s1.toString()); would give the correct output
		*/
	}

}
