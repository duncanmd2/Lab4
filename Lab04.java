
public class Lab04 {
	
	public static int[] sorter(int [] ar){
		int length = ar.length;
		int temp = 0; 
		for(int i = 0; i < length; i++) {
			for(int k = 0; k < length-1; k++) {
				if(ar[k] < ar[k+1]) {
					temp = ar[k];
					ar[k] = ar[k+1];
					ar[k+1] = temp; 
				}
			}
		}
		int[] ar2 = new int[length]; 
		for(int i = 0; i < ar.length; i++) {
			ar2[i] = ar[i];
		}
		return ar2;
	}

	public static void main(String[] args) {
		int[] arr =  {37, 12, 17, 59, 14};

		int [] arr2 = sorter(arr);

		for(int i: arr2) {
			System.out.print(i + " ");
		}
	}

}
