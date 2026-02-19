package week3.day4;

public class VehicleSwift extends VehicleToyota {

	public void CarName() {

		super.CarName();

		System.out.println("Swift Sports");

	}

	public void Break() {

		System.out.println("Alloy Breaking");
	}

	public static void main(String[] args) {

		VehicleSwift obj1 = new VehicleSwift();

		obj1.CarName();
		obj1.Break();

	}

}
