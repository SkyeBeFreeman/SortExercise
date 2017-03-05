package com.zhitian;

/**
 * Created by zhtian on 2017/3/5.
 */
public class QuickSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {
        int length = a.length;
        if (length > 0) {
            privateSort(a, 0, length - 1);
        }
        Test.printAns("Quick sort", a);
    }

    private void privateSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = getMid(a, left, right);
            privateSort(a, left, mid - 1);
            privateSort(a, mid + 1, right);
        }
    }

    private int getMid(int[] a, int left, int right) {
        int temp = a[left];
        while (left < right) {
            while (left < right && a[right] >= temp) { // 注意判断>= 而不是>
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) { // 注意判断<= 而不是>
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        return left;
    }

}
