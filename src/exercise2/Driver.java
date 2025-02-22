package exercise2;

import java.util.Random;
import java.util.Scanner;

/*
 * Written by Mace Howald on 02/20/2025 for CPRG-304-E
 * 
 * Lab 2: Comparisons, Searching and Sorting
 */



public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;
	
	// Binary search function
	public static int binarySearch(Integer[] numbers, int target) {
		
		// Set high and low range values
		
		int low = 0;
		int high = numbers.length;
		int count = 0;
		
		// Using a while loop since low and high values will be changing
		
		while (low <= high) {
			
			// Set mid to the middle of the current range
			int mid = low + (high-low)/2;
			int midVal = numbers[mid];
			
			if (midVal == target) {
				// Print count for debugging
				System.out.println("Found in " + count + " loops.");
				// If the mid value matches return the index
				return mid;
			}else if (midVal < target) {
				// If the mid value is less than target, remove the lower half of the range
				low = mid + 1;
			}else if (midVal > target) {
				// If the mid value is greater than target, remove the upper half of the range
				high = mid - 1;
			}
			
			// Add to count to see how many loops were done
			count++;
		}
		
		// Default -1 return value
		return -1;
	}
	
	

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}

		
		// Open scanner for user to input int to search for
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter target integer: ");
		int target = scanner.nextInt();
		scanner.close();
		
		// Call the binary search function with the list and target number
		
		int index = binarySearch(nums,target);
		
		// Check if number has been found and show output accordingly
		
		if (index == -1) {
			System.out.println(target + " was not found in the list.");
		} else {
			System.out.println(target + " was found in the list at index " + index + "!");
			// Show the number indexed in the list for debugging
			System.out.println(nums[index]);
		}
		
		
	}

}
