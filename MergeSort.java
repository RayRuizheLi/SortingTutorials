import java.util.Random;

public class MergeSort {

	static int[] array;
	static int[] tempArray;

	public static void main(String[] args){

		//Initializing array of random numbers
		array = new int[20];
		tempArray = new int[array.length];

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

		//Sort the array
		//Time Complexity O(n*log(n))
		mergeSort(0, array.length-1);

		//Display array
		for(int n: array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();


	}

	public static void mergeSort(int lowestIndex, int highestIndex){

		//Display segement
		System.out.println();
		for(int index = lowestIndex; index <= highestIndex; index++ ){
			System.out.print(array[index] + " ");
		}
		System.out.println();
		
		if(lowestIndex != highestIndex){
			//Find the middel index
			int middleIndex = lowestIndex + (highestIndex - lowestIndex) / 2;
			//Sort left 
			mergeSort(lowestIndex, middleIndex);
			//Sort right
			mergeSort(middleIndex + 1, highestIndex);
			//Actually sort them
			sort(lowestIndex, middleIndex, highestIndex);
		}

	}

	public static void sort(int lowestIndex, int middleIndex, int highestIndex){

		//Copy the section we are sorting
		for(int index = lowestIndex; index <= highestIndex; index++){
			tempArray[index] = array[index];
		}

		//Initialize counters
		int pointer1 = lowestIndex;
		int pointer2 = middleIndex + 1;
		int indexCounter = lowestIndex;

		//Compare the two groups starting from the left of each group
		while(pointer1 <= middleIndex && pointer2 <= highestIndex){
			//>= can be changed to <= to sort in descending order
			if(tempArray[pointer1] >= tempArray[pointer2]){
				array[indexCounter] = tempArray[pointer2];
				pointer2++;
			}
			else{
				array[indexCounter] = tempArray[pointer1];
				pointer1++;
			}
			indexCounter++;
		}

		while(pointer1 <= middleIndex){
			array[indexCounter] = tempArray[pointer1];
			indexCounter++;
			pointer1++;
		}


	}

	//	static void sort(int lowerIndex, int middle, int higherIndex) {
	//
	//		for (int i = lowerIndex; i <= higherIndex; i++) {
	//			tempArray[i] = array[i];
	//		}
	//		int i = lowerIndex;
	//		int j = middle + 1;
	//		int k = lowerIndex;
	//		while (i <= middle && j <= higherIndex) {
	//			if (tempArray[i] <= tempArray[j]) {
	//				array[k] = tempArray[i];
	//				i++;
	//			} else {
	//				array[k] = tempArray[j];
	//				j++;
	//			}
	//			k++;
	//		}
	//		while (i <= middle) {
	//			array[k] = tempArray[i];
	//			k++;
	//			i++;
	//		}
	//
	//	}

}
