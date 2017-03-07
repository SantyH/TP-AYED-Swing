import javax.swing.*;
import java.awt.*;

/**
 * Created by Lucas on 4/3/2017.
 */
public class MainMenuWindow{
    static JFrame frame;

    public static void createMainWindow() {
        JFrame frameMainMenu = new JFrame("Main Menu");
        frameMainMenu.setResizable(false);
        frameMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        frameMainMenu.add(panel);


        JLabel text = new JLabel("Trabajo Practico Swing");
        text.setAlignmentX(Component.CENTER_ALIGNMENT);
        text.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.add(text);

        JLabel textMembers = new JLabel("Lucas Manzanelli, Santiago Hazaña");
        textMembers.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(textMembers);


        JButton startGameButton = new JButton("Start Game");
        startGameButton.setSize(100, 30);
        startGameButton.setMaximumSize(startGameButton.getSize());
        startGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startGameButton.addActionListener(new ALOpenStartGameWindow());
        panel.add(startGameButton);


        JButton settingsButton = new JButton("Settings");
        settingsButton.setSize(100, 30);
        settingsButton.setMaximumSize(settingsButton.getSize());
        settingsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        settingsButton.addActionListener(new ALOpenSettingsWindow());
        panel.add(settingsButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setSize(100, 30);
        exitButton.setMaximumSize(exitButton.getSize());
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.addActionListener(new ALExitButton());
        panel.add(exitButton);


        frameMainMenu.setLocationRelativeTo(null);//aligned to the center of the screen
        frameMainMenu.setVisible(true);//visible
        frameMainMenu.pack();
        frameMainMenu.setSize(250, 150);

        frame=frameMainMenu;
    }

    public static void hideWindow(){
        frame.setVisible(false);
    }

    public static void showWindow(){
        frame.setVisible(true);
    }
}
