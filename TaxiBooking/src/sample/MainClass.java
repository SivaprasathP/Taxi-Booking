package sample;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean loop=true;
		
		while(loop) {
			System.out.println("Choose any one\n1.Book Taxi\n2.Display Details\n3.Exit");
			int n=in.nextInt();
			
			switch(n) {
			case 1:
			{
				System.out.println("Enter Pickup Location:");
				char pickupLocation=in.next().charAt(0);
				System.out.println("Enter Drop Location:");
				char dropLocation=in.next().charAt(0);
				System.out.println("Enter Pickup Time:");
				int pickupTime=in.nextInt();
				System.out.println(TaxiBook.booking(pickupLocation,dropLocation,pickupTime));
				break;
			}
			case 2:
			{
				TaxiBook.display();
				break;
			}
			case 3:
			{
				loop=false;
				System.out.println("\tThank You!!");
				in.close();
				break;
			}
			}
		}
	}
}
