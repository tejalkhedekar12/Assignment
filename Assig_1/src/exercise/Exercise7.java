package exercise;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st no.");
        int num1=in.nextInt();
        System.out.println("Enter 2nd no.");
        int num2=in.nextInt();
        System.out.println("Enter 3rd no.");
        int num3=in.nextInt();
        if(num1>num2 && num1>num3)
        {
        	System.out.println("1st no. is largest");
        }
        else if(num2>num1 && num2>num3)
        {
        	System.out.println("2nd no. is largest");
        }
        else
        {
        	System.out.println("3rd no. is largest");
        }
	}

}