public class hello {
    public static void main(String[] args) {
        
    int rows = 6;
    for (int a = 0; a < rows; a++) {
        for (int w = 0; w < rows - a - 1; w++) {
            System.out.print(" ");

        }
        for (int k = 0; k <= a; k++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
}
