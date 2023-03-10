package my.playBetter;

/*
By: Sasha Robinson
Date Created: October 17, 2021
Last Edited: January 27, 2022
Description: The main menu file which hosts the majority of the software. This file is responsible for displaying almost all of the information in the program to the user, including songs, artists, reviews, playable music, several functionalitys like looping and skipping through songs, as well as much more under the hood (such as a bubble sort algorithim).
*/

import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.io.*;
import java.util.*;

/**
 * mainMenu class that extends the JFrame object 
 * @author sasha
 */

public class mainMenu extends javax.swing.JFrame {

    /**
     * Constructor method that initializes components and sets up GUI
     */
    public mainMenu() {
        initComponents();

        // Load music from filepath (by default Borderline - Tame Impala)
        player.loadMusic(filepath);

        // Set table opacity (more visual)
        songTable.setOpaque(false);
        ((DefaultTableCellRenderer)songTable.getDefaultRenderer(Object.class)).setOpaque(false);
        
        // More visual CSS like additions
        songScrollPane.setOpaque(false);
        songScrollPane.getViewport().setOpaque(false);
        songTable.setShowGrid(false);

        // Methods called for grabbing and calculating the ratings of each song and then sorted before display
        grabRatingsForTable(songTable);
        sortAverages(songTable);

    }

    /**
     * @param player = MusicPlayer object that can be considered a master control of the sound system used in the software
     * @param filepath = String for the default filepath (Borderline - Tame Impala)
     * @param clipTimePosition = time position of the song, used for playing audio
     * @param isPlaying = boolean representing if a song is currently playing
     * @param isLooping = boolean representing if the currently playing song is set to loop
     */
    static MusicPlayer player = MusicPlayer.getPlayer();
    static String filepath = "/Users/sasha/Desktop/ICS4U/playBetter/playBetterMaven/src/main/java/my/playBetter/Song Files/Tame Impala - Borderline.wav";
    static long clipTimePosition;
    static boolean isPlaying = false;
    static boolean isLooping = false;

    /**
     * @param artistName = Empty string representing the artist name - gets reassigned later on in the program
     * @param songName = Empty string representing the song name - gets reassigned later on in the program
     * @param row = integer representing current row in the song table
     * @param column = intenger representing current column in the song table
     */
    static String artistName = "";
    static String songName = "";
    int row = 0;
    int column = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new java.awt.Button();
        backgroundPanel = new javax.swing.JPanel();
        audioControlPanel = new javax.swing.JPanel();
        playButton = new javax.swing.JToggleButton();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        accountPortalPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JToggleButton();
        signupButton = new javax.swing.JToggleButton();
        menuPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        loopButton = new javax.swing.JButton();
        reviewButton = new javax.swing.JButton();
        displaySongsPanel = new javax.swing.JPanel();
        songScrollPane = new javax.swing.JScrollPane();
        songTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        backgroundPanel.setBackground(new java.awt.Color(255, 209, 209));

