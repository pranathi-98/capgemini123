package day2;

public class Reverse_of_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class Main {
		//	  public static void main(String[] args) {

			    int num = 1234, reversed = 0;

			    while(num != 0) {
			    
			      int digit = num % 10;
			      reversed = reversed * 10 + digit;
			      num /= 10;
			    }

			    System.out.println("Reversed Number: " + reversed);
			  }
	}
