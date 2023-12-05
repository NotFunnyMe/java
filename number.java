public class number {

    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            int count1 = i * n;
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                     System.out.print(count++ + "\t");

                } else {
                    System.out.print(count1-- + "\t");
                 }
            }
            System.out.println();
        }
    }
}