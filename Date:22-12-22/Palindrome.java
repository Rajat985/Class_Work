package Basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	int r,sum=0,temp,num;
	Scanner in = new Scanner(System.in);
    System.out.print("Enter a number :  ");
    num=in.nextInt();
    temp=num;
    while(num>0){    
    	   r=num%10;  
    	   sum=(sum*10)+r;    
    	   num=num/10;    
    	  }  
    if(temp==sum) 
    	System.out.print("This Is a Palindrome Number");
    
    else
    	System.out.print("This Number is not a Palindrome Number");
   

	}

}
