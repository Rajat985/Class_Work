package Basic;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int range,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Range:");
		range = sc.nextInt();
		System.out.print("All Even Numbers are: ");
		for(int i=2;i<=range;i+=2) {
			System.out.print(i+" ");
			sum=sum+i;
			

		
		}
		System.out.print("\nSum of all Even numbers: " + sum);
		
	}

}
