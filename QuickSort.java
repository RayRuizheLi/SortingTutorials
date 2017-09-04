import java.util.Random;

public class QuickSort {

	private int array[];

	public static void main(String[] args){
		QuickSort sort = new QuickSort();

		//Initializing array of random numbers
		sort.array = new int[20];


		//Generating random numbers
		Random rand = new Random();

		for(int index = 0; index < sort.array.length; index++){
			//Maximum 50  Minimum 1
			sort.array[index] = rand.nextInt(50) + 1;
		}

		//Display array
		for(int n: sort.array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();

		//Quick Sort
		//Time Complexity           
		//Best case (nlogn)    rand array, median choosen as pivot   
		//worst case (n^2)		sorted array 1, 2, 3, 4, 5, 6, 7
		//Compared to merge sort: Speed, not necessarily better
		//But less storage space
		
		sort.quickSort(0, sort.array.length-1);
		
		//Display array
		for(int n: sort.array){
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();

	}

	public void quickSort(int lowestIndex, int highestIndex){

		int pointer1 = lowestIndex;
		int pointer2 = highestIndex;
		//Pivot number can be anything
		int pivot = array[highestIndex];
		
		
		//Display array
		System.out.println("pivot " + pivot );
		for(int index = lowestIndex; index <= highestIndex; index++ ){
			System.out.print(array[index] + " ");
		}

		while( pointer1 < pointer2) {
			
			while(array[pointer1] < pivot){
				pointer1++;
			}
			
			while(array[pointer2] > pivot){
				pointer2--;
			}
			
			if(pointer1 <= pointer2){
				swap(pointer1, pointer2);
				pointer1++;
				pointer2--;
			}
		}
		//Display array
		System.out.println();
		for(int index = lowestIndex; index <= highestIndex; index++ ){
			System.out.print(array[index] + " ");
		}
		System.out.println();
		System.out.println();
		
		if(lowestIndex < pointer2){
			quickSort(lowestIndex, pointer2);
		}
		if(pointer1 < highestIndex){
			quickSort(pointer1, highestIndex);
		}


	}

	public void swap(int index1, int index2){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
