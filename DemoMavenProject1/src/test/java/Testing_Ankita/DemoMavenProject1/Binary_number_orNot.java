package Testing_Ankita.DemoMavenProject1;

public class Binary_number_orNot {

	public static void main(String[] args) {
		int a = 1021;
		int count = 0;
		
		while(a!=0) {
			if(a%10>1) {
				count++;							
			}			
			a=a/10;
			
		}
		if (count>0) {
			System.out.println("The number is not binary in nature");
		}
		else {
			System.out.println("The number is binary in nature");
		}

	}

}
