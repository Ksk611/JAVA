package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub //93p
//		int keyCode1,keyCode2;
//		
//		System.out.print("첫번째 수 입력: ");
//		keyCode1 = System.in.read();
////		System.out.print("두번째 수 입력: ");
////		keyCode2 = System.in.read();
//		System.out.println(keyCode1 );
//		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:"+ keyCode);
			if(keyCode==113) {
				break;
			}
		}
		System.out.println("종료");
		
	}

}
