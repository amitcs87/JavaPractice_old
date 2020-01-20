package practiceset1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
	
	public static void removeDupFromArray(int[] arr) {
		
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				flag = false;
				if(i==j) {
					
				}else {
					if(arr[i] == arr[j]) {
						flag = true;
						break;
					}
				}
			}
			if(!flag) {
				arrl.add(arr[i]);
			}
		}
		System.out.println(arrl);
	}
	
	public static void removeDupWithLinkedhashSet(Integer[] arr) {
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>(Arrays.asList(arr));
		System.out.println(s);
	}
	
	public static void main(String []args) {
		int arr[] = {1,2,5,2,7,8,5,7,9,2};
		removeDupFromArray(arr);
		
		Integer arr1[] = new Integer[arr.length];
		int i=0;
		for(int val : arr) {
			arr1[i++] = Integer.valueOf(val);
		}
		removeDupWithLinkedhashSet(arr1);
	}
	
	

}
