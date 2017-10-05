/*
 * Processes numbers
 * 
 * @author derfelterciano
 * @version 0.1
 * 
 * 
 * 
 */
import java.util.*;
public class ProcessingNumbers {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("How many #s are you going to use today?: ");
		int times = input.nextInt();
		int result = 0;
		int smallestNum =999999999;
		int biggestNum =-999999999;
		int biggestNumEven=-999999999;
		for(int i=1; i<= times; i++) {
			System.out.print("Enter number "+ i+": ");
			int given = input.nextInt();
			System.out.println();
			if (given%2==0) {
				result+=given;
				if (given > biggestNumEven) {
					biggestNumEven=given;
				}
			} 
			if (given < smallestNum) {
				smallestNum = given;
			}
			if (given > biggestNum) {
				biggestNum=given;
			}
		}
		if (biggestNumEven==-999999999) {
			biggestNumEven=0;
		}
		System.out.println("sum of even numbers: "+result);
		System.out.println("Biggest Even number: "+ biggestNumEven);
		System.out.println("biggest: "+biggestNum);
		System.out.println("smallest: "+smallestNum);
	}
}
