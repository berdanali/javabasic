
package teknıkresımodev;

import java.util.Scanner;


public class Teknıkresımodev {

    public static void main(String[] args) {
        
        int x,y;
        double kordinat;
        int m1,m2;
        
   Scanner k = new Scanner(System.in);
   System.out.println("Lütfen x  kordinatını giriniz ... ");
      x = k.nextInt();
      System.out.println("Lütfen y  kordinatını giriniz ... ");
   y = k.nextInt();
   
   
   
  System.out.println("kaç birim öteleyeceksiniz ? ");
  m1 = k.nextInt();
  m2 = k.nextInt();
  
  x = x+m1;
  y = y+m2;
  
        System.out.println("Yeni kordinatlar ...");
        System.out.println(x);
        System.out.println(y);
    }
    
}
