
package entrenamientos;

import java.util.Scanner;


public class GirlOrMen {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); // rodrigo
        String name = sc.next();
        int letrasDistintas = 0;
        for (int i = 0; i < name.length(); i++) {
            int repetidas = 0;
            for (int j = i+1; j < name.length(); j++) {
                    if(name.charAt(i) == name.charAt(j)){
                        repetidas += 1;
                    }
            }
            if(repetidas == 0){
                letrasDistintas += 1;
            }
        }
        if(letrasDistintas%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }      
    }
    
}
