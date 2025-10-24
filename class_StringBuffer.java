
public class class_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Manual");
		s1.append(" Testing");
		System.out.println(s1);
	s1.insert(7, 'A');
	System.out.println(s1);
		s1.insert(7, "API");
		System.out.println(s1);
		s1.replace(0, 7, "Automation ");
		System.out.println(s1);
		s1.delete(14, 15);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		int count=s1.capacity();
		System.out.println(count);
		s1.ensureCapacity(10);
		System.out.println(s1);
		
	}

}
