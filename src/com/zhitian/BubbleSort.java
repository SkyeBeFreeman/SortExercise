package com.zhitian;

/**
 * Created by zhtian on 2017/3/5.
 */
public class BubbleSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (a[j] < a[j-1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        Test.printAns("Bubble sort", a);
    }

}
