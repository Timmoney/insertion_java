class InsertionSort{
	void sort(int arr[]){
		int n = arr.length;

		//start from the second elements
		for(int i=1; i<n; i++){
			int key = arr[i];
			int j = i-1;

			//in the left segment, move everything bigger than the current key to
			//the right
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}

			//(smaller element) ----- key ----- (bigger element)
			arr[j+1] = key;
		}

	}

		//prints the arrays
	void printArray(int arr[]){
		int n = arr.length;

		for(int i=0; i<n; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {60,32,4,34,20,100};

		InsertionSort obj = new InsertionSort();

		obj.sort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}
}