import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lucas on 6/3/2017.
 */
public class ALBackButton implements ActionListener{
    /** Si es true, oculta la ventana "StartGame".
     * "Si es false, oculta la ventana "Settings".
     */
    private boolean toCloseWindow;

    public ALBackButton(boolean toCloseWindow){
        this.toCloseWindow=toCloseWindow;
    }

    /**
     * Vuelve a la ventana principal y cierra la actual.
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
