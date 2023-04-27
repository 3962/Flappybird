import javax.swing.*;
import java.awt.*;

public class FlappyBird {
    public static FlappyBird flappyBird;
    public final int WIDTH = 800, HEIGHT = 600;

    public FlappyBird() {
        JFrame jframe = new JFrame();
        jframe.setSize(WIDTH, HEIGHT);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jframe.setLocation(dim.width / 2 - jframe.getSize().width / 2, dim.height / 2 - jframe.getSize().height / 2);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new instance of the Bird panel and add it to the JFrame
        Bird bird = new Bird();
        jframe.add(bird);
    }

    public static void main(String[] args)
    {
        flappyBird = new FlappyBird();
    }
}
