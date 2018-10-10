/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package makingpizza;

/**
 *
 * @author antho6229
 */

import java.text.DecimalFormat;

public class pizzaForm extends javax.swing.JFrame {

    /**
     * Creates new form pizzaForm
     */
    
    //create decimal format
    DecimalFormat df = new DecimalFormat("$###.##");
    
    //declare constants
    final double LABOUR_PRICE = 0.75;
    final double RENT_PRICE = 0.99;
    final double PRICE_PER_DIAMETER = 0.50;
    final double TAX_RATE = 0.13;
    
    public pizzaForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        diameterLabel = new javax.swing.JLabel();
        diameterTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        subtotalLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(102, 102, 0));
        mainPanel.setForeground(new java.awt.Color(255, 51, 51));

        titleLabel.setFont(new java.awt.Font("Comic Geek", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 0));
        titleLabel.setText("Putrid Pizza");

        diameterLabel.setFont(new java.awt.Font("Comic Geek", 0, 18)); // NOI18N
        diameterLabel.setForeground(new java.awt.Color(255, 255, 0));
        diameterLabel.setText("Diameter of pizza(cm):");

        diameterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diameterTextFieldActionPerformed(evt);
            }
        });

        calculateButton.setFont(new java.awt.Font("Comic Geek", 1, 11)); // NOI18N
        calculateButton.setText("CALCULATE PRICE");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        subtotalLabel.setFont(new java.awt.Font("Comic Geek", 0, 18)); // NOI18N
        subtotalLabel.setForeground(new java.awt.Color(255, 255, 0));
        subtotalLabel.setText("Subtotal:");

        taxLabel.setFont(new java.awt.Font("Comic Geek", 0, 18)); // NOI18N
        taxLabel.setForeground(new java.awt.Color(255, 255, 0));
        taxLabel.setText("Tax:");

        totalLabel.setFont(new java.awt.Font("Comic Geek", 0, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 0));
        totalLabel.setText("Total:");

        outputLabel.setFont(new java.awt.Font("Comic Geek", 0, 12)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(255, 255, 0));
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(diameterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(calculateButton)
                            .addComponent(subtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(21, 21, 21)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diameterLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateButton)
                .addGap(18, 18, 18)
                .addComponent(subtotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taxLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel)
                .addGap(31, 31, 31)
                .addComponent(outputLabel)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diameterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diameterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diameterTextFieldActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        //declare local variables
        double diameter, subtotal, tax, total;

        //get the diameter
        diameter = Double.parseDouble(diameterTextField.getText());
        
        //calculate subtotal tax and total
        subtotal = LABOUR_PRICE + RENT_PRICE + (PRICE_PER_DIAMETER * diameter);
        tax = TAX_RATE * subtotal;
        total = tax + subtotal;
        
        //output price
        subtotalLabel.setText("Subtotal:  " + df.format(subtotal));
        taxLabel.setText("Tax:            " + df.format(tax));
        totalLabel.setText("Total:        " + df.format(total));
        
        if(diameter >=1 && diameter <=15){
            outputLabel.setText("We are going to make you a cute little pizza!");
        }else if(diameter > 15 && diameter < 20){
            outputLabel.setText("This will be a great  pizza!");
        }else if(diameter >=20 && diameter < 40){
            outputLabel.setText("This will be delicious!");
        }else if(diameter > 40){
            outputLabel.setText("Whoa, big pizza! You might need a truck to transport it!");
        }else{
            outputLabel.setText("I\'m sorry, we can\'t make this pizza!");
            subtotalLabel.setText("Subtotal:");
            taxLabel.setText("Tax:");
            totalLabel.setText("Total:");
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        //exits program
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(pizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizzaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel diameterLabel;
    private javax.swing.JTextField diameterTextField;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
