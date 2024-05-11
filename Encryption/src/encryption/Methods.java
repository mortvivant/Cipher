/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encryption;

/**
 *
 * @author Mehmet
 */
public abstract class Methods {
     
    
    public static void encryption(String sMessage,int number){
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String eMessage = "";
        int determined; 
       
        for(int i = 0 ; i<sMessage.length();i++){
            if (!Character.isLetter(sMessage.charAt(i))){
                eMessage += " ";
            }
            for (int j = 0; j < alphabet.length ;j++){
                if( alphabet[j].equalsIgnoreCase(String.valueOf(sMessage.charAt(i)))){
                    determined = (j+ number)%26;
                    eMessage += alphabet[determined];
                    }
               }
        }
        System.out.println("Message has been encrypted: " + eMessage.toUpperCase());
    }    
    
    public static void decryption(String eMessage,int number){
         String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
         String sMessage = "";
         int determined;
         
         for(int i = 0 ; i < eMessage.length(); i++){
             if (!Character.isLetter(eMessage.charAt(i))){
                sMessage += " ";
            }
            for (int j = 0; j < alphabet.length ;j++){
                if( alphabet[j].equalsIgnoreCase(String.valueOf(eMessage.charAt(i)))){
                    determined = ((j- number)+26)%26;
                    sMessage += alphabet[determined];
                    }
            }
        }
        System.out.println("Message has been decrypted: " + sMessage.toUpperCase());
    }
}
                