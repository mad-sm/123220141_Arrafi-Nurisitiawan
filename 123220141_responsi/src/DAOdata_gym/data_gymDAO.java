/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdata_gym;
import java.sql.*;
import java.util.*;
import connector.koneksi;
import gym.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOImplement.data_gymImplement;
/**
 *
 * @author Lab Informatika
 */
public class data_gymDAO implements data_gymImplement{
    Connection connection;
    
    final String select = "SELECT * FROM gym";
    final String insert = "INSERT INTO gym (judul, alur, penokohan, akting, nilai) VALUES (?, ?, ?, ?, ?);";
    final String update = "UPDATE gym SET alur= ?, penokohan=?, akting=?, nilai=? where judul=?";
    final String delete = "DELETE FROM gym WHERE judul=?";
    
    public data_gymDAO(){
        connection = connector.connection();      
    }

    @Override
    public void create(data_gym m) {
        
        PreparedStatement statement = null;
        
        try{
           double nilai = calculateNilai(m.getAlur(), m.getPenokohan(), m.getAkting());
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, m.getPenyewa());
            statement.setDouble(2, m.getAlat());
            statement.setDouble(3, m.getNomer_Telepon());
            statement.setDouble(4, m.getWaktu_Sewa());
            statement.setDouble(5, Biaya_Sewa);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                m.setPenyewa(rs.getString(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public void update(data_gym m) {
        
        PreparedStatement statement = null;
        try{
            double nilai = calculateNilai(m.getAlat(), m.getWaktu_Sewa(), m.getb());
            statement = connection.prepareStatement(update);
            statement.setDouble(1, m.getPenyewa());
            statement.setDouble(2, m.getAlat());
            statement.setDouble(3, m.getWaktu_Sewa());
            statement.setDouble(4, biaya_sewa);
            statement.setString(5, m.getPenyewa();
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(data_gym m) {
        PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(delete);
                statement.setString(1, m.getPenyewa());
                statement.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
    }
    
    private double calculateNilai(Double alur, Double penokohan, Double akting) {
        return (alur + penokohan + akting) / 3.0;
    }

    @Override
    public List<data_gym> getAll() {
        List<data_gym> dm = new ArrayList<>();
        
        try{
            dm = new ArrayList<data_gym>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                data_gym mv = new data_gym();
                mv.setJudul(rs.getString("Judul"));
                mv.setAlur(rs.getDouble("Alur"));
                mv.setPenokohan(rs.getDouble("Penokohan"));
                mv.setAkting(rs.getDouble("Akting"));
                mv.setMilai(rs.getDouble("Nilai"));
                dm.add(mv);
            }
            
            
            
        }catch(SQLException ex){
            Logger.getLogger(data_gymDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dm;
        
        
    }
}
