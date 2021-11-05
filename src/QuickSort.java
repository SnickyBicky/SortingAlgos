
public class QuickSort {

	public static int swap1 = 0;
	public static int swap2 = 0;

	public static void quicksort(int[] data, int first, int last) {

		if (first < last) {

			int splitPoint = data[first];
			int left = first + 1;
			int right = last;

			while (left <= right) {

				//increment left if
				if (data[left] < splitPoint || left > right) {
					left++;
				}

				if (data[right] > splitPoint || left > right) {
					right--;
				}

				if (left < right) {
					int temp1 = data[left];
					data[left] = data[right];
					data[right] = temp1;
					swap1++;

				}
			}
			int temp = data[first];
			data[first] = data[right];
			data[right] = temp;
			splitPoint = right;

			quicksort(data, first, splitPoint - 1);
			quicksort(data, splitPoint + 1, last);
			swap2++;
			
			System.out.println("Swap1 = " + swap1);
			System.out.println("Swap2 = " + swap2);

			for (int i : data) {
				System.out.print(i + ", ");
			}
			System.out.println("\n");

		}
	}

	public static void main(String[] args) {

		int[] data = { 76, 11, 79, 50, 89, 43, 92, 46 };
		quicksort(data, 0, 7);

	}
}
