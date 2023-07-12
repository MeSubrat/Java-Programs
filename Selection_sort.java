import java.util.Scanner;
class Selection_sort{
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

        for(int i=0;i<n;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;   
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}