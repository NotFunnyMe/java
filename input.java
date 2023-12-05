import java.util.Scanner;
public class input {
    public static void main(String[] args){

        Scanner o = new Scanner(System.in);
        System.out.println("enter the number of elements to be inserted in array");
        int n=o.nextInt();
        System.out.println("enter the elements in array");
        int k[] = new int[n];
        for(int i=0;i<k.length;i++){
            k[i]=o.nextInt();
            System.out.print(k[i] + "\t");
        }
    }

    
}
