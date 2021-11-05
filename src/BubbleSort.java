
public class BubbleSort {

	public static void main(String[] args) {

		int[] data = { 29, 84, 25, 6, 58, 82, 47, 72, 45, 70 };
		int passes = 0;
		int exchanges = 0;
		int firstUnsorted = 0;
		boolean swap = true;

		System.out.println("Array in the beginning: ");
		for(int i : data) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		while (swap) {
			passes++;
			swap = false;
			int index = data.length - 1;

			while (index > firstUnsorted) {
				if (data[index] < data[index - 1]) {
					int temp = data[index];

					data[index] = data[index - 1];
					data[index - 1] = temp;
					swap = true;
					exchanges++;
					
					System.out.println("Current state of array:");
					for(int i : data) {
						System.out.print(i + " ");
					}
					System.out.println("");
					
				}
				index--;
			}
		}

		System.out.println("\nPasses: " + passes + " Exchanges: " + exchanges);
		
		for (int i : data) {
			System.out.print(i + " ");
		}

	}

}
