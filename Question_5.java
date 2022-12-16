package assignment_3_Sorting_Algorithms;

import java.util.Arrays;
// selection Sort Algorithm
public class Question_5 {

	static void selection_sort(int inputArray[]) 
    { 
        int n = inputArray.length; 
   
        // traverse unsorted array 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int minimum_index = i; 
            for (int j = i+1; j < n; j++) 
                if (inputArray[j] < inputArray[minimum_index]) 
                    minimum_index = j; 
   
            // swap minimum element with compared element  
            int temp = inputArray[minimum_index]; 
            inputArray[minimum_index] = inputArray[i]; 
            inputArray[i] = temp; 
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int inputArray[] = {7,5,2,20,42,15,23,34,10};
        System.out.println("Original Array:" + Arrays.toString(inputArray)); 
    
        selection_sort(inputArray); 
    
        System.out.println("Sorted Array:" + Arrays.toString(inputArray)); 
	}

}
