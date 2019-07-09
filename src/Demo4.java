import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("华氏度为：");
        double h=input.nextDouble();
        double c=5/9.0*(h-32);
        System.out.println("摄氏度为："+c);
    }
}
