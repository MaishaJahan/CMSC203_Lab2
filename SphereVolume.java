import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double diam, radius, volume;
		
		System.out.println("This program with find the volume of a sphere");
		System.out.println("What is the diameter: ");
		diam = input.nextDouble();
		radius = 2.0 / diam;
		
		volume = (4.0/3.0)* Math.PI * (Math.pow(radius, 3));
		System.out.println("The volume is: " + volume);

	}

}
