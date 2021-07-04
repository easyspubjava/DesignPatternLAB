package factorymethod;

public class CarTest {

	public static void main(String[] args) {

		CarFactory factory = new HyundaiFactory();
		Car newCar = factory.createCar("sonata");
		
		System.out.println(newCar);
		
		
		Car myCar = factory.returnMyCar("Tomas");
		Car hisCar = factory.returnMyCar("Tomas");
		System.out.println(myCar == hisCar);
		
		
	}

}
