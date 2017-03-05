package com.zhitian;

/**
 * Created by zhtian on 2017/3/2.
 */
public class InsertSort implements MySort {

    @Override
    public void mySort(int a[]) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            if(a[i] < a[i-1]) {
                int temp = a[i];
                a[i] = a[i - 1];
                int j = i - 2;
                while (j >= 0 && a[j] > temp) { // 注意判断数组越界
                    a[j + 1] = a[j];
                    j--;
                }
                a[++j] = temp;
            }
        }
        Test.printAns("Insert sort", a);
    }

}
