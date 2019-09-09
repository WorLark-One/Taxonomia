/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxonomia;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 */
public class InterfazGUI extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGUI
     */
    
    private Controlador controlador;
    
    public InterfazGUI() {
        this.controlador=new Controlador();
        initComponents();       
        this.repaint();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        especie = new javax.swing.JTextField();
        familia = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        phylum = new javax.swing.JTextField();
        orden = new javax.swing.JTextField();
        reino = new javax.swing.JTextField();
        dominio = new javax.swing.JTextField();
        clase = new javax.swing.JTextField();
        añadirImagen = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        agregarEspecie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        InformeUno = new javax.swing.JButton();
        InformeUnoText = new javax.swing.JTextField();
        InformeTresText = new javax.swing.JTextField();
        informeTres = new javax.swing.JButton();
        informeDos = new javax.swing.JButton();
        InformeDosText = new javax.swing.JTextField();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taxonomía");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(1120, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label1.setName("Especie"); // NOI18N
        label1.setText("Especie");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label2.setName("Genero"); // NOI18N
        label2.setText("Género");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label3.setName("Orden"); // NOI18N
        label3.setText("Orden");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label4.setName("Familia"); // NOI18N
        label4.setText("Familia");

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label5.setName("Clase"); // NOI18N
        label5.setText("Clase");

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(255, 255, 255));
        label6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label6.setName("Phylum"); // NOI18N
        label6.setText("Phylum");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(255, 255, 255));
        label7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label7.setName("Reino"); // NOI18N
        label7.setText("Reino");

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(255, 255, 255));
        label8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label8.setName("Imagen"); // NOI18N
        label8.setText("Imagen");

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(255, 255, 255));
        label9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label9.setName("Dominio"); // NOI18N
        label9.setText("Dominio");

        especie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        especie.setName(""); // NOI18N
        especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieActionPerformed(evt);
            }
        });

        familia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiaActionPerformed(evt);
            }
        });

        genero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });

        phylum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phylum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phylumActionPerformed(evt);
            }
        });

        orden.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });

        reino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinoActionPerformed(evt);
            }
        });

        dominio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dominioActionPerformed(evt);
            }
        });

        clase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claseActionPerformed(evt);
            }
        });

        añadirImagen.setText("Añadir imagen");
        añadirImagen.setName("añadirImagen"); // NOI18N
        añadirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(especie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phylum, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dominio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(añadirImagen))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especie, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phylum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reino, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dominio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clase, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añadirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        agregarEspecie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        agregarEspecie.setText("Agregar Especie");
        agregarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEspecieActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 410));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarEspecie)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(agregarEspecie)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(new java.awt.Color(255, 255, 255));
        label10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label10.setName("Especie"); // NOI18N
        label10.setText("Agregar especie");

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(new java.awt.Color(255, 255, 255));
        label11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label11.setName("Especie"); // NOI18N
        label11.setText("Generar informe");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        InformeUno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InformeUno.setText("Informe Uno");
        InformeUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeUnoActionPerformed(evt);
            }
        });

        InformeUnoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        InformeTresText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        InformeTresText.setName("InformeTresText"); // NOI18N
        InformeTresText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeTresTextActionPerformed(evt);
            }
        });

        informeTres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        informeTres.setText("Informe Tres");
        informeTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeTresActionPerformed(evt);
            }
        });

        informeDos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        informeDos.setText("Informe Dos");
        informeDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeDosActionPerformed(evt);
            }
        });

        InformeDosText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        InformeDosText.setName("InformeDosText"); // NOI18N

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label12.setText("Ingresar Especie");

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label13.setName(""); // NOI18N
        label13.setText("Ingresar Familia");

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label14.setName(""); // NOI18N
        label14.setText("Ingresar Reino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(InformeUnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(InformeUno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(InformeDosText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InformeTresText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(informeDos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(informeTres, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InformeDosText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InformeUnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InformeTresText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(informeTres)
                    .addComponent(informeDos)
                    .addComponent(InformeUno))
                .addGap(25, 25, 25))
        );

        label14.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especieActionPerformed

    private void familiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familiaActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void phylumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phylumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phylumActionPerformed

    private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenActionPerformed

    private void reinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinoActionPerformed

    private void dominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dominioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dominioActionPerformed

    private void claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claseActionPerformed

    private void añadirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirImagenActionPerformed
        this.file.removeAll();                              
        try{
         file = new JFileChooser();
         file.showOpenDialog(this);
         abre=file.getSelectedFile();
         if(abre!=null){     
            FileReader archivos=new FileReader(abre);
            String tipo = file.getTypeDescription(abre);
            if(!(("Archivo JPG").equals(tipo) || ("Archivo PNG").equals(tipo))){
                JOptionPane.showMessageDialog(null, "El tipo del archivo no era una imagen", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            this.jPanel2.remove(jLabel1);
            ImageIcon i = new ImageIcon(abre.getAbsolutePath()); 
            Image img = i.getImage();
            img = img.getScaledInstance(560, 233, java.awt.Image.SCALE_SMOOTH);
            i = new ImageIcon(img);
            this.jLabel1.setIcon(i);
            this.jPanel2.add(this.jLabel1);
            this.pack();
            this.repaint();
            //Adaptador a = new Adaptador();
            //a.generarInforme2();
          }    
         }
         catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" + "\nNo se ha encontrado el archivo", "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
           return;
          }
        
        JOptionPane.showMessageDialog(null, "La imagen fue guardada con exito");
                   
        
    }//GEN-LAST:event_añadirImagenActionPerformed

    private void InformeUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeUnoActionPerformed
        // TODO add your handling code here:
        String a = InformeUnoText.getText();
        if (a.equals("") || a == null) {
            JOptionPane.showMessageDialog(null, "Le falta rellenar la especie", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            this.controlador.generarInforme(1, a);
        }
        
        InformeUnoText.setText("");
    }//GEN-LAST:event_InformeUnoActionPerformed

    private void informeDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeDosActionPerformed
        // TODO add your handling code here:
        String a = this.InformeDosText.getText();
        if (a.equals("") || a == null) {
            JOptionPane.showMessageDialog(null, "Le falta rellenar el texto", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            this.controlador.generarInforme(2, a);
        }
        
        this.InformeDosText.setText("");
    }//GEN-LAST:event_informeDosActionPerformed

    private void informeTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeTresActionPerformed
        // TODO add your handling code here:
        String a = this.InformeTresText.getText();
        if (a.equals("") || a == null) {
            JOptionPane.showMessageDialog(null, "Le falta rellenar el texto", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            this.controlador.generarInforme(3, a);
        }

        this.InformeTresText.setText("");
    }//GEN-LAST:event_informeTresActionPerformed

    private void InformeTresTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeTresTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformeTresTextActionPerformed

    private void agregarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEspecieActionPerformed
        // TODO add your handling code here:
        //this.imagen() falta este ctm
        String[] lista = new String[8];
        lista[0]=this.dominio.getText();
        lista[1]=this.reino.getText();
        lista[2]=this.phylum.getText();
        lista[3]=this.clase.getText();
        lista[4]=this.orden.getText();
        lista[5]=this.familia.getText();
        lista[6]=this.genero.getText();
        lista[7]=this.especie.getText();
        for(int i=0; i<lista.length; i++){
            switch (lista[i]) {
                case "":
                JOptionPane.showMessageDialog(null, "Le falta rellenar un dato", "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
                return;

                default:
                break;
            }
        }
        this.controlador.crearEspecie(lista, this.abre);
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        this.dominio.setText("");
        this.reino.setText("");
        this.phylum.setText("");
        this.clase.setText("");
        this.orden.setText("");
        this.familia.setText("");
        this.genero.setText("");
        this.especie.setText("");
        this.file.removeAll();
    }//GEN-LAST:event_agregarEspecieActionPerformed

    /**
     * @param args the command line arguments
     */

    private JFileChooser file=new JFileChooser();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InformeDosText;
    private javax.swing.JTextField InformeTresText;
    private javax.swing.JButton InformeUno;
    private javax.swing.JTextField InformeUnoText;
    private javax.swing.JButton agregarEspecie;
    private javax.swing.JButton añadirImagen;
    private javax.swing.JTextField clase;
    private javax.swing.JTextField dominio;
    private javax.swing.JTextField especie;
    private javax.swing.JTextField familia;
    private javax.swing.JTextField genero;
    private javax.swing.JButton informeDos;
    private javax.swing.JButton informeTres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField orden;
    private javax.swing.JTextField phylum;
    private javax.swing.JTextField reino;
    // End of variables declaration//GEN-END:variables
    private File abre;
    public void generarInforme() {
        // TODO implement here
    }

    /**
     * 
     */
    public void crearEspecie() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Operation1() {
        // TODO implement here
    }


}
