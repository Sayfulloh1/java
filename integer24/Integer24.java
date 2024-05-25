import java.util.Scanner;


public class Integer24{
	public static void main(String[] args){
		int week_day = 3;
		int day_number = 0;
		String day;

	System.out.print("Enter day number: ");

	Scanner scanner = new Scanner(System.in);
	day_number = scanner.nextInt();
	
	week_day = day_number % 7;
		
	switch(week_day){
		case 1: 
		 day = "Monday";
		 break;
		case 2:
		 day = "Tuesday";
		 break;
		case 3:
		 day = "Wednesday";
		 break;
		case 4:
		 day = "Thursday";
		 break;
		case 5:
		 day = "Friday";
		 break;
		case 6:
		 day = "Saturday";
		 break;
		case 0:
 		 day = "Sunday";
		 break;
		default:
		 day = "Invalid day";

	}
		System.out.println("The day is: " + day);

  }


}
