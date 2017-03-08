import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by santiagohazana on 3/7/17.
 */
public class Controller {
}

/**
 * Settings window listener class that hides the windows when the back button is pressed
 */

class ALOpenSettingsWindow implements ActionListener {
    private boolean frameAvalible=false;

    @Override
    public void actionPerformed(ActionEvent e) {
        SettingsWindow.showWindow();
        MainMenuWindow.hideWindow();
    }
}

/**
 * Action listener that uses the exit button to exit the application
 */

class ALExitButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

/**
 * Back button action listener for all back buttons
 */

class ALBackButton implements ActionListener{
    /** If it is true, hides the "StartGame" window.
     * "If it is false, hides the "Settings" window.
     */
    private boolean toCloseWindow;

    public ALBackButton(boolean toCloseWindow){
        this.toCloseWindow=toCloseWindow;
    }

    /**
     * Goes back to main windows and closes the actual window.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(toCloseWindow){
            StartGameWindow.hideWindow();
        }else {
            SettingsWindow.hideWindow();
        }
        MainMenuWindow.showWindow();
    }
}

/**
 * Action listener for the start game button, opens the start game window
 */

class ALOpenStartGameWindow implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainMenuWindow.hideWindow();
        StartGameWindow.showWindow();
    }
}

/**
 * Class that checks and prints the state of the settins buttons if any is pressed, all works with an action listener
 */

class ALSettingState implements ActionListener {

    boolean soundState = true;
    boolean musicState = false;
    boolean shadowsState = false;
    boolean antiAlisingState = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        changeState(e.getActionCommand());
        printState();
    }
    // This method changes the state of booleans from the buttons, on of off.
    void changeState(String button){
        if(button == "0"){
            soundState = !soundState;
        }else if(button == "1"){
            musicState = !musicState;
        }else if(button == "2"){
            shadowsState = !shadowsState;
        }else if(button == "3"){
            antiAlisingState = !antiAlisingState;
        }
    }

    //This method prints the state of all the buttons any time a button is pressed
    void printState(){
        if(soundState){
            System.out.println("Sound: On");
        }else{
            System.out.println("Sound: Off");
        }

        if(musicState){
            System.out.println("Music: On");
        }else{
            System.out.println("Music: Off");
        }

        if(shadowsState){
            System.out.println("Shadows: On");
        }else{
            System.out.println("Shadows: Off");
        }

        if(antiAlisingState){
            System.out.println("Anti-alising: On");
        }else{
            System.out.println("Anti-alising: Off");
        }
        System.out.println("-----------------");
    }

}