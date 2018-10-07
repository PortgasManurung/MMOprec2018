/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mm;

import java.util.Scanner;


/**
 *
 * @author Samuel Manurung
 */
public class MM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
       int A[][]=new int[5][5];
       int B[][]=new int[5][5];
       int Tambah[][]=new int[5][5];
       int  c = 0;
       int  d = 0;
       
         System.out.println("Masukkan Matriks A");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                A[i][j]=input.nextInt();
            }
        }
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                if(A[x][y]>=0){
                    c++;
                }
            }
         
    }
           for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                if(A[x][y]<0){
                    d++;
                }
            }
         
    }
        
       
        System.out.println("plusnya = "+c);
        System.out.println("minusnya = "+d);
        
}
}
