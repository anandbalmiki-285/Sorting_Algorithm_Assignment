package assignment_3_Sorting_Algorithms;

//QuickSort Algorithm

import java.util.Arrays;

class QuickSort { 

    int partition(int intArray[], int low, int high) { 
        int pivot = intArray[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) { 
     
            if (intArray[j] <= pivot) { 
                i++; 
           
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
   

        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    } 
   

    void quick_sort(int intArray[], int low, int high) { 
        if (low < high) { 
                        int pivot = partition(intArray, low, high); 
   

            quick_sort(intArray, low, pivot-1); 
            quick_sort(intArray, pivot+1, high); 
        } 
    } 
}
 

public class Question_2 {

	public static void main(String[] args) {
	
		int intArray[] = {4,-1,6,8,0,5,-3}; 
        int n = intArray.length; 
        
        System.out.println("Original Array: " + Arrays.toString(intArray));

        QuickSort obj = new QuickSort(); 
        obj.quick_sort(intArray, 0, n-1); 

        System.out.println("\nSorted Array: " + Arrays.toString(intArray)); 
	}

}
