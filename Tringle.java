import java.util.Scanner;

public class Tringle {
    public static void checktringle(int l, int s, int x){
    if(l==s &&s==x){
        System.out.println("Tringle is Equilateral");
    }
    else if (l==s || s==x || s==l)
    {
        System.out.println("Tringle is isoceles");
    }    
    else
    System.out.println("Tringle is scalene");
}

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the length of side=");
    int l = sc.nextInt();
    int s = sc.nextInt();
    int x = sc.nextInt();
    checktringle(l, s, x); 
  }  
}
