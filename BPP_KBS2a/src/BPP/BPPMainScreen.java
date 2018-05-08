package BPP;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BPPMainScreen extends JFrame implements ActionListener {

    private Product product;

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

    public BPPMainScreen(Product product) {
        this.product = product;

        setTitle("BPP");
        setSize(1000, 800);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlXML = new JLabel("Upload XML file:");
        add(jlXML);
        jbUploadXML = new JButton("Choose file");
        jbUploadXML.addActionListener(this);
        add(jbUploadXML);

        jlNumberTimes = new JLabel("Number of times:");
        add(jlNumberTimes);
        jtfNumber = new JTextField(2);
        add(jtfNumber);

        jbStart = new JButton("Start");
        jbStart.addActionListener(this);
        add(jbStart);

        jlAlgorithm = new JLabel("BPP Algorithm:");
        add(jlAlgorithm);
        JComboBox AlgorithmList = new JComboBox(Algorithms);
        AlgorithmList.setSelectedIndex(3);
        AlgorithmList.addActionListener(this);
        add(AlgorithmList);

        jbStop = new JButton("Stop");
        jbStop.addActionListener(this);
        add(jbStop);

        jlAddProduct = new JLabel("Add product:");
        add(jlAddProduct);
        jtfSize = new JTextField(1);
        add(jtfSize);
        jbAddProduct = new JButton("Add");
        jbAddProduct.addActionListener(this);
        add(jbAddProduct);
        jbAddRandom = new JButton("Add random");
        jbAddRandom.addActionListener(this);
        add(jbAddRandom);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }

}
