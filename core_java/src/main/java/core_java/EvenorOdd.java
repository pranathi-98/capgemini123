package core_java;

import java.util.Scanner;


public class EvenorOdd {

	public static void main(String[] args) {
		
		System.out.print("enter the value :  ");
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
				
				String output = (n % 2 == 0)?"even number" :"odd number";
		
		System.out.println(output);

	}

}
