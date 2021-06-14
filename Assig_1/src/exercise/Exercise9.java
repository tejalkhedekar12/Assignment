package exercise;
import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Principal value");
        int p=in.nextInt();
        System.out.println("Enter rate per annum");
        int r=in.nextInt();
        System.out.println("Enter time in years");
        int t=in.nextInt();
        int si;
        si=(p*r*t)/100;
        System.out.println("Simple Interest = "+si);
	}

}
