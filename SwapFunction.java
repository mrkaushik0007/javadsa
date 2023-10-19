import java.util.Scanner;

public class SwapFunction {
public static void Swap(int a, int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Value of a="+a+"Value of b="+b);
 
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a=");
    int a = sc.nextInt();
    System.out.println("enter the value of b=");
    int b = sc.nextInt();
    Swap(a,b);
}
    
}    

