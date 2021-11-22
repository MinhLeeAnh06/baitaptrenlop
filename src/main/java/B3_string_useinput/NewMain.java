/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B3_string_useinput;

import java.io.InputStream;
import java.util.Scanner;import java.lang.String;

/**
 *2
 * @author Minhleeanh06
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner In4 = new Scanner (System.in);
       //String ten = In4.nextLine();
       // int tuoi = In4.nextInt();
        //String lop  = In4.nextLine();
       // System.out.println("nhap diem toan vao day\n");
        //Double toan;
       //toan = In4.nextDouble();
       // Double ly = In4.nextDouble();
        //System.out.println("nhap diem so ly vao day\n");
       // Double hoa;
       // System.out.println("nhap diem so hoa vao day \n");
      //  hoa = In4.nextDouble();
        //System.out.println("ten toi la :"+ten );
      // System.out.println("tuoi toi la : "  + tuoi );
       // System.out.println("lop la : " +  lop);
         //TODO code application logic here
        // nhap diem
        ///lam bai moi 
        System.out.println("Nhap so luong sinh vien trong lop  ");
        int n = In4.nextInt();
        String[] name = new String[n];
        String[] lop = new String[n];
        Double[]toan = new Double[n];
        Double[]ly = new Double[n];
        Double[]hoa = new Double[n];
        Double dtb ;Double tong ;
        for(int i = 0 ;i<n;i++){
            System.out.println("Stt "+ i);
            System.out.println("Lop cua sinh vien la  : ");
            lop[i]=In4.nextLine() ;In4.nextLine();
            System.out.println("Ten cua sinh vien   ");
            name[i]=In4.nextLine();
            System.out.println("Diem ly cua sinh vien ");
            ly[i]=In4.nextDouble();
            System.out.println("Diem toan cua sinh vien");
            toan[i]=In4.nextDouble();
            System.out.println("Diem hoa cua sinh vien ");
            hoa[i]=In4.nextDouble();
            tong = toan[i] + ly[i] + hoa[i];
            dtb = tong/3;
            if(dtb>=8){
                System.out.println("Hs gioi "+ "Stt "+i);
            }
            // ket thuc hoc sinh gioi 
            else if(dtb<8&&dtb>5){
            System.out.println("Hs kha "+"Stt "+i); 
        }//ketthuchsinh kha
            else{
                System.out.println("Hsy "+" stt "+ i);
            }// ket thuc hoc sinh yeu 

            // ket thuc max 
        }
 
                   

        
    }

    private static void n(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
