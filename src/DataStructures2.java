
public class DataStructures2 {// THE SELECTION SORT ALGORITHM
	
	public static int[] selectionSort(int[] a) {// takes in an array of integers in this case
		for (int i = 0; i < a.length - 1; i++) {// runs n-1 times in outer loop
			int indexOfMin = i;                 // set indexOfMin to starting comparison point of second loop
			for (int j = 0 + i + 1; j < a.length; j++) {// compare from the next array element onward and update indexOfMin when necessary
				if (a[j] < a[indexOfMin]) {
					indexOfMin = j;
				}
			}
			if (a[i] != a[indexOfMin]) {// replace the "first" element with the minimum if necessary
				int box = a[indexOfMin];
				a[indexOfMin] = a[i];
				a[i] = box;
			}
		}
		return a;
	}
	
	// we are doing at most (5)*(n-1 + n-2 + n-3 + ... + 3 + 2 + 1) ~ 5/2 (n^2) which is O(n^2)

	public static void main(String[] args) {
		System.out.println("DEMONSTRATING SELECTION SORT:");
		int[] a = { 21, 3, 41, 6, 12, 8, 9 };
		int[] b = { 2, 1, 1, 6, 2, 88, 9 };
		int[] c = { 210, 30, 410, 600, 102, 8, 5 };
		int[] d = { 2, 1, -3, -6, 12, 11, 9 };
		int[] e = { 9, 0 };
		int[] f = { 0 };
		int[][] G = {a, b, c, d, e, f};
		for (int k = 0; k < G.length; k++) {
			for (int l = 0; l < G[k].length; l++) {
				System.out.println(selectionSort(G[k])[l]);
			}
			System.out.println("Finished with array " + k);
		}
	}
}
