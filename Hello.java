package antra;

public class Hello {
	public void talk() {
		System.out.print("Hello ");
	}
	public String talk(String s) {
		
		return "Hello "+s;
	}
	public static void main(String[] args) {
		Hello obj=new Hello();
		System.out.println(obj.talk("ankur"));
		
	}
}
