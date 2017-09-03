import java.util.ArrayList;
import java.util.Random;

public class BucketSort {

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


		//Bucket Sort
		//Time Complexity:
		//Best: Ω(n+k)
		//Average: ϴ(n+k)
		//Worst: O(n^2) 
		Bucket[] buckets = new Bucket[10];
		for(int index = 0; index < buckets.length; index++){
			buckets[index] = new Bucket();
		}

		//Put numbers into buckets 
		for(int n: array){   
			int bucketIndex = n*10/51;    
			buckets[bucketIndex].bucket.add(n);
		}

		//Display numbers in each bucket
		for(Bucket n: buckets){
			System.out.print("Bucket ");
			for(int num: n.bucket){

				System.out.print(num + " ");
			}
			System.out.println();
		}

		System.out.println();

		int index = 0;
		//Sort each of the buckets using insertion sort
		for(Bucket n: buckets){
			insertionSort(n.bucket);

			//put sorted number to the new array
			for(int num: n.bucket){
				array[index] = num;
				index++;
			}

		}

		System.out.println();
		//Display numbers in each bucket
		for(Bucket n: buckets){
			System.out.print("Bucket ");
			for(int num: n.bucket){

				System.out.print(num + " ");
			}
			System.out.println();
		}

		//Display array

		System.out.println();
		for(int n: array){
			System.out.print(n + " ");
		}
		System.out.println();

	}

	public static void insertionSort(ArrayList<Integer> array){

		//Insertion Sort
		//Best Time O(n)
		//worst time complexity O(n^2)	
		for(int indexCounter = 0; indexCounter < array.size()-1; indexCounter++){

			int placeHolder = indexCounter;

			while(placeHolder >= 0 && array.get(placeHolder) > array.get(placeHolder+1)){
				swap(array, placeHolder, placeHolder+1);
				placeHolder--;
			}


		}
		

	}

	public static void swap(ArrayList<Integer> array, int index1, int index2){
		int temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}

}

class Bucket{
	ArrayList<Integer> bucket = new ArrayList<Integer>();
}

