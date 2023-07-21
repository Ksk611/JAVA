package sec01.exam01;

public class FirstClassTest {
	static int a=0;
	int b;
	
	public FirstClassTest() {
		a++;
		System.out.println("constructor");
	}
	
	public void method1() {
		
	System.out.println("Static");
	System.out.println("b"+"method");
    }
}
