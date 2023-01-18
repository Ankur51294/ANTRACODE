package antra;

public class SubString {
	public static void main(String[] args) {
		String s="java";
		findAllSubtring(s);
	}

	private static void findAllSubtring(String s) {
		String output="";
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = 0; j <= s.length()-1; j++) {
				String substring = s.substring(i, j);
				output=output+substring;
				
			}
			
		}
		System.out.println(output);
		
		
	}

}
