package week1.day2;

public class ChromeBrowser {
	public static void main(String[]args) {
		ChromeBrowser obj=new ChromeBrowser();
		obj.carData();
	}

	String carName ="BMW";
    int noOfWheels = 4;
    float engineCapacity = 3.0f; 
    double price = 50000.99;
    long vinNumber = 12345678901234567L; 
    char symbol = 'B'; 
    boolean isAcOn = false; 



public void carData() {
	System.out.println(carName + "\n" + noOfWheels + "\n" + engineCapacity + "\n" + price + "\n" + vinNumber + "\n"
			+ symbol + "\n" + isAcOn);
}
}
