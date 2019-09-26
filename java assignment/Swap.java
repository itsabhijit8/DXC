package java2;

import java.util.Scanner;

public class Swap {
	
    Scanner sc = new Scanner(System.in);
    
    int a,b;
    public void display()
    {
       System.out.println("Enter first num:");
       a = sc.nextInt();
       System.out.println("Enter second num:");
       b = sc.nextInt();
       b = b + a;
       a = b - a;
       b = b -a;
       System.out.println("First num =" +a);
       System.out.println("Second num =" +b);
       
    	
    	 
    }
	public static void main(String[] args){
		Swap d = new Swap();
		d.display();
		
	}

}
