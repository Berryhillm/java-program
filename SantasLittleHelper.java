/**
 *Santa's Little Helper
 *
 *Doug Turner
 *12/6/17
 */
 
 import java.util.*;
 import java.text.*;
 
 public class SantasLittleHelper {
 	static String iFirstName, iLastName, iToy1, iToy2, iData, iPrice1, iPrice2;
 	static double cPrice1, cPrice2, cDiscount, cSub, cNewSub, cTax, cTotal;
 	static Scanner scanner;
 	static Date			today;
 	static SimpleDateFormat simpleDF1, simpleDF2;
 	static DecimalFormat dF1;
 	
 	//Main Method
 	public static void main(String[] args) {
 		init();
 		input();
 		calcs();
 		output();
 	}
 	
 	//Init Method
 	public static void init() {
 		scanner = new Scanner(System.in);
 		dF1 = new DecimalFormat("###.00");
 		scanner.useDelimiter("\r\n");
 		today	= new Date();
			
		simpleDF1 = new SimpleDateFormat( );
		simpleDF2 = new SimpleDateFormat ("EEEE MMM dd, yyyy");
 	}
 	
 	//Input Method
 	public static void input() {
 		System.out.println("Please enter the child's first name");
 		iFirstName = scanner.next();
 		
 		System.out.println("Please enter the child's last name");
 		iLastName = scanner.next();
 		
 		System.out.println("Please enter the name of the first toy");
 		iToy1 = scanner.next();
 		
 		System.out.println("Please enter the price of the first toy");
 		iPrice1 = scanner.next();
 		try {
 			cPrice1 = Double.parseDouble(iPrice1);
 		}
 		catch (Exception e){
 			System.out.println("Invalid data entered");
 		}
 
 		System.out.println("Please enter the name of the second toy");
 		iToy2 = scanner.next();
 		
 		System.out.println("Please enter the price of the second toy");
 		iPrice2 = scanner.next();
 		try {
 			cPrice2 = Double.parseDouble(iPrice2);
 		}
 		catch (Exception e) {
 			System.out.println("Invalid data entered");
 		}
 	}
 	
 	//Calcs Method
 	public static void calcs() {
 		cSub = (cPrice1 + cPrice2);
 		cTax = (cSub * .07);
 		cTotal = (cSub + cTax);
 	}
 	
 	//Output Method
 	public static void output() {
 		System.out.println("Child's name: " + iFirstName + " " + iLastName);
 		System.out.println(" ");
		System.out.println("Todays Date is: " + simpleDF2.format(today));
		System.out.println("Name of toy number 1: " + iToy1);
		System.out.println(" ");
		System.out.println("Cost of toy number 1: " + dF1.format(cPrice1));
		System.out.println(" ");
		System.out.println("Name of toy number 2: " + iToy2);
		System.out.println(" ");
		System.out.println("Cost of toy number 2: " + dF1.format(cPrice2));
		System.out.println(" ");
		System.out.println("Subtotal: " + dF1.format(cSub));
		System.out.println(" ");
		System.out.println("Tax: " + dF1.format(cTax));
		System.out.println(" ");
		System.out.println("Total Bill: " + dF1.format(cTotal));
		System.out.println(" ");
		System.out.println("Merry Christmas! The End!");
		
 	}
 }