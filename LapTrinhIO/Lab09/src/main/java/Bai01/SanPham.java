/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bai01;
import java.io.Serializable;

/**
 *
 * @author MSI_PC
 */
public class SanPham implements Serializable {

   private String maso;
   private String ten;
   private float gia;
   
   
   public SanPham(String maso,String ten,float gia){
       this.maso=maso;
       this.ten=ten;
       this.gia=gia;
    }

    public String getMaso() {
        return maso;
    }

    public String getTen() {
        return ten;
    }

    public float getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", gia=" + gia + '}';
    }
   
   
   
   
}
