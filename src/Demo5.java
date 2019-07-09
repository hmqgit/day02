import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入本金：");
        double benjin=input.nextDouble();
        double benxi1=benjin+benjin*2.25/100*1;
        System.out.println("存一年的本息为："+benxi1);
        double benxi2=benjin+benjin*2.7/100*2;
        System.out.println("存两年的本息为："+benxi2);
        double benxi3=benjin+benjin*3.24/100*3;
        System.out.println("存三年的本息为："+benxi3);
        double benxi5=benjin+benjin*3.6/100*5;
        System.out.println("存五年的本息为："+benxi5);
    }
}
