import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] testArr = {29, 84, 25, 6, 58, 82, 47, 72, 45, 70};  
		
		for(int integer:testArr){  
            System.out.print(integer+" ");
        }
        System.out.println(" ");
		
        selectionSort4(testArr);
        
        for(int value:testArr){  
            System.out.print(value+" ");  
        } 
		
		
	}

	public static void selectionSort(int[] dataArr) {

		System.out.println("Before Selection Sort");  
        for(int value:dataArr){  
            System.out.print(value+" ");  
        } 
        System.out.println("");
        
		// setting up indexes
		for (int i = 0; i < dataArr.length - 1; i++) {
			int index = i;

			// searching for the lowest unsorted index
			// we do int j = i + 1 as we don't want to loop through already sorted index
			for (int j = i + 1; j < dataArr.length; j++) {
				if (dataArr[j] < dataArr[index]) {
					index = j;
				}
			}

			int smallerNumber = dataArr[index];

			dataArr[index] = dataArr[i];
			dataArr[i] = smallerNumber;
			
			System.out.println("\nSwapping " + dataArr[index] + " at index " + index +
					" WITH " + dataArr[i] + " at index " + i);
			
			System.out.println("Current state of an array");  
	        for(int k:dataArr){  
	            System.out.print(k+" ");
	        }
	        System.out.println(" ");
		}
	}
	
	 public static int[] selectionSort2(int[] inputArray){
	        int outerLoopIterations = 0;
	        int innerLoopIterations = 0;

	        int[] array = inputArray;
	        int n = array.length;

	        for(int index1 = 0; index1 <= n - 2; index1++){
	            outerLoopIterations++;
	            int minInd = index1; // the index of the smallest value

	            for(int index2 = index1 + 1; index2 <= n - 1; index2++){
	                innerLoopIterations++;
	                if(array[index2] < array[minInd]){
	                    minInd = index2;
	                }
	            }
	            System.out.println("\nSwapping " + array[index1] + " at index " + index1 +
	                    " with " + array[minInd] + " at index " + minInd);

	            //swap
	            int temp = array[index1];
	            array[index1] = array[minInd];
	            array[minInd] = temp;

	            System.out.println("After the swap: " + Arrays.toString(array));
	        }

	        System.out.println("\nOUTER LOOP ITERATIONS: " + outerLoopIterations);
	        System.out.println("INNER LOOP ITERATIONS: " + innerLoopIterations);

	        return array;

	    }
	 
	 public static int[] selectionSort3 (int[] list) {
		 
		 	int outerLoopIterations = 0;
	        	int innerLoopIterations = 0;
		 
		 
			int i, j, minValue, minIndex, temp = 0;
			for (i = 0; i < list.length; i++) {
				minValue = list[i];
				minIndex = i;
				outerLoopIterations++;
				for (j = i; j < list.length; j++) {
					innerLoopIterations++;
					if (list[j] < minValue) {
						minValue = list[j];
						minIndex = j;
					}
				}
				if (minValue < list[i]) {
					temp = list[i];
					list[i] = list[minIndex];
					list[minIndex] = temp;
				}
			}
			System.out.println("\nOUTER LOOP ITERATIONS: " + outerLoopIterations);
	        System.out.println("INNER LOOP ITERATIONS: " + innerLoopIterations);

			return list;
		}
	 
	 public static int[] selectionSort4 (int[] list) {
		 int outerLoopIterations = 0;
	     int innerLoopIterations = 0;
	        
		 int lowestValue = 0;
		 int indexOfLowestValue = 0;
		 
		 for(int index = 0; index <= list.length - index; index++) {
			 outerLoopIterations++;
			 
			 lowestValue = list[index];
			 indexOfLowestValue = index;
			 
			 for(int indexToCheck = index; indexToCheck < list.length; indexToCheck++) {
				 innerLoopIterations++;
				 
				 if(list[indexToCheck] < lowestValue) {
					 lowestValue = list[indexToCheck];
					 indexOfLowestValue = indexToCheck;
				 }
			 }
			 
			 int temp = list[index];
	         list[index] = list[indexOfLowestValue];
	         list[indexOfLowestValue] = temp;
			 
		 }
		 
		 System.out.println("\nOUTER LOOP ITERATIONS: " + outerLoopIterations);
	     System.out.println("INNER LOOP ITERATIONS: " + innerLoopIterations);
		 
		 return list;
	 }

}
