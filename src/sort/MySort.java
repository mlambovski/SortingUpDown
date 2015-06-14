package sort;

public class MySort {

    private Sortable sortable;

    public MySort(Sortable sortable) {
        this.sortable = sortable;
    }

    public void sort(int[] arr) {
        int i;
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            for (i = j - 1; (i >= 0) && (sortable.greater(arr[i], key)); i--) {
                arr[i + 1] = arr[i];
            }
            arr[i + 1] = key;
        }
    }
}
