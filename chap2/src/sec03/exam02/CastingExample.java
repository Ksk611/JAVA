package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//75
		//캐스팅 하는 이유 : 원래 큰범위 타입에서 작은 타입으로 가는것은 불가능 그래서 강제로 캐스팅을 하는것. 실수타입(float, double)에서 정수 타입으로 캐스팅하면 소수점은 버려지고 저장된다.
		//byte < short < int < long < float < double
		int intValue = 44032;
		char charValue =(char) intValue;
		
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue =(int) doubleValue;
		System.out.println(intValue);
		
		

	}

}
