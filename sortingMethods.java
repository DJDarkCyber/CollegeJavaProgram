package sortinMethods;

import java.util.Scanner;

public class sortingMethods {
	public static void main(String[] args) {
		while(true) {
			Scanner input = new Scanner(System.in);
			int usrChoice;
			System.out.println("1. Perform Linear Search");
			System.out.println("2. Perform Binary Search");
			System.out.println("3. Perform Bubble Sorting");
			System.out.println("4. Perform Selection Sorting");
			System.out.println("5. Perform Insertion Sorting");
			System.out.println("99. Exit");
			System.out.print("\n> ");
			usrChoice = input.nextInt();
			switch(usrChoice) {
			case 1:
				SequentialSearch sq = new SequentialSearch();
				sq.performSearch();
				break;
			case 2:
				BinarySearch bin = new BinarySearch();
				bin.performSeach();
				break;
			case 3:
				BubbleSorting bub = new BubbleSorting();
				bub.PerformSort();
				break;
			case 4:
				SelectionSorting sel = new SelectionSorting();
				sel.performSort();
				break;
			case 5:
				InsertionSorting ins = new InsertionSorting();
				ins.performSort();
				break;
			case 99:
				System.out.println("[-] Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("[-] Invalid Choice, Try Again!");
			}
		}
		
	}
}

// Sequential Searching Method

class SequentialSearch{
	int usrMax;
	int usrArray[];
	int usrVal;
	public void performSearch() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the max elements to get > ");
		this.usrMax = input.nextInt();
		this.usrArray = new int[this.usrMax];
		for(int i =0; i<this.usrMax; i++) {
			System.out.print(i+1 + " > ");
			this.usrArray[i] = input.nextInt();
		}
		System.out.print("\nEnter the Element to Search > ");
		this.usrVal = input.nextInt();
		for(int i=0; i<this.usrMax; i++) {
			if (this.usrVal == this.usrArray[i]) {
				System.out.println("Element Found! at position : " + i);
				return;
			}
		}
		System.out.println("Element not found!");
		
	}
}

// Binary Searching Method

class BinarySearch{
	int usrMax;
	int usrArray[];
	int usrVal;
	public void performSeach(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements to get > ");
		this.usrMax = input.nextInt();
		System.out.println("Note: Enter elements in Ascending order");
		this.usrArray = new int[this.usrMax];
		for(int i=0; i<this.usrMax; i++) {
			System.out.print((i+1) + " > ");
			this.usrArray[i] = input.nextInt();
		}
		System.out.print("Enter the element to search > ");
		this.usrVal = input.nextInt();
		int first = 0;
		int last = this.usrMax - 1;
		int midVal = (first + last)/2;
		while(first<=last) {
			midVal = (first + last)/2;
			if(this.usrArray[midVal] == this.usrVal) {
				System.out.println("Element found at index : " + midVal);
				return;
			}
			else if(this.usrVal > this.usrArray[midVal]) {
				first = midVal + 1;
			}
			else {
				last = midVal - 1;
			}
		}
		System.out.println("Oops! Element Not found !\n");
	}
}

// Bubble Sorting Method

class BubbleSorting{
	
	int usrArray[];
	int usrMax;
	int usrVal;
	
	public void PerformSort() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements to get > ");
		this.usrMax = input.nextInt();
		this.usrArray = new int[usrMax];
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(i+1 + " > ");
			this.usrArray[i] = input.nextInt();
		}
		System.out.print("\nArray Before sorting : {");
		
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(usrArray[i] + ", ");
		}
		System.out.println("}\n");
		int count = 1;
		while(count < this.usrMax) {
			int swapCount = 0;
			for(int i=0; i<this.usrMax-count; i++) {
				if(this.usrArray[i] > this.usrArray[i+1]) {
					int temp = this.usrArray[i];
					this.usrArray[i] = this.usrArray[i+1];
					this.usrArray[i+1] = temp;
					swapCount++;
				}
			}
			if(swapCount == 0) break;
			count++;
		}
		System.out.print("\n\nArray After Sorting : {");
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(this.usrArray[i] + ", ");
		}
		System.out.print("}\n\n");
	}
}

// Selection Sorting Method

class SelectionSorting{
	int usrArray[];
	int usrMax;
	int usrVal;
	
	public void performSort() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements to get > ");
		this.usrMax = input.nextInt();
		this.usrArray = new int[usrMax];
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(i+1 + " > ");
			this.usrArray[i] = input.nextInt();
		}
		System.out.print("\nArray Before sorting : {");
		
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(usrArray[i] + ", ");
		}
		System.out.println("}\n");
		for(int i =0; i<this.usrMax; i++) {
			int min = i;
			for(int j=i; j<this.usrMax; j++) {
				if(this.usrArray[j] < this.usrArray[min]) {
					min = j;
				}
			}
			
			if(i!= min) {
				int temp = this.usrArray[i];
				this.usrArray[i] = this.usrArray[min];
				this.usrArray[min] = temp;
			}
		}
		System.out.print("\n\nArray After Sorting : {");
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(this.usrArray[i] + ", ");
		}
		System.out.print("}\n\n");
	}
}

// Insertion Sorting Method

class InsertionSorting{
	int usrArray[];
	int usrMax;
	int usrVal;
	
	public void performSort() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements to get > ");
		this.usrMax = input.nextInt();
		this.usrArray = new int[usrMax];
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(i+1 + " > ");
			this.usrArray[i] = input.nextInt();
		}
		System.out.print("\nArray Before sorting : {");
		
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(usrArray[i] + ", ");
		}
		System.out.println("}\n");
		int j;
		for(int i=1;i<this.usrMax; i++) {
			int currentVal = this.usrArray[i];
			j = i - 1;
			while(j >= 0 && this.usrArray[j] > currentVal) {
				this.usrArray[j + 1] = this.usrArray[j];
				j = j - 1;
			}
			this.usrArray[j+1] = currentVal;
		}
		System.out.print("\n\nArray After Sorting : {");
		for(int i=0; i<this.usrMax; i++) {
			System.out.print(this.usrArray[i] + ", ");
		}
		System.out.print("}\n\n");
	}
}



