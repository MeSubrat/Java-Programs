import java.util.Scanner;
class MarkSort{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        double arr[]=new double[n];
        
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            int max=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            double temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;   
        }
        for(int i=0;i<n;i++){
            System.out.println((i+1)+" : "+arr[i]);
        }
    }
}