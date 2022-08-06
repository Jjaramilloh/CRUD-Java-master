/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netosolis.com;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
@author netosolis.com
 */
public class Main extends javax.swing.JFrame {
    private UIManager.LookAndFeelInfo apariencias[];
    private CRUD crud;
    private DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        apariencias=UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(apariencias[1].getClassName());
            SwingUtilities.updateComponentTreeUI(this);
            crud = new CRUD();
            tabla.setModel(modelo);
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Genero");
            modelo.addColumn("Año");
            modelo.addColumn("Actor");
            modelo.addColumn("Pais");
            this.cargarPeliculas();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cbGenero1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cbPais1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        txActor = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox();
        cbAnio = new javax.swing.JComboBox();
        cbPais = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txNombre1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbGenero2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cbAnio1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txActor1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbPais2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        cbPeliculas = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbPeliculas1 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jComboBox3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD netosolis.com");
        setResizable(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Buscar por Genero");

        cbGenero1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbGenero1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Terror", "Accion", "Romantica", "Thriller", "Comedia" }));
        cbGenero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPorGenero(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Buscar por Pais");

        cbPais1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbPais1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Mexico", "Estados Unidos", "Peru", "Colombia", "Bolivia", "Ecuador", "Guatemala", "España", "Canada", "Brazil", "Uruguay", "Argentina" }));
        cbPais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPorPais(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPais1, 0, 244, Short.MAX_VALUE)
                    .addComponent(cbGenero1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(204, 204, 204))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbPais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Peliculas", jPanel1);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Genero:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Actor:");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Pais:");

        txNombre.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toUpper(evt);
            }
        });

        txActor.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txActor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toUpper(evt);
            }
        });

        cbGenero.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terror", "Accion", "Romantica", "Thriller", "Comedia" }));

        cbAnio.setEditable(true);
        cbAnio.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1960", "1970", "1980", "1990", "2000", "2010" }));

        cbPais.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mexico", "Estados Unidos", "Peru", "Colombia", "Bolivia", "Ecuador", "Guatemala", "España", "Canada", "Brazil", "Uruguay", "Argentina" }));

        jButton1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jButton1.setText("Registrar Pelicula");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(cbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNombre)
                            .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAnio, 0, 335, Short.MAX_VALUE)
                            .addComponent(txActor))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insertar Pelicula", jPanel2);

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Nombre:");

        txNombre1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Genero:");

        cbGenero2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbGenero2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terror", "Accion", "Romantica", "Thriller", "Comedia" }));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Año:");

        cbAnio1.setEditable(true);
        cbAnio1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbAnio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1960", "1970", "1980", "1990", "2000", "2010" }));

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Actor:");

        txActor1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Pais:");

        cbPais2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbPais2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mexico", "Estados Unidos", "Peru", "Colombia", "Bolivia", "Ecuador", "Guatemala", "España", "Canada", "Brazil", "Uruguay", "Argentina" }));

        jButton2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jButton2.setText("Actualizar Pelicula");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPelicula(evt);
            }
        });

        cbPeliculas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        cbPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarDatosPelicula(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Seleccion la Pelicula:");

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Id:");

        txId.setEditable(false);
        txId.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(45, 45, 45)
                        .addComponent(cbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txId, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAnio1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPais2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txActor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(txNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGenero2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbGenero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(cbAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txActor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbPais2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Modificar Pelicula", jPanel3);

        cbPeliculas1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Seleccion la Pelicula:");

        jButton3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jButton3.setText("Eliminar Pelicula");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPelicula(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(45, 45, 45)
                .addComponent(cbPeliculas1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPeliculas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(64, 64, 64)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Pelicula", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Convierte a mayusculas el contenido de los JTEXTFIELD
    private void toUpper(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toUpper
        JTextField ob =(JTextField) evt.getSource();
        ob.setText(ob.getText().toUpperCase());
    }//GEN-LAST:event_toUpper
    
    //Funcion para registrar una nueva pelicula
    private void Registrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar
        //Sacamos los valores de los jtextfield y los jcombos
        String nombre = txNombre.getText();
        String actor = txActor.getText();
        //Si algun jtextfield no esta lleno mandamos un error
        if(nombre.trim().length()==0 || actor.trim().length()==0){
            JOptionPane.showMessageDialog(this, "Falta LLenar Algunos Datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(cbAnio.getSelectedItem().toString());
        String genero = cbGenero.getSelectedItem().toString();
        String pais = cbPais.getSelectedItem().toString();
        
        if(crud.insert(nombre, genero, anio, actor, pais)){
            JOptionPane.showMessageDialog(this, "Pelicula registrada con exito.", "Extio", JOptionPane.INFORMATION_MESSAGE);
            txActor.setText("");
            txNombre.setText("");
            cbPeliculas.removeAllItems();
            cbPeliculas1.removeAllItems();
            cargarPeliculas();
        }else{
            JOptionPane.showMessageDialog(this, "Error al registrar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_Registrar

    //Funcion que sirve para buscar peliculas por genero
    private void BuscarPorGenero(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPorGenero
        if(cbGenero1.getSelectedIndex()==0){
            cargarPeliculas();
            return;
        }
        limpiarTabla();
        try{
            ResultSet rs = crud.selectXgenero(cbGenero1.getSelectedItem().toString());
            while(rs.next()){
                Object row [] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    row[i] = rs.getObject(i+1); //El resulset los indices empiezan en 1, mi for lo empieso en 0 por eso le sumo i+1
                }
                //Agregamos cada registro al modelo de la tabla
                modelo.addRow(row);
            }
        }catch(Exception e){
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Error al cargar los datos de la Base de Datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarPorGenero

    //Funcion para buscar peliculas por pais
    private void BuscarPorPais(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPorPais
        if(cbPais1.getSelectedIndex()==0){
            cargarPeliculas();
            return;
        }
        limpiarTabla();
        try{
            ResultSet rs = crud.selectXpais(cbPais1.getSelectedItem().toString());
            while(rs.next()){
                Object row [] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    row[i] = rs.getObject(i+1); //El resulset los indices empiezan en 1, mi for lo empieso en 0 por eso le sumo i+1
                }
                //Agregamos cada registro al modelo de la tabla
                modelo.addRow(row);
            }
        }catch(Exception e){
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Error al cargar los datos de la Base de Datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BuscarPorPais

    //Funcion para actualizar los datos de una pelicula
    private void ActualizarPelicula(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPelicula
        //Sacamos los valores de los jtextfield y los jcombos
        int id;
        try {
            id = Integer.parseInt(txId.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ninguna Pelicula Seleccionada.", "Extio", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String nombre = txNombre1.getText();
        String actor = txActor1.getText();
        //Si algun jtextfield no esta lleno mandamos un error
        if(nombre.trim().length()==0 || actor.trim().length()==0){
            JOptionPane.showMessageDialog(this, "Falta LLenar Algunos Datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anio = Integer.parseInt(cbAnio1.getSelectedItem().toString());
        String genero = cbGenero2.getSelectedItem().toString();
        String pais = cbPais2.getSelectedItem().toString();
        
        if(crud.update(id,nombre, genero, anio, actor, pais)){
            JOptionPane.showMessageDialog(this, "Pelicula registrada con exito.", "Extio", JOptionPane.INFORMATION_MESSAGE);
            txActor.setText("");
            txNombre.setText("");
            cbPeliculas.removeAllItems();
            cbPeliculas1.removeAllItems();
            cargarPeliculas();
        }else{
            JOptionPane.showMessageDialog(this, "Error al registrar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_ActualizarPelicula

    //Funcion para eliminar una pelicula
    private void EliminarPelicula(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPelicula
        Pelicula pel = (Pelicula) cbPeliculas1.getSelectedItem();
        if(pel == null)return;
            if(crud.delete(pel.getId())){
                JOptionPane.showMessageDialog(this, "La pelicula se elimino con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                cbPeliculas.removeAllItems();
                cbPeliculas1.removeAllItems();
                cargarPeliculas();
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la pelicula", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_EliminarPelicula

    //Funcion que carga los datos de la pelicula a actualizar
    private void CargarDatosPelicula(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarDatosPelicula
        Pelicula pel = (Pelicula) cbPeliculas.getSelectedItem();
        if(pel == null)return;
        txId.setText(pel.getId()+"");
        txNombre1.setText(pel.getNombre());
        for (int i = 0; i < cbGenero2.getItemCount(); i++) {
            if(pel.getGenero().equals(cbGenero2.getItemAt(i).toString())){
                cbGenero2.setSelectedIndex(i);
                break;
            }
        }
        cbAnio1.addItem(pel.getAnio());
        cbAnio1.setSelectedIndex(cbAnio1.getItemCount()-1);
        txActor1.setText(pel.actor);
        for (int i = 0; i < cbPais2.getItemCount(); i++) {
            if(pel.getPais().equals(cbPais2.getItemAt(i).toString())){
                cbPais2.setSelectedIndex(i);
                break;
            }
        }
        
    }//GEN-LAST:event_CargarDatosPelicula
    
    //Funcion que carga todas la peliculas en la tabla y en los JCOMboBox
    private void cargarPeliculas(){
        limpiarTabla();
        try{
            ResultSet rs = crud.selectXtodas();
            while(rs.next()){
                Object row [] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    row[i] = rs.getObject(i+1); //El resulset los indices empiezan en 1, mi for lo empieso en 0 por eso le sumo i+1
                }
                //Agregamos cada registro al modelo de la tabla
                modelo.addRow(row);
                cbPeliculas.addItem(new Pelicula(Integer.parseInt(row[0].toString()),row[1].toString(),row[2].toString(),
                        row[4].toString(),row[5].toString(),Integer.parseInt(row[3].toString())));
                cbPeliculas1.addItem(new Pelicula(Integer.parseInt(row[0].toString()),row[1].toString(),row[2].toString(),
                        row[4].toString(),row[5].toString(),Integer.parseInt(row[3].toString())));
            }
        }catch(Exception e){
            e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Error al cargar los datos de la Base de Datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Funcion para limpiar la tabla
    private void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    //Clase con los atributos de la clase pelicula de la Base de datos
    class Pelicula
    {
        private int id,anio;
        private String nombre,genero,actor,pais;
        
 
        public Pelicula(int id, String nombre,String genero,String actor, String pais,int anio)
        {
            this.id = id;
            this.nombre = nombre;
            this.anio = anio;
            this.actor = actor;
            this.pais = pais;
            this.genero = genero;
        }
 
        public int getId()
        {
            return id;
        }
 
        public String getNombre()
        {
            return nombre;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getActor() {
            return actor;
        }

        public void setActor(String actor) {
            this.actor = actor;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }
        
 
        @Override
        public String toString()
        {
            return nombre;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbAnio;
    private javax.swing.JComboBox cbAnio1;
    private javax.swing.JComboBox cbGenero;
    private javax.swing.JComboBox cbGenero1;
    private javax.swing.JComboBox cbGenero2;
    private javax.swing.JComboBox cbPais;
    private javax.swing.JComboBox cbPais1;
    private javax.swing.JComboBox cbPais2;
    private javax.swing.JComboBox cbPeliculas;
    private javax.swing.JComboBox cbPeliculas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txActor;
    private javax.swing.JTextField txActor1;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txNombre1;
    // End of variables declaration//GEN-END:variables
}
