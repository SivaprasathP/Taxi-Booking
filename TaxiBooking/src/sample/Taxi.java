package sample;

public class Taxi {
	private char currentLocation = 'A';//initially all taxi are at A
	private int customerId=0;
	private int taxiId;
	private char pickupLocation;
	private char dropLocation;
	private int pickupTime;
	private int dropTime=0;
	private int earnings;
	
	public Taxi(int taxiId) {
		this.taxiId=taxiId;
	}
	
	public int getDropTime() {
		return dropTime;
	}
	
	public void setDropTime(int dropTime) {
		this.dropTime=dropTime;
	}
	
	public int getTaxiId() {
		return taxiId;
	}
	
	public void setTaxiId(int taxiId) {
		this.taxiId=taxiId;
	}
	
	public char getCurrentLocation() {
		return currentLocation;
	}
	
	public void setCurrentLocation(char currentLocation) {
		this.currentLocation=currentLocation;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	
	public char getPickupLocation() {
		return pickupLocation;
	}
	
	public void setPickupLocation(char pickupLocation) {
		this.pickupLocation=pickupLocation;
	}
	
	public char getDropLocation() {
		return dropLocation;
	}
	
	public void setDropLocation(char dropLocation) {
		this.dropLocation=dropLocation;
	}
	
	public int getPickupTime() {
		return pickupTime;
	}
	
	public void setPickupTime(int pickupTime) {
		this.pickupTime=pickupTime;
	}
	
	public int getEarnings() {
		return earnings;
	}
	
	public void setEarnings(int earnings) {
		this.earnings=earnings;
	}
	
	@Override
	public String toString() {
		return "Taxi:"+getTaxiId()+"\ncurrentLocation:"+currentLocation+"\ncustomerId:"+customerId+"\npickupLocation:"+pickupLocation+"\ndropLocation:"+dropLocation+"\npickupTime"+pickupTime+"\ndropTime"+dropTime+"\nearnings:"+earnings;
	}
}
