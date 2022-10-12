
package ahmet1;


public class Ahmet1 {
 
 public static String[] bul(String[] s){
     int e =s.length;
     int boy=s[0].length();
     int indis = 0,sayac = 0;
         
     for (int i = 1; i<e; i++){
          if (s[i].length()>boy){
              boy=s[i].length();
          indis =i;
          sayac++;
          }        
     }
     System.out.println((sayac-1)+"kadar en uzun string vardır");
     String geri[]=new String[2];
     geri[0] = s[indis];
     geri[1]=Integer.toString(indis);
     return geri ;
 
 }
    public static void main(String[] args) {
      String s2[] ={"ali","osman","haydar","huseyın","SSSSSSS","AAAAAAA"};
      String dondu[]=new String[2];
      dondu=bul(s2);
      
      
        System.out.println(dondu[0]);
        System.out.println(dondu[1]);
                
        }
}  
        
        
        
    
    

