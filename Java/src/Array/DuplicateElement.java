package Array;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[] {23,5,6,4,8,3,5,6,3,8,90};
		System.out.println("Duplicate elements in given array:");
		for(int i=0;i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
