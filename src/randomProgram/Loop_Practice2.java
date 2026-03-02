package randomProgram;


import java.util.Scanner;

public class Loop_Practice2 {

	// Find the largest element in an array using a loop.
	private void first(Scanner obj) {
		System.out.println("enter how many elements in array");
		int n = obj.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = obj.nextInt();

		int max = arr[0];
		int min = max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("max value " + max + " and min value: " + min);
	}

	// Print a square pattern of * with n rows and columns.
	private void second(Scanner obj) {
		System.out.println("how many rows and columns");
		int n = obj.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	// Print a right-angled triangle pattern of *.
	// Print a number triangle pattern:
	// Print an inverted triangle pattern of *.

	private void third(Scanner obj) {
		System.out.println("how many rows?");
		int n = obj.nextInt();
		System.out.println("choose 1 to print right angle triangle");
		System.out.println("choose 2 for number triangle");
		System.out.println("choose 3 for inverted triangle");
		int choice = obj.nextInt();
		if (choice == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++)
					System.out.print("*");
				System.out.println();
			}
		} else if (choice == 2) {
			for (int i = 0; i < n; i++) {
				int num = 1;
				for (int j = 0; j <= i; j++) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
		} else if (choice == 3) {
			for (int i = 0; i < n; i++) {
				for (int j = n; j > i; j--)
					System.out.print("*");
				System.out.println();
			}
		} else
			System.out.println("wrong input");
	}

	// Print a pyramid pattern of numbers.
	private void fourth(Scanner obj) {
		System.out.println("enter row numbers for pyramid triangle");
		int n = obj.nextInt();
		for (int i = 0; i < n; i++) {
			for (int space = n; space > i; space--)
				System.out.print(" ");
			for (int star = 1; star <= i * 2 - 1; star++)
				System.out.print("*");
			System.out.println();
		}
	}

	// Check if an array contains duplicate elements using nested loops.
	private void fifth(Scanner obj) {
		int arr[] = { 5, 48, 14, 5, 78 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean isFoundAlready = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					isFoundAlready = true;
					break;
				}
			}
			if (isFoundAlready)
				continue;
			int position = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					position = j;
				}
				// System.out.print(count+" ");
			}
			if (count >= 1)
				System.out.println("duplicate found for " + arr[i] + " at " + position + " position");
		}
	}

	// Print all pairs of elements in an array.
	private void sixth() {
		int arr[] = { 1, 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)
				System.out.print("[ " + arr[i] + "," + arr[j] + " ]" + " ");
		}
		System.out.println();
	}

	// Find all pairs whose sum is equal to a given number.
	private void seventh(Scanner obj) {
		System.out.println("enter the number");
		int n = obj.nextInt();
		int arr[] = { -5, 1, 2, 3, 4, 20, 5, 6, 7, 8, 9, 10, 15, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n)
					System.out.print("[ " + arr[i] + "," + arr[j] + " ]" + " ");
			}
		}
		System.out.println();

	}

//Print a hollow square pattern using *.
	private void eight(Scanner sc) {
		System.out.println("How many rows");
		int n = sc.nextInt();

		System.out.println("enter choice 1 for hollow square " + "2 for number hollow pyramid");
		int choice = sc.nextInt();
		if (choice == 1) {
			for (int line = 0; line <= n; line++) {
				if (line == 0 || line == n) {
					for (int star = 0; star <= n; star++)
						System.out.print("* ");
				} else {
					System.out.print("* ");
					for (int star = 1; star <= n - 1; star++)
						System.out.print("  ");
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (choice == 2) {
			for (int line = 0; line <= n; line++) {
				int num = 1;
				for (int space = n; space > line; space--)
					System.out.print(" ");
				if (line == 0 || line == n) {
					for (int star = 0; star <= line; star++)
						System.out.print(num + " ");
				} else {
					System.out.print(num + " ");
					for (int star = 1; star < line*2-1; star++)
						System.out.print(" ");
					System.out.print(num);
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Loop_Practice2 obj = new Loop_Practice2();
		obj.first(sc);
		obj.second(sc);
		obj.third(sc);
		obj.fourth(sc);
		obj.fifth(sc);
		obj.sixth();

		obj.seventh(sc); //check for number 15
		obj.eight(sc);

		sc.close();
	}
}
