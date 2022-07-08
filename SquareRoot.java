package searching;
import java.util.Scanner;
// here the floor value will be returned 
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the square root of that number ");
		int num =sc.nextInt();
		int i =1;
		while(i*i<=num) {
			i++;
			
		}
		System.out.println("The Square Root of the entered number is :-");
		System.out.println(i-1);

	}

}
