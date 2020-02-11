import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator 
{
	public static void main(String[] args) 
	{
		      Scanner sc=new Scanner(System.in);
      
      
	  System.out.println("Enter two numbers");
      int num1=sc.nextInt();
	   
      int num2=sc.nextInt();
	  Scanner sc1=new Scanner(System.in);
	  System.out.println("Choose operation to be formed ");
      System.out.println("1.(+)Addition");
      System.out.println("2.(-)Subtraction");
      System.out.println("3.(*)Multiplication");
      System.out.println("4.(/)Division");
	  char choice=sc1.next().charAt(0);
     
      switch(choice)
      {
          case '+':
                   System.out.println(add(num1,num2));
                   break;
          case '-': 
                   System.out.println(sub(num1,num2)); 
                   break;
          case '*': 
                   System.out.println(mul(num1,num2)); 
                   break; 
          case '/': 
                   System.out.println(div(num1,num2));       
                   break;
          default:  System.out.println("No operation");
                     break;                           
      }

	}
	static int add(int n1,int n2){
	return n1+n2;
	}
	static int sub(int n1,int n2){
	return n1-n2;
	}
	static int mul(int n1,int n2){
	return n1*n2;
	}
	static int div(int n1,int n2){
    return n1/n2;	
	}

}
