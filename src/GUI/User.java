package GUI;

import Jobs.Degree;
import Jobs.Job;
import Main.Applicant;
import Main.Employer;
import static Main.Employer.getEmployers;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class User extends javax.swing.JInternalFrame {

    
    public User() {
        initComponents();
        jButton2.setVisible(false);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agein = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        genderin = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        degreein = new javax.swing.JComboBox<>();
        specin = new javax.swing.JComboBox<>();
        expin = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Personal information");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        namin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naminActionPerformed(evt);
            }
        });
        jPanel1.add(namin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Age:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        agein.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        agein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageinActionPerformed(evt);
            }
        });
        jPanel1.add(agein, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        genderin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "M", "F" }));
        genderin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderinActionPerformed(evt);
            }
        });
        jPanel1.add(genderin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Qualifications");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        degreein.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degree", "Diploma", "Bachelor", "Master", "PhD." }));
        degreein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeinActionPerformed(evt);
            }
        });
        jPanel1.add(degreein, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 30));

        specin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Specialization", "Engineering", "IT", "Medicine", "business", "Law" }));
        specin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specinActionPerformed(evt);
            }
        });
        jPanel1.add(specin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 110, 30));

        expin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Experience", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25+" }));
        expin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expinActionPerformed(evt);
            }
        });
        jPanel1.add(expin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 100, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 140, -1));

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 450, 330));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("     User");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 840, 450));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 860, 550));

        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void naminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naminActionPerformed

    private void ageinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageinActionPerformed

    private void genderinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderinActionPerformed

    private void degreeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeinActionPerformed

    private void specinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specinActionPerformed

    private void expinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        display.setText("");
        if(genderin.getSelectedIndex() == 0 || specin.getSelectedIndex() == 0 || expin.getSelectedIndex() == 0 
                || degreein.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "please enter all the information");
        }
        else{
        String name = namin.getSelectedText();
        int age = Integer.parseInt((String)agein.getSelectedItem());
        char gender = 'G';
        if (genderin.getSelectedItem() == "M") {
                    gender = 'M';
                } else {
                    gender = 'F';
                }
        String degree =(String) degreein.getSelectedItem();
        String specialization = (String) specin.getSelectedItem();
        int experience = Integer.parseInt((String)expin.getSelectedItem());
        Degree d1 = new Degree(degree, specialization);
        Applicant a1 = new Applicant(name, age, gender, d1, experience);
        
        Scanner EmployRead = null;
        try{
           EmployRead = new Scanner(new File("src/GUI/Jobs.txt"));
           while(EmployRead.hasNextLine()){
               String[] line = EmployRead.nextLine().split(",");
               new Employer(line[0],Integer.parseInt( line[1]), line[2].charAt(0),
                       new Degree(line[3], line[4]), Integer.parseInt(line[5]), new Job(line[6], Double.parseDouble(line[7])), Integer.parseInt(line[8]));

           }
        }
        catch(Exception ex){
            System.out.println("Error");
        }
        
        for (int i = 0; i < getEmployers().size(); i++) {
            if(degreein.getSelectedIndex() >= getEmployers().get(i).getReqdegreeind()  && a1.getExperience() >= 
                    getEmployers().get(i).getReqexperience() && a1.getDegree().getSpecilization()
                            .equals(getEmployers().get(i).getReqDegree().getSpecilization())){
                display.append(getEmployers().get(i).toString());
                jButton2.setVisible(true);
                break;
                
            }
            
        }}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Applied successfully, We will be in touch");
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agein;
    private javax.swing.JComboBox<String> degreein;
    private javax.swing.JTextArea display;
    private javax.swing.JComboBox<String> expin;
    private javax.swing.JComboBox<String> genderin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namin;
    private javax.swing.JComboBox<String> specin;
    // End of variables declaration//GEN-END:variables
}
