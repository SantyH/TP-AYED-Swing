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
        panel.setLayout(new BorderLayout());
        startGameFrame.add(panel);

        JLabel image = new JLabel(new ImageIcon("gta_1.jpg"));
        panel.add(image,BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ALBackButton(true)); //Como es True, oculta la ventana StartGameWindow

        panel.add(backButton,BorderLayout.PAGE_END);

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
