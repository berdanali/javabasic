
package pkg7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int sayi1 = scanner.nextInt(), sayi2 = scanner.nextInt();

        yaz(sayi1, sayi2);

    }

    public static void yaz(int s1, int s2) throws IOException{
        File file3 = new File("C:\\Users\\Berdan\\Desktop\\3d.txt");
        File file7 = new File("C:\\Users\\Berdan\\Desktop\\7d.txt");
        File fileTam = new File("C:\\Users\\Berdan\\Desktop\\tamd.txt");

        FileWriter fw3 = new FileWriter(file3);
        FileWriter fw7 = new FileWriter(file7);
        FileWriter fwTam = new FileWriter(fileTam);

        for(int i = s1; i <= s2; i++){
             if(i % 3 == 0 && i %7 == 0)      fwTam.write(i + "\n");
             else if(i % 3 == 0)      fw3.write(i + "\n");
             else if(i % 7 == 0)      fw7.write(i + "\n");
        }
        fw3.close();
        fw7.close();
        fwTam.close();
    }
}
    

