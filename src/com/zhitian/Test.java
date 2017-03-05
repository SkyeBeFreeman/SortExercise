package com.zhitian;

/**
 * Created by zhtian on 2017/3/2.
 */
public class Test {

    public static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    public static void printAns(String name, int[] b) {
        System.out.println(name + ": ");
        for (int i: b){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertSort insertSort = new InsertSort();
        insertSort.mySort(a);
    }

}
