package logical_operators;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your age: ");
        int age=sc.nextInt();
        if (age>=18&&age<=60) {
            System.out.println("logical AND");
            System.out.println("age is within the range!");
        }
        if(age<18||age>60) {
            System.out.println("logical OR");
            System.out.println("age is outside the range");
        }
        if(!(age>=18&&age<=60)) {
            System.out.println("logical NOT");
            System.out.println("person is not in the eligible age range");
        }
    }
}
