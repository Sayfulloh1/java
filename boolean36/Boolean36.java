import java.util.Scanner;


public class Boolean36{
	public static void main(String[] args){
		int x1;
		int y1;
		int x2;
		int y2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first cell x coordinate: ");
		x1 = scanner.nextInt();	
		
		System.out.print("Enter the first cell y coordinate: ");
		y1 = scanner.nextInt();
		
		System.out.print("Enter the second cell x coordinate: ");
		x2 = scanner.nextInt();	
		
		System.out.print("Enter the second cell y coordinate: ");
		y2 = scanner.nextInt();

		if(x2-x1 == y2-y1){
			System.out.println("The bishop can move among these cells");
		}else{
			System.out.println("The bishop can't move among these cells");
		  }

	}
}
