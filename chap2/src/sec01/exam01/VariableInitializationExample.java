package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //52
		int value = 50;
		
		int result = value + 10 ;
		
		System.out.println(result);
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour *60)+minute;
//		int totalMinute = (3 *60) + minute;
//		int totalMinute = 180 + 5;
//		int totalMinute = 185;
		
		System.out.println("총"+totalMinute+"분");
		

	}

}
