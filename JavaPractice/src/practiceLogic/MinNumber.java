package practiceLogic;


public class MinNumber {
	
	static int minNum(int arr[]) {
		int min = arr[0];
		for(int i : arr) {
			if(min > i) {
				min = i;
			}
		}
		return min;
	}
	
	static int maxNum(int arr[]) {
		int max = arr[0];
		for (int i : arr) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	
	public static void main(String []args) {
		int arr[] = {2,2,4,2,7,9,3,9};
		System.out.println(minNum(arr));
		System.out.println(maxNum(arr));
	}
}
