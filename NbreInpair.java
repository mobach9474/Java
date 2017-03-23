/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobash;

import java.util.Scanner;

/**
 *
 * @author  mohamadou bassirou matricule: 12A617FS
 */
public class NbreInpair {
    public static void main(String [] arg){
        Scanner scan= new Scanner(System.in);
        System.out.println("entrez un nombre x ");
        int n=scan.nextInt();
        System.out.println("vous avez entrer x= "+n);
        System.out.println("La liste des nombres impairs inferieur a "+n+"sont: ");
            int r;
            while(n>0){
                n=n-1;
                r=n%2;
                if(r!=0){
                    System.out.println(n);
                }
                
            
            }
    }
    
}
