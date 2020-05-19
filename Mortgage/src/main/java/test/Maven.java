package test;

public class Maven extends ParentCalss{
	
	boolean isEtea;
	
	public void testMaven(){
		System.out.println("This is child constructor");
		System.out.println(isEtea);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* System.out.println("This is first"); */
		
		Maven maven = new Maven();
		maven.testMaven();

	}

}
