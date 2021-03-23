/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Estudiante;
import Modelo.GenerarArchivo;
import Modelo.LeerArchivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamela
 */
public class ViistaEstudiantes extends javax.swing.JFrame {
    
    DefaultTableModel tablaEstudiantes;
    JFileChooser archivoCSV = new JFileChooser(System.getProperty("user.dir")); 
    private void cargar (){
        try{
            String texto = " "; 
            Object cabeceras[] = {"Matricula", "Nombre", "Calificacion"};
            tablaEstudiantes = new DefaultTableModel (cabeceras,0); 
            archivoCSV.showOpenDialog(this); 
            File abrir = archivoCSV.getSelectedFile();
            
            Object elemento[] = new Object[3];
            
            if(abrir!=null){
                FileReader fichero = new FileReader(abrir);
                BufferedReader leer = new BufferedReader(fichero);
                
                while ((texto = leer.readLine())!=null){
                    String registro[] = texto.split(","); 
                    
                    elemento[0]= registro[0];
                    elemento[1]= registro[1];
                    elemento[2]= registro[2];
                    tablaEstudiantes.addRow(elemento);
                }
                
                jTable1.setModel(tablaEstudiantes); 
            }
        }catch (IOException e){
            
            System.out.println("error: " + e);
            
        }
        
    }

    /**
     * Creates new form ViistaEstudiantes
     */
    public ViistaEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPaneEstudiantes = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonGenerarPDF = new javax.swing.JButton();
        jButtonGenerarCSV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCargarArchivo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("X");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Matricula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Calificacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, -1, -1));

        jScrollPaneEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneEstudiantes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneEstudiantes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(tablaEstudiantes);
        jScrollPaneEstudiantes.setViewportView(jTable1);

        getContentPane().add(jScrollPaneEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1010, 410));

        jButtonGenerarPDF.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButtonGenerarPDF.setText("PDF");
        jButtonGenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerarPDFMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, -1, -1));

        jButtonGenerarCSV.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButtonGenerarCSV.setText("CSV");
        jButtonGenerarCSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerarCSVMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonGenerarCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Generar: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAlumnos.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 592));

        jMenu1.setText("Cargar archivo CSV");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemCargarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemCargarArchivo.setText("Cargar archivo");
        jMenuItemCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCargarArchivo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jMenuItemCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarArchivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemCargarArchivoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        LeerArchivo leerArchivo = new LeerArchivo();
        try {  
            List<Estudiante> listaEstudiantes = leerArchivo.leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(ViistaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButtonGenerarCSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarCSVMouseClicked
        // TODO add your handling code here:
        File file = new File ("Calificaciones.csv");
            file.delete();
            GenerarArchivo archivo = new GenerarArchivo();
        List<Estudiante> listaEstudiantes = null;
        try {
            archivo.generarArchivo(listaEstudiantes);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViistaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ViistaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGenerarCSVMouseClicked

    private void jButtonGenerarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarPDFMouseClicked
        // TODO add your handling code here:
        //Generar archivo PDF
    }//GEN-LAST:event_jButtonGenerarPDFMouseClicked
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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViistaEstudiantes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerarCSV;
    private javax.swing.JButton jButtonGenerarPDF;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCargarArchivo;
    private javax.swing.JScrollPane jScrollPaneEstudiantes;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
