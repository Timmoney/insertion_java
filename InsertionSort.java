class InsertionSort{
	void sort(int arr[]){
		int n = arr.length;

		for(int i=1; i<n; i++){
			int key = arr[i];
			int j = i-1;

			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1;
			}
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

		SelectionSort obj = new SelectionSort();

		obj.sort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}
}