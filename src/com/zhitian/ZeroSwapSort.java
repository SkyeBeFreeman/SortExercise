package com.zhitian;

/**
 * Created by zhtian on 2017/3/15.
 */
public class ZeroSwapSort implements MySort {

    public int[] a = {3,6,5,8,7,1,4,9,0,2};


    @Override
    public void mySort() {
        sort(a, a.length);
        Test.printAns("Zero wap sort", a);
    }

    /**
     * 交换数组里n和0的位置
     *
     * @param array
     *            数组
     * @param len
     *            数组长度
     * @param n
     *            和0交换的数
     */
    public void swapWithZero(int[] array, int len, int n) {
        int zIndex = -1;
        int nIndex = -1;
        for(int i = 0; i < len; ++i){
            if(array[i] == 0){
                zIndex = i;
            }
            if(array[i] == n){
                nIndex = i;
            }
        }
        int temp = array[zIndex];
        array[zIndex] = array[nIndex];
        array[nIndex] = temp;
    }


    /**
     * 通过调用swapWithZero方法来排
     *
     * @param array
     *            存储有[0,n)的数组
     * @param len
     *            数组长度
     */
    public void sort(int[] array, int len) {
        if(len <= 1){
            return;
        }
        for(int i = len - 1; i > 0; --i){
            swapWithZero(array, len, array[i]);
            int curMax = array[i];
            for(int j = i; j >= 0; --j){
                if(array[j] > curMax){
                    curMax = array[j];
                }
            }
            swapWithZero(array, len, curMax);
        }
    }

}
