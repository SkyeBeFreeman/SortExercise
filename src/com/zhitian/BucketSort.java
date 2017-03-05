package com.zhitian;

/**
 * Created by zhtian on 2017/3/5.
 */
public class BucketSort implements MySort {

    public int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    @Override
    public void mySort() {
        int length = a.length;
        int max = a[0];
        for (int i = 1; i < length; i++) {
            max = max > a[i] ? max : a[i];
        }
        int buckets[] = new int[max + 1];
        for (int i : a) {
            buckets[i]++;
        }
        System.out.println("Bucket sort:");
        for (int i = 0; i < max + 1; i++) {
            while (buckets[i] > 0) {
                System.out.print(i + " ");
                buckets[i]--;
            }
        }
        System.out.println();
    }

}
