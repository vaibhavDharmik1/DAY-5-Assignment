import java.io.*;  
import java.util.*;  
  
class QAR {  
  
  
    public static void main (String[] args) {  
    System.out.println("Enter the value of num1 and num2");  
    Scanner sc = new Scanner(System.in);  
    int num1 = sc.nextInt();  
    int num2 = sc.nextInt(); 
	int quotient, remainder; 
    
      
    quotient = num1 / num2;  
  
    remainder = num1 % num2;  
  
    System.out.println("Quotient when " + num1 + "/" + num2 + " is: "   
  
+ quotient);  
    System.out.println("Remainder when " + num1 + " is divided by "   
  
+ num2 + " is: " + remainder);  
    }  
}   
