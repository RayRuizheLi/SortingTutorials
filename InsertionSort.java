import java.util.Random;

public class InsertionSort {

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

		//Insertion Sort
		//Best Time O(n)
		//worst time complexity O(n^2)	
		for(int indexCounter = 0; indexCounter < array.length-1; indexCounter++){

			int placeHolder = indexCounter;

			while(placeHolder >= 0 && array[placeHolder] > array[placeHolder+1]){
				
				//Display array
				for(int n: array){
					System.out.print(n + " ");
				}
				System.out.println();
				
				
				swap(array, placeHolder, placeHolder+1);
				placeHolder--;
			}
			
			//For spacing each round
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
