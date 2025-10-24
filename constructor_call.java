
public class constructor_call {
	constructor_call(){
		this(10);
		System.out.println("In Default constructor");
		
	}
	
	constructor_call(int a){
		System.out.println("In Parametarize constructor constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructor_call c1 =new constructor_call();
		//constructor_call c2 =new constructor_call(10);
		
	}

}
