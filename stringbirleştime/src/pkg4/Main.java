
package pkg4;


public class Main {

    
    public static String birlestir(String[] str1, String[] str2){
        String str = "";

        for(int i = 0; i < str1.length; i++){
            str += str1[i];
        }

        for(int i = 0; i < str2.length; i++){
            str += str2[i];
        }

        return str;
    }
    public static void main(String[] args) {
          String[] str1 = {"Ben7im ", "adim "};
        String[] str2 = {"Fatih ", "Altuntas"};

        System.out.println(birlestir(str1, str2));
        
    }

 
    }
    

