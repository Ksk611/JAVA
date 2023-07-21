package sec02.exam02;

import java.util.Scanner;

public class ArrayScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int sum=0;
		double avg;
		
		for(int i=0; i<scores.length; i++) {
			scores[1] = sc.nextInt();
//			sum += scores[i];
			
		}
		sum = add(scores);
		avg = sum/5.0;
		System.out.println("Average:" + avg);
		reverse(scores);
		
	}
	
	public static void reverse(int[] scores) {
		for(int i=4; i>=0; i--) {
			System.out.println(scores[1]+" ");
		}
		
	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
	}

}
