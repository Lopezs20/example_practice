package lopezs20;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.*;
import org.junit.Test;
public class AppTest 
{
    /**
     * Testing MinStack data structure 
     */
    @Test
    public void shouldInitializeMinStack()
    {
        MinStack test = new MinStack();
        assertEquals(-1, test.getMin());
    }
    @Test
    public void shouldAddItemToMinStack()
    {
        MinStack test = new MinStack();
        test.push(10);
        assertEquals(10, test.getMin());
        assertEquals(10, test.pop());
    }
    @Test
    public void shouldAddTwoItemsToMinStack()
    {
        MinStack test = new MinStack();
        test.push(1000);
        test.push(673839);
        assertEquals(1000, test.getMin());
        assertEquals(673839, test.top());
    }
    @Test
    public void shouldPopTwoItemsFromMinStack()
    {
        MinStack test = new MinStack();
        test.push(1000);
        test.push(673839);
        assertEquals(1000, test.getMin());
        assertEquals(673839, test.top());
        assertEquals(673839, test.pop());
        assertFalse("checking pop...", test.top() == 673839);
        assertEquals(1000, test.pop());
    }
    /**
     * Testing QuickSort data structure
     */
    @Test
    public void shouldInitalizeQuickSort()
    {
        int[] a1 = {1, 2, 3};
        int[] a2 = {3, 2, 1};
        int[] a3 = {};
        int[] a4 = {3, 1, -1, 0, 2, 5};
        int[] a5 = {2, 2, 1, 1, 0, 0, 4, 4, 2, 2, 2};
        int[] a6 = {0};
        int[] a7 = {3, -2, -1, 0, 2, 4, 1};
        int[] a8 = {1, 2, 3, 4, 5, 6, 7};
        int[] a9 = {2, 2, 2, 2, 2, 2, 2};

        int[] a1Sorted = {1, 2, 3};
        int[] a2Sorted = {1, 2, 3};
        int[] a3Sorted = {};
        int[] a4Sorted = {-1, 0, 1, 2, 3, 5};
        int[] a5Sorted = {0, 0, 1, 1, 2, 2, 2, 2, 2, 4, 4};
        int[] a6Sorted = {0};
        int[] a7Sorted = {-2, -1, 0, 1, 2, 3, 4};
        int[] a8Sorted = {1, 2, 3, 4, 5, 6, 7};
        int[] a9Sorted = {2, 2, 2, 2, 2, 2, 2};

        QuickSort.Qsort(a1);
        QuickSort.Qsort(a2);
        QuickSort.Qsort(a3);
        QuickSort.Qsort(a4);
        QuickSort.Qsort(a5);
        QuickSort.Qsort(a6);
        QuickSort.Qsort(a7);
        QuickSort.Qsort(a8);
        QuickSort.Qsort(a9);

       assertArrayEquals(a1, a1Sorted);
       assertArrayEquals(a2, a2Sorted);
       assertArrayEquals(a3, a3Sorted);
       assertArrayEquals(a4, a4Sorted);
       assertArrayEquals(a5, a5Sorted);
       assertArrayEquals(a6, a6Sorted);
       assertArrayEquals(a7, a7Sorted);
       assertArrayEquals(a8, a8Sorted);
       assertArrayEquals(a9, a9Sorted);
    }
    /**
     * Testing Bubble Sorting algorithm.
     * Makes random number assertion in 2 
     */
    @Test
    public void shouldBubbleSort()
    {
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
    /**
     * Testing RandomPassword Generator 
     * pairValues methods
     */
    @Test
    public void shouldPrintListOfVowels(){
        RandomPasswordGenerator gen = new RandomPasswordGenerator();
        HashSet<String> values = new HashSet<>();
        values = gen.initialize(values);
        String word = gen.collectPairValues("Hello My Name is apple", values);
        System.out.println(word);
    }
    /**
     * Testing Random Password Generator
     * schedule method
     */
    @Test
    public void shouldPrintAnimationFromScheduler(){
        RandomPasswordGenerator gen = new RandomPasswordGenerator();
        gen.schedule();
    }
}
