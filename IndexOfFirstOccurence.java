package searching;
//Naive approach toward finding the index of first Occurrences ...
public class IndexOfFirstOccurence {
	// here the written code will return nothing when no value of x is present ..

	public static void main(String[] args) {
		int x=51;
		int arr[]= {1,23,465,7,5,3,2,2,3};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("The Value of X is present at index "+i);
			}
		
			
		}
		return ;
		

	}

}
