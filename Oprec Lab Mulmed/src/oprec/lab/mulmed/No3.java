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
public class No3 {
        public static void main(String[] args) {
            //  Nim
            String strA = "1301164056";
 
            //  Mengambil isi sebagian Nim
            String sub_str1 = strA.substring(0,1);  
            System.out.println(sub_str1+" Menyatakan kode universitas ");
            String sub_str2 = strA.substring(1,2);  
            System.out.println(sub_str2+" Menyatakan kode Fakultas ");
            String sub_str3 = strA.substring(2,3);  
            System.out.println(sub_str3+" Menyatakan kode Jurusan ");
            String sub_str4 = strA.substring(3,4);  
            System.out.println(sub_str4+" Menyatakan kode Angkatan ");
            String sub_str5 = strA.substring(4,10);  
            System.out.println(sub_str5+" Menyatakan kode Angkatan ");
        }

  
    
}
