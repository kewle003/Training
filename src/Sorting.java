/**
 * This class implements sorting algorithms
 * 
 * @author Mark
 *
 */
public class Sorting {
	private static int n;
	/**
	 * 
	 * Worst case runtime is theta(n^2). Essentially
	 * this algorithm will run through the array once.
	 * It begins by starting at the second element and considering
	 * the first element already in a "sorted" array. On each iteration
	 * it will check the next element in the unsorted array with all the
	 * elements in the sorted array and insert this element in the proper
	 * place. If the element is larger than the rest than it inserts the
	 * element at the end of the sorted array.
	 * 
	 * @param array
	 */
	public void insertionSort(int[] array) {
		int arraySize = array.length;
		int count = 0;
		for (int i = 1; i < arraySize; i++) {
			int key = array[i];
			count = i - 1;
			while ((count >= 0) && (array[count] > key)) {
				array[count + 1] = array[count];
				count--;
			}
			array[count + 1] = key;
		}
	}
	
	public void heapSort(int[] array) {
		buildMaxHeap(array);
		for (int i = array.length; i>=2; i--) {
			swap(array, 0, i);
			n = n - 1;
			maxHeapify(array, 0);
			
		}
	}
	
	public void quickSort() {
		
	}
	
	public void bucketSort() {
		
	}
	
	private void maxHeapify(int[] a, int i) {
		int left = leftIndex(i);
		int right = rightIndex(i);
		int largest = 0;
		
		if ((left <= n) && (a[left] > a[i])) {
			largest = left;
		} else {
			largest = i;
		}
		
		if ((right <= n) && (a[right] > a[i])) {
			largest = right;
		} else {
			largest = i;
		}
		
		if (largest != i) {
			swap(a, i, largest);
			maxHeapify(a, largest);
		}
	}
	
	private void buildMaxHeap(int[] a) {
		int n = a.length-1;
		for (int i = n/2; i >= 0; i--) {
			maxHeapify(a,i);
		}
	}
	
	/**
	 * This grabs the parent index of a binary tree.
	 * 
	 * @param i
	 * @return
	 */
	private int parentIndex(int i) {
		return (int) Math.floor(i/2);
	}
	
	/**
	 * This grabs the left index of a binary tree.
	 * 
	 * @param i
	 * @return
	 */
	private int leftIndex(int i) {
		return 2*i;
	}
	
	/**
	 * This grabs the right index of a binary tree.
	 * 
	 * @param i
	 * @return
	 */
	private int rightIndex(int i) {
		return (2*i + 1);
	}
	
	private void swap(int[] array, int i, int j) {
		int placeHolder = array[i];
		array[i] = array[j];
		array[j] = placeHolder;
	}
}
