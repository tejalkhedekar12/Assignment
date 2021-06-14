package exercise;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st no.");
        int num1=in.nextInt();
        System.out.println("Enter 2nd no.");
        int num2=in.nextInt();
        System.out.println("Enter 3rd no.");
        int num3=in.nextInt();
        int sum,avg;
        sum=num1+num2+num3;
        avg=sum/3;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
	}
}