
public class MergeSort {

	public static int[] mergeSort(int[] data) {

		if (data.length > 1) {

			int mid_pt = data.length / 2;
			int[] leftList = new int[mid_pt]; // left list starts at index 0 and ends in mid point
			int[] rightList = new int[data.length - mid_pt]; // right list is made of the remaining indexes

			// populating left array with data - data at index 0 of og array, till mid point
			for (int i = 0; i < mid_pt; i++) {
				leftList[i] = data[i];
			}

			// populating right array with data - data at mid point of og array, till the end of the array
			for (int i = mid_pt; i < data.length; i++) {
				rightList[i - mid_pt] = data[i]; // we do -mid_pt bc we don't want first indexes of rightList to just be empty.
			}

			//splitting left lists and right lists
			mergeSort(leftList); 
			mergeSort(rightList);
			
			merge(data, leftList, rightList, mid_pt, data.length - mid_pt); //merge the two and sort them

		}

		return data;

	}

	public static void merge(int[] data, int[] leftList, int[] rightList, int leftLength, int rightLength) {

		int mainIndex = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		
		while (leftIndex < leftList.length && rightIndex < rightList.length) {
			if (leftList[leftIndex] <= rightList[rightIndex]) {
				data[mainIndex++] = leftList[leftIndex++];
			} else {
				data[mainIndex++] = rightList[rightIndex++];
			}
		}

		
		while (leftIndex < leftList.length) {
			data[mainIndex++] = leftList[leftIndex++];
		}

		while (rightIndex < rightList.length) {
			data[mainIndex++] = rightList[rightIndex++];
		}
		
	}

	public static void main(String[] args) {

		int[] testArr = {1, 4, 2, 3, 5, 7, 6, 8, 10, 9};
		
		int[] output = mergeSort(testArr);
		
		for(int i : output) {
			System.out.print(i + " ");
		}
		
		
	}

}
