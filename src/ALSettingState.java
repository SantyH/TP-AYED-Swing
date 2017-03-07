import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by santiagohazana on 3/7/17.
 */
public class ALSettingState implements ActionListener {

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
            System.out.println("Sound ON");
        }else{
            System.out.println("Sound OFF");
        }

        if(musicState){
            System.out.println("Music ON");
        }else{
            System.out.println("Music OFF");
        }

        if(shadowsState){
            System.out.println("Shadows ON");
        }else{
            System.out.println("Shadows OFF");
        }

        if(antiAlisingState){
            System.out.println("Anti-alising ON");
        }else{
            System.out.println("Anti-alising OFF");
        }
        System.out.println("");
    }

}
