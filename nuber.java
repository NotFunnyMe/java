import java.util.Scanner;
public class nuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to swap array");
        int k=sc.nextInt();
        int arr[]={10,20,30,40,50};
        for(int i=0;i<k;i++)
        {
            int temp = arr[i];
            arr[i]=arr[arr.length-k+i];
            arr[arr.length-k+i]=temp;
        }
        System.out.println("array is ");
        for(int m=0;m<arr.length;m++)
        {
            System.out.print(arr[m]+"\t");
        }

    }
    
}
