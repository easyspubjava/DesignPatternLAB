package factorymethod;

public abstract class CarFactory {

	
	public abstract Car createCar(String name);  // add - on

	public abstract Car returnMyCar(String name);
}