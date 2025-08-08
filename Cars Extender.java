package one;
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	
	void displaydetails() {
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand, String model, String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	void displaydetails() {
		super.displaydetails();
		System.out.println("Fuel Type:"+fuelType);
	}
}

class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand, String model, String fuelType, double batteryCapacity) {
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	void displaydetails() {
		super.displaydetails();
		System.out.println("Battery Capacity(in kwh):"+batteryCapacity+ "kwh");
		
	}
}
public class Veriton {
	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar("Tesla", "Model Y", "Electric", 100.0);
		electricCar.displaydetails();
	}

}
