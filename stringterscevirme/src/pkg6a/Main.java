package pkg6a;
import java.util.Arrays;
public class Main {
 public static String[] tersCevir(String[] a){
        String[] str1 = new String[a.length];
        String gecici = "";
        for(int i = 0; i < a.length; i++){
            for(int k = a[i].length()-1; k >= 0 ; k--){
                gecici += a[i].charAt(k);
            }
            str1[i] = gecici;
            gecici = "";
        }
        return str1;
    } 
    public static void main(String[] args) {
       String[] str = {"Ali", "Hasan", "Hüseyin"};
        System.out.println(Arrays.toString(tersCevir(str)));
    }


  
}



    

