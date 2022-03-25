package Default;

public class SrtingMethods1 {

	public static void main(String[] args) {
		String s ="Welcome";
		String s1 = "to Java";
		
		System.out.println(s.length()); //to find the length of a string
		System.out.println(s.concat(s1)); // to do the concatenation of strings
		
		//s.trim() cuts down 
		s ="	Welcome		";
		System.out.println("Before trimming is " +s);
		System.out.println("After trimming string is " +s.trim()); 
		
		//charAt()
		System.out.println(s.charAt(4)); //gives the character value at that index
		
		// contains() ---returns true
		System.out.println(s.contains("com")); //Gives true if the string is present in the input string
		
		//comparing strings equals()
		s="Welcome";
		s1="Welcome";
		System.out.println(s.equals(s1)); // True
		System.out.println(s.equals("Wel Come")); //false
		System.out.println(s.equals("welcome")); //false
		
		System.out.println(s.equalsIgnoreCase("welcome")); // true //It will match the characters and ignore the case sensitivity
		
		//replacing characters
		s="Welcome to Java";
	
		System.out.println(s.replace('o','i'));//replaces o with i
		
		System.out.println(s.replace("Java","Selenium")); //replaces Java with Selenium
		
		// Substring - gives a particular part of the string using start and the end index
		String s2="Welcome to Java";
		System.out.println(s2.substring(0,3));
		System.out.println(s2.substring(3,7));
		
		//Converting case
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
	}

}
