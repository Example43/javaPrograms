package JavaBasicProgarms.JavaBasicProgarms;

public class GitStringTest {

	public static void main(String[] args) {
		
		String str = new String("vaishnavi Reddy");		
		String str1 = "Krishna Reddy";
		String str2 = "vaishnavi Reddy";
		String str3 = "Patil Reddy";
		String str4 = "Reddy";
		System.out.println(str3+str4);
		//int abc=str.indexOf(0, 2);
		
		int sss = str.lastIndexOf(str);
		System.out.println(sss);
	
			
		System.out.println(str1 == str2);
		System.out.println(str1 == str);

		// Contains
		boolean s = str1.contains("Reddy");
		boolean s1 = str1.contains("Apple");
		System.out.println(s);
		System.out.println(s1);

		// Substring
		System.out.println(str1.substring(0));
		System.out.println(str2.substring(0, 6));
		System.out.println(str2.substring(6, 9));

		// Join and concat
		String fullname = String.join("-", str1, str2, " " + str3);
		String fullname1 = str1.concat(str3);
		System.out.println(fullname);
		System.out.println(fullname1);

		// Char value for particular given index
		char char1 = str1.charAt(6);
		System.out.println(char1);

		// Checking string ends given char
		boolean endChar = str.endsWith("y");
		System.out.println(endChar);

		// Comparing two stings
		boolean compare = str1.contentEquals(str4);
		System.out.println(compare);
		 boolean compare2 = str.equals(str2);
		System.out.println(compare2);
		System.out.println(str.compareTo(str4));

		// HashCode of String
		int hashcode1 = str1.hashCode();
		System.out.println(hashcode1);

		// Index of particular char in string
		int indexofchar = str2.indexOf("u");
		System.out.println(indexofchar);

		// Repeating String
		String repeatingString = str1.repeat(7);
		System.out.println(repeatingString);
	}
}
