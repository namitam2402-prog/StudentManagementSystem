package models;

/**
 * Simple Student model demonstrating:
 * - fields (instance variables)
 * - constructors
 * - getters and setters (encapsulation)
 * - toString override
 */

public class Student {

	private int id;
	private String name;
	private int age;
	private String email;
	
	
	public Student() {
		//This is a no- argument constructor
	}
	
	public Student(int id, String name, int age,String email)
	{//This is a parameterized constructor
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	//getters and setters (encapsulation)
	public int getId() {
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if (age > 0 ) 
			this.age = age;
		else 
			System.out.println("Enter a valid age.");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email =email;
	}
	
	
	//Useful for printing the object
	@Override
	public String toString()
	{
		return "Student{" +
				"id =" + id +
				", age=" + age +
				", name=" + name +
				", email="+email + "}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
