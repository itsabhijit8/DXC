package java2;

import java.util.Scanner;

public class Demo6 {
	
    Scanner sc = new Scanner(System.in);
    
    int num1,num2;
    public void display()
    {
       System.out.println("Enter first num:");
       num1 = sc.nextInt();
       System.out.println("Enter second num:");
       num2 = sc.nextInt();
       if(num1<0) {
    	   System.out.println("Please enter positive num");
       }
       else if(num2<2) {
    	   System.out.println("Please enter positive num");
       }
       else {
    	   System.out.println("The sum of both the numbers is:" +(num1+num2));
       }
    	
    	 
    }
	public static void main(String[] args){
		Demo6 d = new Demo6();
		d.display();
		
	}

}
