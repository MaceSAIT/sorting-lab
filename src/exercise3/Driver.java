package exercise3;

import java.util.Random;
import java.util.Arrays;

public class Driver
{

 public static final int SIZE = 100;
 public static final int UPPER_BOUND = 1000;

 public static void main( String[] args )
 {

  Integer[] nums = new Integer[SIZE];
  Random rand = new Random();

  for( int i = 0; i < SIZE; i++ )
  {
   nums[i] = rand.nextInt( UPPER_BOUND );
  }
  System.out.println(Arrays.toString(nums));
  
  switch (args[0]) 
  {
            case "b":
                bubbleSort(nums);
                break;
            case "i":
                insertionSort(nums);
                break;
            case "s":
                selectionSort(nums);
                break;
            case "q":
                quickSort(nums);
                break;
            default:
                return;
        }
  System.out.println(Arrays.toString(nums));
 }
 
 public static void bubbleSort(Integer[] nums)
 {
	 int n = nums.length;
	  for (int i = 0; i < n - 1; i++)
	  {
	      for (int x = 0; x < n - i - 1; x++)
	      {
	          if (nums[x] < nums[x + 1])
	          { 
	              int tmp = nums[x];
	              nums[x] = nums[x + 1];
	              nums[x + 1] = tmp;
	          }
	      }
	  }
 }
 
 public static void insertionSort(Integer[] nums)
 {
  return;
 }
 
 public static void selectionSort(Integer[] nums)
 { 
  return;
 }
 
 public static void quickSort(Integer[] nums)
 {
  return;
 }
}