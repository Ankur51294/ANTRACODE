package antra;

public class Pet
{
	 public void brag()
	 {
		 System.out.println("I have the best pet!");
	 }
	 public static void main(String[] args)
	 {
		 Cat d1 = new Cat();
		 d1.brag();
	 }
}
class Cat extends Pet
{
	 public void brag()
	 {
		 super.brag();
		 System.out.println("I have the best dog!");
	 }
	 
}
