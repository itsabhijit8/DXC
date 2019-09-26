package java2;

import java.util.Scanner;

public class Leapyear {
	
    Scanner sc = new Scanner(System.in);
    
    int num1;
    public void display()
    {
       System.out.println("Enter year:");
       num1 = sc.nextInt();
       
       if(num1%4!=0) {
    	   System.out.println("Given year is not a leap year");
       }
       else {
    	   System.out.println("Given year is a leap year");
       }
    	
    	 
    }
	public static void main(String[] args){
		Leapyear d = new Leapyear();
		d.display();
		
	}

}
