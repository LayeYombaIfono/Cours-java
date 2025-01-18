/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacompiler;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Ifono
 */
public class MaFenetre {
    JFrame mainFrame = null;
    
    public MaFenetre(){
        
        mainFrame = new JFrame();
        
        
        mainFrame.setTitle("Mon application");
        
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
        
        mainFrame.setSize(320, 240);
    }
    
    public void afficher(){
    
        mainFrame.setVisible(true);
    }
    
}
