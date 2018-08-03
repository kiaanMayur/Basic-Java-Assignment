
/*class to implement the sorting technique of bubble sort*/
public class BubbleSort {
	
	// method to sort the elements
	public static void Sort(int[] unsorted) {
		int i, j, temp;
		
		for(i=0; i<15; i++) {
			
			for(j=0; j<14; j++) {
				
			if(unsorted[j] > unsorted[j+1]) {
				
				temp = unsorted[j];
				unsorted[j] = unsorted[j+1];
				unsorted[j+1] = temp;
			}
			}
		}
	}
	
	//method to display the sorted elements
	public static void displaySort(int[] unsorted) {
		int i;
		
		for(i=0; i<15; i++)
			System.out.print(unsorted[i] + " ");
	}
	
	public static void main(String args[]) {
		
		int unsorted[] = new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

		Sort(unsorted);
		
		System.out.println("table after sorting is:\n");
		
		displaySort(unsorted);
		
	}
}