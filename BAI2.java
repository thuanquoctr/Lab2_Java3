/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class BAI2 extends JFrame implements ActionListener {

    private long so = 0;
    private String pheptoan = "";
    private JLabel name;
    private JTextField text;
    private JButton so0;
    private JButton so1;
    private JButton so2;
    private JButton so3;
    private JButton so4;
    private JButton so5;
    private JButton so6;
    private JButton so7;
    private JButton so8;
    private JButton so9;
    private JButton cong;
    private JButton tru;
    private JButton nhan;
    private JButton chia;
    private JButton bang;
    private JButton amduong;
    private JButton c_reset;
    private JButton sqrt;
    private JButton phantram;
    private JButton motchiax;
    private JPanel p1;
    private JPanel p2;
    private JButton bgr;
    private boolean b = true;

    public BAI2() {
        this.setTitle("Calculator");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name = new JLabel("Casio", JLabel.CENTER);
        name.setFont(new Font("Serif", Font.BOLD, 30));
        name.setForeground(Color.magenta);
        text = new JTextField("0", JTextField.RIGHT);
        text.setPreferredSize(new Dimension(40, 40));
        text.setFont(new Font("Serif", Font.BOLD, 20));       
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        so0 = new JButton("0");
        so0.setFont(new Font("Serif", Font.BOLD, 20));
        so0.setBackground(Color.white);
        so1 = new JButton("1");
        so1.setFont(new Font("Serif", Font.BOLD, 20));
        so1.setBackground(Color.white);
        so2 = new JButton("2");
        so2.setFont(new Font("Serif", Font.BOLD, 20));
        so2.setBackground(Color.white);
        so3 = new JButton("3");
        so3.setFont(new Font("Serif", Font.BOLD, 20));
        so3.setBackground(Color.white);
        so4 = new JButton("4");
        so4.setFont(new Font("Serif", Font.BOLD, 20));
        so4.setBackground(Color.white);
        so5 = new JButton("5");
        so5.setFont(new Font("Serif", Font.BOLD, 20));
        so5.setBackground(Color.white);
        so6 = new JButton("6");
        so6.setFont(new Font("Serif", Font.BOLD, 20));
        so6.setBackground(Color.white);
        so7 = new JButton("7");
        so7.setFont(new Font("Serif", Font.BOLD, 20));
        so7.setBackground(Color.white);
        so8 = new JButton("8");
        so8.setFont(new Font("Serif", Font.BOLD, 20));
        so8.setBackground(Color.white);
        so9 = new JButton("9");
        so9.setFont(new Font("Serif", Font.BOLD, 20));
        so9.setBackground(Color.white);
        cong = new JButton("+");
        cong.setFont(new Font("Serif", Font.BOLD, 20));
        cong.setBackground(Color.orange);
        tru = new JButton("-");
        tru.setFont(new Font("Serif", Font.BOLD, 20));
        tru.setBackground(Color.orange);
        nhan = new JButton("*");
        nhan.setFont(new Font("Serif", Font.BOLD, 20));
        nhan.setBackground(Color.orange);
        chia = new JButton("/");
        chia.setFont(new Font("Serif", Font.BOLD, 20));
        chia.setBackground(Color.orange);
        bang = new JButton("=");
        bang.setFont(new Font("Serif", Font.BOLD, 20));
        bang.setBackground(Color.CYAN);
        amduong = new JButton("+/-");
        amduong.setFont(new Font("Serif", Font.BOLD, 20));
        amduong.setBackground(Color.LIGHT_GRAY);
        c_reset = new JButton("C");
        c_reset.setFont(new Font("Serif", Font.BOLD, 20));
        c_reset.setBackground(Color.red);
        sqrt = new JButton("sqrt");
        sqrt.setFont(new Font("Serif", Font.BOLD, 20));
        sqrt.setBackground(Color.LIGHT_GRAY);
        phantram = new JButton("%");
        phantram.setFont(new Font("Serif", Font.BOLD, 20));
        phantram.setBackground(Color.LIGHT_GRAY);
        motchiax = new JButton("1/x");
        motchiax.setFont(new Font("Serif", Font.BOLD, 20));
        motchiax.setBackground(Color.LIGHT_GRAY);

        bgr = new JButton("Đổi màu nền");
        bgr.setFont(new Font("Serif", Font.BOLD, 20));
        bgr.setBackground(Color.LIGHT_GRAY);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1));
        p1.add(name);
        p1.add(text);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 5, 4, 4));
        p2.add(so1);
        p2.add(so2);
        p2.add(so3);
        p2.add(chia);
        p2.add(sqrt);
        p2.add(so4);
        p2.add(so5);
        p2.add(so6);
        p2.add(nhan);
        p2.add(phantram);
        p2.add(so7);
        p2.add(so8);
        p2.add(so9);
        p2.add(tru);
        p2.add(motchiax);
        p2.add(so0);
        p2.add(amduong);
        p2.add(c_reset);
        p2.add(cong);
        p2.add(bang);
        so0.addActionListener(this);
        so1.addActionListener(this);
        so2.addActionListener(this);
        so3.addActionListener(this);
        so4.addActionListener(this);
        so5.addActionListener(this);
        so6.addActionListener(this);
        so7.addActionListener(this);
        so8.addActionListener(this);
        so9.addActionListener(this);
        cong.addActionListener(this);
        tru.addActionListener(this);
        nhan.addActionListener(this);
        chia.addActionListener(this);
        bang.addActionListener(this);
        amduong.addActionListener(this);
        c_reset.addActionListener(this);
        sqrt.addActionListener(this);
        phantram.addActionListener(this);
        motchiax.addActionListener(this);
        bgr.addActionListener(this);

        this.setLayout(new BorderLayout(5, 5));
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        this.add(bgr, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        switch (click) {
            case "0":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "0");
                    text.setText(String.valueOf(so));
                }
                break;
            case "1":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "1");
                    text.setText(String.valueOf(so));
                }
                break;
            case "2":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "2");
                    text.setText(String.valueOf(so));
                }
                break;
            case "3":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "3");
                    text.setText(String.valueOf(so));
                }
                break;
            case "4":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "4");
                    text.setText(String.valueOf(so));
                }
                break;
            case "5":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "5");
                    text.setText(String.valueOf(so));
                }
                break;
            case "6":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "6");
                    text.setText(String.valueOf(so));
                }
                break;
            case "7":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "7");
                    text.setText(String.valueOf(so));
                }
                break;
            case "8":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "8");
                    text.setText(String.valueOf(so));
                }
                break;
            case "9":
                if (text.getText().length() < 12) {
                    if (text.getText().equals("0")) {
                        text.setText("");
                    }
                    long so = Long.parseLong(text.getText() + "9");
                    text.setText(String.valueOf(so));
                }
                break;
            case "+":
                so = Long.parseLong(text.getText());
                pheptoan = "+";
                text.setText("0");
                break;
            case "-":
                so = Long.parseLong(text.getText());
                pheptoan = "-";
                text.setText("0");
                break;
            case "*":
                so = Long.parseLong(text.getText());
                pheptoan = "*";
                text.setText("0");
                break;
            case "/":
                so = Long.parseLong(text.getText());
                pheptoan = "/";
                text.setText("0");
                break;
            case "+/-": {
                double gt = Double.parseDouble(text.getText());
                if (gt < 0) {
                    gt *= -1;
                    text.setText(String.valueOf(gt));
                } else {
                    gt *= -1;
                    text.setText(String.valueOf(gt));
                }
            }
            break;
            case "C":
                so = 0;
                pheptoan = "";
                text.setText("0");
                break;
            case "sqrt":
                if (pheptoan.equals("")) {
                    long ketqua = 0;
                    ketqua = (long) Math.sqrt(Long.parseLong(text.getText()));
                    text.setText(ketqua + "");
                } else {
                    JOptionPane.showMessageDialog(this, "Thao tác không đúng !");
                }
                break;
            case "%": {
                double ketquaphantram = 0;
                ketquaphantram = Double.parseDouble(text.getText()) / 100;
                text.setText(String.valueOf(ketquaphantram));
            }
            break;
            case "1/x": {
                double gt = 1 / Double.parseDouble(text.getText());
                text.setText(String.valueOf(gt));
            }

            break;
            case "=":
                switch (pheptoan) {
                    case "+": {
                        double ketqua = 0;
                        double so_1 = Double.parseDouble(text.getText());
                        ketqua = so + so_1;
                        text.setText(ketqua + "");
                        break;
                    }
                    case "-": {
                        double ketqua = 0;
                        double so_1 = Double.parseDouble(text.getText());
                        ketqua = so - so_1;
                        text.setText(ketqua + "");
                        break;
                    }
                    case "*": {
                        double ketqua = 0;
                        double so_1 = Double.parseDouble(text.getText());
                        ketqua = so * so_1;
                        text.setText(ketqua + "");
                        break;
                    }

                    case "/": {
                        double ketqua = 0;
                        double so_1 = Double.parseDouble(text.getText());
                        ketqua = so / so_1;
                        text.setText(ketqua + "");
                        break;
                    }

                    default:
                        break;
                }
                break;
            case "Đổi màu nền": {

                if (b == true) {
                    this.getContentPane().setBackground(Color.black);
                    so0.setBackground(Color.black);
                    so0.setForeground(Color.white);
                    so1.setBackground(Color.black);
                    so1.setForeground(Color.white);
                    so2.setBackground(Color.black);
                    so2.setForeground(Color.white);
                    so3.setBackground(Color.black);
                    so3.setForeground(Color.white);
                    so4.setBackground(Color.black);
                    so4.setForeground(Color.white);
                    so5.setBackground(Color.black);
                    so5.setForeground(Color.white);
                    so6.setBackground(Color.black);
                    so6.setForeground(Color.white);
                    so7.setBackground(Color.black);
                    so7.setForeground(Color.white);
                    so8.setBackground(Color.black);
                    so8.setForeground(Color.white);
                    so9.setBackground(Color.black);
                    so9.setForeground(Color.white);
                    cong.setBackground(Color.black);
                    cong.setForeground(Color.white);
                    tru.setBackground(Color.black);
                    tru.setForeground(Color.white);
                    nhan.setBackground(Color.black);
                    nhan.setForeground(Color.white);
                    chia.setBackground(Color.black);
                    chia.setForeground(Color.white);
                    sqrt.setBackground(Color.black);
                    sqrt.setForeground(Color.white);
                    motchiax.setBackground(Color.black);
                    motchiax.setForeground(Color.white);
                    phantram.setBackground(Color.black);
                    phantram.setForeground(Color.white);
                    amduong.setBackground(Color.black);
                    amduong.setForeground(Color.white);
                    bgr.setBackground(Color.black);
                    bgr.setForeground(Color.white);
                    bang.setBackground(Color.gray);
                    bang.setForeground(Color.white);
                    c_reset.setBackground(Color.gray);
                    c_reset.setForeground(Color.white);
                    text.setBackground(Color.black);
                    text.setForeground(Color.white);                  

                    b = false;
                } else {
                    this.getContentPane().setBackground(Color.white);

                    so0.setBackground(Color.white);
                    so0.setForeground(Color.black);
                    so1.setBackground(Color.white);
                    so1.setForeground(Color.black);
                    so2.setBackground(Color.white);
                    so2.setForeground(Color.black);
                    so3.setBackground(Color.white);
                    so3.setForeground(Color.black);
                    so4.setBackground(Color.white);
                    so4.setForeground(Color.black);
                    so5.setBackground(Color.white);
                    so5.setForeground(Color.black);
                    so6.setBackground(Color.white);
                    so6.setForeground(Color.black);
                    so7.setBackground(Color.white);
                    so7.setForeground(Color.black);
                    so8.setBackground(Color.white);
                    so8.setForeground(Color.black);
                    so9.setBackground(Color.white);
                    so9.setForeground(Color.black);
                    cong.setBackground(Color.orange);
                    cong.setForeground(Color.black);
                    tru.setBackground(Color.orange);
                    tru.setForeground(Color.black);
                    nhan.setBackground(Color.orange);
                    nhan.setForeground(Color.black);
                    chia.setBackground(Color.orange);
                    chia.setForeground(Color.black);
                    sqrt.setBackground(Color.gray);
                    sqrt.setForeground(Color.black);
                    motchiax.setBackground(Color.gray);
                    motchiax.setForeground(Color.black);
                    phantram.setBackground(Color.gray);
                    phantram.setForeground(Color.black);
                    amduong.setBackground(Color.gray);
                    amduong.setForeground(Color.black);
                    bgr.setBackground(Color.white);
                    bgr.setForeground(Color.black);
                    bang.setBackground(Color.white);
                    bang.setForeground(Color.black);
                    c_reset.setBackground(Color.red);
                    c_reset.setForeground(Color.black);
                    text.setBackground(Color.white);
                    text.setForeground(Color.black);
                    b = true;
                }
            }

            break;
            default:
                break;
        }

    }

}
