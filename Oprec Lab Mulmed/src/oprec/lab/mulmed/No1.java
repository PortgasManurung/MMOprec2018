/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oprec.lab.mulmed;

import java.util.Scanner;

/**
 *
 * @author Samuel Manurung
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;        
        System.out.println("Masukkan Angka:");
        x = input.nextInt();
        gangen(x);

    }
    
    public static int gangen(int x){
        if (x%2==1 ){
            System.out.println("Ganjil");
        }
        else{
            System.out.println("Genap");
        }
        return 0;
    }

    
}
