package sort;

import java.util.Random;

public class UseSort {

    public static void main(String[] args) {
        SortOrder so = new SortOrder();
        MySort upSorter = new MySort(so.getUpward());
        MySort downSorter = new MySort(so.getDownward());
        Random num = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        upSorter.sort(arr);
        System.out.println("Upward:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        downSorter.sort(arr);
        System.out.println("Downward:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
