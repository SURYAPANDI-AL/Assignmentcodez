

import java.util.Scanner;
import java.util.Stack;

public class ChatBot  {
	static Stack<Integer>stk= new Stack<>();
	
	public static void main(String []args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to chat bot service!!!....\n");
		Thread.sleep(1000);
		//System.out.println("press 1 to continue.\n");
		int input=1,count=0;
		while(input!=5){
			if(input!=0) {
				stk.push(input);
			}
			else if(input==0) {
				stk.pop();
				//stk.pop();
				input=stk.peek();
				count=count-2;
				continue;
			}
			if(input==1&&count==0) {
				Thread.sleep(500);
				//language settings.
				System.out.println("_______________________Language settings:________________________________\n");
				Thread.sleep(500);
				System.out.println("Press 1 - English language.\n");
				Thread.sleep(500);
				System.out.println("Press 2 - Tamil language.\n");
				Thread.sleep(500);
				System.out.println("Press 3 - Hindi language.\n");
				Thread.sleep(500);
				System.out.println("\nPress 5 - Exit.\n");
				count++;
			}
			else if((input==1||input==2||input==3)&&count==1) {
				Thread.sleep(500);
				//Services.
				System.out.println("____________________Main menu:_________________________\n");
				Thread.sleep(500);
				System.out.println("Press 1 - Blance and validity.\n");
				Thread.sleep(500);
				System.out.println("Press 2 - Value added Service.\n");
				Thread.sleep(500);
				System.out.println("Press 3 - Complaints.\n");
                Thread.sleep(500);
				System.out.println("press 0 - Go back.\n");
				Thread.sleep(500);
				System.out.println("\npress 5 - Exit.\n");
				count++;
			}
			else if(input==1&&count==2) {
				Thread.sleep(500);
				//Services.
				System.out.println("You had recharged to one month plan at Rs.249 and the pack validity ends on feb-04-2023.\n");
				break;
			}
			else if(input==3&&count==2) {
				Thread.sleep(500);
				//Services.
				System.out.println("Your complaints are here.we will contect you as soon as possible.\n");
				
				break;
			}
			else if(input==2&&count==2) {
				Thread.sleep(500);
				//RecomendedServices.
				System.out.println("_________________________Recommended services:_____________________________________\n");
				Thread.sleep(500);
				System.out.println("Press 1 - Caller tune.\n");
				Thread.sleep(500);
				System.out.println("Press 2 - cricket score.\n");
				Thread.sleep(500);
				System.out.println("Press 3 - Astrology.\n");
				Thread.sleep(500);
				System.out.println("press 0 - Go back.\n");
				Thread.sleep(500);
				System.out.println("\nPress 5 - Exit.\n");
				count++;
			}
			else if((input==2||input==1||input==3)&&count==3) {
				Thread.sleep(500);
				//RecomendedServices.
				System.out.println("Thanks for making the subscribtion Enjoy the Service.....\nValidity:one month by today.\n");
				break;
			}
			else {
				Thread.sleep(1000);
				System.out.println("Enter a valid input.");
				stk.pop();
			}
            System.out.print("enter:");
			input=sc.nextInt();
			
		}
		Thread.sleep(1000);
		System.out.println("\nthanks for using the chat bot..");
		Thread.sleep(1500);
		System.out.println("\n\nGood day to you :)");
		sc.close();
	}
}
