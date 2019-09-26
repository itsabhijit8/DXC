package java2;

import java.util.Date;
import java.util.Scanner;

public class Assignment {
	
    String favLetter;
    Scanner sc = new Scanner(System.in);
    public void display()
    {
    	System.out.println("Enter your favourite letter:");
        favLetter = sc.next();
        if(favLetter = 97){
        	System.out.println("Charecter is vowel");
        }
        if(favLetter = e){
        	System.out.println("Charecter is vowel");
        }
        if(favLetter = i){
        	System.out.println("Charecter is vowel");
        }
        if(favLetter = o){
        	System.out.println("Charecter is vowel");
        }
        if(favLetter = u){
        	System.out.println("Charecter is vowel");
        }
        else {
        	System.out.println("Character is not a vowel")
        }
        
    }
	public static void main(String[] args){
		Assignment d = new Assignment();
		d.display();
		
	}

}
