package searching;

public class BInarySearch {
	
	public static int BnySea(int arr[],int n,int x) {
		int l=0;
	//	int n = arr.length;
		int h=n-1;
		while(l<=h) {
			int mid= l+(h-l)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]>x) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,3,2,4,5,6,8,9,12,13,14,15,16,17,18,20};
		// int n =arr.length;
//		int x =13;
		BnySea(arr,16,13);

	}

}
