package core_java;

public class Switch {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++)
		{
			switch(i)
		{
		
		case 1 : System.out.println("i=1");
		break;
		case 2 : System.out.println("i=2");
		break;
		case 3 : System.out.println("i=3");
		break;
		case 4 : System.out.println("fail");
		break;
		default : System.out.println("invaild choice");
		}

	}

}
}
