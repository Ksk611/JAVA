package sec03exam01;

public class WarpperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10";
		//String str = new string("10");
		byte value= Byte.parseByte(str);
		System.out.println(value);
		
		String str2 = "true";
		boolean value2 = Boolean.parseBoolean(str2);
		System.out.println(value2);
		
		int value3 = Integer.parseInt("10");
		String str3 = String.valueOf(value3);
		System.out.println(str3);
	}

}
