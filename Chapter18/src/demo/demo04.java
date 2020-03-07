package demo;



/**
 * @author QiZhiYuan
 * @create 2020-02-28 10:59
 */
public class demo04 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <5; i++) {
            for (int j = 1; j <5; j++) {
                for (int k = 1; k <5; k++) {
                    if(i!=k && k!=j && i!=j) {
                        a++;
                        System.out.println(i * 100 + j * 10 + k * 1);
                    }
                }
                }
            }
        System.out.println("有"+a+"个");
        }

    }

