
import java.awt.Color;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Timer application with counting down feature.
 * @author Bethany
 */
public class NewJFrame extends javax.swing.JFrame {

    private static int min, hr, sec;
    private static boolean ifCancel = false;
    private static String choice;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        actionButton = new javax.swing.JButton();
        hrText = new javax.swing.JTextField();
        secText = new javax.swing.JTextField();
        minText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        chooser = new javax.swing.JComboBox<>();
        TimeButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        jLabel1.setText("时");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        jLabel2.setText("分");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        jLabel3.setText("秒");

        actionButton.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        actionButton.setText("开始你的挑战！");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButtonActionPerformed(evt);
            }
        });

        hrText.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        hrText.setText("0");

        secText.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        secText.setText("0");

        minText.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        minText.setText("0");

        cancelButton.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        cancelButton.setText("等等等等等");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        chooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRE Writing", "GRE Quantitative", "GRE Verbal" }));
        chooser.setToolTipText("");
        chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooserActionPerformed(evt);
            }
        });

        TimeButton.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        TimeButton.setText("计时");
        TimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(secText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TimeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hrText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(minText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actionButton)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(TimeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(secText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButtonActionPerformed
        ifCancel = false;   // trigger the timer if clicked again
        min = (Integer.parseInt(minText.getText()));
        hr = (Integer.parseInt(hrText.getText()));
        sec = (Integer.parseInt(secText.getText()));
        long start=System.currentTimeMillis();
        long end = start + hr*60*60*1000 + min*60*1000 + sec*1000; // get end time
        
        Timer timer=new Timer();
        timer.schedule(new TimerTask(){
            public void run(){
                long show=end-System.currentTimeMillis();
                if (ifCancel == true){
                    show = 0;
                    timer.cancel();
                }
                else{
                    long h=show/1000/60/60;
                    long m=show/1000/60%60;
                    long s=show/1000%60;
                    hrText.setText(Long.toString(h));
                    minText.setText(Long.toString(m));
                    secText.setText(Long.toString(s));

                    if (h == 0 && m == 0){
                        getContentPane().setBackground(Color.RED);
                    }
                }
            }
        },0,1000);
        timer.schedule(new TimerTask(){
            public void run()
            {
                timer.cancel();
                getContentPane().setBackground(Color.WHITE);
            }
          
        }, new Date(end));
        
    }//GEN-LAST:event_actionButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        ifCancel = true;
        getContentPane().setBackground(Color.WHITE);
        hrText.setText("0");
        minText.setText("0");
        secText.setText("0");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooserActionPerformed
        choice = chooser.getSelectedItem().toString();
        switch(choice){
            case "GRE Writing":
                hrText.setText("0");
                minText.setText("30");
                secText.setText("0");
                break;
            case "GRE Verbal":
                hrText.setText("0");
                minText.setText("35");
                secText.setText("0");
                break;
            case "GRE Quantitative":
                hrText.setText("0");
                minText.setText("40");
                secText.setText("0");
                break;
            default:
                hrText.setText("0");
                minText.setText("0");
                secText.setText("0");
                break;
        }
    }//GEN-LAST:event_chooserActionPerformed

    private void TimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeButtonActionPerformed
        ifCancel = false;   // trigger the timer if clicked again
        long start=System.currentTimeMillis();

        Timer timer=new Timer();
        timer.schedule(new TimerTask(){
            public void run(){
                long show=System.currentTimeMillis() - start;
                if (ifCancel == true){
                    show = 0;
                    timer.cancel();
                }
                else{
                    long h=show/1000/60/60;
                    long m=show/1000/60%60;
                    long s=show/1000%60;
                    hrText.setText(Long.toString(h));
                    minText.setText(Long.toString(m));
                    secText.setText(Long.toString(s));
                }
            }
        },0,1000);
    }//GEN-LAST:event_TimeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                NewJframe.setAlwaysOnTop(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TimeButton;
    private javax.swing.JButton actionButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> chooser;
    private javax.swing.JTextField hrText;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField minText;
    private javax.swing.JTextField secText;
    // End of variables declaration//GEN-END:variables
}
