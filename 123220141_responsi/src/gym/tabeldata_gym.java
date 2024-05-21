/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class tabeldata_gym extends AbstractTableModel{
    List<data_gym> dm;
    public tabeldata_gym(List<data_gym>dm){
        this.dm = dm;
    }
    
    @Override
    public int getRowCount(){
        return dm.size();
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            
            case 0:
                return "Nama Penyewa";
            
            case 1:
                return "Nama Alat";
            
            case 2:
                return "Nomer Telepon";
           
            case 3:
                return "Waktu Sewa";
            
            case 4:
                return "Biaya Sewa";
           
            default:
                return null;
        }
        
    }
    
    @Override
    public Object getValueAt(int row, int column){
        switch(column){
            
            case 0:
                return dm.get(row).getPenyewa();
                
            case 1:
                return dm.get(row).getAlat();
                
            case 2:    
                return dm.get(row).getNomer_Telepon();
                
            case 3:    
                return dm.get(row).getWaktu_Sewa();
                
            case 4:    
                return dm.get(row).getBiaya_Sewa();
              
            default:
                return null;
        }
    }
}
