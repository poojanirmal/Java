package Session_9;

public class _2_Car {
	
//	below data members are subject to change for every car so declared as non static

	String name;
	int price;
	String colour;
	
//	As  wheels is an constant entity for a car so declared as static
	
	static int wheels = 4;
	
	public static void main (String args[]) 
	{
//		Assigning the value for sport car
		System.out.println("................Sport car details...............");
		_2_Car sportCar = new _2_Car();
		
//		sportCar.name = "BMW";
//		System.out.println(sportCar.name = "BMW");
		
		sportCar.name = "BMW";
		sportCar.price = 60000;
		sportCar.colour = "Sterling Black";
//		sportCar.wheels = 5;
		
		
		System.out.println(sportCar.name);
		System.out.println(sportCar.price);
		System.out.println(sportCar.colour);
//		System.out.println(sportCar.wheels);// avoid using this and directly use static variable
		System.out.println(wheels);
		

//		Assigning the value for passenger car
		System.out.println("................Passenger car details...............");
		
		_2_Car passengerCar = new _2_Car();
		

		
		passengerCar.name = "Grand i10";
		passengerCar.price = 4000;
		passengerCar.colour = "White";
//		passengerCar.wheels = 5;
		
		
		System.out.println(passengerCar.name);
		System.out.println(passengerCar.price);
		System.out.println(passengerCar.colour);
//		System.out.println(passengerCar.wheels);// avoid using this and directly use static variable
		System.out.println(wheels);
		
		
		
		
		
		
		
		
		
		
	}

}
