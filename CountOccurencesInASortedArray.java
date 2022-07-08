package searching;

// Naive approach ........

public class CountOccurencesInASortedArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,40,40};
		int x=40;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
				}
		}
		System.out.println(count);
		

	}

}
