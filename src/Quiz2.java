import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double inc = 0;
		double rate = 0;
		double tr = 0;
		double attend = 0;
		double second = 0, third = 0, fourth = 0;
		double total = 0;
		
	System.out.println("Welcome to the 'Cost of Tuition Program' for the \nUniversity of Delaware!");
	System.out.println("Please enter the cost of tuition for \nthe scholastic year:");
		tr = input.nextDouble();
	System.out.println("Please enter the rate of increase as in integer: ");
		inc = input.nextDouble();
		rate = inc / 100;
	
	for (int i=0;i<=4;i++){
		second = (tr* rate)+ tr;
		third = second + (second *rate)+tr;
		fourth = second + third + (third * rate)+tr;
		total = fourth;
	}
	System.out.printf("The total after four years is: $%.2f", total);
	}

}
