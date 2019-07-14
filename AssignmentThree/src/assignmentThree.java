import java.util.Scanner;

public class assignmentThree  {

	public static void main(String[] args) {
		
		/*The following two lines are my gravitational 
		 * mass of the earth, which are constants*/
		final double gravConst = 6.67 * Math.pow(10, -11);
		final double massEarth = 5.98 * Math.pow( 10,  24);
		
		// declaring variables
		double rexp = 0, rcoef, satVelocity = 0, radius;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("What is the coefficient of the radius?: ");
		
		rcoef = scanner.nextDouble();
		
		radius = rcoef * Math.pow(10,  rexp);
		System.out.print("What is the value of the radius " + radius);
		double satVelovity = Math.sqrt((gravConst * massEarth) / radius);
		
		rexp = scanner.nextDouble();
		
		System.out.print("The satellite velocity is: " + satVelocity);
		
	}

}
