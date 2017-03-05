package com.zhitian;

/**
 * Created by zhtian on 2017/3/5.
 */
public class ShellSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {
        int length = a.length;
        int step = a.length / 2;
        while (step >= 1) {
            privateSort(step);
            step /= 2;
        }

        Test.printAns("Shell's sort", a);
    }

    private void privateSort(int step) {
        int length = a.length;
        for (int cnt = 0; cnt < step; cnt++) {
            for (int i = cnt + step; i < length; i+=step) {
                int j = i - step;
                int temp = a[i];
                while (j >= 0 && a[j] > temp) {
                    a[j + step] = a[j];
                    j -= step;
                }
                a[j + step] = temp;

            }
        }
    }

}
