package core_java;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=32;
		if(marks>60) {
			System.out.println("first division");
		}
		else
		{
			if(marks>=45 && marks<60) {
				System.out.println("second division");
			}
			else
				if(marks>=33 && marks<=45) {
					System.out.println("third division");
				}
				else
			        {
						System.out.println("fail");
					}
		}

	}

}
