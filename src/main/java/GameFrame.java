import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
//        this.setLocationRelativeTo(null);
        showOnScreen(1, this);
    }

    public static void showOnScreen(int screen, JFrame frame) {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] graphicsDevices = graphicsEnvironment.getScreenDevices();

        graphicsDevices[screen].getDefaultConfiguration().getBounds().getWidth();
        int x = (int) ((graphicsDevices[screen].getDefaultConfiguration().getBounds().getWidth() - frame.getWidth()) / 2);
        int y = (int) ((graphicsDevices[screen].getDefaultConfiguration().getBounds().getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

    }
}
