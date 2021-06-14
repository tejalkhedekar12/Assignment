package exercise;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 st no.");
		int n1=sc.nextInt();
		System.out.println("Enter 2 nd no.");
		int n2=sc.nextInt();
		System.out.println("Numbers before swapping: "+"num1="+n1+" num2="+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("Numbers after swapping: "+"num1="+n1+" num2="+n2);
	}

}