        audioControlPanel.setBackground(new java.awt.Color(243, 241, 241));

        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        nextButton.setText(">>>");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setText("<<<");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout audioControlPanelLayout = new javax.swing.GroupLayout(audioControlPanel);
        audioControlPanel.setLayout(audioControlPanelLayout);
        audioControlPanelLayout.setHorizontalGroup(
            audioControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioControlPanelLayout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(previousButton)
                .addGap(18, 18, 18)
                .addComponent(playButton)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        audioControlPanelLayout.setVerticalGroup(
            audioControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioControlPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(audioControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(previousButton)
                    .addComponent(nextButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        accountPortalPanel.setBackground(new java.awt.Color(255, 209, 209));

        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountPortalPanelLayout = new javax.swing.GroupLayout(accountPortalPanel);
        accountPortalPanel.setLayout(accountPortalPanelLayout);
        accountPortalPanelLayout.setHorizontalGroup(
            accountPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPortalPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(signupButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton))
        );
        accountPortalPanelLayout.setVerticalGroup(
            accountPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPortalPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(accountPortalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(signupButton))
                .addContainerGap())
        );

        menuPanel.setBackground(new java.awt.Color(248, 228, 228));
        menuPanel.setMaximumSize(new java.awt.Dimension(275, 320));
        menuPanel.setRequestFocusEnabled(false);

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        loopButton.setText("Loop");
        loopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loopButtonActionPerformed(evt);
            }
        });

        reviewButton.setText("Review");
        reviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
            .addComponent(loopButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        displaySongsPanel.setBackground(new java.awt.Color(248, 228, 228));

        songTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Borderline", "Tame Impala", null},
                {"Xtal", "Aphex Twin", null},
                {"Worth it", "beabadoobee", null},
                {"Change Your Mind", "CASTLEBEAT", null},
                {"Part", "CASTLEBEAT", null},
                {"Feels Like Summer", "Childish Gambino", null},
                {"Pretty Girl", "Clairo", null},
                {"Take A Slice", "Glass Animals", null},
                {"Interlude", "Izaya Tiji", null},
                {"After The Storm", "Kali Uchis", null},
                {"velvet", "Lilac", null},
                {"Randomly", "Lucki", null},
                {"Chamber of Reflection", "Mac DeMarco", null},
                {"Show Me How", "Men I Trust", null},
                {"Little Dark Age", "MGMT", null},
                {"Cocoon", "Milky Chance", null},
                {"Shook Ones Pt. II", "Mobb Deep", null},
                {"Break It Off", "Pink Pantheress", null},
                {"ERROR", "Plastic Girl In Closet", null},
                {"Ryd", "Steve Lacy", null},
                {"Goodie Bag", "Still Woozy", null},
                {"Hi", "Temporex", null},
                {"Come Over", "The Internet", null},
                {"Sweater Weather", "The Neighbourhood", null},
                {"911", "Tyler The Creator", null},
                {"OKRA", "Tyler The Creator", null},
                {"Remember When", "Wallows", null},
                {"Heart Stop", "Weiland", null},
                {"Tried 2 Tell U", "Yeat", null},
                {"Tru to U", "Yeat", null},
                {"soon", "yuragi", null}
            },
            new String [] {
                "Songs", "Artists", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        songTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        songScrollPane.setViewportView(songTable);
        if (songTable.getColumnModel().getColumnCount() > 0) {
            songTable.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        javax.swing.GroupLayout displaySongsPanelLayout = new javax.swing.GroupLayout(displaySongsPanel);
        displaySongsPanel.setLayout(displaySongsPanelLayout);
        displaySongsPanelLayout.setHorizontalGroup(
            displaySongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaySongsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        displaySongsPanelLayout.setVerticalGroup(
            displaySongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaySongsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Apple LiGothic", 0, 48)); // NOI18N
        titleLabel.setText("Play Better");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(audioControlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(accountPortalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displaySongsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(accountPortalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(titleLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displaySongsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(audioControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Method called when the user chooses to pause or play the song - action is decided depending on the boolean value of isPlaying
     * @param evt = generic event handler
     */
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        
        // If the song is currently playing, user wishes to pause it
        if (isPlaying) {

            // Save the time position of the song (so if the user unpauses it can continue where it was)
            clipTimePosition = player.clip.getMicrosecondPosition();

            // Stop the song
            player.clip.stop();

            // Change the text for the user
            playButton.setText("Play");
            
        }

        // Song is paused, resume 
        else {

            // Set the song to the previously saved clip time position
            player.clip.setMicrosecondPosition(clipTimePosition);

            // Start the song again
            player.clip.start();

            // Change the text for the user
            playButton.setText("Pause");
        }

        // Flip boolean value
        isPlaying = !isPlaying;
        

    }//GEN-LAST:event_playButtonActionPerformed

    /**
     * Method for looping the song on the event of the loop button being called
     * @param evt = generic event handler
     */
    private void loopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loopButtonActionPerformed
        
        // Song is not currently looping, begin looping
        if (!isLooping) {

            // Set the player to loop the song
            player.clip.loop(Clip.LOOP_CONTINUOUSLY);
        }

        else {

            // Stop looping the song (value of 0 means terminate)
            player.clip.loop(0);
        }

        // Flip boolean values
        isLooping = !isLooping;

    }//GEN-LAST:event_loopButtonActionPerformed

    /**
     * Method for when the user presses the sign up button
     * @param evt = generic event handler
     */
    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        
        // Transition to other screen
        this.setVisible(false);
        new createAccountMenu().setVisible(true);

    }//GEN-LAST:event_signupButtonActionPerformed

    /**
     * Method for when the user presses the log in button
     * @param evt = generic event handler
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        // Transition to other screen
        this.setVisible(false);
        new MainUserInterface().setVisible(true);

    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * Method used for capturing when the user clicks on the songTable JTable object - position of press is captured
     * @param evt = generic event handler
     */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        // If the user pressed in the songs column, play the song (don't play song if the user presses the artist name for example)
        if (songTable.getColumnName(songTable.getSelectedColumn()).equals("Songs")) {

            // Returns stringified values of the values at the selected row and column (captured from mouse click) to be saved as song and artist
            songName = (String) songTable.getValueAt(songTable.getSelectedRow() , songTable.getSelectedColumn());
            artistName = (String) songTable.getValueAt(songTable.getSelectedRow() , songTable.getSelectedColumn() + 1);

            // Designating row and column to previously declared variables for use later in program
            row = songTable.getSelectedRow();
            column = songTable.getSelectedColumn();

            // Stop playing current song if one is playing
            player.clip.stop();

            // Reroute the filepath to be the artistName - songName.wav. This is how all the .wav files are saved for the program
            filepath = "/Users/sasha/Desktop/ICS4U/playBetter/playBetterMaven/src/main/java/my/playBetter/Song Files/" + artistName + " - " + songName + ".wav";

            // Load the music into the MusicPlayer object
            player.loadMusic(filepath);

            // Set the player position to 0 (beginning of song)
            player.clip.setMicrosecondPosition(0);
            clipTimePosition = 0;

            // Start playing the song
            player.clip.start();

            // Make isPlaying true (whether or not it was false before)
            isPlaying = true;

            // Change text for the user
            playButton.setText("Pause");

        }
        
    }//GEN-LAST:event_formMousePressed

    /**
     * Method for when the user wishes to play the next song in the playlist
     * @param evt = generic event handler
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
        // Stringified song name and artist name one row below (the next song)
        songName = (String) songTable.getValueAt(row + 1, column);
        artistName = (String) songTable.getValueAt(row + 1, column + 1);

        // As mentioned earlier, this row tracker is used for the next and previous song functionality. It is used to keep track of the current row
        row += 1;

        // Stop the song
        player.clip.stop();

        // Reroute the filepath (as shown before)
        filepath = "/Users/sasha/Desktop/ICS4U/playBetter/playBetterMaven/src/main/java/my/playBetter/Song Files/" + artistName + " - " + songName + ".wav";

        // Load the music
        player.loadMusic(filepath);

        // Set time position to 0
        player.clip.setMicrosecondPosition(0);
        clipTimePosition = 0;

        // Start playing clip
        player.clip.start();

        // Make isPlaying true
        isPlaying = true;

        // Change text for user
        playButton.setText("Pause");
        
    }//GEN-LAST:event_nextButtonActionPerformed

    /**
     * Identical method to the nextButtonActionPerformed method, but back a row (no commenting necessary)
     * @param evt
     */
    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        songName = (String) songTable.getValueAt(row - 1, column);
        artistName = (String) songTable.getValueAt(row - 1, column + 1);

        row -= 1;

        player.clip.stop();

        filepath = "/Users/sasha/Desktop/ICS4U/playBetter/playBetterMaven/src/main/java/my/playBetter/Song Files/" + artistName + " - " + songName + ".wav";
        player.loadMusic(filepath);

        // User has started playing song
        player.clip.setMicrosecondPosition(0);
        clipTimePosition = 0;

        // Start playing clip
        player.clip.start();

        isPlaying = true;
        playButton.setText("Pause");

    }//GEN-LAST:event_previousButtonActionPerformed

    /**
     * Method for generating a ReviewMenu when the user clicks to review
     */
    private void reviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewButtonActionPerformed
        
        // New Review Menu generated with the currently captured song name and arist name passed in for further use
        new ReviewMenu(songName,artistName).setVisible(true);

    }//GEN-LAST:event_reviewButtonActionPerformed

    /**
     * Method for refreshing the page, simply by recalling the grab ratings method and sorting averages method
     * @param evt
     */
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        
        grabRatingsForTable(songTable);
        sortAverages(songTable);
        
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    /**
     * Method for grabbing the ratings from each individual song database file, averaging them and then placing in the passed in JTable
     * @param songTable = songTable used throughout the rest of the main menu being passed in as an arguement so that we can edit individual cells
     */
    public static void grabRatingsForTable(JTable songTable) {

        // Loop through table
        for (int i = 0; i < songTable.getRowCount(); i++) {

            /**
             * @param song = Stringified value of the song found at the ith row 
             */
            String song = (String) songTable.getValueAt(i, 0);
            
            // Go into song file
            try {

                /**
                 * @param file = File object storing the file path of the song database
                 * @param fileScanner = Scanner object to parse through file
                 */
                File file = new File("/Users/sasha/Desktop/ICS4U/playBetter/playBetterMaven/src/main/java/my/playBetter/Files/" + song + ".csv");
                Scanner fileScanner = new Scanner(file);

                /**
                 * @param sum = Sum of the eventual average (numerator)
                 * @param counter = Amount of ratings for the eventual average (denominator)
                 */
                Double sum = 0.0;
                int counter = 0;

                // Iterate through file
                while (fileScanner.hasNext()) {

                    /**
                     * @param data = Double parsing of the passed in String (such as 4.0)
                     */
                    Double data = Double.valueOf(fileScanner.next());
                    sum += data;
                    counter += 1;
                         
                }

                // If divided by 0 -> NaN, check for this
                if (counter != 0) {

                    /**
                     * @param result = String formatted to one decimal point quotient of the sum and counter
                     */
                    String result = String.format("%.1f", sum / counter);

                    // Set rating beside the song name and artist
                    songTable.setValueAt(result, i, 2);
                }

                else {

                    // There were no ratings, set to 0.0 (as a String so later when we try to parse an expected String we don't break the program)
                    songTable.setValueAt("0.0", i, 2);

                }
            }

            catch (IOException e) {
                System.out.println("MADMAWDNAWDNA");
            }
            
        }
        
    }

    /**
     * Method that uses a bubble sort algorithim (not very efficient, but with the limited entries of data no a problem - possible scalability problem) to sort out the average ratings from highest to lowest
     * @param songTable = songTable used throughout rest of program, passed in so we can edit cell entries
     */
    public static void sortAverages(JTable songTable) {

        /**
         * @param notFinished = Boolean variable that is used in the infinite while loop of the program, until it is determined that the bubble sort is complete
         */
        Boolean notFinished = true;

        // While not finished sorting
        while (notFinished) {

            /**
             * @param counter = counter variable used to detect if at one point next > current, thus indicating the algorithim is not finished
             */
            int counter = 0;

            // Loop through each row
            for (int i = 0; i < songTable.getRowCount() - 1; i++) {

                /**
                 * @param current = Double version of Stringified object found in the ratings of the ith row
                 * @param next = Double version of the Stringified object found in the ratings of the ith + 1 row
                 */
                Double current = Double.valueOf( (String) songTable.getValueAt(i, 2));
                Double next = Double.valueOf( (String) songTable.getValueAt(i + 1, 2));
                
                // If the next rating entry is greater than the current, switch them (algorithim is not done)
                if (next > current) {
                    
                    // As the algorihim is not finished, increase the counter so as to continue the while loop later on
                    counter += 1;

                    /**
                     * @param firstSong = the first song in the swap
                     * @param firstArtist = the first artist in the swap
                     * @param secondSong = the second song in the swap
                     * @param secondArtist = the second artist in the swap
                     */
                    String firstSong = (String) songTable.getValueAt(i, 0);
                    String firstArtist = (String) songTable.getValueAt(i, 1);
                    String secondSong = (String) songTable.getValueAt(i + 1, 0);
                    String secondArtist = (String) songTable.getValueAt(i + 1, 1);

                    // Switch the value of the first song, artist and rating with the second song, artist and rating in the JTable
                    songTable.setValueAt(firstSong, i + 1, 0);
                    songTable.setValueAt(firstArtist, i + 1, 1);
                    songTable.setValueAt(secondSong, i, 0);
                    songTable.setValueAt(secondArtist, i, 1);
                    songTable.setValueAt(next.toString(), i, 2);
                    songTable.setValueAt(current.toString(), i + 1, 2);

                }
            }

            // If the counter is 0 (at no point next > current evaluated true, the algorithim is sorted and thus complete, return)
            if (counter == 0) {
                return;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPortalPanel;
    private javax.swing.JPanel audioControlPanel;
    private javax.swing.JPanel backgroundPanel;
    private java.awt.Button button1;
    private javax.swing.JPanel displaySongsPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton loginButton;
    private javax.swing.JButton loopButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JToggleButton playButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton reviewButton;
    private javax.swing.JToggleButton signupButton;
    private javax.swing.JScrollPane songScrollPane;
    private javax.swing.JTable songTable;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
