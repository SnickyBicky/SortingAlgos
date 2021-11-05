
public class InsertionSort {

	public static int[] insertionSorting(int[] data) {
		
		int innerLoopIteration = 0;
		int outerLoopIteration = 0;
		
		System.out.println("Array in the beginning:");
		for(int indexBeginning : data) {
			System.out.print(indexBeginning + " ");
		}
		System.out.println("");
		
		int i, j, key, temp;

		// outer loop, it is used for indexing and KEY value. Key value is simply the
		// one at the index i.
		// Then, the inner loop compares j (index key - 1) and
		// if our key (data[i]) is smaller, swap the places.
		for (i = 1; i < data.length; i++) {
			key = data[i];
			
			j = i - 1; // because we want to compare key and value on the left.
			System.out.println("Comparing: " + data[i] + " and " + data[j]);
			
			// as long as j has not reached the end of the list AND key (data at index i)
			// is smaller than data in the index to the left - SWAP
			while (j >= 0 && key < data[j]) {
				temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
				j--;
				innerLoopIteration++;
			}
			
			// purely printing stuff
			System.out.println("\nCurrent state: ");
			for (int printIndex : data) {
				System.out.print(printIndex + " ");
			}
			System.out.println("");
			outerLoopIteration++;
		}
		
		System.out.println("\nOuter loop iterations: " + outerLoopIteration 
							+ "\nInner loop iterations: " + innerLoopIteration);
		return data;
	}

	public static void main(String[] args) {

		int[] data = { 48, 35, 67, 23, 51, 56, 25, 18, 42 };

		insertionSorting(data);

		
		System.out.println("\nFinal outcome: ");
		for (int i : data) {
			System.out.print(i + " ");
		}

	}

}
