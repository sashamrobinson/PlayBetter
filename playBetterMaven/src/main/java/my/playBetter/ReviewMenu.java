package my.playBetter;

/*
By: Sasha Robinson
Date Created: December 16, 2021
Last Edited: January 27, 2022
Description: File responsible for the review pop up when the user wishes to review a song. 
*/

import javax.swing.ButtonGroup;
import java.io.*;

/**
 * ReviewMenu class that extends the JFrame object 
 * @author sasha
 */
public class ReviewMenu extends javax.swing.JFrame {

    /**
     * @param songName = name of song that will be added later in the program (yet to be initialized)
     */
    String songName;
    
    /**
     * Constructor method that initializes components and sets up GUI
     */
    public ReviewMenu(String song, String artist) {
        
        initComponents();
        
        // Assign the passed in song String to the songName variable
        songName = song;

        // Set error label to invisible
        errorLabel.setVisible(false);

        // Change review text for user
        reviewText.setText("Reviewing: " + song + " - " + artist);
        
        /**
         * @param group = ButtonGroup object that will be connected to five rating buttons. Needed so that multiple buttons at once cannot be pressed
         */
        ButtonGroup group = new ButtonGroup();

        // Adding buttons to ButtonGroup
        group.add(oneStarButton);
        group.add(twoStarButton);
        group.add(threeStarButton);
        group.add(fourStarButton);
        group.add(fiveStarButton);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        reviewText = new javax.swing.JLabel();
        oneStarButton = new javax.swing.JRadioButton();
        twoStarButton = new javax.swing.JRadioButton();
        threeStarButton = new javax.swing.JRadioButton();
        fourStarButton = new javax.swing.JRadioButton();
        fiveStarButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        reviewText.setText("Reviewing:");

        oneStarButton.setText("Not Good (1)");

        twoStarButton.setText("Decent (2)");

        threeStarButton.setText("Pretty Good (3)");

        fourStarButton.setText("Good (4)");

        fiveStarButton.setText("Very Good (5)");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("No Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(errorLabel))
                    .addComponent(reviewText)
                    .addComponent(fiveStarButton)
                    .addComponent(fourStarButton)
                    .addComponent(threeStarButton)
                    .addComponent(twoStarButton)
                    .addComponent(oneStarButton)
                    .addComponent(submitButton))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reviewText)
                .addGap(18, 18, 18)
                .addComponent(oneStarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoStarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threeStarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourStarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fiveStarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method responsible for writing to database with the review of the user
     * @param evt = generic event handler
     */
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        try {

            /**
             * @param writer = FileWriter object to write to songName.csv file
             * @param output = PrinterWriter object for outputting value to file
             */
            FileWriter writer = new FileWriter("src/main/java/my/playBetter/Files/" + songName + ".csv", true);
            PrintWriter output = new PrintWriter(writer);

            /**
             * @param rating = rating that will be added to the database
             */
            double rating = 0.0;

            // Associating buttons with ratings
            if (fiveStarButton.isSelected()) {
                rating = 5.0;
            }

            else if (fourStarButton.isSelected()) {
                rating = 4.0;
            }

            else if (threeStarButton.isSelected()) {
                rating = 3.0;
            }

            else if (twoStarButton.isSelected()) {
                rating = 2.0;
            }

            else if (oneStarButton.isSelected()) {
                rating = 1.0;
                
            }

            // If none of the buttons are pressed, alert the user that they must choose a rating before submitting
            else {
                errorLabel.setText("Please select a rating before submitting");
                errorLabel.setVisible(true);
            }

            // If rating has been assigned
            if (rating > 0.0) {

                // Add to database
                output.println(rating);
                output.close();

                // Set frame to invisible and then dispose of the object so as to save memory
                setVisible(false);
                dispose();

            }

        }

        catch (IOException error) {
            System.out.println("Error in writing to review files");
        }

    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReviewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReviewMenu(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JRadioButton fiveStarButton;
    private javax.swing.JRadioButton fourStarButton;
    private javax.swing.JRadioButton oneStarButton;
    private javax.swing.JLabel reviewText;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton threeStarButton;
    private javax.swing.JRadioButton twoStarButton;
    // End of variables declaration//GEN-END:variables
}
