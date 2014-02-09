/**
 * This class implements the Sorting algorithms
 * 
 * @author Mark
 *
 */
public class SortingDemo {
	public static void main(String args[]) {
		Sorting sorter = new Sorting();
		int[] arr = {5,2,4,6,1,3};
		sorter.insertionSort(arr);
		printArray(arr);
		
		int []a1={4,1,3,2,16,9,10,14,8,7}; 
		sorter.heapSort(a1);
		for(int i=0;i<a1.length;i++) { 
	            System.out.print(a1[i] + " "); 
	    } 
		
	}
	
	private static void printArray(int[] array) {
		for(int el : array) {
			System.out.print(el + ", ");
		}
		System.out.println();
	}
}
