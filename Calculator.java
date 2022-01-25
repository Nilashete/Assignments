package Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float c;
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter first number");
		float a1= sc.nextFloat();  
	 
		System.out.println("enter second number");
		float a2 = sc.nextFloat();		
        System.out.println("Enter operator 2.+, 3.-, 4.*, 5./");
        int op = sc.nextInt();
		
		//int op = 0;
		if(op == 2){
			System.out.println(" Addition" +(a1+a2));
			
			
			
		}else if(op==3) {
			
				System.out.println("subrtraction " +(a1-a2));
				
			
				
		}else if(op==4) {
			
				System.out.println("multiplication " +(a1*a2));
				
			
				
		}else if(op==5) {
			
				System.out.println("Division " +(a1/a2));
				
		}else{
			System.out.println("invalid input ");
		}
		}
	}


