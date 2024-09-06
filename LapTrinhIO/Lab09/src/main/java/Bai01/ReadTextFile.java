/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai01;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author MSI_PC
 */
public class ReadTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds=new ArrayList<>();
        
        try{
            FileReader fr=new FileReader("SanPham.txt");
            BufferedReader br=new BufferedReader(fr);
            String Line;
            
            while((Line=br.readLine())!=null)
            {
                String[]arr=Line.split(";");
                
                SanPham sp=new SanPham(arr[0], arr[1],Float.parseFloat(arr[2]));
                
                ds.add(sp);
            }
            
            
        }catch(Exception ex){
            System.out.println("Loi xay ra"+ex.toString());
        }
        
        
        for(SanPham x:ds){
            System.out.println(x);
        }
    }
    
}
