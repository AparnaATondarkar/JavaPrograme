import java.util.Arrays;

public class convert_string_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Aparna";
		char[] c1=name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			System.out.println(c1[i]);
		}
		System.out.println(Arrays.toString(c1));

	}

}
