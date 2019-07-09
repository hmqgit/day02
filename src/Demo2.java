import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入卡号：");
        int num=input.nextInt();
        int ge=num%10;
        int shi=num%100/10;
        int bai=num%1000/100;
        int qian=num/1000;
        int he=ge+shi+bai+qian;
        System.out.println("卡号的和为："+he);
    }
}
