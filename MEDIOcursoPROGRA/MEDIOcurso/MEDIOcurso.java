package MEDIOcurso;
 
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author EINSAM
 */
public class MEDIOcurso extends javax.swing.JFrame {

    /**
     * Creates new form MEDIOcusro
     */
    public MEDIOcurso() {
        initComponents();
        model=(DefaultTableModel)this.TablaMATERIALES.getModel();
    }
DefaultTableModel model;
//////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMATERIALES = new javax.swing.JTable();
        BotonGUARDAR = new javax.swing.JButton();
        BotonAGREGAR = new javax.swing.JButton();
        BotonABRIR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaMANTENIMIENTO = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("GESTION DE MATERIALES ");

        TablaMATERIALES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "DETALLE", "MODELO", "MARCA", "FABRICACION", "VALOR", "GARANTIA", "DURACION", "OFICINA DESTINO", "RESPONSABLE", "FECHA DE ENTREGA", "HORA DE ENTREGA", "FECHA MANTENIMIENTO", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(TablaMATERIALES);

        BotonGUARDAR.setText("GUARDAR");
        BotonGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGUARDARActionPerformed(evt);
            }
        });

        BotonAGREGAR.setText("AGREGAR");
        BotonAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAGREGARActionPerformed(evt);
            }
        });

        BotonABRIR.setText("ABRIR");
        BotonABRIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonABRIRActionPerformed(evt);
            }
        });

        jLabel8.setText("NECESITAN MANTENIMIENTO");

        TablaMANTENIMIENTO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "DETALLE", "MODELO", "MARCA", "GARANTIA"
            }
        ));
        jScrollPane3.setViewportView(TablaMANTENIMIENTO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonABRIR)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAGREGAR)
                        .addGap(18, 18, 18)
                        .addComponent(BotonGUARDAR))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGUARDAR)
                    .addComponent(BotonAGREGAR)
                    .addComponent(BotonABRIR))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void BotonABRIRActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        String col1,col2,col3,col4,col5,col6,col7,col8,col9,col10,col11,col12,col13,col14;
        String au= "H:\\Documentos\\NetBeansProjects\\MEDIOcusro\\src\\mediocusro\\datos.txt";

        Scanner linea = null;

         File doc_le=new File(au);
        try{
            linea = new Scanner(doc_le);
            while(linea.hasNextLine()){
                col1 = linea.nextLine();
                col2 = linea.nextLine();
                col3= linea.nextLine();
                col4= linea.nextLine();
                col5= linea.nextLine();
                col6= linea.nextLine();
                col7= linea.nextLine();
                col8= linea.nextLine();
                col9= linea.nextLine();
                col10= linea.nextLine();
                col11= linea.nextLine();
                col12= linea.nextLine();
                col13= linea.nextLine();
                col14= linea.nextLine();
                model.addRow(new Object[]{col1,col2,col3,col4,col5,col6,col7,col8,col9,col10,col11,col12,col13,col14});

            }
        }
        catch(Exception x){
            JOptionPane.showMessageDialog(null,"ERROR");
        }

    }                                          

    private void BotonAGREGARActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        model.addRow(new Object[]{"","","","","","","","","","","","","",""});
    }                                            

    private void BotonGUARDARActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        try {
            FileWriter guardar= new FileWriter("H:\\Documentos\\NetBeansProjects\\MEDIOcusro\\src\\mediocusro\\datos.txt") ;
            for (int i=0;i<this.TablaMATERIALES.getRowCount();i++){
                guardar.write(model.getValueAt(i, 0).toString()+"\n");
                guardar.write(model.getValueAt(i, 1).toString()+"\n");
                guardar.write(model.getValueAt(i, 2).toString()+"\n");
                guardar.write(model.getValueAt(i, 3).toString()+"\n");
                guardar.write(model.getValueAt(i, 4).toString()+"\n");
                guardar.write(model.getValueAt(i, 5).toString()+"\n");
                guardar.write(model.getValueAt(i, 6).toString()+"\n");
                guardar.write(model.getValueAt(i, 7).toString()+"\n");
                guardar.write(model.getValueAt(i, 8).toString()+"\n");
                guardar.write(model.getValueAt(i, 9).toString()+"\n");
                guardar.write(model.getValueAt(i, 10).toString()+"\n");
                guardar.write(model.getValueAt(i, 11).toString()+"\n");
                guardar.write(model.getValueAt(i, 12).toString()+"\n");
                guardar.write(model.getValueAt(i, 13).toString()+"\n");
                
            }
            guardar.close();
            JOptionPane.showMessageDialog(null,"DATOS GUARDADOS");
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"ERROR");
        }

    }                                            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(MEDIOcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MEDIOcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MEDIOcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MEDIOcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MEDIOcurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonABRIR;
    private javax.swing.JButton BotonAGREGAR;
    private javax.swing.JButton BotonGUARDAR;
    private javax.swing.JTable TablaMANTENIMIENTO;
    private javax.swing.JTable TablaMATERIALES;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration                   
}
