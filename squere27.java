import java.util.Scanner;

public class squere27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nilai n = ");
        int n = scanner.nextInt();
        for (int iouter = 1; iouter<=n;iouter++) {
            for (int j = 1; j <= n ; j++) {
            System.out.print("*");
        } System.out.println();
    }
    }
}
