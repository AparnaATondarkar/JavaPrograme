import java.util.ArrayList;
import java.util.Collections;

public class Array_listDemo {
//WAP to include all possible ArrayList properties
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	ArrayList a1=new ArrayList();
	a1.add("AParna");
	a1.add(989);
	a1.add("AParna");
	a1.add(989);
	
	ArrayList<String> a2=new ArrayList<>();
	a2.add("Avinash");
	ArrayList<Integer> a3= new ArrayList<>();
	a3.addAll(a1);
	a3.add(null);
	a3.add(324);
	a3.add(null);
	System.out.println(a3);
	a1.remove(0);	
	System.out.println(a1);
	String name=a2.get(0);
	System.out.println(name);
	a2.add(1, "hgfggh");
	System.out.println(a2);
	a2.addAll(2, a1);
	System.out.println(a2);
	//a1.clear();
	System.out.println(a1);
	boolean b1=a1.contains("AParna");
	System.out.println(b1);
	ArrayList<Integer> a5= new ArrayList<>(9);
	Collections.addAll(a5, 1,23,33,45,7);
	System.out.println(a5);
	
	
	
		
	}

}

