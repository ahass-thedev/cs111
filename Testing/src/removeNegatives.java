import java.util.ArrayList;

public class removeNegatives {
	public static void main(String[] args) {
		int arr1[] = { 2, -5, 7, -3, -9, 8, -100, 101 };
		int arr[] = { 0, 1, 1, 3, 4, 5, 6, 7, 7, 7, 9, 1, 2 };
		// int arr[] = { 3, 5, 3, 3, 7};
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// print1DArray(arr);
		System.out.println(removeNegativeNums(arr1));
		print2DArray(arr2);
		// System.out.println(duplicateIndex(arr));
	}

	static void print1DArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void print2DArray(int arr[][]) {
		for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr[rows].length; cols++) {
				System.out.print(arr[rows][cols] + " ");
			}
			System.out.println();
		}
	}

	// figure out how to remove the zeros and resize
	static ArrayList<Integer> removeNegativeNums(int arr[]) {

		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				newList.add(arr[i]);
			}
		}
		return newList;
	}

	static boolean areThereDuplicates(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					System.out.println(arr[j]);
					return true;
				}
			}
		}
		return false;
	}

	static ArrayList<Integer> duplicateIndex(int arr[]) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (!indexList.contains(i) || !indexList.contains(j)) {
						indexList.add(i);
						indexList.add(j);
					}
				}
			}
		}
		return indexList;
	}
}
