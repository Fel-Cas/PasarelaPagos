/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagos.session;

import com.pagos.entity.Pago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface PagoManagerLocal {

    List<Pago> getAllPagos();

    void saveDatabase(Pago pago);
    
}
