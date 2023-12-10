/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import gui.MainGoNorth;
import gui.ProgramacionLineal;
import gui.Inventarios;
import javax.swing.JFrame;

/**
 *
 * @author xeon
 */
public class Main {
    
    public JFrame mainGoNorth;
    public JFrame ProgramacionLineal;
    public JFrame MetodoTransporte;
    public JFrame Planeacion;
    public JFrame Inventarios;
    public JFrame LineaEspera;
    
    public Main() {
        mainGoNorth = new MainGoNorth(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);
        
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainGoNorth.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
