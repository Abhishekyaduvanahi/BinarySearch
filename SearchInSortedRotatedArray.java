package searching;

// naive approach is similar to linear search for this problem .......
public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,8,9};
		int x =8;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==x) {
				System.out.println("The Value you searched in sorted Rotated Array is :  "+x);
			}
		}
		
		

	}

}
