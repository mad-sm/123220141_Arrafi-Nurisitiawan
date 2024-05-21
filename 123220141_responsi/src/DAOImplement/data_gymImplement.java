/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;


import java.util.List;
import gym.*;
/**
 *
 * @author Lab Informatika
 */
public interface data_gymImplement {
    public void create(data_gym m);
    public void update(data_gym m);
    public void delete(data_gym m);
    public void create(data_gym m);
    public List<data_gym> getAll();
}
