public class alphabet {
    public static void main(String[] args) {
        int n=5;
        int count1 = 1;
        int count2=(n*(n+1)/2)-n+1;
        for(int i =1;i<=n;i++)
        {
            int c1=count1,c2=count2;
            for(int j1=n,j2=i;j1>=i||j2<=n;j1--,j2++)
            {
                System.out.print((char)(c1+64)+"\t"+(char)(c2+64));
                c1+=j1;
                c2++;
            }
            System.out.println();
            count1++;
            count2-=n-i;
        }
        }
        
}

