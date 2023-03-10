/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Appointment;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER OS
 */
public class TimeSchedule extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form Doctor2
     */
    public TimeSchedule() {
        initComponents();
        connect();
        lb1.addMouseListener(this);
        lb2.addMouseListener(this);
        lb3.addMouseListener(this);
        lb4.addMouseListener(this);
        lb5.addMouseListener(this);
        lb6.addMouseListener(this);
        lb7.addMouseListener(this);
        lb8.addMouseListener(this);
        lb9.addMouseListener(this);
        lb10.addMouseListener(this);
        lb11.addMouseListener(this);
        lb12.addMouseListener(this);
        
    }
    int serialnum=0;
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    ResultSet rs;
     ResultSet rs1;
   public void connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/doctorsassistant","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TimeSchedule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TimeSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void load()
         
 {
     
	
	{
		String input=txtbox.getText();
	
       		try {
            
            		pst=con.prepareStatement("SELECT time,fees from doctorr where name=?");
			pst.setString(1,input);
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		    while(rs.next())
            		{
               			Vector v2=new Vector();
                
                    		v2.add(rs.getString("time"));
                    		
                		d.addRow(v2);
                                fe.setText(rs.getString("fees"));
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(TimeSchedule.class.getName()).log(Level.SEVERE, null, ex);
        	} 
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nm = new javax.swing.JLabel();
        txtbox = new javax.swing.JTextField();
        searchbox = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fe = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        nm1 = new javax.swing.JLabel();
        nam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 100));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sunday", null},
                {"Monday", null},
                {"Tuesday", null},
                {"Wednesday", null},
                {"Thursday", null}
            },
            new String [] {
                "Day", "Available time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        nm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nm.setText("Name :");

        txtbox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtboxActionPerformed(evt);
            }
        });

        searchbox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchbox.setText("Search");
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb1.setText("Serial 1");

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb2.setText("Serial 2");

        lb3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb3.setText("Serial 3");

        lb4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb4.setText("Serial 4");

        lb5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb5.setText("Serial 5");

        lb6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb6.setText("Serial 6");

        lb7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb7.setText("Serial 7");

        lb8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb8.setText("Serial 8");

        lb9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb9.setText("Serial 9");

        lb10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb10.setText("Serial 10");

        lb11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb11.setText("Serial 11");

        lb12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb12.setText("Serial 12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1)
                    .addComponent(lb2)
                    .addComponent(lb3)
                    .addComponent(lb4))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb8)
                    .addComponent(lb7)
                    .addComponent(lb6)
                    .addComponent(lb5))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb12)
                    .addComponent(lb9)
                    .addComponent(lb10)
                    .addComponent(lb11))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb1)
                            .addComponent(lb9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lb5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb10)
                            .addComponent(lb6)
                            .addComponent(lb2))))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb11)
                    .addComponent(lb7)
                    .addComponent(lb3))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb12)
                    .addComponent(lb8)
                    .addComponent(lb4))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Fees:");

        fe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Choose your date");

        txtdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        nm1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nm1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nm1.setText("Patient Name :");

        nam.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbox))
                            .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(216, 216, 216)
                .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nm1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm)
                    .addComponent(txtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbox))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nm1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
        load();
    }//GEN-LAST:event_searchboxActionPerformed

    private void txtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int serial1= serialnum;
         SimpleDateFormat Date_Format= new SimpleDateFormat("yyyy-MM-dd");
        String Date= Date_Format.format(txtdate.getDate());
        String Patient=nam.getText();
       
        
        try {
            pst1=con.prepareStatement("select * from appointment where date=? and serial_num=?");
            pst1.setString(1, Date);
            pst1.setInt(2, serial1);
             rs1=pst1.executeQuery();
             if(rs1.next()==true)
             {
                 JOptionPane.showMessageDialog(this, "This serial is already booked");
           
             }
             else{
                pst1=con.prepareStatement("insert into appointment(patient_name,date,serial_num)values(?,?,?)");
                pst1.setString(1,Patient);
                pst1.setString(2, Date);
                pst1.setInt(3,serial1 );
                int k=pst1.executeUpdate();
                if(k==1)
                {
                    JOptionPane.showMessageDialog(this, " serial booked");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Something wrong");
                }
             
             }
             
             
             
             
             
             
             
             
                    } catch (SQLException ex) {
            Logger.getLogger(TimeSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TimeSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JTextField nam;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel nm1;
    private javax.swing.JButton searchbox;
    private javax.swing.JTextField txtbox;
    private com.toedter.calendar.JDateChooser txtdate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==lb1)
        { 
            serialnum=1;
        }
        else if(e.getSource()==lb2)
        {serialnum=2;}
         else if(e.getSource()==lb3)
        {serialnum=3;}
         else if(e.getSource()==lb4)
        {serialnum=4;}
         else if(e.getSource()==lb5)
        {serialnum=5;}
         else if(e.getSource()==lb6)
        {serialnum=6;}
         else if(e.getSource()==lb7)
        {serialnum=7;}
         else if(e.getSource()==lb8)
        {serialnum=8;}
         else if(e.getSource()==lb9)
        {serialnum=9;}
         else if(e.getSource()==lb10)
        {serialnum=10;}
         else if(e.getSource()==lb11)
        {serialnum=11;}
         else if(e.getSource()==lb12)
        {serialnum=12;}
        JOptionPane.showMessageDialog(this, serialnum);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
