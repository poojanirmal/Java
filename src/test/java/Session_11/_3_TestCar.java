package Session_11;

public class _3_TestCar {
	
	public static void main(String[] args) {
		
		_2_BMW b = new _2_BMW();
		b.start();
		b.stop();
		b.fillFuel();
		b.engine();
		b.autoParking();
//		b.carHonk();
		_2_BMW.carHonk();
		System.out.println("...........................");
		
//		Top Casting - child class object refer by a parent class
		
		_1_Car c = new  _2_BMW();//called the method which is available in parent class and override in child class
		
		c.start();
		c.stop();
		c.fillFuel();
		c.engine();
		_1_Car.carHonk();
		System.out.println("...........................");
		
//		Top Casting
		 _0_Vehicle v = new  _2_BMW();//called the method which is available in vehicle class and override in BMW class
		
		v.engine();
		System.out.println("...........................");
		
		
//		Top CAsting
		 _0_Vehicle v1 = new  _1_Car();
		 v1.engine();
		 System.out.println("...........................");
		 
//		 Down Casting - parent class refer by child class . but java not allow it.
		 
		 _2_BMW b1 =( _2_BMW) new _1_Car();
		 
		 _2_BMW b2 = ( _2_BMW) new _0_Vehicle();
		 
		 _1_Car c2 = (_1_Car) new _0_Vehicle();
		
	}
	

}
