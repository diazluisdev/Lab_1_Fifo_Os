/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_1_fifo_so;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class logical_class extends JFrame {

    Timer Reloj;

    int segundos;

    int delay = 1000;

    int tiempo1 = 6;

    int tiempo2 = 5;

    int tiempo3 = 5;

    int tiempo4 = 5;

    private JButton btnDetener;

    private JButton btnInicio;

    private JMenu jMenu1;

    private JMenuBar jMenuBar1;

    private JScrollPane jScrollPane1;

    private JTable jTable1;

    private JMenuItem mnAcercade;

    private JMenu mnAyuda;

    private JMenuItem mnDetener;

    private JMenuItem mnIniciar;

    private JMenu mnOpciones;

    private JMenuItem mnSalir;

    private JMenuItem mnTemas;

    public logical_class() {
        initComponents();
        int[] anchos = {30, 95, 50, 55, 62, 60, 65};
        for (int i = 0; i < this.jTable1.getColumnCount(); i++) {
            this.jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private void initComponents() {
        this.btnInicio = new JButton();
        this.btnDetener = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.mnIniciar = new JMenuItem();
        this.mnDetener = new JMenuItem();
        this.mnSalir = new JMenuItem();
        this.mnOpciones = new JMenu();
        this.mnAyuda = new JMenu();
        this.mnTemas = new JMenuItem();
        this.mnAcercade = new JMenuItem();
        setDefaultCloseOperation(3);
        setTitle("Lab 1 Procesos FIFO");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                logical_class.this.formWindowClosing(evt);
            }
        });
        this.btnInicio.setText("Iniciar");
        this.btnInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logical_class.this.btnInicioActionPerformed(evt);
            }
        });
        this.btnDetener.setText("Detener");
        this.btnDetener.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logical_class.this.btnDetenerActionPerformed(evt);
            }
        });
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null}, {null, null, null, null, null, null, null},}, (Object[]) new String[]{"Id", "Nombre", "CPU", "Memoria", "Quamtum", "Prioridad", "Estado"}));
        this.jTable1.setRowSelectionAllowed(false);
        this.jScrollPane1.setViewportView(this.jTable1);
        this.jMenu1.setText("Archivo");
        this.mnIniciar.setText("Iniciar");
        this.mnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logical_class.this.mnIniciarActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.mnIniciar);
        this.mnDetener.setText("Detener");
        this.mnDetener.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logical_class.this.mnDetenerActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.mnDetener);
        this.mnSalir.setText("Salir");
        this.mnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logical_class.this.mnSalirActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.mnSalir);
        this.jMenuBar1.add(this.jMenu1);
        this.mnOpciones.setText("Opciones");
        this.jMenuBar1.add(this.mnOpciones);
        this.mnAyuda.setText("Ayuda");
        this.mnTemas.setText("Temas de ayuda");
        this.mnAyuda.add(this.mnTemas);
        this.mnAcercade.setText("Acerca de Simulador");
        this.mnAcercade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logical_class.this.mnAcercadeActionPerformed(evt);
            }
        });
        this.mnAyuda.add(this.mnAcercade);
        this.jMenuBar1.add(this.mnAyuda);
        setJMenuBar(this.jMenuBar1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(this.jScrollPane1, -1, 421, 32767)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, 32767)
                                        .addComponent(this.btnInicio, -2, 71, -2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(this.btnDetener)))
                        .addContainerGap()));
        layout.setVerticalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.jScrollPane1, -2, 380, -2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(this.btnInicio)
                                .addComponent(this.btnDetener))
                        .addContainerGap(-1, 32767)));
        this.btnInicio.getAccessibleContext().setAccessibleName("jButton1");
        getAccessibleContext().setAccessibleName("Lab 1 Procesos FIFO");
        pack();
    }

    private void btnInicioActionPerformed(ActionEvent evt) {
        PrimerProceso(evt);
        this.btnInicio.setEnabled(false);
    }

    private void btnDetenerActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Se han detenido los procesos!!!", "Lab 1 Procesos FIFO", 1);
        this.jTable1.setValueAt("", 0, 0);
        this.jTable1.setValueAt("", 0, 1);
        this.jTable1.setValueAt("", 0, 2);
        this.jTable1.setValueAt("", 0, 3);
        this.jTable1.setValueAt("", 0, 4);
        this.jTable1.setValueAt("", 0, 5);
        this.jTable1.setValueAt("", 0, 6);
        this.jTable1.setValueAt("", 1, 0);
        this.jTable1.setValueAt("", 1, 1);
        this.jTable1.setValueAt("", 1, 2);
        this.jTable1.setValueAt("", 1, 3);
        this.jTable1.setValueAt("", 1, 4);
        this.jTable1.setValueAt("", 1, 5);
        this.jTable1.setValueAt("", 1, 6);
        this.jTable1.setValueAt("", 2, 0);
        this.jTable1.setValueAt("", 2, 1);
        this.jTable1.setValueAt("", 2, 2);
        this.jTable1.setValueAt("", 2, 3);
        this.jTable1.setValueAt("", 2, 4);
        this.jTable1.setValueAt("", 2, 5);
        this.jTable1.setValueAt("", 2, 6);
        this.jTable1.setValueAt("", 3, 0);
        this.jTable1.setValueAt("", 3, 1);
        this.jTable1.setValueAt("", 3, 2);
        this.jTable1.setValueAt("", 3, 3);
        this.jTable1.setValueAt("", 3, 4);
        this.jTable1.setValueAt("", 3, 5);
        this.jTable1.setValueAt("", 3, 6);
        this.Reloj.stop();
        this.btnInicio.setEnabled(true);
    }

    private void mnSalirActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void mnIniciarActionPerformed(ActionEvent evt) {
        PrimerProceso(evt);
    }

    private void mnDetenerActionPerformed(ActionEvent evt) {
        btnDetenerActionPerformed(evt);
    }

    private void formWindowClosing(WindowEvent evt) {
        System.exit(0);
    }

    private void mnAcercadeActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Sistemas Operativos Lab 1 \nDaniel Ballestas V.\nLuis Felipe D.\nChristian Puello B. \nUniversidad de Cartagena 2024", "Lab 1 Procesos FIFO", 1);
    }

    private void PrimerProceso(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Se han iniciado los procesos!!!", "Lab 1 Procesos FIFO", 1);
        this.jTable1.setValueAt("1", 0, 0);
        this.jTable1.setValueAt("2", 1, 0);
        this.jTable1.setValueAt("3", 2, 0);
        this.jTable1.setValueAt("4", 3, 0);
        this.jTable1.setValueAt("Firefox", 0, 1);
        this.jTable1.setValueAt("Visual Studio", 1, 1);
        this.jTable1.setValueAt("Discord", 2, 1);
        this.jTable1.setValueAt("Mysql", 3, 1);
        this.jTable1.setValueAt("0 %", 0, 2);
        this.jTable1.setValueAt("0 %", 1, 2);
        this.jTable1.setValueAt("0 %", 2, 2);
        this.jTable1.setValueAt("0 %", 3, 2);
        this.jTable1.setValueAt("0 MB", 0, 3);
        this.jTable1.setValueAt("0 MB", 1, 3);
        this.jTable1.setValueAt("0 MB", 2, 3);
        this.jTable1.setValueAt("0 MB", 3, 3);
        this.jTable1.setValueAt(this.tiempo1 + " seg", 0, 4);
        this.jTable1.setValueAt(this.tiempo2 + " seg", 1, 4);
        this.jTable1.setValueAt(this.tiempo3 + " seg", 2, 4);
        this.jTable1.setValueAt(this.tiempo4 + " seg", 3, 4);
        this.jTable1.setValueAt("4", 0, 5);
        this.jTable1.setValueAt("4", 1, 5);
        this.jTable1.setValueAt("4", 2, 5);
        this.jTable1.setValueAt("4", 3, 5);
        this.jTable1.setValueAt("Listo", 0, 6);
        this.jTable1.setValueAt("Listo", 1, 6);
        this.jTable1.setValueAt("Listo", 2, 6);
        this.jTable1.setValueAt("Listo", 3, 6);
        this.segundos = this.tiempo1;
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int i;
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 20.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " %", 0, 2);
                }
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 5.0D + 10.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " MB", 0, 3);
                }
                logical_class.this.jTable1.setValueAt("Iniciado", 0, 6);
                logical_class.this.jTable1.setValueAt(String.valueOf(logical_class.this.segundos) + " seg", 0, 4);
                if (logical_class.this.segundos <= 0) {
                    logical_class.this.jTable1.setValueAt("Finalizado", 0, 6);
                    Toolkit.getDefaultToolkit().beep();
                    logical_class.this.jTable1.setValueAt("0 %", 0, 2);
                    logical_class.this.jTable1.setValueAt("0 MB", 0, 3);
                    logical_class.this.Reloj.stop();
                    logical_class.this.SegundoProceso(evt);
                }
                logical_class.this.segundos--;
            }
        };
        this.Reloj = new Timer(this.delay, taskPerformer);
        this.Reloj.start();
    }

    private void SegundoProceso(ActionEvent evt) {
        this.segundos = this.tiempo2;
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int i;
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 20.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " %", 1, 2);
                }
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 5.0D + 10.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " MB", 1, 3);
                }
                logical_class.this.jTable1.setValueAt("Iniciado", 1, 6);
                logical_class.this.jTable1.setValueAt(String.valueOf(logical_class.this.segundos) + " seg", 1, 4);
                if (logical_class.this.segundos <= 0) {
                    logical_class.this.jTable1.setValueAt("Finalizado", 1, 6);
                    Toolkit.getDefaultToolkit().beep();
                    logical_class.this.jTable1.setValueAt("0 %", 1, 2);
                    logical_class.this.jTable1.setValueAt("0 MB", 1, 3);
                    logical_class.this.Reloj.stop();
                    logical_class.this.TercerProceso(evt);
                }
                logical_class.this.segundos--;
            }
        };
        this.Reloj = new Timer(this.delay, taskPerformer);
        this.Reloj.start();
    }

    private void TercerProceso(ActionEvent evt) {
        this.segundos = this.tiempo3;
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int i;
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 20.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " %", 2, 2);
                }
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 5.0D + 5.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " MB", 2, 3);
                }
                logical_class.this.jTable1.setValueAt("Iniciado", 2, 6);
                logical_class.this.jTable1.setValueAt(String.valueOf(logical_class.this.segundos) + " seg", 2, 4);
                if (logical_class.this.segundos <= 0) {
                    logical_class.this.jTable1.setValueAt("Finalizado", 2, 6);
                    Toolkit.getDefaultToolkit().beep();
                    logical_class.this.jTable1.setValueAt("0 %", 2, 2);
                    logical_class.this.jTable1.setValueAt("0 MB", 2, 3);
                    logical_class.this.Reloj.stop();
                    logical_class.this.CuartoProceso(evt);
                }
                logical_class.this.segundos--;
            }
        };
        this.Reloj = new Timer(this.delay, taskPerformer);
        this.Reloj.start();
    }

    private void CuartoProceso(ActionEvent evt) {
        this.segundos = this.tiempo4;
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int i;
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 15.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " %", 3, 2);
                }
                for (i = 0; i < 1000; i++) {
                    int numAleatorio = (int) Math.floor(Math.random() * 10.0D + 5.0D);
                    logical_class.this.jTable1.setValueAt(numAleatorio + " MB", 3, 3);
                }
                logical_class.this.jTable1.setValueAt("Iniciado", 3, 6);
                logical_class.this.jTable1.setValueAt(String.valueOf(logical_class.this.segundos) + " seg", 3, 4);
                if (logical_class.this.segundos <= 0) {
                    logical_class.this.jTable1.setValueAt("Finalizado", 3, 6);
                    Toolkit.getDefaultToolkit().beep();
                    logical_class.this.jTable1.setValueAt("0 %", 3, 2);
                    logical_class.this.jTable1.setValueAt("0 MB", 3, 3);
                    logical_class.this.btnInicio.setEnabled(true);
                    logical_class.this.Reloj.stop();
                }
                logical_class.this.segundos--;
            }
        };
        this.Reloj = new Timer(this.delay, taskPerformer);
        this.Reloj.start();
    }

}
