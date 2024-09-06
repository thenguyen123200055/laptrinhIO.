/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02;

import Bai01.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author MSI_PC
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ArrayList<SanPham> ds = null;
        
        try (FileInputStream fis = new FileInputStream("sanpham.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
             
            ds = (ArrayList<SanPham>) ois.readObject();
            
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }
        
        // Kiểm tra nếu ds không phải là null trước khi lặp qua nó
        if (ds != null) {
            for (SanPham x : ds) {
                System.out.println(x);
            }
        } else {
            System.out.println("Danh sach san pham rong hoac khong ton tai file.");
        }
    }
        
    }
