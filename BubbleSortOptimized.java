import java.util.Random;

public class BubbleSortOptimized {
	//

	public static void main(String[] args){

		//Initializing array of random numbers
		
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		//int[] array = new int[10];
		//Generating random numbers
//		Random rand = new Random();
//
//		for(int index = 0; index < array.length; index++){
//			//Maximum 50  Minimum 1
//			array[index] = rand.nextInt(50) + 1;
//		}

		//Display array
		for(int n: array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();

		//Bubble Sort;
		//Time complexcity §°(n^2)
		//Best Case: O(n)
		boolean isSwap = true;
		int rounds = 0;
		while(isSwap == true){

			isSwap = false;

			for(int index = 1; index < array.length - rounds; index++){
				System.out.println(index);
				
				if(array[index-1] > array[index]){
					swap(array, index-1, index);
					isSwap = true;
				}
			}
			
			System.out.println();
			
			rounds++;

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
