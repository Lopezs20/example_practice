package lopezs20;
public class QuickSort {
    private static final int NEGATIVE = -1;
    private static void sort(int[] arr, int left, int right){
        if (left >= right){
           return ; 
        }
        int pivot = partition(arr, left, right);
        
        sort(arr, left, pivot + NEGATIVE);
        sort(arr, ++pivot, right);
    }
    private static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l + NEGATIVE;
        for (int j = l; j < r; j++){
            if(arr[j] < pivot){
                ++i;
                //swap(arr[i], arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap(arr[i + 1], arr[r]);
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return ++i;
    }
    // private static void swap(int x, int y){
    //     int temp = x;
    //     x = y;
    //     y = temp;
    // }
    public static void Qsort(int[] arr){
        QuickSort.sort(arr, 0, arr.length + NEGATIVE);
        //System.out.println("QuickSort returned: "+ sorted);
    }
}
