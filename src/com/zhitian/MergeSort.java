package com.zhitian;

/**
 * Created by zhtian on 2017/3/5.
 */
public class MergeSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {

        int length = a.length;
        privateSort(a, 0, length - 1);
        Test.printAns("Merge sort", a);

    }

    private void privateSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            privateSort(a, left, mid);
            privateSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public void merge(int[] a, int left, int center, int right) {
        int[] tempArr = new int[a.length];
        int mid = center + 1;
        int index = left;
        int first = left;
        while (left <= center && mid <= right) {
            if (a[left] < a[mid]) {
                tempArr[index++] = a[left++];
            } else {
                tempArr[index++] = a[mid++];
            }
        }
        while (left <= center) {
            tempArr[index++] = a[left++];
        }
        while (mid <= right) {
            tempArr[index++] = a[mid++];
        }
        while (first <= right) {
            a[first] = tempArr[first++];
        }
    }

}
