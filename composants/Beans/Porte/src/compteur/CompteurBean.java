/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compteur;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author pmissechanab
 */
public class CompteurBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "cmpt";
    
    private Integer cmpt;
    private boolean working;
    
    private PropertyChangeSupport propertySupport;
    
    public CompteurBean() {
        propertySupport = new PropertyChangeSupport(this);
        working=true;
        setCmpt(0);
    }
    
    public Integer getCmpt() {
        return cmpt;
    }
    
    public String toString(){
        return cmpt.toString();
    }
    
    public void setCmpt(int c) {
        if(working){
            Integer oldValue = this.cmpt;
            this.cmpt = c;
            propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.cmpt);
        }
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public void incr(){
        setCmpt(getCmpt()+1);
    }
    public void decr(){
        setCmpt(getCmpt()-1);
    }
    public void raz(){
        setCmpt(0);
    }
    
    public void start(){
        working=true;
    }
    public void stop(){
        working=false;
    }
    public boolean getWorking(){
        return this.working;
    }

}
