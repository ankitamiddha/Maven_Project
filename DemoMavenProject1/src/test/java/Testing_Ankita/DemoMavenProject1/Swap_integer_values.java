package Testing_Ankita.DemoMavenProject1;

public class Swap_integer_values {

	public static void main(String[] args) {
	
		int a = 32;
		int result = 0;
		System.out.println("Print A: "+a);
		result = result + (a%10);
		a=a/10;
		result = (result*10)+a;
		System.out.println("Print result: "+result);
		

	}

}
