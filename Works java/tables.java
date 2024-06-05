import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a =sc.nextInt();

        System.out.println("the table is :");
        for (int c = 1; c <= 10; c++) {
        System.out.println(a + "x" + c + "=" + (a * c) );
        }
       sc.close();
    }
}
