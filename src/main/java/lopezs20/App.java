package lopezs20;
import java.util.*;
public class App {
    public static void main(String[] args){
        // Make a random assorment of integers in array
        Random rand = new Random();
        int[] nums = new int[10];
        int[] nums2 = new int[10];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(100);
            nums2[i] = rand.nextInt(50);
        }

        System.out.println("BubbleSort:\nBefore: ");
        BubbleSort.printArray(nums);
        BubbleSort.Sort(nums);
        System.out.println("\nAfter: ");
        BubbleSort.printArray(nums);

        System.out.println("\nInsertionSort:\nBefore: ");
        InsertionSort.printArray(nums2);
        System.out.println("\nAfter: ");
        InsertionSort.inSort(nums2);
        InsertionSort.printArray(nums2);
        
    }
}
