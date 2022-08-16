/**
 * @author lopezs20
 * Insertion Sort Algorithm implementation using 4 different datatype 
 */
package lopezs20;
public class InsertionSort {
    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "  ");
        }
    }
    public static int[] inSort(int[] nums){
        // Easiest/Simplest approach
        // ArrayList<Integer> temp = new ArrayList<Integer>();
        // for(int i = 0; i < nums.length; i++){
        //     temp.add(i);
        // }
        // Iterator<Integer> counter = temp.iterator();
        // while(counter.hasNext()){
        //     System.out.println(counter.next());
        // }
        // Brute force approach
        for(int i = 1; i < nums.length; i++){
            int currentVal = nums[i];
            int before = i - 1;
            // Shifting right
            while (before >= 0 && nums[before] > currentVal){
                nums[before + 1] = nums[before];
                before--;
            }
            // Insert sort (remember that before == -1 here)
            nums[before + 1] = currentVal;
        }
        return new int[] {};
    }
    
}
