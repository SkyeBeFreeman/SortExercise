package com.zhitian;

/**
 * Created by zhtian on 2017/3/2.
 */
public class InsertSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int temp = a[i];
            while (j >= 0 && a[j] > temp) { // 注意判断数组越界
                a[j + 1] = a[j];
                j--;
            }
            a[++j] = temp;
        }
        Test.printAns("Insert sort", a);
    }

}
