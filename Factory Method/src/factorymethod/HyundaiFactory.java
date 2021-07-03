package factorymethod;

import java.util.HashMap;

public class HyundaiFactory extends CarFactory{

	HashMap<String, Car> carMap = new HashMap<String, Car>();
	
	@Override
	public Car createCar(String name) {

		Car car = null;
		
		if (name == "sonata") {
			car = new Sonata();
		}
		else if( name == "santafe") {
			car =  new Santafe();
		}
		
		return car;
	}
	
	@Override
	public Car returnMyCar(String name) {
		
	// Jame는 Sonata, Tomas는 Santafe 인 경우
		
		Car myCar = carMap.get(name);
		if(myCar == null) {
			
			if(name.equals("James")){
				myCar = new Sonata();
			}
			else if(name.equals("Tomas") ){
				myCar = new Santafe();
			}
			carMap.put(name, myCar);
		}
		
		return myCar;
		
	}

}
