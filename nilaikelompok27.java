import java.util.Scanner;

public class nilaikelompok27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1, nilai;
        double ratanilai,totalnilai;

        while (i <= 6) {
            System.out.println("kelompok " + i);

            totalnilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("nilai dari kelompok penilai " + j + ": ");
                nilai = scanner.nextInt();
                totalnilai += nilai;
            }

            ratanilai=totalnilai/5; 
            System.out.println("rata-rata nilai kelompok " + i + " adalah " + ratanilai);
            System.out.println();
            i++;
        }

        scanner.close();
    }
}
