import javax.swing.*;
import java.awt.*;

/**
 * Created by Lucas on 5/3/2017.
 */
public class StartGameWindow {
    static JFrame frame;
    public static void createStartGameWindow() {
        JFrame startGameFrame = new JFrame("Start Game");
        startGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        startGameFrame.add(panel);

        JLabel image = new JLabel();
        panel.add(image);

        JButton backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.addActionListener(new ALBackButton(true)); //Como es True, oculta la ventana StartGameWindow
        panel.add(backButton);

        startGameFrame.setLocationRelativeTo(null);//centrado en pantalla
        startGameFrame.setVisible(false);//visible
        startGameFrame.pack();

        frame=startGameFrame;
    }

    public static void hideWindow(){
        frame.setVisible(false);
    }

    public static void showWindow(){
        frame.setVisible(true);
    }
}
