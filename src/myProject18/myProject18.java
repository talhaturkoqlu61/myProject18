package myProject18;
import java.util.Scanner;

public class myProject18 {
	public static void main(String[]args) {
		int input,total=0;
		Scanner inp=new Scanner(System.in);
		
		do {
			System.out.print("Please enter a number:");
			input=inp.nextInt();
			if(input%2!=0) {
				System.out.println("Program has ended!");
				System.out.println("Total:"+total);
				
			}
			else if(input%4==0) {
				total+=input;
				System.out.println("Total:"+total);
				
				
			}
		}while(input%2==0);
		
	
		}
		
	
		
			
		}
	


