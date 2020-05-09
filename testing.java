package Basics;

public class testing {

	public static void main(String[] args) {

		int[] numbArr = {34,56,4,10};
		int arrLength = numbArr.length;

		for (int i = 0; i < 25; i=i+3) {
			System.out.println(i);
		}
	}





	/**
	 * @param numbArr
	 */
	private static void selectionSort(int[] numbArr) {
		for (int i = 0; i < numbArr.length; i++) {
			for (int j = i+1; j < numbArr.length; j++) {
				if(numbArr[i]>numbArr[j]) {
					int temp = numbArr[i];
					numbArr[i]=numbArr[j];
					numbArr[j] = temp;
				}
			}
		}

		for (int i : numbArr) {
			System.out.printf(i+" ");
		}
	}

	public static int factorial(int n) {
		if(n==1 || n==0)
			return 1;
		return n* factorial(n-1);
	}
	public static int binarySearch(int[] arr, int searchKey, int left, int middle,int right) {

		if(searchKey==arr[middle]) {
			return middle;
		}
		else if(arr[middle]<searchKey && left<right) {
			left = middle+1;
			middle = (left + right)/2;
			return binarySearch(arr,searchKey,left, middle, right);
		}
		else if(arr[middle]>searchKey && right>left) {
			right = middle-1;
			middle = (left + right)/2;
			return binarySearch(arr,searchKey,left, middle, right);
		}
		else
			return -1;
	}

	public static int binarySearchIterative(int[] arr, int searchKey) {

		int left = 0;
		int right = arr.length-1;
		int middle = arr.length/2;

		while(searchKey!=arr[middle]) {
			if(arr[middle]<searchKey && left<=right) {
				left = middle + 1;
				middle = (right + left)/2;
			}else if(arr[middle]>searchKey && right>=left) {
				right = middle -1;
				middle = (left + right)/2;
			}else {
				return -1;
			}
		}
		return middle;
	}

}
