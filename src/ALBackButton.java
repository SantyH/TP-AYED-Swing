import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lucas on 6/3/2017.
 */
public class ALBackButton implements ActionListener{
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
