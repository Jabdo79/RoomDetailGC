import java.util.Scanner;

public class RoomDetailGC {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//initialize scanner and variables that will be used
		double area=0, perimeter=0, volume=0, length=0, width=0, height=0;
		boolean cont = true;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!\n");
		
		while (cont) {
			//take user inputs
			System.out.print("Enter length: ");
			length = getDouble();
			System.out.print("Enter Width: ");
			width = getDouble();
			System.out.print("Enter Height: ");
			height = getDouble();
			//calculate are, perimeter and volume
			area = length * width;
			System.out.println("Area: " + area);
			perimeter = 2 * length + 2 * width;
			System.out.println("Perimeter: " + perimeter);
			volume = length*width*height;
			System.out.println("Volume: "+volume);
			//ask user to continue
			System.out.print("\nContinue?(y/n)");
			if(sc.next().charAt(0)!='y'){
				cont = false;
				System.out.println("\nGoodbye!");
			}
		}	
		//clean up! close the scanner!
		sc.close();
	}
	
	//validate input as a double and return a double
	public static double getDouble(){
		double correctInput=0;
		
		while(!sc.hasNextDouble()){
			System.out.println("Please enter a number.");
			sc.next();
		}
		correctInput = sc.nextDouble();
		
		return correctInput;
	}
	
}