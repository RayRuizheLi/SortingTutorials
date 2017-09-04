import java.util.Random;

public class MergeSortProper {

	private int[] array;
	private int[] tempArray;

	public static void main(String[] args){

		MergeSortProper merge = new MergeSortProper();
		
		//Initializing array of random numbers
		merge.array = new int[20];
		merge.tempArray = new int[merge.array.length];

		//Generating random numbers
		Random rand = new Random();

		for(int index = 0; index < merge.array.length; index++){
			//Maximum 50  Minimum 1
			merge.array[index] = rand.nextInt(50) + 1;
		}

		//Display array
		for(int n: merge.array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();

		//MergeSort
		//Sort the array
		//Time Complexity O(n*log(n))
		merge.mergeSort(0, merge.array.length-1);

		//Display array
		for(int n: merge.array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();


	}

	public void mergeSort(int lowestIndex, int highestIndex){

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

	public void sort(int lowestIndex, int middleIndex, int highestIndex){

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



}
