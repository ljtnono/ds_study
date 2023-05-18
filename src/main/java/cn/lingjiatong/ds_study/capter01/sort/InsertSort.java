package cn.lingjiatong.ds_study.capter01.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author Ling, Jiatong
 * Date: 2023/5/18 13:58
 */
public class InsertSort {

    public static void swap(int[] arr, int aIndex, int bIndex) {
        int temp = arr[aIndex];
        arr[aIndex] = arr[bIndex];
        arr[bIndex] = temp;
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 2, 1 };
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
