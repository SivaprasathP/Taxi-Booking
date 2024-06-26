package sample;
import java.util.*;
public class TaxiBook {
	private static ArrayList<Taxi> taxiList=new ArrayList<Taxi>();
	private static int taxiLimit=4,idGenerator=1,tId=1;
	private static ArrayList<Taxi> taxiBookedHistory=new ArrayList<Taxi>();
	
	public static String booking(char pickupLocation,char dropLocation,int pickupTime) {
		if(taxiList.size()<taxiLimit) {
			taxiList.add(new Taxi(tId++));
		}
		
		int min=Integer.MAX_VALUE;
		Taxi taxiReady=null;
		
		for(Taxi t:taxiList) {
			if(t.getDropTime()<=pickupTime && Math.abs(pickupLocation-t.getCurrentLocation())<=min) {
				if(Math.abs(pickupLocation-t.getCurrentLocation())==min) {
					if(taxiReady!=null && t.getEarnings()<taxiReady.getEarnings()) {
						taxiReady=t;
					}
				}else {
					taxiReady=t;
					min=Math.abs(pickupLocation- t.getCurrentLocation());
				}
			}
		}
		
		if(taxiReady!=null) {
			taxiReady.setCustomerId(idGenerator++);
			taxiReady.setPickupTime(pickupTime);
			taxiReady.setPickupLocation(pickupLocation);
			taxiReady.setDropLocation(dropLocation);
			taxiReady.setCurrentLocation(dropLocation);
			taxiReady.setDropTime(pickupTime + Math.abs(dropLocation-pickupLocation));//for A to B it takes 1 hour
			taxiReady.setEarnings((taxiReady.getEarnings()) + (Math.abs(dropLocation-pickupLocation)*15-5)*100 + 100);
			taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1);
			taxiBookedHistory.add(taxiReady);
		}
		
		return taxiReady!=null?"Taxi number "+taxiReady.getTaxiId()+" is booked!":"Taxis are not available";
	}
	
	public static void display() {
		System.out.println("-----------------------------------------------------------------");
		for(Taxi t:taxiBookedHistory) {
			System.out.println(t.toString());
			System.out.println("-----------------------------------------------------------------");
		}
	}
}
