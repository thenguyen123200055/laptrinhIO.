/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02;

import Bai01.SanPham;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author MSI_PC
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds=new ArrayList<>();
        
        
        ds.add(new SanPham("SP01", "Duong", 27000));
        ds.add(new SanPham("SP02", "Nuoc Mam", 37000));
        ds.add(new SanPham("SP03", "Gao", 47000));
        
        try{
            FileOutputStream fos=new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos=new ObjectOutputStream(fos) ;
            
            oos.writeObject(ds);
            
            oos.close();
                System.out.println("Da ghi xong");
            
               
        }catch(Exception ex){
            System.out.println("Loi:" +ex.toString());
            System.out.println("That bai");
        }
        
    }
    
}
