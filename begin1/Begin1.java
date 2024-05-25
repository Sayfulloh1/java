
import java.util.Scanner;



public class Begin1{
	public static void main(String[] args){
		double a = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side of square: ");
		a = scanner.nextDouble();
		System.out.println("Perimeter of square is: ");
		double P = 4*a;
		System.out.println(P);
	}
}
