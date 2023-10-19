import java.util.Scanner;

public class SimpleNumber {
    public static void instrest(int p, int r, int t){
        int amt ;
        amt = (p*r*t)/100;
        System.out.println("Your total instrest is ="+amt);
        int total = p+amt;
        System.out.println("Total Amount "+total);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the princile AMount RATe & TIME");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t =sc.nextInt();
        instrest(p, r, t);
    }
}
