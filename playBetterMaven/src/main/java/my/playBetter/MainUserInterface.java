package my.playBetter;
/*
By: Sasha Robinson
Date Created: October 12, 2021
Last Edited: January 27, 2022
Description: This is the main interface file that the user interacts with upon launching the program. It is a GUI designed for rerouting the user either to the main menu or to the create account menu.
*/

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

/**
 * MainUserInterface class that extends the JFrame object 
 * @author sasha
 */
public class MainUserInterface extends javax.swing.JFrame {
    
    /**
     * Constructor method that initializes components and sets up GUI
     */
    public MainUserInterface() {
        initComponents();

        // Make error label invisible
        errorLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        usernamePanel = new javax.swing.JPanel();
        usernameText = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordText = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 209, 209));

        loginButton.setBackground(new java.awt.Color(153, 204, 255));
        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameText.setText("Username:");

        usernameTextField.setForeground(new java.awt.Color(51, 51, 51));
        usernameTextField.setText("Username");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
        });

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameText)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        passwordText.setText("Password:");

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordText)
                .addGap(9, 9, 9)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setText("Don't have an account? ");

        createAccountButton.setText("Create an Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(createAccountButton)))
        );

        errorLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("No error");
        errorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(loginButton))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorLabel)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method that is called when the username text field gains focus (user clicks on it). On this event, clear the text field (simply a user interface quality of life)
     * @param evt = generic event handler
     */
    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained

        // Set textfield to empty string
        usernameTextField.setText("");

    }//GEN-LAST:event_usernameTextFieldFocusGained
    
    /**
     * Method for checking whether the given username and password found in the textfields match up against the database - uses grabUserInformation method (backend algorithim). This method is called when the user clicks login
     * @param evt = generic event handler
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        /**
         * @param pulledUserInformation = the returning HashMap value from the grabUserInformation method algorithim
         */
        HashMap<String,String> pulledUserInformation = grabUserInformation();

        /**
         * @param username = the value found in usernameTextField
         * @param passwordChar = the value found in passwordTextField (returned as an array of char)
         * @param password = stringified result of char array from before
         */
        String username = usernameTextField.getText();
        char[] passwordChar = passwordTextField.getPassword();
        String password = new String(passwordChar);

        /**
         * @param verification = if the passed in username is true, this variable will hold a password to later be matched against the database
         */
        String verification = pulledUserInformation.get(username);
        
        // Checking if password matches against the database
        if (verification == null || !verification.equals(password)) {
            errorLabel.setText("<html>" + "Incorrect username or password." + "</html>");
            errorLabel.setVisible(true);
        }

        // Correct password and username, login
        else if (verification.equals(password)) {

            // Close current screen, transition to main menu
            this.setVisible(false);
            new mainMenu().setVisible(true);
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * Method for transitioning to create account menu screen
     * @param evt = generic event handler
     */
    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed

        // Close current screen, transition to create account menu
        this.setVisible(false);
        new createAccountMenu().setVisible(true);

    }//GEN-LAST:event_createAccountButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // Error label visibility set to invisible by default
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUserInterface().setVisible(true);
            
            }
        });
    }

    /**
     * Method for handling back-end low level grabbing of user information from file and parsing into returnable HashMap
     * @return = Hashmap of key and value type String that will be the username and passwords found in file
     */
    public static HashMap<String, String> grabUserInformation() {
        
        try {

            /**
             * @param file = File object for the users.csv file
             * @param fileScanner = Scanner object that reads users.csv
             */
            File file = new File("src/main/java/my/playBetter/Files/users.csv");
            Scanner fileScanner = new Scanner(file);

            /**
             * @param userInformation = HashMap that will store username and passwords in Strings
             */
            HashMap<String, String> userInformation = new HashMap<String,String>();

            // Iterate through file, storing information into hashmap
            while (fileScanner.hasNext()) {

                /**
                 * @param data = the current line of the file that is being parsed
                 * @param username = empty string that will be summated by characters to form the username
                 * @param password = empty string that will be summated by characters to form the password
                 * @param comma = a variable used to store an indice of where a comma is found
                 */
                String data = fileScanner.nextLine();
                String username = "";
                String password = "";
                int comma = 0;

                // Loop through line, seperate username and password, add to hashmap
                for (int i = 0; i < data.length(); i++) {

                    // If a comma is detected
                    if (data.charAt(i) == ',') {
                        comma = i;
                        break;
                    }

                    else {
                        
                        // Add character to username
                        username += data.charAt(i);
                    }
                }

                // Password loop
                for (int j = comma + 1; j < data.length(); j++) {

                    // Add character to password
                    password += data.charAt(j);

                }

                // Username and password have been differentiated, place in HashMap
                userInformation.put(username, password);

            }

            fileScanner.close();

            // Return the full HashMap 
            return userInformation;

        }

        catch (IOException e) {
            System.out.println(e);
        }

        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel passwordText;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPanel usernamePanel;
    private javax.swing.JLabel usernameText;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
