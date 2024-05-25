import java.util.Scanner;

public class Begin39{
	public static void main(String[] args){
		double A;
		double B;
		double C;
		double discriminant;
		double solution1 = 0;
		double solution2 = 0;

System.out.print("Enter koefficient A of quadratic function: \n");
Scanner scanner = new Scanner(System.in);
A = scanner.nextDouble();

System.out.print("Enter koefficient B of quadratic function: \n");
B = scanner.nextDouble();

System.out.print("Enter koefficient C of quadratic function: \n");
C = scanner.nextDouble();

discriminant = Math.pow(B,2)-4*A*C;

System.out.println(discriminant);

if(discriminant>0){

 solution1= (-B+Math.sqrt(discriminant))/2*A;
 solution2= (-B-Math.sqrt(discriminant))/2*A;

 }else if(discriminant == 0){

	solution1 = -B/2*A;
	solution2 = solution1;

  }else{
	System.out.println("NO SOLUTION, D<0 ");
}

System.out.println(solution1);
System.out.println(solution2);











	}
}
