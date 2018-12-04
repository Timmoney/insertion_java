class RecurInsertion{
	void sort(int arr[], int n){

		//base case, just in case if there is no element at all
		if(n <= 1)
			return;

		sort(arr, n-1);
		
		//here we make sure the the key is the next of j
		int key = arr[n-1];
		int j = n-2;

		while(j>=0 && arr[j] >key){
			arr[j+1] = arr[j];
			j--;
		} 
		arr[j+1] = key;
		
	}

	//prints the arrays
	void printArray(int arr[]){
		int n = arr.length;

		for(int i=0; i<n; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {5,60,88,3,2,100};

		RecurInsertion obj = new RecurInsertion();

		obj.sort(arr,  6);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}

}