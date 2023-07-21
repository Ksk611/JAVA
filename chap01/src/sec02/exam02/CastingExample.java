package sec02.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 10;
		int b = a;
		a = (short)b; //캐스팅 작은그릇에서 큰그릇으로 가는 것은 불가하기때문, 명시적 형변환 필요
		
		float f = 3.14f; //int, float 사이즈같음. 하지만 정수 와 실수의 차이가 있음
		//f = b; // 묵시적 형변환
		b = (int)f; // 명시적 형변환 필요
		
		System.out.println(a);
		System.out.println(b);

	}

}
