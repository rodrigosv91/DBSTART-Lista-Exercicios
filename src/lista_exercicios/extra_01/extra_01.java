package lista_exercicios.extra_01;

import java.util.Scanner;

public class extra_01 {

    public static void main(String[] args) {      
        /*  
            Write a function maskify, which changes all but the last four characters into '#'
            Examples:
                Input: 	
                    1) "4556364607934874"  
                    2) "64607934354" 
                    3) "1"
                    4) "" 
                    5) "Skippy"
                Output: 
                    1) "############4874" 	
                    2) "#######4354" 	
                    3) "1" 	| No #s if less than 4 characters
                    4) ""       | Make sure to handle empty strings
                    5) "##ippy" 
            Guaranteed Constraints:
                The input string will never be null or undefined.
            Returns: String
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a String:");
        String string = sc.nextLine();
 
        System.out.println("String mascarada: ");
        System.out.println(mascaraString(string));
    }
    
    public static String mascaraString(String string){
        if(string.length() <= 4){
            return string;
        }
        else{
            String copia_string = "";
            for(int i = 0 ; i < string.length()-4; i++){
                copia_string = copia_string + "#";
            }          
            //retorna uma substring apartir dos 4 ultimos caracteres
            copia_string = copia_string + string.substring((string.length() - 4), string.length());          
            return copia_string;
        }
    }   
}
