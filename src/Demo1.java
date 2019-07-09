import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        System.out.println("圆的面积为："+3.14*r*r);
    }
}
