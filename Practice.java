package test;

public class testOne {

	public static void main(String[] args) {
		int arr[]= {3,0,2,0,0,5,4,0,1,0};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//for(int i=0;i<arr.length;i++)
		//System.out.print(arr[i] +" ");
		int countZero = 0; // count the number of zeros in array
		for(int i = 0; i < arr.length; i++){
			if(arr[i]  == 0){
				countZero++;
			}
		}
		int l = 0;
		for(int k = countZero; k < arr.length; k++){
			arr[l] = arr[k];
			l++;
		}
		
		
		for(int k = arr.length - countZero; k < arr.length; k++){
			arr[k] = 0;
			
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +" ");
  }
	
}
