
package pkg5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) throws IOException {

        File file = new File("sayi.dat");
        FileWriter fw = new FileWriter(file);
        Scanner scanner = new Scanner(System.in);

        int sayac = 0, sayi = 0;

        while(sayi >= 0){
            sayi = scanner.nextInt();

            if(sayi % 13 == 0){
                fw.write(sayi + "\n");
                sayac++;
            }

        }

        fw.write(sayac + " adet");
        fw.close();

    }
}
    

