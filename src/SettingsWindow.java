import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Lucas on 6/3/2017.
 */
public class SettingsWindow {
    public static JFrame frame;

    public static void createSettingsWindow(){

        ActionListener ac = new ALSettingState();

        JFrame frameSetting = new JFrame("Settings");
        frameSetting.setResizable(false);
        frameSetting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSettings = new JPanel();
        panelSettings.setLayout(new BoxLayout(panelSettings, BoxLayout.PAGE_AXIS));
        frameSetting.add(panelSettings);

        JLabel textSettings = new JLabel("Settings");
        textSettings.setAlignmentX(Component.CENTER_ALIGNMENT);
        textSettings.setAlignmentY(Component.TOP_ALIGNMENT);
        panelSettings.add(textSettings);

        /**
         * Sound panel.
         */

        JPanel panelSettingsSound = new JPanel();
        panelSettingsSound.setLayout(new FlowLayout());
        panelSettings.add(panelSettingsSound);

        /**
         *  Sound buttons
         */

        JLabel textSound = new JLabel("Sound: ");
        panelSettingsSound.add(textSound);

        ButtonGroup soundButtonGroup = new ButtonGroup();

        JRadioButton onSoundButton = new JRadioButton("ON",true);
        onSoundButton.setActionCommand("0"); // int = 0 identifies the sound button
        onSoundButton.addActionListener(ac);
        soundButtonGroup.add(onSoundButton);

        JRadioButton offSoundButton = new JRadioButton("OFF");
        offSoundButton.setActionCommand("0"); // int = 0 identifies the sound button
        offSoundButton.addActionListener(ac);
        soundButtonGroup.add(offSoundButton);

        panelSettingsSound.add(onSoundButton);
        panelSettingsSound.add(offSoundButton);


        /**
         * Music panel
         */

        JPanel panelSettingsMusic = new JPanel();
        panelSettingsMusic.setLayout(new FlowLayout());
        panelSettings.add(panelSettingsMusic);

        /**
         * Music buttons.
         */

        JLabel musicText = new JLabel("Music: ");
        panelSettingsMusic.add(musicText);

        ButtonGroup musicButtonGroup = new ButtonGroup();

        JRadioButton onMusicButton = new JRadioButton("ON");
        onMusicButton.setActionCommand("1"); // int = 1 identifies the sound button
        onMusicButton.addActionListener(ac);
        musicButtonGroup.add(onMusicButton);

        JRadioButton offMusicButton = new JRadioButton("OFF", true);
        offMusicButton.setActionCommand("1"); // int = 1 identifies the sound button
        offMusicButton.addActionListener(ac);
        musicButtonGroup.add(offMusicButton);

        panelSettingsMusic.add(onMusicButton);
        panelSettingsMusic.add(offMusicButton);

        /**
         * Graphics panel
         */

        JPanel panelSettingsGraphics = new JPanel(new BorderLayout());
        panelSettings.add(panelSettingsGraphics);

        JLabel textGraphic = new JLabel("Graphics: ");
        panelSettingsGraphics.add(textGraphic,BorderLayout.PAGE_START);
        textGraphic.setAlignmentX(Component.LEFT_ALIGNMENT);

        /**
         * Graphics buttons.
         */

        JCheckBox shadowsCheckBox = new JCheckBox("Shadows");
        shadowsCheckBox.setActionCommand("2"); // int = 2 identifies the sound button
        shadowsCheckBox.addActionListener(ac);
        panelSettingsGraphics.add(shadowsCheckBox,BorderLayout.LINE_START);

        JCheckBox antiAlisingCheckBox = new JCheckBox("Anti-Alising");
        antiAlisingCheckBox.setActionCommand("3"); // int = 3 identifies the sound button
        antiAlisingCheckBox.addActionListener(ac);
        panelSettingsGraphics.add(antiAlisingCheckBox,BorderLayout.LINE_END);

        /**
         * Back Button.
         */

        JButton backButton = new JButton("Back");
        backButton.setSize(100, 30);
        backButton.setMaximumSize(backButton.getSize());
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.addActionListener(new ALBackButton(false));//It is false, so it hides the SettingsWindow
        panelSettings.add(backButton);

        frameSetting.setLocationRelativeTo(null);//aligned to the center of the screen
        frameSetting.setVisible(false);//not visible
        frameSetting.pack();

        frame=frameSetting;
    }

    public static void hideWindow(){
        frame.setVisible(false);
    }

    public static void showWindow(){
        frame.setVisible(true);
    }
}
