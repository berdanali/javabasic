package bolunensayılarbul;

import java.util.Scanner;

public class Bolunensayılarbul {

    public static void main(String[] args) {
        System.out.println("Lütfen bölenlerini bulmak istediğiniz sayıları yazın");
        Scanner klavye = new Scanner(System.in);

        int sayi = klavye.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
