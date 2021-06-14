package exercise;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter alphabet");
        char al;
        al=in.next().charAt(0);
        switch(al)
        {
        case 'a':
        	System.out.println(al+" is vowel");
        	break;
        case 'A':
        	System.out.println(al+" is vowel");
        	break;
        case 'e':
        	System.out.println(al+" is vowel");
        	break;
        case 'E':
        	System.out.println(al+" is vowel");
        	break;
        case 'i':
        	System.out.println(al+" is vowel");
        	break;
        case 'I':
        	System.out.println(al+" is vowel");
        	break;
        case 'o':
        	System.out.println(al+" is vowel");
        	break;
        case 'O':
        	System.out.println(al+" is vowel");
        	break;
        case 'u':
        	System.out.println(al+" is vowel");
        	break;
        case 'U':
        	System.out.println(al+" is vowel");
        	break;
        default :
        	System.out.println(al+" is Consonant");
        
        }
	}

}
