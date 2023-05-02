import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Bird extends JPanel implements KeyListener, ActionListener {
    private int G, x, y, width, height;
    private Timer timer;

    public Bird() {
        G = 1;
        this.x = 400 - 25;
        this.y = 300 - 25;
        this.width = 50;
        this.height = 50;
        setBackground(Color.BLACK);
        setFocusable(true);

        setDoubleBuffered(true);

        timer = new Timer(10,this);
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // Move the bird downwards by G pixel every time the timer fires and add 1 to G
        y += G;
        G += 1;
        if(G > 20){
            G = 20;
        }

        if(y + height >= getParent().getHeight()){
            timer.stop();
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            G = -15;
            repaint();
            timer.start();
        }
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}

}
