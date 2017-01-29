import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static final int SIZE = 6;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[SIZE][SIZE];
        for(int i=0; i < SIZE; i++){
            for(int j=0; j < SIZE; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int  maxsum = Integer.MIN_VALUE;
        for (int m =0; m<SIZE-2;m++){
            for (int n =0; n<SIZE-2; n++){
                int tempsum = arr[m][n]+arr[m][n+1]+arr[m][n+2]+arr[m+1][n+1]+arr[m+2][n]+arr[m+2][n+1]+arr[m+2][n+2];
                maxsum= Math.max(tempsum, maxsum);
                    }
            }
        System.out.println(maxsum);
    
        in.close();
        }
      
        
    }
    

