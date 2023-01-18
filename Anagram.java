package antra;

public class Anagram {
	public static boolean isAnagram(String s1,String s2) {
	String str1=s1.replaceAll{"\\s", ""};
	String str2=s2.replaceAll("\\s", "");
	 if(str1.length() != str2.length())
	 {
		 return false;
	 }
	 else 
	 {
		char c1[]=str1.toLowerCase().toCharArray();
		char c2[]=str2.toLowerCase().toCharArray()
	 }
	}
	public static void main(String[] args) {
		
	}
}
