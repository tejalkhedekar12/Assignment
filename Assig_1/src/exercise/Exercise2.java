package exercise;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
        int di=sc.nextInt();
        System.out.println("Enter divisor");
        int div=sc.nextInt();
        int Quo;
        int rem;
        Quo=di/div;
        rem=di-(div*Quo); //rem=di%div;
        System.out.println("Quotient is "+Quo);
        System.out.println("Remainder is "+rem);
	}

}
