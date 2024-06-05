import  java.util.Scanner;
public class Calculator {
    int a,b,c;
    Calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First NUmber: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        sc.close();
    }

    void add(){
        c=a+b;
    }
    
    void dislpay(){
        System.out.println("Your Answer is: " + c);
    }

     public static void main(String s[]){
    Calculator obj=new Calculator();
    obj.add();
    obj.dislpay();
}
}
