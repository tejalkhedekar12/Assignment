package exercise;
import java.util.Scanner;
class Exercise10 {

	public static void main(String[] args) {
	    double pi=3.14;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter radius of circle");
		int r=in.nextInt();
		double cir,area;
		cir=2*pi*r;
        area=pi*r*r;
        System.out.println("Circumference of circle = "+cir);
        System.out.println("Area of circle = "+area);
	}

}
