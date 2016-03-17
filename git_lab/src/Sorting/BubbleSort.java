package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] num) {
	  int j;
    boolean swap = true;  
    int temp;   
    while (swap){
      swap= false;    
      for( j=0; j < num.length -1; j++ ){
        if ( num[ j ] > num[j+1] ){
          temp = num[ j ];                
          num[ j ] = num[ j+1 ];
          num[ j+1 ] = temp;
          swap = true;              
        } 
      } 
    } 
		return num;
	}
}
