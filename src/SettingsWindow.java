import javax.swing.*;
import java.awt.*;

/**
 * Created by Lucas on 6/3/2017.
 */
public class SettingsWindow {
    public static JFrame frame;

    public static void createSettingsWindow(){
        JFrame frameSetting = new JFrame("Settings");
        frameSetting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSettings = new JPanel();
        panelSettings.setLayout(new BoxLayout(panelSettings, BoxLayout.PAGE_AXIS));
        frameSetting.add(panelSettings);

        JLabel textSettings = new JLabel("Settings");
        textSettings.setAlignmentX(Component.CENTER_ALIGNMENT);
        textSettings.setAlignmentY(Component.TOP_ALIGNMENT);
        panelSettings.add(textSettings);
*/
        /**
         * Panel de sonido
         */

        JPanel panelSettingsSound = new JPanel();
        panelSettingsSound.setLayout(new FlowLayout());
        panelSettings.add(panelSettingsSound);

        /**
         *  Botones de sonido
         */

        JLabel textSound = new JLabel("Sound: ");
        panelSettingsSound.add(textSound);

        ButtonGroup soundButtonGroup = new ButtonGroup();

        JRadioButton onSoundButton = new JRadioButton("ON",true);
        soundButtonGroup.add(onSoundButton);

        JRadioButton offSoundButton = new JRadioButton("OFF");
        soundButtonGroup.add(offSoundButton);

        panelSettingsSound.add(onSoundButton);
        panelSettingsSound.add(offSoundButton);
        panelSettingsSound.setLayout(new BoxLayout(panelSettingsSound,BoxLayout.LINE_AXIS));

        /**
         * Panel de musica
         */

        JPanel panelSettingsMusic = new JPanel();
        panelSettingsMusic.setLayout(new FlowLayout());
        panelSettings.add(panelSettingsMusic);

        /**
         * Botones de musica
         */
        ButtonGroup musicButtonGroup = new ButtonGroup();

        JRadioButton onMusicButton = new JRadioButton("ON");
        musicButtonGroup.add(onMusicButton);

        JRadioButton offMusicButton = new JRadioButton("OFF", true);
        musicButtonGroup.add(offMusicButton);

        panelSettingsMusic.add(onMusicButton);
        panelSettingsMusic.add(offMusicButton);



        JButton backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.addActionListener(new ALBackButton(false));//Como es false, oculta la SettingsWindow
        panelSettings.add(backButton);

        frameSetting.setLocationRelativeTo(null);//centrado en pantalla
        frameSetting.setVisible(false);//no visible
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
