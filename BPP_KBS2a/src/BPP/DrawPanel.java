package BPP;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public DrawPanel() {
        this.setPreferredSize(new Dimension(1000, 500));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
