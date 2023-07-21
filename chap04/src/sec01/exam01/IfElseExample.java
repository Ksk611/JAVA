package sec01.exam01;
import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // 137
		Scanner sc = new Scanner(System.in);
		int score;
		
		int i>0;
//		for(int i=0; i<5; i++) {
		while(i<=5) {
			i=i+1;
			score = sc.nextInt();
			
			if(score>=60) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
			
		}
	}

	}
