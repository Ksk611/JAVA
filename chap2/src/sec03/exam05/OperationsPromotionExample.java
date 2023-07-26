package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //81
//		double x = 1;
//		double y = 2;
//		double result = x/y;
//		System.out.println(result);
//		
//		int a = 1;
//		int b = 2;
//		float result1 = (float)a/b;
//		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		//byte value = x+y; 불가 
		int value = x+y;
		System.out.println(value);
		
		char a = 'A';
		char b = 1;
		int value1 = a+b;
		System.out.println("유니코드 =" + value1);
		System.out.println("출력문자 =" + (char)value1);
		
		int c =10;
		int d = c/4;
		System.out.println(d);
		
		int e = 10;
		double f = e/4.0;
		System.out.println(f);
		
		int g = 1;
		int h = 2;
		double value3=(double)g/h;
		System.out.println(value3);
		

	}

}
