
import java.util.*;

public class Ques03 {

    // Brute method 
    public static int missingB(int arr[]) {
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                return i;
            }

        }
        return -1;
    }

    // Better method
    public static int missingNumBetter(int arr[]) {
        int n = arr.length;
        int hash[] = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]] = 1;
        }
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    // optimal solutinon
    // Case 01  (Using the sum)
    public static int missingNumBySum(int arr[]) {
        int n = arr.length+1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < n-1; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
    // Case2 (using the XOR)
    public static int missingXor(int arr[]){
        int xor1 = 0;
        int xor2 = 0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            xor1 = xor1 ^ i;           
        }
        for(int i = 0; i<n-1; i++){
            xor2 ^= arr[i];
        }
        return xor1^xor2;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5 };

        // int miss_num = missingB(arr);
        // missingNumBetter(arr);
        // int missingNum = missingNumBySum(arr);
        // System.out.println(missingNum);
        int missing_Num = missingXor(arr);
        System.out.println(missing_Num);

    }

}
