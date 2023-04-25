import javax.swing.JFrame;
import java.awt.*;

public class FlappyBird
{
    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;

    public FlappyBird()
    {
        JFrame jframe = new JFrame();

        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().setBackground(Color.BLACK);

    }

    public static void main (String[] args)
    {
        flappyBird = new FlappyBird();
    }
}
