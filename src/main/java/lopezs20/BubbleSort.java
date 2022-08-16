/**
 * Runtime Complexity: O(N^2)
 * Since you need to track each switch operations in-order
 * to know when to stop sorting and needing access into 
 * each element takes O(N) time. O(N*N) is O(N^2).
 * 
 * Not very efficient on large data sets.
 * It lacks performance as it is time consuming
 * to search every entry of O(N) while performing another
 * O(N) operation of tracking when to stop sorting.
 *    Double the work double the time.
 */
package lopezs20;
public class BubbleSort {
    public static void Sort(int[] nums){
        // Brute Force approach 
        boolean isSwapped = true;
        while (isSwapped){
            isSwapped = false;
            for(int i = 0; i < nums.length - 1; i++){
                if (nums[i] > nums[i + 1]){
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    isSwapped = true;
                 }
            }
        }
    }
    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "  ");
        }
    }
}
