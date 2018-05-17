package BPP;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private Order order;

    public DrawPanel() {
        this.order = null;
        this.setPreferredSize(new Dimension(1080, 600));
        setBackground(Color.WHITE);
    }

    public void setOrder(Order order) {
        this.order = order;
        repaint();
    }

    public void drawBigProduct(Graphics g, int id) {
        if (id > 0) {
            int x = 0;
            if (id == 1) {
                x = 12;
            }
            if (id == 2) {
                x = 224;
            }
            if (id == 3) {
                x = 436;
            }
            if (id == 4) {
                x = 648;
            }
            if (id == 5) {
                x = 860;
            }
            g.fillRect(x, 30, 200, 200);
        }
    }

    public void drawMediumProduct(Graphics g, int id) {
        if (id > 0) {
            int x = 0;
            if (id == 1) {
                x = 12;
            }
            if (id == 2) {
                x = 224;
            }
            if (id == 3) {
                x = 436;
            }
            if (id == 4) {
                x = 648;
            }
            if (id == 5) {
                x = 860;
            }
            g.fillRect(x, 30, 200, 150);
        }
    }

    public void drawSmallProduct(Graphics g, int id) {
        if (id > 0) {
            int x = 0;
            if (id == 1) {
                x = 12;
            }
            if (id == 2) {
                x = 224;
            }
            if (id == 3) {
                x = 436;
            }
            if (id == 4) {
                x = 648;
            }
            if (id == 5) {
                x = 860;
            }
            g.fillRect(x, 30, 200, 100);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (order != null) {
            ArrayList<Product> orderList = order.getOrderPackages();

            for (Product p : orderList) {
                int id = p.getProductId();

                g.setColor(p.getColor());
                if (p.getSize() == 40) {
                    drawBigProduct(g, id);
                }
                if (p.getSize() == 30) {
                    drawMediumProduct(g, id);
                }
                if (p.getSize() == 20) {
                    drawSmallProduct(g, id);
                }
            }
        }

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));

        //box 1
        g2.setColor(Color.black);
        g2.drawLine(135, 250, 135, 550);
        g2.drawLine(345, 552, 135, 552);
        g2.drawLine(345, 250, 345, 550);

        //box 2
        g2.drawLine(435, 250, 435, 550);
        g2.drawLine(645, 552, 435, 552);
        g2.drawLine(645, 250, 645, 550);

        //box 3
        g2.drawLine(735, 250, 735, 550);
        g2.drawLine(945, 552, 735, 552);
        g2.drawLine(945, 250, 945, 550);

        g.setColor(Color.red);

        //pakketten in rij
//        g.fillRect(12, 30, 200, 200);
//        g.fillRect(224, 30, 200, 150);
//        g.fillRect(436, 30, 200, 100);
//        g.fillRect(648, 30, 200, 200);
//        g.fillRect(860, 30, 200, 100);
        //groot pakket
        g.fillRect(140, 350, 200, 200);

        //middel pakket
        g.fillRect(440, 400, 200, 150);

        //klein pakket
        g.fillRect(740, 450, 200, 100);

        g.setColor(Color.yellow);
        g.fillRect(140, 250, 200, 100);
    }
}
