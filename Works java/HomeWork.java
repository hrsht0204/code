import java.util.Scanner;
class HomeWork {
  public static void main(String[] args) {
    int x = (int) (Math.random()*321);
    int y = (int) (Math.random()*345);
    int z= (x + y);
    System.out.print(x);
    System.out.print(" + ");
    System.out.print(y);
    System.out.print(" = ");

    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("Your Answer is:" + a);
    sc.close();
    System.out.println("Answer is: " + z);
    String result = (a == z) ? "You Are Correct." : "You Are Incorrect.";
    System.out.println(result);

  }
}    


