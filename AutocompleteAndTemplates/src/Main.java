import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * kelas ini milik Main
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.println("Selamat datang di program konversi massa!");
        out.print("Masukkan massa dalam kilogram: ");
        double kilogram = input.nextDouble();

        // Konversi kilogram ke gram
        double gram = kilogram * 1000;

        out.println(kilogram + " kilogram adalah " + gram + " gram.");

        input.close();
    }
}
