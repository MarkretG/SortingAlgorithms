package sortings;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    private static void quickSort(int[] arr,int left,int right) {
        if (left < right) {
            int pivot = arr[left];
            int i = left;
            int j = right;
            while (i < j) {
                i = i + 1;
                while (i <= right && arr[i] < pivot)
                    i++;
                while (j >= left &&arr[j] > pivot)
                    j--;
                if (i < j && i <= right) {
                    swap(arr,i,j);
                }
            }
            swap(arr,left,j);
            quickSort(arr, left, j-1);
            quickSort(arr, j+1, right);
        }
    }
    private static void swap(int[] arr,int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
       /* for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);*/
    }
}
