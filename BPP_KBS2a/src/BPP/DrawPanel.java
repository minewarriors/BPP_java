package BPP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public DrawPanel() {
        this.setPreferredSize(new Dimension(1000, 500));
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);
        g.drawRect(100, 30, 200, 300);
        g.drawRect(300, 30, 200, 300);
        g.drawRect(600, 30, 200, 300);
    }
}
