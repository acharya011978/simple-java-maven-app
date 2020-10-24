import java.util.*;   
import java.util.Scanner;
import java.lang.*; 

class PalindromeInteger{  
 public static void main(String args[]){  
		
	Scanner in = new Scanner(System.in);   
	System.out.println("Enter a integer to check if it is a palindrome");  
	int n; 

  int r,sum=0,temp;    

try
        { 
           n = in.nextInt();  // take integer input from user  
        } 
        catch(IllegalArgumentException e) 
        { 
            System.out.println("Sorry! you provided an character, thats not allowed here. Please enter an integer!!!"); 
            throw e; // rethrowing the exception 
	     
        } 


  
  temp=n;    
  while(n>0){    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
  }    
in.close();

  if(temp==sum)    
   System.out.println("The given number is a PALINDROME number ");    
  else    
   System.out.println("The given number is a PALINDROME number ");
 
}  

}  
