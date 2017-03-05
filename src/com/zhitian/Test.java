package com.zhitian;

/**
 * Created by zhtian on 2017/3/2.
 */
public class Test {

    public static void printAns(String name, int[] b) {
        System.out.println(name + ": ");
        for (int i: b){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertSort insertSort = new InsertSort();
        insertSort.mySort();
    }

}
