package com.zhitian;

/**
 * Created by zhtian on 2017/3/5.
 */
public class SelectionSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = a[i];
            int position = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = min;
        }
        Test.printAns("Selection sort", a);
    }

}
