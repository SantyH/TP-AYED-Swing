import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lucas on 6/3/2017.
 */
public class ALOpenSettingsWindow implements ActionListener {
    private boolean frameAvalible=false;

    @Override
    public void actionPerformed(ActionEvent e) {
        SettingsWindow.showWindow();
        MainMenuWindow.hideWindow();
    }
}
