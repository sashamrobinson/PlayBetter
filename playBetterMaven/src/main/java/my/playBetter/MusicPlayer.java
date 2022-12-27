package my.playBetter;

/*
By: Sasha Robinson
Date Created: November 21, 2021
Last Edited: January 27, 2022
Descrption: Master file responsible for handling the loading of music to the MusicPlayer objects. Code is quite abstract and written from reading through documentation and other sources online.
*/

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;

/**
 * MusicPlayer class for controlling audio
 * @author sasha
 */
public class MusicPlayer {
    
    /**
     * @param player = initialized MusicPlayer object for further reference
     * @param clip = the clip of sound being parsed to be played
     */
    static MusicPlayer player = new MusicPlayer();
    static Clip clip;
    
    /**
     * Empty constructor 
     */
    private MusicPlayer() {

    }

    /**
     * Getter method for returning the player 
     * @return
     */
    public static MusicPlayer getPlayer() {
        return player;
    }
    
    /**
     * Method responsible for loading the designated file path location of the .wav file into the AudioInputStream
     * @param filepath = passed in filepath to be parsed
     */
    public static void loadMusic(String filepath) {

        try {

            /**
             * @param musicPath = File object holding the filepath 
             */
            File musicPath = new File(filepath);

            // If file found
            if (musicPath.exists()) {

                /**
                 * @param audioInput = AudioInputStream object used to pass the File object containing the .wav filepath to the AudioSystem's input stream
                 */
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);

                // Code that was written for use of a timeline at the bottom of the screen(such as the one in Spotify). Deprecated as we ran out of time, but I left it anyway as it is interesting code
                AudioFormat format = audioInput.getFormat();
                long audioFileLength = musicPath.length();
                int frameSize = format.getFrameSize();
                float frameRate = format.getFrameRate();
                float durationInSeconds = (audioFileLength / (frameSize * frameRate));
                
                // Abstract passing of the clip from the AudioSystem and opening to the audio input
                clip = AudioSystem.getClip();
                clip.open(audioInput);

            }

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
