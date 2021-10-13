package Java.WhileDemo;

import java.util.Scanner;



public class WhilePrime {

	public static void main(String[] args) {
		
		int i=2;
	    int num;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number:");
			num=sc.nextInt();
		}
		boolean prime=false;
		
	
			while(i<num) {
		         if(num%i==0) {
		        	 //System.out.println("NOT PRIME");
		        	 prime=true;
		        	 
		        	 break;
		        	 
		         }
		         i=i+1;
		         
			}
		         if(prime==true){
		        	 System.out.println(num+" is a Prime Number");
		        	 
		         }
		         else{
		        	 System.out.println(num+" not a Prime Number");
		        	 
		         }
		                          
		}
		
	}

/*Output 1
 * Enter the number:5
5 not a Prime Number *


*output 2
*Enter the number:8
8 is a Prime Number*
*/


