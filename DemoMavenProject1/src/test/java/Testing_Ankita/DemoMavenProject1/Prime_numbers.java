package Testing_Ankita.DemoMavenProject1;

public class Prime_numbers {

	public static void main(String[] args) {
	int tocheck = 7;
	int m;
	int count = 0;
	m=tocheck/2;
	if (tocheck==0||tocheck==1) {
		System.out.println(tocheck+" is not a prime number");
	}else {
		for(int i = 2;i<=m;i++) {
			if(tocheck%i==0) {
				count++;
				System.out.println(tocheck+" is not a prime number");
				break;
		}
	}

	}
	if(count==0)
	System.out.println(tocheck+" is a prime number");	

	}
}
