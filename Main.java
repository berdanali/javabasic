
package pkg1;
public class Main {
public static int rakamAyir(String str){

        String str1 = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')    str1 += str.charAt(i);
        }

        return Integer.parseInt(str1);
    }
  
    public static void main(String[] args) {
        
        String str = "asd123fa8ti9999h07";

        System.out.println(rakamAyir(str));
    }

   
    }
    

