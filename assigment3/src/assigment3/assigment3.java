package assigment3;

import java.util.Scanner;

public class assigment3 {

	public static void main(String[] args) {
		printInfo();
		printitems();
		printcalculate();

	}	
		public static void printInfo() {
		Scanner sc = new Scanner(System.in);	
			
		
		System.out.println("**************WELCOME TO IZANS BEUTY**********");
		System.out.println("Please tell me about yourself.");
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("How old are you? ");
		int age = sc.nextInt();
		System.out.println("What is your id number?");
		int ic = sc.nextInt();
		System.out.println("What is your gender?");
		char gender = sc.next().charAt(0);
		System.out.println("What is your phone number?");
		int phone = sc.nextInt();
		System.out.println(" ");
		
		
		
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ic number: " + ic);
		System.out.println("Gender: " + gender);
		System.out.println("HP: " + phone);
		
		}
		
		public static void printitems() {	
		
		
		System.out.println("product mackup");
		System.out.println();
		
		System.out.println("TODAY IS A SPECIAL DAY PROMOSI!!!!!!!");
		System.out.println();
		
		String[] mackup = {"lipstick","maskara","eyeliner","foundation","blusher"};
		
		System.out.println(mackup[0] + " RM20");
		System.out.println(mackup[1] + " RM25");
		System.out.println(mackup[2] + " RM15");
		System.out.println(mackup[3] + " RM30");
		System.out.println(mackup[4] + " RM10");
		}
		
		
		
		public static void printcalculate() { 
		
		Scanner in = new Scanner(System.in);
			 
		System.out.println("****************************************************");
		int quantity1= 0, quantity2=0, quantity3=0, quantity4=0, quantity5=0;
		int item1=0,item2=0,item3=0,item4=0,item5=0;
		
		String[] mackup = {"lipstick","maskara","eyeliner","foundation","blusher"};
		int price [] = {20,25,15,30,10};
		
		
		System.out.print("HOW MANY YOU WANT?");
		System.out.println();
		
		
		System.out.println(mackup[0]);
		quantity1=in.nextInt();
		item1 = (price[0] *quantity1);
		System.out.println(mackup[0] + " RM " + item1);	
		System.out.println(mackup[1]);
		System.out.println();
		
		System.out.print("Enter quantity product:");
		quantity2=in.nextInt();
		item2 = (price[1]*quantity2);
		System.out.println(mackup[1] + " RM " + item2);
		System.out.println(mackup[2]);
		System.out.println();
		
		
		System.out.print("Enter quantity product:");
		 quantity3=in.nextInt();
		item3 = (price[2]*quantity3);
		System.out.println(mackup[2] + " RM " + item3);
		System.out.println(mackup[3]);
		System.out.println();
		
		System.out.print("Enter quantity product:");
		quantity4=in.nextInt();
		item4 = (price[3]*quantity4);
		System.out.println(mackup[3] + " RM " + item4);
		System.out.println(mackup[4]);
		System.out.println();
		
		System.out.print("Enter quantity product:");
		quantity5=in.nextInt();
		item5 = (price[4]*quantity5);
		System.out.println(mackup[4] + " RM " + item5);
			System.out.println();
		
		System.out.println();
		double total = (item1+item2+item3+item4+item5);
		
		
		System.out.println("Total price : RM"+ total);
		
		}
}

	