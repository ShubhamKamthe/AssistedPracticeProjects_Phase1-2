//Write a program to create single-dimensional and multidimensional arrays.

package Array;

public class ArrayExample {

	public static void main(String[] args) {
		//1-D array
		int arr[]={1,2,3,4,5,6};
		for(int i=0;i<arr.length; i++){
			System.out.println(arr[i]);	
		}
		//2D array
		int arr1[][]={
				{1,2,3},
				{5,6,7}
		};
		System.out.println("Printing the [0,0] element of the array "+arr1[0][0]);

		System.out.println("Printing the [1,2] element of the array "+arr1[1][2]);
	}

}
