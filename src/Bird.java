import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Bird extends JPanel {
    private int x, y, width, height;

    public Bird() {
        this.x = 400 - 25;
        this.y = 300 - 25;
        this.width = 50;
        this.height = 50;
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            y += 20;
            repaint();
        }
    }
    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyReleased(KeyEvent e){

    }

}
