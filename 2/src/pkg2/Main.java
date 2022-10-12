
package pkg2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        File fileBu = new File("C:\\Users\\Berdan\\Desktop\\55.txt\\");
        File fileGecer = new File("C:\\Users\\Berdan\\Desktop\\33.txt\\");
        File fileKalir = new File("C:\\Users\\Berdan\\Desktop\\44.txt\\");

        String ad = "Fatih" , soyAd = "Altuntas", yas = "20";
        int not = 51;

        FileWriter fwBu = new FileWriter(fileBu);
        FileWriter fwGecer = new FileWriter(fileGecer);
        FileWriter fwKalir = new FileWriter(fileKalir);

        fwBu.write(ad + "   " + soyAd + "    " + yas + "    " + not);

        if(not >= 50)   fwGecer.write(ad + " " + not + " puaniyla geçti.");
        else    fwKalir.write(ad + " " + not + " puaniyla kaldi.");

        fwBu.close();
        fwGecer.close();
        fwKalir.close();
    }
    }
    

