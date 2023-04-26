import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {
    private int x, y, width, height;

    public Bird() {
        this.x = (400);
        this.y = (300);
        this.width = 50;
        this.height = 50;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }
}
