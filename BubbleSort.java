package Programs;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {10,5,80,34,21,43,19};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]+" ");
			}
		}
	}

