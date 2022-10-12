package pkg3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void yaz(String[][] str) throws IOException {
        File file = new File("C:\\Users\\Berdan\\Desktop\\66.txt\\");
        FileWriter fw = new FileWriter(file);

        for (int i = 0; i < str.length; i++) {
            for (int k = 0; k < str[i].length; k++) {
                if (str[i][k].length() == 1) {
                    fw.write(str[i][k] + "\n");
                }
            }
        }
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        String[][] str = {
            {"a", "b", "1", "12"},
            {"d", "?", "<", "123"},
            {"F", "#", "s", "12584"}
        };

        yaz(str);
    }
}
