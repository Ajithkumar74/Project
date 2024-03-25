import java.lang.*;
import java.util.*;

public class AlternateSorting {

static void alternateSort(int arr[], int n){
		Arrays.sort(arr);
		int i=0, j=n-1;
		while(i<j){
		System.out.print(arr[j--] +" ");
		System.out.print(arr[i++] +" ");
		}
		
		if(n%2!=0)
	       System.out.print(arr[i] +" ");

	}

	public static void main(String[] args) {
		int arr[] = {1, 12, 4, 6, 7, 10};
		int n = arr.length;
 		alternateSort(arr, n); 
 		System.out.println();

 		int arr2[] = {1, 6, 9, 4, 3, 7, 8, 2};
		n = arr2.length;
 		alternateSort(arr2, n); 

	}
}