/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab_1_fifo_so;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Luis Diaz, Cristian Burgos y Daniel Ballestas
 */
public class main_class {
    public static void main(String[] args) {

        // Configurar el Look and Feel a Nimbus, si está disponible (componentes visuales para que se vea agradable el programa)

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(logical_class.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(logical_class.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(logical_class.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(logical_class.class.getName()).log(Level.SEVERE, (String) null, ex);
        }


        //crea y muestra la GUI del programa
        EventQueue.invokeLater(() -> {
            logical_class frame = new logical_class();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
        });
    }
}
