package BPP;

import static BPP.BPPInterface.boxSize;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private Order order;
    private Box a;
    private Box b;
    private Box c;

    public DrawPanel(Box boxA, Box boxB, Box boxC) {
        this.a = boxA;
        this.b = boxB;
        this.c = boxC;
        this.order = null;
        this.setPreferredSize(new Dimension(1080, 600));
        setBackground(Color.WHITE);
    }

    public void setOrder(Order order) {
        this.order = order;
        repaint();
    }

    //volgende methodes zorgen ervoor dat pakketten in een rij worden getekent op volgorde van id
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

    public void drawBoxBigProduct(Graphics g, int id) {
        if (id > 0) {
            int y = 0;
            if (boxSize - a.getFreeSpace() == 60) {
                y = 350;
            }
            if (boxSize - a.getFreeSpace() == 40) {
                y = 250;
            }
            if (boxSize - a.getFreeSpace() == 30) {
                y = 200;
            }
            if (boxSize - a.getFreeSpace() == 20) {
                y = 150;
            }
            g.fillRect(140, y, 200, 200);
        }
    }

    public void drawBoxMediumProduct(Graphics g, int id) {
        if (id > 0) {
            int y = 0;
            if (boxSize - a.getFreeSpace() == 60) {
                y = 450;
            }
            if (boxSize - a.getFreeSpace() == 40) {
                y = 350;
            }
            if (boxSize - a.getFreeSpace() == 30) {
                y = 300;
            }
            if (boxSize - a.getFreeSpace() == 20) {
                y = 250;
            }
            g.fillRect(440, y, 200, 150);
        }
    }

    public void drawBoxASmallProduct(Graphics g, int id) {
        if (id > 0) {
            int y = 0;
            if (boxSize - a.getFreeSpace() == 60) {
                y = 450;
            }
            if (boxSize - a.getFreeSpace() == 40) {
                y = 350;
            }
            if (boxSize - a.getFreeSpace() == 30) {
                y = 300;
            }
            if (boxSize - a.getFreeSpace() == 20) {
                y = 250;
            }
            g.fillRect(140, y, 200, 100);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (order != null) {
            ArrayList<Product> orderList = order.getOrderPackages();

            //kijken welke methode aangeroepen moet worden op grootte
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

        if (a != null) {
            a.getProductBoxArray().forEach((a) -> {
                int id = a.getProductId();

                g.setColor(a.getColor());
                if (a.getSize() == 40) {
                    if (id > 0) {
                        int y = 0;
                        if (boxSize - this.a.getFreeSpace() == 60) {
                            y = 350;
                        }
                        if (boxSize - this.a.getFreeSpace() == 40) {
                            y = 250;
                        }
                        g.fillRect(140, y, 200, 200);
                    }
                    if (a.getSize() == 30) {
                        if (id > 0) {
                            int y = 0;
                            if (boxSize - this.a.getFreeSpace() == 60) {
                                y = 400;
                            }
                            if (boxSize - this.a.getFreeSpace() == 40) {
                                y = 300;
                            }
                            if (boxSize - this.a.getFreeSpace() == 30) {
                                y = 250;
                            }
                            g.fillRect(140, y, 200, 150);
                        }
                        if (a.getSize() == 20) {
                            if (id > 0) {
                                int y = 0;
                                if (boxSize - this.a.getFreeSpace() == 60) {
                                    y = 450;
                                }
                                if (boxSize - this.a.getFreeSpace() == 40) {
                                    y = 350;
                                }
                                if (boxSize - this.a.getFreeSpace() == 30) {
                                    y = 300;
                                }
                                if (boxSize - this.a.getFreeSpace() == 20) {
                                    y = 250;
                                }
                                g.fillRect(140, y, 200, 100);
                            }
                        }
                    }
                }
            });
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

        //groot pakket
        //g.fillRect(140, 350, 200, 200);
        //middel pakket
        // g.fillRect(440, 400, 200, 150);
        //klein pakket
        // g.fillRect(740, 450, 200, 100);
//        g.fillRect(140, 350, 200, 100);
//
//        g.setColor(Color.yellow);
        //g.fillRect(140, 250, 200, 200);
    }
}
