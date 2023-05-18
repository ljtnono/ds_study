package cn.lingjiatong.ds_study.capter01.sort;


import java.util.Arrays;

/**
 * 冒泡排序算法
 *
 * @author Ling, Jiatong
 * Date: 2023/5/18 11:15
 */
public class BubbleSort {

    public static void swap(int[] arr, int aIndex, int bIndex) {
        int temp = arr[aIndex];
        arr[aIndex] = arr[bIndex];
        arr[bIndex] = temp;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
