package mainmethods;

/**
 * Chris Hitchcock - 04/10/16
 * This program is a GUI program which does an analysis of the number inputted
 * into the input box; it demonstrates various Math methods: Math.pow, Math.sqrt,
 * Math.cbrt, Math.ceil, and Math.floor, then displays this
 * analysis in the corresponding output boxes, which are labeled above them.
 */
public class myGUI extends javax.swing.JFrame {
    double number,numSqrt,numCbrt;
    /**
     * Creates new form myGUI
     */
    public myGUI() {
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

        prompt = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        inputBox = new javax.swing.JTextField();
        analysis = new javax.swing.JTextField();
        squaredLabel = new javax.swing.JTextField();
        numSquared = new javax.swing.JTextField();
        squareRootLabel = new javax.swing.JTextField();
        numSquareRoot = new javax.swing.JTextField();
        roundUpLabel = new javax.swing.JTextField();
        numRoundUp = new javax.swing.JTextField();
        roundDownLabel = new javax.swing.JTextField();
        numRoundDown = new javax.swing.JTextField();
        cubeRootLabel = new javax.swing.JTextField();
        numCubedLabel = new javax.swing.JTextField();
        numCubed = new javax.swing.JTextField();
        numCubeRoot = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prompt.setEditable(false);
        prompt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prompt.setText("Please enter a double");
        prompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promptActionPerformed(evt);
            }
        });

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        inputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBoxActionPerformed(evt);
            }
        });

        analysis.setEditable(false);
        analysis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        analysis.setText("Analysis");

        squaredLabel.setEditable(false);
        squaredLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squaredLabel.setText("Number Squared");

        numSquared.setEditable(false);
        numSquared.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        squareRootLabel.setEditable(false);
        squareRootLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareRootLabel.setText("Square Root of Number");

        numSquareRoot.setEditable(false);
        numSquareRoot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        roundUpLabel.setEditable(false);
        roundUpLabel.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        roundUpLabel.setText("Number Rounded Up");

        numRoundUp.setEditable(false);
        numRoundUp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        roundDownLabel.setEditable(false);
        roundDownLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roundDownLabel.setText("Number Rounded Down");

        numRoundDown.setEditable(false);
        numRoundDown.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cubeRootLabel.setEditable(false);
        cubeRootLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cubeRootLabel.setText("Cube Root of Number");

        numCubedLabel.setEditable(false);
        numCubedLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numCubedLabel.setText("Number Cubed");

        numCubed.setEditable(false);
        numCubed.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        numCubeRoot.setEditable(false);
        numCubeRoot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(numSquared, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(numRoundUp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numCubedLabel)
                                    .addComponent(squaredLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cubeRootLabel)
                                        .addComponent(analysis)
                                        .addComponent(squareRootLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(roundUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(roundDownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(numCubed, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(numCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numRoundDown, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(enter)
                .addGap(18, 18, 18)
                .addComponent(analysis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundUpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(squareRootLabel)
                    .addComponent(squaredLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numSquared, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numRoundUp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numCubedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundDownLabel)
                    .addComponent(cubeRootLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numRoundDown, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCubed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void promptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promptActionPerformed

    private void inputBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBoxActionPerformed
    /**
    * This method runs whenever the enter button is pressed it does a quick analysis of the number
    * pre: inputted number (kind of, finds it when button is pressed but that is how it runs)
    * post: inputted number squared, cubed, square-rooted, cube-rooted, rounded up and rounded down.
     */
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==enter)
        {
            number = Double.parseDouble(inputBox.getText());
            numSquared.setText(String.valueOf(Math.pow(number,2)));
            numCubed.setText(String.valueOf(Math.pow(number,3)));
            numSqrt=Math.sqrt(number)*100;
            numSqrt=Math.round(numSqrt);
            numSqrt=numSqrt/100;
            numCbrt=Math.cbrt(number)*100;
            numCbrt=Math.round(numCbrt);
            numCbrt=numCbrt/100;
            numSquareRoot.setText(String.valueOf(numSqrt)+"~");
            numCubeRoot.setText(String.valueOf(numCbrt)+"~");
            numRoundUp.setText(String.valueOf(Math.ceil(number)));
            numRoundDown.setText(String.valueOf(Math.floor(number)));
        }
    }//GEN-LAST:event_enterActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(myGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField analysis;
    private javax.swing.JTextField cubeRootLabel;
    private javax.swing.JButton enter;
    private javax.swing.JTextField inputBox;
    private javax.swing.JTextField numCubeRoot;
    private javax.swing.JTextField numCubed;
    private javax.swing.JTextField numCubedLabel;
    private javax.swing.JTextField numRoundDown;
    private javax.swing.JTextField numRoundUp;
    private javax.swing.JTextField numSquareRoot;
    private javax.swing.JTextField numSquared;
    private javax.swing.JTextField prompt;
    private javax.swing.JTextField roundDownLabel;
    private javax.swing.JTextField roundUpLabel;
    private javax.swing.JTextField squareRootLabel;
    private javax.swing.JTextField squaredLabel;
    // End of variables declaration//GEN-END:variables
}
