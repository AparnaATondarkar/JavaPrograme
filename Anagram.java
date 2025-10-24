import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"WAP to find out the given string is an Anagram
		String name="saw";
		String name1="was";
		if(name.length()!=name1.length()) {
			System.out.println("Given String are not anagram because they are different in size");	
		}
		else {
			char[] c1=name.toCharArray();
			char[] c2=name1.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean ans=Arrays.equals(c1,c2);
			if(ans=true) {
				System.out.println("Given string is anagram");
			}
			else {
				System.out.println("Given string is not anagram");
			}
		}
		

	}

}
