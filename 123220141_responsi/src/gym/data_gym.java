/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

/**
 *
 * @author Lab Informatika
 */
public class data_gym {
    private String penyewa;
    private String alat;
    private int nomer_telepon;
    private int waktu_sewa;
    private double biaya_sewa;
    
    public String getPenyewa(){
        return penyewa;
    }
    
    public void setPenyewa(String penyewa){
        this.penyewa = penyewa;
    }
    
    public String getAlat(){
        return alat;
    }
    
    public void setAlat(String alat){
        this.alat = alat;
    }
    
    public int getNomer_Telepon(){
        return nomer_telepon;
    }
    
    public void setNomer_Telepon(int nomer_telepon){
        this.nomer_telepon = nomer_telepon;
    }
    
    public int getWaktu_Sewa(){
        return waktu_sewa;
    }
    
    public void setWaktu_Sewa(int waktu_sewa){
        this.waktu_sewa = waktu_sewa;
    }
    
    public double getBiaya_Sewa(){
        return biaya_sewa;
    }
    
    public void setBiaya_Sewa(double biaya_sewa){
        this.biaya_sewa = biaya_sewa;
    }
            
}
