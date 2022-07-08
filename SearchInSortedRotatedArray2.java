package searching;


// This is the efficient approach for Searching in sorted Rotated array 
// This efficient approach is using Binary Search
public class SearchInSortedRotatedArray2 {

	public static void main(String[] args) {
	
		int arr[]= {10,20,40,60,5,8};
		int low =0,high =arr.length-1;
		int x=8;
		while(low<=high) {
			int mid =(low+high)/2;
			if(arr[mid]==x) {
				System.out.println(mid);
			}
			if(arr[low]<arr[mid]) {
				if(x>=arr[low]&&x<arr[mid])
				{
					high =mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(x>arr[mid] && x<=arr[high]) {
					low =mid+1;
				}
				else {
					high =mid-1;
				}
			}
		}
		System.out.println("-1");

	}

}
