/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahmayudhip.latihanmvcjdbc.main;

import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingUtilities;
import rahmayudhip.latihanmvcjdbc.database.KingBarbershopDatabase;
import rahmayudhip.latihanmvcjdbc.entity.Pelanggan;
import rahmayudhip.latihanmvcjdbc.error.PelangganException;
import rahmayudhip.latihanmvcjdbc.service.PelangganDao;
import rahmayudhip.latihanmvcjdbc.view.MainViewPelanggan;

/**
 *
 * @author LENOVO
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });


       
    }

}  
        
        
    
    

