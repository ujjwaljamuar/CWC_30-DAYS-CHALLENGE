package challenge;

// Print the following pattern.
public class Q84 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int alphabet = 1;
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((int) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}
