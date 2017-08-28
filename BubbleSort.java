import java.util.Random;

public class BubbleSort {
	//

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

		//Bubble Sort;
		//Time complexcity §°(n2)
		for(int rounds = 0; rounds < array.length; rounds++){

			for(int index = 1; index < array.length - rounds; index++){

				if(array[index-1] > array[index]){
					swap(array, index-1, index);
				}
			}

		}

		//Display array
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
