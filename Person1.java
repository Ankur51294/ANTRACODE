package antra;

public class Person1
{
	 public void speak()
	 {
		 System.out.println("I'm a person");
	 }
	 public static void main(String[] args)
	 {
		 Person1 p1 = new Student1();
		 p1.speak();
	 }
}
class Student1 extends Person1
{
 // ADD CODE HERE
	public void speak()
	 {
		 System.out.println("I'm a student");
	 }
	
}