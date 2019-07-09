import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("num1=");
        int num1=input.nextInt();
        System.out.print("num2=");
        int num2=input.nextInt();
        System.out.println("交换前num1="+num1+"    num2="+num2);

        int a=num1;
        num1=num2;
        num2=a;
        System.out.println("交换后num1="+num1+"    num2="+num2);
    }
}