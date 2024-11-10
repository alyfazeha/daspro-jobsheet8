import java.util.Scanner;

public class assignmentNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("input a number : ");
        n = sc.nextInt();

        for (int a=1; a<=n; a++){
            for (int b=1; b<=n; b++){
                if (a==n || b==n || a==1 || b==1) {
                    System.out.print(" " + n);
                } else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
