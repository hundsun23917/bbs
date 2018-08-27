package learnpath.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {
   /* public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int)(Math.random()*100);
        a[1] = (int)(Math.random()*100);
        a[2] = (int)(Math.random()*100);
        a[3] = (int)(Math.random()*100);
        a[4] = (int)(Math.random()*100);
        System.out.println("随机的数字是：");
        for (int x : a ) {
            System.out.println(x);
        }
        System.out.println("排序后的数组：");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }*/
   public static void main(String[] args) {
       int a = 1 ;
       int b = 2;
       /*if(a++==b){
           System.out.println("a++=b"+a);
       }
       System.out.println("a++=b"+a);*/
       if(++a==b){
           System.out.println("++a==b"+a);
       }
       System.out.println(a);
   }
}
