import java.util.Scanner;

//checking cell of chess board white or black
// x and y are coordinates


 public class Boolean34{
	public static void main(String[] args){
	
	int x = 1;
	int y = 1;
	
	System.out.println("Enter the x coordinate : ");
	Scanner scanner = new Scanner(System.in);
	x = scanner.nextInt();
        
	System.out.println("Enter the y coordinate: ");
	y = scanner.nextInt();

	int result = x+y;

	if(result % 2 == 0){
	    System.out.println("This cell is black");
	}else{
	     System.out.println("This cell is white");
	  }

    }
















 }
