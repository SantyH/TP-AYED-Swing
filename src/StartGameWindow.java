import javax.swing.*;
import java.awt.*;

/**
 * Created by Lucas on 5/3/2017.
 */
public class StartGameWindow {
    static JFrame frame;
    public static void createStartGameWindow() {
        JFrame startGameFrame = new JFrame("Start Game");
        startGameFrame.setResizable(false);
        startGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        startGameFrame.add(panel);

        JLabel image = new JLabel(new ImageIcon("gta_1.jpg"));
        panel.add(image,BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.setSize(100, 30);
        backButton.setMaximumSize(backButton.getSize());
        backButton.addActionListener(new ALBackButton(true)); //It is true, so it hides the StartGameWindow

        panel.add(backButton,BorderLayout.PAGE_END);

        startGameFrame.setLocationRelativeTo(null);//aligned to the center of the screen
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
