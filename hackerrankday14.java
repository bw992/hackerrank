import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements =elements; 
}
public void computeDifference(){
       
        for (int j=0;j<elements.length;j++){
            for (int m=1;m<elements.length;m++){
               
                if (Math.abs(elements[j]-elements[m])>maximumDifference){
                maximumDifference = Math.abs(elements[j]-elements[m]);
                 }
             }
            
           }
        }
    }
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}