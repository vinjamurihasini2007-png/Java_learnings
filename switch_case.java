package switch_case;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character: ");
        char A = sc.next().toLowerCase().charAt(0);
        switch(A){
            case'a':
                System.out.println(A+" is an vowel");
                break;
            case'e':
                System.out.println(A+" is an vowel");
                break;
            case'i':
                System.out.println(A+" is an vowel");
                break;
            case'o':
                System.out.println(A+" is an vowel");
                break;
            case'u':
                System.out.println(A+" is an vowel");
                break;
            default:
                System.out.println(A+" is a consonent");
        }
    }

}
