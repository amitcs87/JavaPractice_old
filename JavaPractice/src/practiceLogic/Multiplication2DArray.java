package practiceLogic;

public class Multiplication2DArray {
	
	public static void main(String []args) {
		
		int arr1[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
		int arr2[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
		int arr3[][] = new int[arr1.length][arr2[0].length];
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				for(int k=0; k<arr1.length; k++) {
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		for(int m=0; m<arr3.length; m++) {
			for(int n=0; n<arr3[0].length; n++) {
				System.out.print(arr3[m][n]+" ");
			}
			System.out.println();
		}
	}

}
