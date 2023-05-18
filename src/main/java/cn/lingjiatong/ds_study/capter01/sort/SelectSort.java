package cn.lingjiatong.ds_study.capter01.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author Ling, Jiatong
 * Date: 2023/5/18 13:21
 */
public class SelectSort {

    public static void swap(int[] arr, int aIndex, int bIndex) {
        int temp = arr[aIndex];
        arr[aIndex] = arr[bIndex];
        arr[bIndex] = temp;
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 在这里定义一个变量存储，可以减少交换的次数
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            swap(arr, temp, i);
        }
    }


    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 2, 1 };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
