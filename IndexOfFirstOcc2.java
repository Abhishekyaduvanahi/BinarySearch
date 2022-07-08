package searching;

public class IndexOfFirstOcc2 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,3,4,5,6,7,8};
		int l=0;
		int x =3;
	int h=arr.length-1;
		while(l<=h) {
		int mid= l+(h-l)/2;
			
			if(arr[mid]>x) {
				h=mid-1;
			}
			else if(arr[mid]<x) {
				l=mid+1;
			}
			else {
				if(mid==0||arr[mid-1]!=arr[mid]) {
					System.out.println(mid);
					
				}
				else {
					h=mid-1;
					return;
				}
			}
			
		}

	}

}
