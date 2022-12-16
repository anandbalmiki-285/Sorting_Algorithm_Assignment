package assignment_3_Sorting_Algorithms;

import java.util.Arrays;

public class Question_1 {

	public static void main(String[] args) {

        int arr[] = {12, 68, 44, 12, 64, 6, 52, 8, 9, 64, 44, 68};
        int freq[] = new int[arr.length];

        Arrays.fill(freq, -1);

        System.out.println("The array elements are : "+Arrays.toString(arr));
        
        unique(arr,freq);
    }
    

    static void unique(int arr[], int freq[])
    {
        int count;
        for(int i = 0; i<arr.length; i++)
        {
           
            count=1;
            for(int j = i + 1; j<arr.length;j++)
            {

                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j] = 0;
                }
            }
      
            if(freq[i]!=0)
            {
                freq[i] = count;
            }
        }
        
        System.out.print("The duplicate elements in the array are : ");
        for(int i = 0; i<arr.length;i++)
        {
            if(freq[i]>1)
                System.out.print(arr[i]+" ");
        }
		
	}

}
