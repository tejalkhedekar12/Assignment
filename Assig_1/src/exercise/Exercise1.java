package exercise;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the character");
	   char ch=sc.next().charAt(0);
	   int ascii=ch;
	   System.out.println("ASCII value is "+ ascii);
	}

}
