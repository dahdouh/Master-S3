/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli1;

import javax.swing.JLabel;

/**
 *
 * @author pmissechanab
 */
public class Test1 extends JLabel{
    private String content=new String("pouet");
    private String hidden=new String("truc");
    
    public Test1(){
        this.setText(content);
    }
 
    public void switchText(){
        String temp=content;
        content=hidden;
        hidden=temp;
        this.setText(content);
    }
}
