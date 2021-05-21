package core_java;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		boolean flag = false;
		for(int i=2; i<num/2; i++)
		{
			if(num % 1 == 0)
			{
				flag=true;
				break;
			}
				
		}
		if(!flag)
			System.out.println("prime");
		else
			System.out.println("not prime ");
		
		

	}

}
