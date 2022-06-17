package week1.day2;

public class printCarName {

	public void printCarName() {
		System.out.println("Maruti Swift");
	}
	
	private String getCarColor() {
		System.out.println("The car Color");
		return "red";
	}
	
	boolean isCarPunctured() {
		return false;
	}
	
	public int getCarNumber() {
		return 2111;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Syntax for accessing class object - Classname object = New Classname();
		printCarName obj1 = new printCarName();
//this is a local variable created automatically on type obj.getCarNumber() and Ctrl+2 and then press L to store the return value of method getCarNumber()
		 int carNumber = obj1.getCarNumber();
		 System.out.println(carNumber);
	}

}
