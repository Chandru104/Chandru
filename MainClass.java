interface VehicleDispInfo{
	void vehicleDisplay();
}

class Vehicle implements VehicleDispInfo{
	public void vehicleDisplay(){
		final String regNo = "TN04102021";
		final String vehicleNo = "TN-21-2108";
		String vehicleType = "2 Tyre";
		System.out.println("Vehicle Registration Number is "+regNo+"\n");
		System.out.println("The Vehicle Number is "+vehicleNo+"\n");
		System.out.println("Vehicle Type is "+vehicleType+"\n");
	}

	void vehiclePrice(){
		double price = 75000;
		System.out.println("The price of this Vehicle is "+price+"\n");
	}
}

class  MainClass{
	public static void main(String[] args) 
	{
		VehicleDispInfo refObj = new Vehicle();
		refObj.vehicleDisplay();

		Vehicle obj = new Vehicle();
		obj.vehiclePrice();
	}
}