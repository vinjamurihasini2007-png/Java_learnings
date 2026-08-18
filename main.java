package while_loop;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        int i=0;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}
