import java.util.Scanner;
class Bubble_sort{
    public static void main(String[] arg){
        int n;
        int arr[]=new int[1000];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
	for(int i=n-1;i>=0;i--){
	    for(int j=0;j<n-1;j++){
		if(arr[j]>arr[j+1]){
		    int temp=arr[j];
		    arr[j]=arr[j+1];
  		    arr[j+1]=temp;
		}
	    }
	}
	for(int i=0;i<n;i++){
	    System.out.print(" "+arr[i]);
	}
    }
}