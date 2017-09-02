import java.util.Random;

public class SelectionSort {

	public static void main(String[] args){
		//Initializing array of random numbers
		int[] array = new int[20];

		//Generating random numbers
		Random rand = new Random();

		for(int index = 0; index < array.length; index++){
			//Maximum 50  Minimum 1
			array[index] = rand.nextInt(50) + 1;
		}

		//Display array
		for(int n: array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();

		//Selection Sort
		//Best/worst time complexity O(n^2)
		for(int rounds = 0; rounds < array.length -1; rounds++){

			int smallestIndex = rounds;
			for(int index = rounds; index < array.length; index++){

				//Display array
				for(int n: array){
					System.out.print(n + " ");
				}
				System.out.println();
				
				if(array[smallestIndex] > array[index]){
					smallestIndex = index;
				}
			}
			swap(array, smallestIndex, rounds);
			
			System.out.println();
		}

		//Display array
		
		System.out.println();
		for(int n: array){
			System.out.print(n + " ");
		}
		System.out.println();

	}

	public static void swap(int[] array, int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}


}
