/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author pmissechanab
 */
@Stateless
@LocalBean
@Remote(Converter.class)
public class ConverterBean implements ConverterInterface {
    public double euroToOtherCurrency(double amount, String currencyCode){
        if("yen".compareTo(currencyCode)==0){
            return amount * 0.0077;
        }
        return amount;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
