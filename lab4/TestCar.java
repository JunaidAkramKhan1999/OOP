public class TestCar {
	public static void main(String[] args){
	//car1 obj
	Car car1 = new Car();
	car1.carName="BMW";
	car1.carModelNum="XYZ";
	car1.carColour="Black";

	//car2 obj
	Car car2 = new Car();
	car2.carName="LandCrozer";
	car2.carModelNum="XYZ";
	car2.carColour="white";

	//car3 obj
	Car car3 = new Car();
	car3.carName="Carolla";
	car3.carModelNum="XYZ";
	car3.carColour="Red";
	
	//Display Car1 information
	System.out.println("Car1 Name : "+ car1.carName + "\nCar1 Model Number : "+ car1.carModelNum + "\nCar1 Colour :" + car1.carColour );
	//Display Car2 information
	System.out.println("Car2 Name : "+ car2.carName + "\nCar2 Model Number : "+ car2.carModelNum + "\nCar2 Colour :" + car2.carColour );
	//Display Car3 information
	System.out.println("Car3 Name : "+ car3.carName + "\nCar3 Model Number : "+ car3.carModelNum + "\nCar3 Colour :" + car3.carColour );

	//call methods
	car1.startCar();
	car1.stopCar();
	car1.Move();
	car1.turnLeft();
	car1.turnRight();	
	car1.onAC();
	car1.offAC();
	car1.OnLight();
	car1.OffLight();
	car1.onRadio();
	 car1.offRadio();
	
}
}