--/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobash;

import java.util.Scanner;

/**
 *
 * @author mohamadou bassirou matricule: 12A617FS
 */
public class Binaire {
    public static void main(String []arg){
        Scanner scan= new Scanner(System.in);
        System.out.println("entrez un nombre decimal a convertir:");
        int dec=scan.nextInt();
        
        System.out.print("Le nombre "+dec+" en binaire est : ");
        int i = 0;
        long resultat = 0;
        int r;
            while(dec>0){
                
                r=dec%2;
                dec=(int)(dec/2);
                
                resultat += r*((int)Math.pow(10,i));
                i+= 1;
                
            }
        System.out.println(resultat);
    }
    
}
