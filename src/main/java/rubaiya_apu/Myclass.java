package rubaiya_apu;

public class Myclass {
	
	int x=10;
	String name = "Tanni";
	
	public static void main(String[] args) {
	
		Myclass myobj = new Myclass();
		Myclass myobj1 = new Myclass();
		myobj.x=40; //to over write the value
		System.out.println(myobj.x);
		System.out.println(myobj1.name);
		
	}
}
