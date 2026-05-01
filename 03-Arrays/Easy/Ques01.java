// Finding the Largest element in the array
import java.util.*;

public class Ques01 {
    // Brute force method    T.C = o(nlogn)
    public static void LargeB(int arr[]){
        
        // to sort the array
        Arrays.sort(arr);

        // finding the largest element
        int largest = arr[arr.length-1];
        System.out.println(largest);       

    }

    // Optimal approach         T.C = O(n)
    public static int largeO(int arr[]){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        System.out.println(largest);
        return largest;
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        // LargeB(arr);
        largeO(arr);

        
    }
}