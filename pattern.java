import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner gt=new Scanner(System.in);
        System.out.println("enter the size");
        int n=gt.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){

            
            System.out.print( "*");
        }
            System.out.println();
        }
    }
}
