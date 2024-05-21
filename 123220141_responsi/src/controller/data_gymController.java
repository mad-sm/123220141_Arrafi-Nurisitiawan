/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdata_gym.data_gymDAO;
import DAOImplement.data_gymImplement;
import gym.*;
import main.main; 

/**
 *
 * @author HP
 */
public class data_gymController {
    main frame;
    data_gymImplement impldatagym;
    List<data_gym> dm;
    
    public data_gymController(main frame){
        this.frame = frame;
        impldatagym = new data_gymDAO();
        dm = impldatagym.getAll();
    }
    public void isitabel(){
        dm = impldatagym.getAll();
        tabeldata_gym mv = new tabeldata_gym(dm);
        frame.getData_gymtable().setModel(mv);
    }
    public void create(){
        data_gym dm = new data_gym();
        dm.setJudul(frame.getJtxtjudul().getText());
        dm.setAlur(Double.parseDouble(frame.getJtxtalur().getText()));
        dm.setPenokohan(Double.parseDouble(frame.getJtxtpenokohan().getText()));
        dm.setAkting(Double.parseDouble(frame.getJtxtakting().getText()));
        impldatagym.create(dm);
    }
    
    public void update(){
        data_gym dm = new data_gym();
        dm.setAlur(Double.parseDouble(frame.getJtxtalur().getText()));
        dm.setPenokohan(Double.parseDouble(frame.getJtxtpenokohan().getText()));
        dm.setAkting(Double.parseDouble(frame.getJtxtakting().getText()));
        dm.setJudul(frame.getJtxtjudul().getText());
        impldatagym.update(dm);
    }
    public void delete(){
        data_gym dm = new data_gym();
        dm.setJudul(frame.getJtxtjudul().getText());
        impldatagym.delete(dm);
    }
        
}
