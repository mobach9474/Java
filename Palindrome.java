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
public class Palindrome {
    public static void main(String []arg)
    {
        String motEntre = "";
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrer un mot : ");
        motEntre = scan.nextLine();
        
        int i=0;
        int n = motEntre.length();
        boolean continuer = true;
        
        while(i < n && continuer)
        {
            if(motEntre.charAt(i) != motEntre.charAt(n-i-1))
            {
                continuer = false;
            }
            i += 1;
        }
        if(continuer)
            System.out.println(motEntre+" est un palindrome");
        else
            System.out.println(motEntre+" n'est pas un palindrome");
    }
    
    
    
}
