public class BinaryRecursiveSearch implements Practice2Search{

	public String searchName(){
		return "Binary recursive";
	}

	public int search(int [] arr, int target){
		return binarySearch(arr, target, 0, arr.length - 1);	
	}

	public int binarySearch(int [] arr, int target, int low, int upper){
		if (low > upper){
			return -1;
		}
		int mid = (upper + low)/2;
		if (arr[mid] == target) {
			return mid;
		}
		else if (arr[mid] < target){
			return binarySearch(arr, target, mid+1, upper);
		}
		else {
			return binarySearch(arr, target, low, mid-1);
		}
	}
}