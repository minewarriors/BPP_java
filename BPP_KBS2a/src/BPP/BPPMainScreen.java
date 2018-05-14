package BPP;

import java.awt.BorderLayout;
import javax.swing.Box;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class BPPMainScreen extends JFrame implements ActionListener {

    private String[] Algorithms = {"Best-fit Decreasing", "Bin Completion", "First Fit", "Own Method"};

    private JLabel jlXML;
    private JButton jbUploadXML;
    private JLabel jlNumberTimes;
    private JTextField jtfNumber;
    private JButton jbStart;
    private JLabel jlAlgorithm;
    private JButton jbStop;
    private JLabel jlAddProduct;
    private JTextField jtfSize;
    private JButton jbAddProduct;
    private JButton jbAddRandom;

    private final JFileChooser fc;

    public BPPMainScreen() {

        setTitle("BPP");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fc = new JFileChooser();

        DrawPanel dp = new DrawPanel();
        add(dp);

        JPanel ThePanel = new JPanel();
        ThePanel.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        Box left1 = Box.createHorizontalBox();
        Box left2 = Box.createHorizontalBox();
        Box left3 = Box.createHorizontalBox();
        Box right1 = Box.createHorizontalBox();
        Box right2 = Box.createHorizontalBox();
        Box right3 = Box.createHorizontalBox();

        jlXML = new JLabel("Upload XML file:");
        left1.add(jlXML);
        left1.add(Box.createHorizontalStrut(30));
        jbUploadXML = new JButton("Choose file");
        jbUploadXML.addActionListener(this);
        left1.add(jbUploadXML);

        jlNumberTimes = new JLabel("Number of times:");
        right1.add(jlNumberTimes);
        right1.add(Box.createHorizontalStrut(30));
        jtfNumber = new JTextField(5);
        right1.add(jtfNumber);

        jbStart = new JButton("Start");
        jbStart.addActionListener(this);
        right2.add(jbStart);

        left2.add(Box.createHorizontalStrut(30));
        jlAlgorithm = new JLabel("BPP Algorithm:");
        left2.add(jlAlgorithm);
        left2.add(Box.createHorizontalStrut(30));
        JComboBox AlgorithmList = new JComboBox(Algorithms);
        AlgorithmList.setSelectedIndex(3);
        AlgorithmList.addActionListener(this);
        left2.add(AlgorithmList);

        jbStop = new JButton("Stop");
        jbStop.addActionListener(this);
        right3.add(jbStop);

        left3.add(Box.createHorizontalStrut(30));
        jlAddProduct = new JLabel("Add product:");
        left3.add(jlAddProduct);
        left3.add(Box.createHorizontalStrut(30));
        jtfSize = new JTextField(5);
        left3.add(jtfSize);
        left3.add(Box.createHorizontalStrut(30));
        jbAddProduct = new JButton("Add");
        jbAddProduct.addActionListener(this);
        left3.add(jbAddProduct);
        left3.add(Box.createHorizontalStrut(30));
        jbAddRandom = new JButton("Add random");
        jbAddRandom.addActionListener(this);
        left3.add(jbAddRandom);

        Box leftComplete = Box.createVerticalBox();
        leftComplete.add(left1);
        leftComplete.add(Box.createVerticalStrut(30));
        leftComplete.add(left2);
        leftComplete.add(Box.createVerticalStrut(30));
        leftComplete.add(left3);
        panel1.add(leftComplete);

        Box rightComplete = Box.createVerticalBox();
        rightComplete.add(right1);
        rightComplete.add(Box.createVerticalStrut(30));
        rightComplete.add(right2);
        rightComplete.add(Box.createVerticalStrut(30));
        rightComplete.add(right3);
        panel2.add(rightComplete);

        ThePanel.add(panel1, BorderLayout.WEST);
        ThePanel.add(panel2, BorderLayout.EAST);
        add(ThePanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbUploadXML) {
            try {
                File xmlFile;
                int returnVal = fc.showOpenDialog(BPPMainScreen.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    xmlFile = new File(file.getAbsolutePath());

                    // loading XML file
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    org.w3c.dom.Document doc = dBuilder.parse(xmlFile);

                    // List elements with "package" tag || Remember a Node is an element
                    NodeList nList = doc.getElementsByTagName("package");

                    System.out.println("----------------------------");

                    // go through NodeList
                    for (int temp = 0; temp < nList.getLength(); temp++) {

                        Node nNode = nList.item(temp);

                        System.out.println("\nCurrent Element :" + nNode.getNodeName());
                        // if NodeType is the same as ElementNode
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;

                            System.out.println("package id : " + eElement.getAttribute("id"));
                            System.out.println("Size : " + eElement.getElementsByTagName("size").item(0).getTextContent());
                            System.out.println("Colour : " + eElement.getElementsByTagName("colour").item(0).getTextContent());
                            System.out.println("Number : " + eElement.getElementsByTagName("number").item(0).getTextContent());

                        }
                    }
                } else {
                    System.out.println("Open command cancelled by user." + "\n");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        repaint();
    }
}
