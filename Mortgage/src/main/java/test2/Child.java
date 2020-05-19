package test2;

public class Child extends GrandChild {
	String name= "test";
	
	public void marriage() {
		System.out.println("This is my child "+ name);		
	}
	
	public void dead() {
		System.out.println("Life is over in child "+ name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild gc = new Child();
		gc.marriage();
		gc.life();
		
		Child child = new Child()
;
		child.dead();
		
		String splithis = "Welcome to the India";
		String split = splithis.split("to the ")[0];
		System.out.println(split );
		
		/*
		 * for (String string : split) { System.out.println(string);
		 * 
		 * }
		 */
		
		
		
		
			
		
		
	}

}
