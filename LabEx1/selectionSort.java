import java.util.Scanner;
public class selectionSort{
	public static void main(String args[]){
		int size, i, j, temp;
		int arr[] = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		size = sc.nextInt();
		System.out.print("Enter Array Elements : \n");
		for(i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for(i=0; i<size; i++){
			for(j=i+1; j<size; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("sorted array >>\n");
		for(i=0; i<size; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
