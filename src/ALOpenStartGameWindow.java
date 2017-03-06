import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lucas on 6/3/2017.
 */
public class ALOpenStartGameWindow implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainMenuWindow.hideWindow();
        StartGameWindow.showWindow();
    }
}
