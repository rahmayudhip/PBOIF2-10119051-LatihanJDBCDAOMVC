/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahmayudhip.latihanmvcjdbc.service;

import java.util.List;
import rahmayudhip.latihanmvcjdbc.entity.Pelanggan;
import rahmayudhip.latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author LENOVO
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
            
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectALLPelanggan() throws PelangganException;
    
}
