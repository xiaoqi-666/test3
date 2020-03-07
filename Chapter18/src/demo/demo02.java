package demo;

import java.util.Scanner;

/**
 * @author QiZhiYuan
 * @create 2020-02-28 10:59
 */
public class demo02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a = input.nextInt();
        System.out.println("请输入第二个数:");
        int b = input.nextInt();
        System.out.println("请输入第三个数:");
        int c = input.nextInt();
        int d=0;
        while (true){
            if(a>b){
                d=b;
                b=a;
                a=d;
            }
            if(b>c){
                d=c;
                c=b;
                b=d;
            }
            if(a<b&&b<c){
                break;
            }
        }
        System.out.println(a+"<"+b+"<"+c);
    }
}
