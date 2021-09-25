import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	Difference(int[] elements) {
        this.elements = elements;
    }
    
    public void computeDifference(){
        
        int maxDifference = Integer.MIN_VALUE;
        for(int first=0; first<this.elements.length; first++ ){
            for(int second=first+1; second<this.elements.length; second++ ){
                //System.out.println("first=" + elements[first] + ", second=" + elements[second]);
                int difference = Math.abs(elements[first]-elements[second]);
                //System.out.println("difference=" + difference);
                if(difference > this.maximumDifference){
                    this.maximumDifference = difference;
                //    System.out.println("New max difference is " +this.maximumDifference);
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