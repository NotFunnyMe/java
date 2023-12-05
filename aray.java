public class aray {
    public static void main(String[] args) {
        int arr[]={10,11,4,15,123,7,71,28,45,804,2002,144,161,22};
        int length=arr.length;
        
        for(int i=0;i<length;i++)
        {
            // System.out.println(arr[i]);
            int k=String.valueOf(arr[i]).length();
            System.out.println("total elements = " + k);
    
        }
       
    
    }
    
}
