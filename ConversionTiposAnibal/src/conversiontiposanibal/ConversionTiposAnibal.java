/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontiposanibal;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class ConversionTiposAnibal {
    static Scanner ent = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce cualquier número: ");
        String num= ent.nextLine();
        int conver = Integer.valueOf(num);
        System.out.println("El numero introducido es: "+conver);
    }
    
}
