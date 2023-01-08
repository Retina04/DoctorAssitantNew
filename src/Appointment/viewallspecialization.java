/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Appointment;

import AdminDoctorActivity.SearchDoctor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER OS
 */
public class viewallspecialization extends javax.swing.JFrame {

    /**
     * Creates new form viewallspecialization
     */
    public viewallspecialization() {
        initComponents();
        connect();
    }
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
   public void connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/doctorsassistant","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(viewallspecialization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(viewallspecialization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public void load()
         
 {
     String Item_Selected = searchbox.getSelectedItem().toString();
	if( Item_Selected.equals("Medecine"))
	{
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Medecine' ");
			        
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		 while(rs.next())
            		{
               			Vector v2=new Vector();
                
                    		
                    		v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
							
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	} 
    	}
	else if(Item_Selected.equals("Dental"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Dental'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}
	else if(Item_Selected.equals("Gynaecology"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Gynaecology'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}
	else if(Item_Selected.equals("Nutrition"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Nutrition'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}
else if(Item_Selected.equals("Neurology"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Neurology'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}	
else if(Item_Selected.equals("Cardiology"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Cardiology'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}	
	
else if(Item_Selected.equals("Covid"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Covid'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}		
else if(Item_Selected.equals("Child & Family"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Child & Family'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}	
	
else if(Item_Selected.equals("Dermatology"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Dermatology'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}	
	
else if(Item_Selected.equals("Eye"))
	{
	
		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Eye'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                            v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
        	}

	}		
	
	
	
	
	
	
	else
	{

		
	
       		try {
            
            		pst=con.prepareStatement("SELECT name,specialization,location,fees,number from doctorr where specialization='Phychology'");
			
            
            		rs=pst.executeQuery();
            		DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
            		d.setRowCount(0);
           		while(rs.next())
            		{
               			Vector v2=new Vector();
                
                    		v2.add(rs.getString("name"));
                    		v2.add(rs.getString("specialization"));
							v2.add(rs.getString("location"));
							v2.add(rs.getString("fees"));
                    		v2.add(rs.getString("number"));
                		d.addRow(v2);
            		}   
            
        	} catch (SQLException ex) {
            		Logger.getLogger(SearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        searchbox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 100));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Find your doctor here");

        searchbox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medecine", "Dental", "Gynaecology", "Nutrition", "Neurology", "Cardiology", "Covid", "Child & Family", "Dermatology", "Eye", "Phychology" }));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Doctors Assistant");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Specialization", "Location", "Fees", "Help line Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(165, 165, 165))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jButton2)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        load();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new TimeSchedule().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(viewallspecialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewallspecialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewallspecialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewallspecialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewallspecialization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> searchbox;
    // End of variables declaration//GEN-END:variables
}
