/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oprec.lab.mulmed;

import java.util.Scanner;
import static oprec.lab.mulmed.No1.gangen;

/**
 *
 * @author Samuel Manurung
 */
public class No2 {
     public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int A[][]=new int[2][2];
        int B[][]=new int[2][2];
        int Tambah[][]=new int[2][2];
        int Kurang[][]=new int[2][2];
        int Pangkat[][]=new int[2][2];
        int Kali[][]=new int[2][2];
         
        System.out.println("Masukkan Matriks A");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("Masukkan Matriks B");
        for(int k=0;k<2;k++){
            for(int l=0;l<2;l++){
                System.out.print("[" +(k+1)+ "][" +(l+1)+ "]:");
                B[k][l]=input.nextInt();
            }
        }
        System.out.println("Matriks A");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(+(A[i][j])+ " ");
            }
                System.out.println(" ");
        }
        System.out.println("Matriks B");
        for(int k=0;k<2;k++){
            for(int l=0;l<2;l++){
                System.out.print(+(B[k][l])+ " ");
            }
                System.out.println(" ");
        } 
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                Tambah[x][y]=A[x][y]+B[x][y];
            }
        
        }
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                Kurang[x][y]=A[x][y]-B[x][y];
            }
        }
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                Pangkat[x][y]=(int) Math.pow(A[x][y],B[x][y]);
            }
        }
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                Kali[x][y]=A[x][y]*B[x][y];
            }
        }
        System.out.println("Hasil penjumlahan Matriks A dan Matriks B");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(+(Tambah[x][y])+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Hasil Kurang Matriks A dan Matriks B");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(+(Kurang[x][y])+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Hasil Pangkat Matriks A dan Matriks B");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(+(Pangkat[x][y])+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Hasil Kali Matriks A dan Matriks B");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(+(Kali[x][y])+" ");
            }
            System.out.println(" ");
        }
        
        

    }

}