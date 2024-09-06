/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author MSI_PC
 */
public class WirteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds=new ArrayList<>();
        
        ds.add(new SanPham("SP01","Duong",27000));
        ds.add(new SanPham("SP02","Nuoc Mam",37000));
        ds.add(new SanPham("SP03","Gao",47000));
        
        
        try{
            FileWriter fw=new FileWriter("SanPham.txt");
            
            for(SanPham x:ds)
            {
                
                fw.write(x.getMaso()+";"+x.getTen()+";"+x.getGia()+";"+"\n");
        }
            fw.close();
            System.out.println("da ghi xong");
        }catch(Exception ex){
            System.out.println(ex.toString());
            System.out.println("Thao tac ghi that bai");
        }
    }
    
    
    
}
