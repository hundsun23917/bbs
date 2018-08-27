package learnpath.array;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {

    @Test
    public void bubbleSort(){
        int[] a = {23,12,4,54,38};
        for (int i = 0; i < a.length; i++) {
            for(int j = 0 ;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int x : a
             ) {
            System.out.print(x+" ");
        }
    }
    @Test
    public void insertionSort(){//相当于将要排序的数组，分为两个，一个已经排序，另一个没有排序
        int[] a = {23,12,4,54,38};
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(a[j]<a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int x :
                a) {
            System.out.print(x+" ");
        }
    }
    @Test
    public void selectSort(){
        int[] a = {23,12,4,54,38};
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1 ; j < a.length ; j++) {
                if(a[i]>a[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        for (int x :
                a) {
            System.out.print(x+" ");
        }
    }
    @Test
    public void arrayCopy(){
        int[] a = {23,12,4,54,38};
        int[] b = {1,3,45,69,23};
        int[] c = new int[10];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        for (int x :
                c) {
            System.out.print(x+" ");
        }
    }
    @Test
    public void twoArray(){
        int [][]a=new int [3][3];
        for (int i = 0; i <a.length ; i++) {
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }
        printArray(a);
        System.out.println(getMax(a));
    }

    public static int getMax(int[][]   a){
        int max = a[0][0];
        int x=0,y=0;
        for (int i = 0; i <a.length ; i++) {
            for(int j = 0;j<a[i].length;j++){
                if(max<a[i][j]){
                    max = a[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        return max;
    }

    public static void printArray(int[][] a){
        for (int i = 0; i <a.length ; i++) {
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
                if(j==a[i].length-1&&i!=a.length-1){
                    System.out.println();
                }
            }
        }
    }
    @Test
    public void arrayTools(){
        int[] a = {23,12,4,54,38};
        int [] b = Arrays.copyOfRange(a,0,4);
        String str = Arrays.toString(b);
        System.out.println(str);
    }
    @Test
    public void twoArraySortTest(){
        int [][]a=new int [3][3];
        for (int i = 0; i <a.length ; i++) {
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }
        int [][]b = twoArraySort(a);
       // printArray(b);
    }
    public static int [][] twoArraySort(int [][]a){
        int srcLength = a.length*a[0].length;
        int [] b = new int [srcLength];
        for(int i = 0 ;i<a[0].length;i++){
            System.arraycopy(a[i],0,b,i*a[i].length,a[i].length);
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        for (int i = 0; i <a.length ; i++) {
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = b[i*j];
            }
        }
        return a;
    }
}
