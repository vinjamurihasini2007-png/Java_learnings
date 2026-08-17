import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=sc.nextLine();
        System.out.print("enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("enter your cgpa: ");
        double cgpa=sc.nextDouble();
        sc.nextLine();
        System.out.print("enter your favourite color: ");
        String color=sc.nextLine();
        System.out.print("are you a student? (true/false): ");
        boolean isStudent=sc.nextBoolean();
        sc.nextLine();
        System.out.println("-------------DETAILS-----------");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+ cgpa);
        System.out.println("favourite color: "+ color);
        if(isStudent){
            System.out.println("you are enrolled as a student!");
        }
        else{
            System.out.println("you are not enrolloed!");
        }
        sc.close();
    }
}
