package antra;

public class ReverseToggle {
		public static String revToggle(String str){  
		    String words[]=str.split("\\s");  
		    String reverseword="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        String first=sb.substring(0,1);  
		        String afterfirst=sb.substring(1);  
		        reverseword+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
		    }  
		    return reverseword.trim();
		}
		public static void main(String[] args) {
			System.out.println(revToggle("this is computer"));
		}
}
