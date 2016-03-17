
public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
	    int j;
	    for (int i = 1; i < unsortedArray.length; i++){
	        int curr = unsortedArray[i];
	        for (j = i-1; (j>=0) && (unsortedArray[j] < curr); j--){
	            unsortedArray[j+1] = unsortedArray[j];
	        }
	        unsortedArray[j+1] = curr;
	    }
	    
		return unsortedArray;
	}
}
