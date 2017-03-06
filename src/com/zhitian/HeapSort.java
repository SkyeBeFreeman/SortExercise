package com.zhitian;

/**
 * Created by zhtian on 2017/3/6.
 */
public class HeapSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
    private int length = a.length;

    @Override
    public void mySort() {
        buildHeap();
        for (int i = length - 1; i >= 0; i--) {
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            maintainHeap(a, 0, i);
        }
        Test.printAns("Heap sort", a);
    }

    private void buildHeap() {
        for (int i = (length - 1) / 2; i >= 0; i--) {
            maintainHeap(a, i, length);
        }
    }

    private void maintainHeap(int[] a, int index, int length) {
        int temp = a[index];
        int child = 2 * index + 1; // 左子树的索引。注意！不是2*index，因为这是数组索引（从0开始）！
        while (child < length) {
            if (child + 1 < length && a[child] < a[child + 1]) {
                child++;
            }
            if (a[child] > a[index]) {
                a[index] = a[child];
                index = child;
                child = 2 * index + 1;
            } else {
                break;
            }
            a[index] = temp;
        }
    }
}
